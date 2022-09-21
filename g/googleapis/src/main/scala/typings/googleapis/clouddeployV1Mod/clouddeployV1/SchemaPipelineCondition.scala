package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPipelineCondition extends StObject {
  
  /**
    * Details around the Pipeline's overall status.
    */
  var pipelineReadyCondition: js.UndefOr[SchemaPipelineReadyCondition] = js.undefined
  
  /**
    * Detalis around targets enumerated in the pipeline.
    */
  var targetsPresentCondition: js.UndefOr[SchemaTargetsPresentCondition] = js.undefined
}
object SchemaPipelineCondition {
  
  inline def apply(): SchemaPipelineCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPipelineCondition]
  }
  
  extension [Self <: SchemaPipelineCondition](x: Self) {
    
    inline def setPipelineReadyCondition(value: SchemaPipelineReadyCondition): Self = StObject.set(x, "pipelineReadyCondition", value.asInstanceOf[js.Any])
    
    inline def setPipelineReadyConditionUndefined: Self = StObject.set(x, "pipelineReadyCondition", js.undefined)
    
    inline def setTargetsPresentCondition(value: SchemaTargetsPresentCondition): Self = StObject.set(x, "targetsPresentCondition", value.asInstanceOf[js.Any])
    
    inline def setTargetsPresentConditionUndefined: Self = StObject.set(x, "targetsPresentCondition", js.undefined)
  }
}
