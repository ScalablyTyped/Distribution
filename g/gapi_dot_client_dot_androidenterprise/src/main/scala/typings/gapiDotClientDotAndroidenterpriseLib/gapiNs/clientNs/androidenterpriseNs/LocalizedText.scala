package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizedText extends js.Object {
  /** The BCP47 tag for a locale. (e.g. "en-US", "de"). */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** The text localized in the associated locale. */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object LocalizedText {
  @scala.inline
  def apply(locale: java.lang.String = null, text: java.lang.String = null): LocalizedText = {
    val __obj = js.Dynamic.literal()
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[LocalizedText]
  }
}

