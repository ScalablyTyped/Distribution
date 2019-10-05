package typings.firefoxDashWebextDashBrowser.browser.privacy

import typings.firefoxDashWebextDashBrowser.browser.types.Setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Use the `browser.privacy` API to control usage of the features in the browser that can affect a user's privacy.
  *
  * Permissions: `privacy`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.privacy.services")
@js.native
object services extends js.Object {
  /* privacy.services properties */
  /**
    * If enabled, the password manager will ask if you want to save passwords. This preference's value is a boolean,
    * defaulting to `true`.
    */
  val passwordSavingEnabled: Setting = js.native
}

