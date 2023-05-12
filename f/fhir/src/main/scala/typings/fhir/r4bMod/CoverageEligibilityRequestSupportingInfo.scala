package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageEligibilityRequestSupportingInfo
  extends StObject
     with BackboneElement {
  
  var _appliesToAll: js.UndefOr[Element] = js.undefined
  
  /**
    * The supporting materials are applicable for all detail items, product/servce categories and specific billing codes.
    */
  var appliesToAll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Could be used to provide references to other resources, document. For example could contain a PDF in an Attachment of the Police Report for an Accident.
    */
  var information: Reference
  
  /**
    * A number to uniquely identify supporting information entries.
    */
  var sequence: Double
}
object CoverageEligibilityRequestSupportingInfo {
  
  inline def apply(information: Reference, sequence: Double): CoverageEligibilityRequestSupportingInfo = {
    val __obj = js.Dynamic.literal(information = information.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageEligibilityRequestSupportingInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageEligibilityRequestSupportingInfo] (val x: Self) extends AnyVal {
    
    inline def setAppliesToAll(value: Boolean): Self = StObject.set(x, "appliesToAll", value.asInstanceOf[js.Any])
    
    inline def setAppliesToAllUndefined: Self = StObject.set(x, "appliesToAll", js.undefined)
    
    inline def setInformation(value: Reference): Self = StObject.set(x, "information", value.asInstanceOf[js.Any])
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def set_appliesToAll(value: Element): Self = StObject.set(x, "_appliesToAll", value.asInstanceOf[js.Any])
    
    inline def set_appliesToAllUndefined: Self = StObject.set(x, "_appliesToAll", js.undefined)
  }
}
