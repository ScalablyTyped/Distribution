package typings.gapiDotClientDotTranslate.gapi.client.translate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSupportedLanguagesRequest extends js.Object {
  /**
    * The language to use to return localized, human readable names of supported
    * languages.
    */
  var target: js.UndefOr[String] = js.undefined
}

object GetSupportedLanguagesRequest {
  @scala.inline
  def apply(target: String = null): GetSupportedLanguagesRequest = {
    val __obj = js.Dynamic.literal()
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSupportedLanguagesRequest]
  }
}

