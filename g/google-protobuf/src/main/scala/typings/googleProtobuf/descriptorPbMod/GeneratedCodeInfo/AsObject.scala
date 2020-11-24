package typings.googleProtobuf.descriptorPbMod.GeneratedCodeInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsObject extends js.Object {
  
  var annotationList: js.Array[typings.googleProtobuf.descriptorPbMod.GeneratedCodeInfo.Annotation.AsObject] = js.native
}
object AsObject {
  
  @scala.inline
  def apply(
    annotationList: js.Array[typings.googleProtobuf.descriptorPbMod.GeneratedCodeInfo.Annotation.AsObject]
  ): AsObject = {
    val __obj = js.Dynamic.literal(annotationList = annotationList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    
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
    def setAnnotationListVarargs(value: typings.googleProtobuf.descriptorPbMod.GeneratedCodeInfo.Annotation.AsObject*): Self = this.set("annotationList", js.Array(value :_*))
    
    @scala.inline
    def setAnnotationList(value: js.Array[typings.googleProtobuf.descriptorPbMod.GeneratedCodeInfo.Annotation.AsObject]): Self = this.set("annotationList", value.asInstanceOf[js.Any])
  }
}
