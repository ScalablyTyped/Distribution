package typings.gapiTranslate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Detections extends js.Object {
  
  var detections: js.Array[js.Array[Confidence]] = js.native
}
object Detections {
  
  @scala.inline
  def apply(detections: js.Array[js.Array[Confidence]]): Detections = {
    val __obj = js.Dynamic.literal(detections = detections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Detections]
  }
  
  @scala.inline
  implicit class DetectionsOps[Self <: Detections] (val x: Self) extends AnyVal {
    
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
    def setDetectionsVarargs(value: js.Array[Confidence]*): Self = this.set("detections", js.Array(value :_*))
    
    @scala.inline
    def setDetections(value: js.Array[js.Array[Confidence]]): Self = this.set("detections", value.asInstanceOf[js.Any])
  }
}
