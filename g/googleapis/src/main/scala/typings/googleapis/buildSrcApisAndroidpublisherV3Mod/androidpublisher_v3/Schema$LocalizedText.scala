package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LocalizedText extends js.Object {
  /**
    * The language code, in BCP 47 format (eg &quot;en-US&quot;).
    */
  var language: js.UndefOr[String] = js.native
  /**
    * The text in the given `language`.
    */
  var text: js.UndefOr[String] = js.native
}

object Schema$LocalizedText {
  @scala.inline
  def apply(language: String = null, text: String = null): Schema$LocalizedText = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LocalizedText]
  }
}

