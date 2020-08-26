package typings.gapiClientTranslate.gapi.client.translate

import typings.gapiClient.gapi.client.Request
import typings.gapiClientTranslate.anon.Bearertoken
import typings.gapiClientTranslate.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectionsResource extends js.Object {
  /** Detects the language of text within a request. */
  def detect(request: Bearertoken): Request[DetectionsListResponse] = js.native
  /** Detects the language of text within a request. */
  def list(request: Callback): Request[DetectionsListResponse] = js.native
}

object DetectionsResource {
  @scala.inline
  def apply(
    detect: Bearertoken => Request[DetectionsListResponse],
    list: Callback => Request[DetectionsListResponse]
  ): DetectionsResource = {
    val __obj = js.Dynamic.literal(detect = js.Any.fromFunction1(detect), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[DetectionsResource]
  }
  @scala.inline
  implicit class DetectionsResourceOps[Self <: DetectionsResource] (val x: Self) extends AnyVal {
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
    def setDetect(value: Bearertoken => Request[DetectionsListResponse]): Self = this.set("detect", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Callback => Request[DetectionsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

