package typings.gapiClientTranslate.gapi.client.translate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSupportedLanguagesRequest extends js.Object {
  /**
    * The language to use to return localized, human readable names of supported
    * languages.
    */
  var target: js.UndefOr[String] = js.native
}

object GetSupportedLanguagesRequest {
  @scala.inline
  def apply(): GetSupportedLanguagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSupportedLanguagesRequest]
  }
  @scala.inline
  implicit class GetSupportedLanguagesRequestOps[Self <: GetSupportedLanguagesRequest] (val x: Self) extends AnyVal {
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
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

