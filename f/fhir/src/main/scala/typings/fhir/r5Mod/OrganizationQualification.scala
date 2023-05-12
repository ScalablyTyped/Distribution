package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationQualification
  extends StObject
     with BackboneElement {
  
  /**
    * Coded representation of the qualification.
    */
  var code: CodeableConcept
  
  /**
    * An identifier allocated to this qualification for this organization.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Organization that regulates and issues the qualification.
    */
  var issuer: js.UndefOr[Reference] = js.undefined
  
  /**
    * Period during which the qualification is valid.
    */
  var period: js.UndefOr[Period] = js.undefined
}
object OrganizationQualification {
  
  inline def apply(code: CodeableConcept): OrganizationQualification = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationQualification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrganizationQualification] (val x: Self) extends AnyVal {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setIssuer(value: Reference): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
