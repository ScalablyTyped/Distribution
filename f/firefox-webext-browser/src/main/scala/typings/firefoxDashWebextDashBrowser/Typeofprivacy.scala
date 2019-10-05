package typings.firefoxDashWebextDashBrowser

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
  val network: Typeofnetwork
  /**
    * Use the `browser.privacy` API to control usage of the features in the browser that can affect a user's privacy.
    *
    * Permissions: `privacy`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val services: Typeofservices
  /**
    * Use the `browser.privacy` API to control usage of the features in the browser that can affect a user's privacy.
    *
    * Permissions: `privacy`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val websites: Typeofwebsites
}

object Typeofprivacy {
  @scala.inline
  def apply(network: Typeofnetwork, services: Typeofservices, websites: Typeofwebsites): Typeofprivacy = {
    val __obj = js.Dynamic.literal(network = network, services = services, websites = websites)
  
    __obj.asInstanceOf[Typeofprivacy]
  }
}

