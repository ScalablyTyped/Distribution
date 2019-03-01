package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Network extends js.Object {
  /**
    * Use the `browser.privacy` API to control usage of the features in the browser that can affect a user's privacy.
    *
    * Permissions: `privacy`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val networkNs: Anon_NetworkPredictionEnabled
  /**
    * Use the `browser.privacy` API to control usage of the features in the browser that can affect a user's privacy.
    *
    * Permissions: `privacy`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val servicesNs: Anon_PasswordSavingEnabled
  /**
    * Use the `browser.privacy` API to control usage of the features in the browser that can affect a user's privacy.
    *
    * Permissions: `privacy`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val websitesNs: Anon_CookieConfig
}

object Anon_Network {
  @scala.inline
  def apply(
    networkNs: Anon_NetworkPredictionEnabled,
    servicesNs: Anon_PasswordSavingEnabled,
    websitesNs: Anon_CookieConfig
  ): Anon_Network = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("networkNs")(networkNs)
    __obj.updateDynamic("servicesNs")(servicesNs)
    __obj.updateDynamic("websitesNs")(websitesNs)
    __obj.asInstanceOf[Anon_Network]
  }
}

