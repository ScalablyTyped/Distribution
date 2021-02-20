package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformPreviewTransform[T] extends Generic {
  
  var body: T = js.native
}
object TransformPreviewTransform {
  
  @scala.inline
  def apply[T](body: T): TransformPreviewTransform[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformPreviewTransform[T]]
  }
  
  @scala.inline
  implicit class TransformPreviewTransformMutableBuilder[Self <: TransformPreviewTransform[_], T] (val x: Self with TransformPreviewTransform[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
