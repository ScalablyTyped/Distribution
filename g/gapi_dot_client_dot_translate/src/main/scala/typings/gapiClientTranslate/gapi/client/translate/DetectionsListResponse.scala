package typings.gapiClientTranslate.gapi.client.translate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectionsListResponse extends js.Object {
  /** A detections contains detection results of several text */
  var detections: js.UndefOr[js.Array[_]] = js.native
}

object DetectionsListResponse {
  @scala.inline
  def apply(): DetectionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectionsListResponse]
  }
  @scala.inline
  implicit class DetectionsListResponseOps[Self <: DetectionsListResponse] (val x: Self) extends AnyVal {
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
    def setDetectionsVarargs(value: js.Any*): Self = this.set("detections", js.Array(value :_*))
    @scala.inline
    def setDetections(value: js.Array[_]): Self = this.set("detections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetections: Self = this.set("detections", js.undefined)
  }
  
}

