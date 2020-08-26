package typings.gapiTranslate

import typings.gapiTranslate.anon.Detections
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleApiTranslateDetectionListResponse extends js.Object {
  var data: Detections = js.native
}

object GoogleApiTranslateDetectionListResponse {
  @scala.inline
  def apply(data: Detections): GoogleApiTranslateDetectionListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiTranslateDetectionListResponse]
  }
  @scala.inline
  implicit class GoogleApiTranslateDetectionListResponseOps[Self <: GoogleApiTranslateDetectionListResponse] (val x: Self) extends AnyVal {
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
    def setData(value: Detections): Self = this.set("data", value.asInstanceOf[js.Any])
  }
  
}

