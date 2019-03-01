package typings
package gapiDotClientDotPlaycustomappLib.gapiNs.clientNs.playcustomappNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomApp extends js.Object {
  /** Default listing language in BCP 47 format. */
  var languageCode: js.UndefOr[java.lang.String] = js.undefined
  /** Title for the Android app. */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object CustomApp {
  @scala.inline
  def apply(languageCode: java.lang.String = null, title: java.lang.String = null): CustomApp = {
    val __obj = js.Dynamic.literal()
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[CustomApp]
  }
}

