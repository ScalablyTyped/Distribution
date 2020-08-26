package typings.gapiTranslate.gapi.client.language

import typings.gapi.gapi.client.HttpRequest
import typings.gapiTranslate.GoogleApiTranslateDetectionListResponse
import typings.gapiTranslate.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait detections extends js.Object {
  /**
    * Detect the language of text.
    */
  def list(`object`: Fields): HttpRequest[GoogleApiTranslateDetectionListResponse] = js.native
}

object detections {
  @scala.inline
  def apply(list: Fields => HttpRequest[GoogleApiTranslateDetectionListResponse]): detections = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[detections]
  }
  @scala.inline
  implicit class detectionsOps[Self <: detections] (val x: Self) extends AnyVal {
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
    def setList(value: Fields => HttpRequest[GoogleApiTranslateDetectionListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

