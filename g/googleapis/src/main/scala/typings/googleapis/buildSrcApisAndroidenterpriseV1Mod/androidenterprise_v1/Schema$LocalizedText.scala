package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A localized string with its locale.
  */
@js.native
trait Schema$LocalizedText extends js.Object {
  /**
    * The BCP47 tag for a locale. (e.g. &quot;en-US&quot;, &quot;de&quot;).
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * The text localized in the associated locale.
    */
  var text: js.UndefOr[String] = js.native
}

object Schema$LocalizedText {
  @scala.inline
  def apply(locale: String = null, text: String = null): Schema$LocalizedText = {
    val __obj = js.Dynamic.literal()
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LocalizedText]
  }
}

