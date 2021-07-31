package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformPutTransform[T]
  extends StObject
     with Generic {
  
  var body: T
  
  var defer_validation: js.UndefOr[Boolean] = js.undefined
  
  var transform_id: String
}
object TransformPutTransform {
  
  @scala.inline
  def apply[T](body: T, transform_id: String): TransformPutTransform[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], transform_id = transform_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformPutTransform[T]]
  }
  
  @scala.inline
  implicit class TransformPutTransformMutableBuilder[Self <: TransformPutTransform[?], T] (val x: Self & TransformPutTransform[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefer_validation(value: Boolean): Self = StObject.set(x, "defer_validation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefer_validationUndefined: Self = StObject.set(x, "defer_validation", js.undefined)
    
    @scala.inline
    def setTransform_id(value: String): Self = StObject.set(x, "transform_id", value.asInstanceOf[js.Any])
  }
}
