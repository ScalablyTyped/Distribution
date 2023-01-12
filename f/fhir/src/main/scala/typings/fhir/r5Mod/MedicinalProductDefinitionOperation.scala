package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductDefinitionOperation
  extends StObject
     with BackboneElement {
  
  /**
    * Specifies whether this particular business or manufacturing process is considered proprietary or confidential.
    */
  var confidentialityIndicator: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Date range of applicability.
    */
  var effectiveDate: js.UndefOr[Period] = js.undefined
  
  /**
    * The organization or establishment responsible for (or associated with) the particular process or step, examples include the manufacturer, importer, agent.
    */
  var organization: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The type of manufacturing operation e.g. manufacturing itself, re-packaging. For the authorization of this, a RegulatedAuthorization would point to the same plan or activity referenced here.
    */
  var `type`: js.UndefOr[CodeableReference] = js.undefined
}
object MedicinalProductDefinitionOperation {
  
  inline def apply(): MedicinalProductDefinitionOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicinalProductDefinitionOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProductDefinitionOperation] (val x: Self) extends AnyVal {
    
    inline def setConfidentialityIndicator(value: CodeableConcept): Self = StObject.set(x, "confidentialityIndicator", value.asInstanceOf[js.Any])
    
    inline def setConfidentialityIndicatorUndefined: Self = StObject.set(x, "confidentialityIndicator", js.undefined)
    
    inline def setEffectiveDate(value: Period): Self = StObject.set(x, "effectiveDate", value.asInstanceOf[js.Any])
    
    inline def setEffectiveDateUndefined: Self = StObject.set(x, "effectiveDate", js.undefined)
    
    inline def setOrganization(value: js.Array[Reference]): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setOrganizationVarargs(value: Reference*): Self = StObject.set(x, "organization", js.Array(value*))
    
    inline def setType(value: CodeableReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
