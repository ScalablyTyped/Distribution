package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChargeItemDefinitionApplicability
  extends StObject
     with BackboneElement {
  
  /**
    * Please note that FHIRPath Expressions can only be evaluated in the scope of the current ChargeItem resource to which this definition is being applied.
    * FHIRPath expressions can traverse into other resources linked from the ChargeItem resource, however, testing rules such as that a billing code may be billed only once per encounter need a wider scope. In such scenarios, CQL may be the appropriate choice.
    */
  var condition: js.UndefOr[Expression] = js.undefined
  
  /**
    * The effective period for a charge item definition  determines when the content is applicable for usage and is independent of publication and review dates. For example, a measure intended to be used for the year 2016 might be published in 2015.
    */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Reference to / quotation of the external source of the group of properties.
    */
  var relatedArtifact: js.UndefOr[RelatedArtifact] = js.undefined
}
object ChargeItemDefinitionApplicability {
  
  inline def apply(): ChargeItemDefinitionApplicability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChargeItemDefinitionApplicability]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChargeItemDefinitionApplicability] (val x: Self) extends AnyVal {
    
    inline def setCondition(value: Expression): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setEffectivePeriod(value: Period): Self = StObject.set(x, "effectivePeriod", value.asInstanceOf[js.Any])
    
    inline def setEffectivePeriodUndefined: Self = StObject.set(x, "effectivePeriod", js.undefined)
    
    inline def setRelatedArtifact(value: RelatedArtifact): Self = StObject.set(x, "relatedArtifact", value.asInstanceOf[js.Any])
    
    inline def setRelatedArtifactUndefined: Self = StObject.set(x, "relatedArtifact", js.undefined)
  }
}
