package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofservices extends js.Object {
  /* privacy.services properties */
  /**
    * If enabled, the password manager will ask if you want to save passwords. This preference's value is a boolean,
    * defaulting to `true`.
    */
  val passwordSavingEnabled: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting
}

object Typeofservices {
  @scala.inline
  def apply(passwordSavingEnabled: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting): Typeofservices = {
    val __obj = js.Dynamic.literal(passwordSavingEnabled = passwordSavingEnabled)
  
    __obj.asInstanceOf[Typeofservices]
  }
}

