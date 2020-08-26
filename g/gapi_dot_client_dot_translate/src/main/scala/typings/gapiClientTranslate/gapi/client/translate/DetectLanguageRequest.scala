package typings.gapiClientTranslate.gapi.client.translate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectLanguageRequest extends js.Object {
  /**
    * The input text upon which to perform language detection. Repeat this
    * parameter to perform language detection on multiple text inputs.
    */
  var q: js.UndefOr[js.Array[String]] = js.native
}

object DetectLanguageRequest {
  @scala.inline
  def apply(): DetectLanguageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectLanguageRequest]
  }
  @scala.inline
  implicit class DetectLanguageRequestOps[Self <: DetectLanguageRequest] (val x: Self) extends AnyVal {
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
    def setQVarargs(value: String*): Self = this.set("q", js.Array(value :_*))
    @scala.inline
    def setQ(value: js.Array[String]): Self = this.set("q", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
  }
  
}

