package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.types.Setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofservices extends js.Object {
  /* privacy.services properties */
  /**
    * If enabled, the password manager will ask if you want to save passwords. This preference's value is a boolean,
    * defaulting to `true`.
    */
  val passwordSavingEnabled: Setting
}

object Typeofservices {
  @scala.inline
  def apply(passwordSavingEnabled: Setting): Typeofservices = {
    val __obj = js.Dynamic.literal(passwordSavingEnabled = passwordSavingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofservices]
  }
}

