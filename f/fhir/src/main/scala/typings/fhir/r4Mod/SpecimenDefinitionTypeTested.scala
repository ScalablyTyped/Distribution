package typings.fhir.r4Mod

import typings.fhir.fhirStrings.alternate
import typings.fhir.fhirStrings.preferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecimenDefinitionTypeTested
  extends StObject
     with BackboneElement {
  
  var _isDerived: js.UndefOr[Element] = js.undefined
  
  var _preference: js.UndefOr[Element] = js.undefined
  
  var _requirement: js.UndefOr[Element] = js.undefined
  
  /**
    * The specimen's container.
    */
  var container: js.UndefOr[SpecimenDefinitionTypeTestedContainer] = js.undefined
  
  /**
    * Set of instructions for preservation/transport of the specimen at a defined temperature interval, prior the testing process.
    */
  var handling: js.UndefOr[js.Array[SpecimenDefinitionTypeTestedHandling]] = js.undefined
  
  /**
    * Primary of secondary specimen.
    */
  var isDerived: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The preference for this type of conditioned specimen.
    */
  var preference: preferred | alternate
  
  /**
    * Criterion for rejection of the specimen in its container by the laboratory.
    */
  var rejectionCriterion: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Requirements for delivery and special handling of this kind of conditioned specimen.
    */
  var requirement: js.UndefOr[String] = js.undefined
  
  /**
    * The usual time that a specimen of this kind is retained after the ordered tests are completed, for the purpose of additional testing.
    */
  var retentionTime: js.UndefOr[Duration] = js.undefined
  
  /**
    * The kind of specimen conditioned for testing expected by lab.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object SpecimenDefinitionTypeTested {
  
  inline def apply(preference: preferred | alternate): SpecimenDefinitionTypeTested = {
    val __obj = js.Dynamic.literal(preference = preference.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecimenDefinitionTypeTested]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpecimenDefinitionTypeTested] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: SpecimenDefinitionTypeTestedContainer): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setHandling(value: js.Array[SpecimenDefinitionTypeTestedHandling]): Self = StObject.set(x, "handling", value.asInstanceOf[js.Any])
    
    inline def setHandlingUndefined: Self = StObject.set(x, "handling", js.undefined)
    
    inline def setHandlingVarargs(value: SpecimenDefinitionTypeTestedHandling*): Self = StObject.set(x, "handling", js.Array(value*))
    
    inline def setIsDerived(value: Boolean): Self = StObject.set(x, "isDerived", value.asInstanceOf[js.Any])
    
    inline def setIsDerivedUndefined: Self = StObject.set(x, "isDerived", js.undefined)
    
    inline def setPreference(value: preferred | alternate): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    inline def setRejectionCriterion(value: js.Array[CodeableConcept]): Self = StObject.set(x, "rejectionCriterion", value.asInstanceOf[js.Any])
    
    inline def setRejectionCriterionUndefined: Self = StObject.set(x, "rejectionCriterion", js.undefined)
    
    inline def setRejectionCriterionVarargs(value: CodeableConcept*): Self = StObject.set(x, "rejectionCriterion", js.Array(value*))
    
    inline def setRequirement(value: String): Self = StObject.set(x, "requirement", value.asInstanceOf[js.Any])
    
    inline def setRequirementUndefined: Self = StObject.set(x, "requirement", js.undefined)
    
    inline def setRetentionTime(value: Duration): Self = StObject.set(x, "retentionTime", value.asInstanceOf[js.Any])
    
    inline def setRetentionTimeUndefined: Self = StObject.set(x, "retentionTime", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_isDerived(value: Element): Self = StObject.set(x, "_isDerived", value.asInstanceOf[js.Any])
    
    inline def set_isDerivedUndefined: Self = StObject.set(x, "_isDerived", js.undefined)
    
    inline def set_preference(value: Element): Self = StObject.set(x, "_preference", value.asInstanceOf[js.Any])
    
    inline def set_preferenceUndefined: Self = StObject.set(x, "_preference", js.undefined)
    
    inline def set_requirement(value: Element): Self = StObject.set(x, "_requirement", value.asInstanceOf[js.Any])
    
    inline def set_requirementUndefined: Self = StObject.set(x, "_requirement", js.undefined)
  }
}
