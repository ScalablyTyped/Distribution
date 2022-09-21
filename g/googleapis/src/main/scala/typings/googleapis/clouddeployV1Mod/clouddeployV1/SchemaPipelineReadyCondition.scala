package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPipelineReadyCondition extends StObject {
  
  /**
    * True if the Pipeline is in a valid state. Otherwise at least one condition in `PipelineCondition` is in an invalid state. Iterate over those conditions and see which condition(s) has status = false to find out what is wrong with the Pipeline.
    */
  var status: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Last time the condition was updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaPipelineReadyCondition {
  
  inline def apply(): SchemaPipelineReadyCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPipelineReadyCondition]
  }
  
  extension [Self <: SchemaPipelineReadyCondition](x: Self) {
    
    inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
