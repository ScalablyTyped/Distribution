package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendedContactDetail
  extends StObject
     with Element {
  
  /**
    * More than 1 address would be for different purposes, and thus should be entered as a different entry,.
    */
  var address: js.UndefOr[Address] = js.undefined
  
  /**
    * If there is no named individual, the telecom/address information is not generally monitored by a specific individual.
    */
  var name: js.UndefOr[js.Array[HumanName]] = js.undefined
  
  /**
    * This contact detail is handled/monitored by a specific organization. If the name is provided in the contact, then it is referring to the named individual within this organization.
    */
  var organization: js.UndefOr[Reference] = js.undefined
  
  /**
    * If the details have multiple periods, then enter in a new ExtendedContact with the new period.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * If no purpose is defined, then these contact details may be used for any purpose.
    */
  var purpose: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The contact details application for the purpose defined.
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}
object ExtendedContactDetail {
  
  inline def apply(): ExtendedContactDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendedContactDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtendedContactDetail] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: Address): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setName(value: js.Array[HumanName]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNameVarargs(value: HumanName*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setOrganization(value: Reference): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPurpose(value: CodeableConcept): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    inline def setTelecom(value: js.Array[ContactPoint]): Self = StObject.set(x, "telecom", value.asInstanceOf[js.Any])
    
    inline def setTelecomUndefined: Self = StObject.set(x, "telecom", js.undefined)
    
    inline def setTelecomVarargs(value: ContactPoint*): Self = StObject.set(x, "telecom", js.Array(value*))
  }
}
