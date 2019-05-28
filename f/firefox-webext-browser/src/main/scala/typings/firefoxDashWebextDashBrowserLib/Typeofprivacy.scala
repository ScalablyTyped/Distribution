package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofprivacy extends js.Object {
  /**
    * Use the `browser.privacy` API to control usage of the features in the browser that can affect a user's privacy.
    *
    * Permissions: `privacy`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val networkNs: Typeofnetwork
  /**
    * Use the `browser.privacy` API to control usage of the features in the browser that can affect a user's privacy.
    *
    * Permissions: `privacy`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val servicesNs: Typeofservices
  /**
    * Use the `browser.privacy` API to control usage of the features in the browser that can affect a user's privacy.
    *
    * Permissions: `privacy`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val websitesNs: Typeofwebsites
}

object Typeofprivacy {
  @scala.inline
  def apply(networkNs: Typeofnetwork, servicesNs: Typeofservices, websitesNs: Typeofwebsites): Typeofprivacy = {
    val __obj = js.Dynamic.literal(networkNs = networkNs, servicesNs = servicesNs, websitesNs = websitesNs)
  
    __obj.asInstanceOf[Typeofprivacy]
  }
}

