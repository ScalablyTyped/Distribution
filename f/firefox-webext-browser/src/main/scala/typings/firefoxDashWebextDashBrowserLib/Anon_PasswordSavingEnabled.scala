package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PasswordSavingEnabled extends js.Object {
  /* privacy.services properties */
  /**
    * If enabled, the password manager will ask if you want to save passwords. This preference's value is a boolean,
    * defaulting to `true`.
    */
  val passwordSavingEnabled: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting
}

object Anon_PasswordSavingEnabled {
  @scala.inline
  def apply(passwordSavingEnabled: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting): Anon_PasswordSavingEnabled = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("passwordSavingEnabled")(passwordSavingEnabled)
    __obj.asInstanceOf[Anon_PasswordSavingEnabled]
  }
}

