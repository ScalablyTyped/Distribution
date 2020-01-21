package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A localized string with its locale.
  */
@js.native
trait SchemaLocalizedText extends js.Object {
  /**
    * The BCP47 tag for a locale. (e.g. &quot;en-US&quot;, &quot;de&quot;).
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * The text localized in the associated locale.
    */
  var text: js.UndefOr[String] = js.native
}

object SchemaLocalizedText {
  @scala.inline
  def apply(locale: String = null, text: String = null): SchemaLocalizedText = {
    val __obj = js.Dynamic.literal()
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLocalizedText]
  }
}

