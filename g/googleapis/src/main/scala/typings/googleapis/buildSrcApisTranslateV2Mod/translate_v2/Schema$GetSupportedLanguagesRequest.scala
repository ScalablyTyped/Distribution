package typings.googleapis.buildSrcApisTranslateV2Mod.translate_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for discovering supported languages.
  */
@js.native
trait Schema$GetSupportedLanguagesRequest extends js.Object {
  /**
    * The language to use to return localized, human readable names of
    * supported languages.
    */
  var target: js.UndefOr[String] = js.native
}

object Schema$GetSupportedLanguagesRequest {
  @scala.inline
  def apply(target: String = null): Schema$GetSupportedLanguagesRequest = {
    val __obj = js.Dynamic.literal()
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GetSupportedLanguagesRequest]
  }
}

