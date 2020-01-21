package typings.gapiClientPlaycustomapp.gapi.client.playcustomapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomApp extends js.Object {
  /** Default listing language in BCP 47 format. */
  var languageCode: js.UndefOr[String] = js.undefined
  /** Title for the Android app. */
  var title: js.UndefOr[String] = js.undefined
}

object CustomApp {
  @scala.inline
  def apply(languageCode: String = null, title: String = null): CustomApp = {
    val __obj = js.Dynamic.literal()
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomApp]
  }
}

