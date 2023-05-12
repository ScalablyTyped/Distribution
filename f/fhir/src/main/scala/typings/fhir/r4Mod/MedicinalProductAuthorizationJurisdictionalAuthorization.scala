package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductAuthorizationJurisdictionalAuthorization
  extends StObject
     with BackboneElement {
  
  /**
    * Country of authorization.
    */
  var country: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The assigned number for the marketing authorization.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Jurisdiction within a country.
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The legal status of supply in a jurisdiction or region.
    */
  var legalStatusOfSupply: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The start and expected end date of the authorization.
    */
  var validityPeriod: js.UndefOr[Period] = js.undefined
}
object MedicinalProductAuthorizationJurisdictionalAuthorization {
  
  inline def apply(): MedicinalProductAuthorizationJurisdictionalAuthorization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicinalProductAuthorizationJurisdictionalAuthorization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProductAuthorizationJurisdictionalAuthorization] (val x: Self) extends AnyVal {
    
    inline def setCountry(value: CodeableConcept): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setJurisdiction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    inline def setJurisdictionVarargs(value: CodeableConcept*): Self = StObject.set(x, "jurisdiction", js.Array(value*))
    
    inline def setLegalStatusOfSupply(value: CodeableConcept): Self = StObject.set(x, "legalStatusOfSupply", value.asInstanceOf[js.Any])
    
    inline def setLegalStatusOfSupplyUndefined: Self = StObject.set(x, "legalStatusOfSupply", js.undefined)
    
    inline def setValidityPeriod(value: Period): Self = StObject.set(x, "validityPeriod", value.asInstanceOf[js.Any])
    
    inline def setValidityPeriodUndefined: Self = StObject.set(x, "validityPeriod", js.undefined)
  }
}
