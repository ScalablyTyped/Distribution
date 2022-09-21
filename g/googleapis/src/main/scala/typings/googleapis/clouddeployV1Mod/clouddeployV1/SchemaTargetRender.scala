package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetRender extends StObject {
  
  /**
    * Output only. Reason this render failed. This will always be unspecified while the render in progress.
    */
  var failureCause: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The resource name of the Cloud Build `Build` object that is used to render the manifest for this target. Format is `projects/{project\}/locations/{location\}/builds/{build\}`.
    */
  var renderingBuild: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Current state of the render operation for this Target.
    */
  var renderingState: js.UndefOr[String | Null] = js.undefined
}
object SchemaTargetRender {
  
  inline def apply(): SchemaTargetRender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetRender]
  }
  
  extension [Self <: SchemaTargetRender](x: Self) {
    
    inline def setFailureCause(value: String): Self = StObject.set(x, "failureCause", value.asInstanceOf[js.Any])
    
    inline def setFailureCauseNull: Self = StObject.set(x, "failureCause", null)
    
    inline def setFailureCauseUndefined: Self = StObject.set(x, "failureCause", js.undefined)
    
    inline def setRenderingBuild(value: String): Self = StObject.set(x, "renderingBuild", value.asInstanceOf[js.Any])
    
    inline def setRenderingBuildNull: Self = StObject.set(x, "renderingBuild", null)
    
    inline def setRenderingBuildUndefined: Self = StObject.set(x, "renderingBuild", js.undefined)
    
    inline def setRenderingState(value: String): Self = StObject.set(x, "renderingState", value.asInstanceOf[js.Any])
    
    inline def setRenderingStateNull: Self = StObject.set(x, "renderingState", null)
    
    inline def setRenderingStateUndefined: Self = StObject.set(x, "renderingState", js.undefined)
  }
}
