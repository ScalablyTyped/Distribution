package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformDeleteTransform
  extends StObject
     with Generic {
  
  var force: js.UndefOr[Boolean] = js.undefined
  
  var transform_id: String
}
object TransformDeleteTransform {
  
  @scala.inline
  def apply(transform_id: String): TransformDeleteTransform = {
    val __obj = js.Dynamic.literal(transform_id = transform_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformDeleteTransform]
  }
  
  @scala.inline
  implicit class TransformDeleteTransformMutableBuilder[Self <: TransformDeleteTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    @scala.inline
    def setTransform_id(value: String): Self = StObject.set(x, "transform_id", value.asInstanceOf[js.Any])
  }
}
