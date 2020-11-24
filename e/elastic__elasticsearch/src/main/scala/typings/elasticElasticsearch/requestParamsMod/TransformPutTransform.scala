package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformPutTransform[T] extends Generic {
  
  var body: T = js.native
  
  var defer_validation: js.UndefOr[Boolean] = js.native
  
  var transform_id: String = js.native
}
object TransformPutTransform {
  
  @scala.inline
  def apply[T](body: T, transform_id: String): TransformPutTransform[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], transform_id = transform_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformPutTransform[T]]
  }
  
  @scala.inline
  implicit class TransformPutTransformOps[Self <: TransformPutTransform[_], T] (val x: Self with TransformPutTransform[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform_id(value: String): Self = this.set("transform_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefer_validation(value: Boolean): Self = this.set("defer_validation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefer_validation: Self = this.set("defer_validation", js.undefined)
  }
}
