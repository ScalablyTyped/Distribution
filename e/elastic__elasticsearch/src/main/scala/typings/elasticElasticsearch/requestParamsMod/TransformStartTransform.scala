package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformStartTransform extends Generic {
  
  var timeout: js.UndefOr[String] = js.native
  
  var transform_id: String = js.native
}
object TransformStartTransform {
  
  @scala.inline
  def apply(transform_id: String): TransformStartTransform = {
    val __obj = js.Dynamic.literal(transform_id = transform_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformStartTransform]
  }
  
  @scala.inline
  implicit class TransformStartTransformMutableBuilder[Self <: TransformStartTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setTransform_id(value: String): Self = StObject.set(x, "transform_id", value.asInstanceOf[js.Any])
  }
}
