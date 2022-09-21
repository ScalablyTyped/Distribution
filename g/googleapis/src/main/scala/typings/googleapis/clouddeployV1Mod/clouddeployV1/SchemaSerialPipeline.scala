package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSerialPipeline extends StObject {
  
  /**
    * Each stage specifies configuration for a `Target`. The ordering of this list defines the promotion flow.
    */
  var stages: js.UndefOr[js.Array[SchemaStage]] = js.undefined
}
object SchemaSerialPipeline {
  
  inline def apply(): SchemaSerialPipeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSerialPipeline]
  }
  
  extension [Self <: SchemaSerialPipeline](x: Self) {
    
    inline def setStages(value: js.Array[SchemaStage]): Self = StObject.set(x, "stages", value.asInstanceOf[js.Any])
    
    inline def setStagesUndefined: Self = StObject.set(x, "stages", js.undefined)
    
    inline def setStagesVarargs(value: SchemaStage*): Self = StObject.set(x, "stages", js.Array(value*))
  }
}
