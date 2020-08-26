package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofprivacy extends js.Object {
  /**
    * Use the `browser.privacy` API to control usage of the features in the browser that can affect a user's privacy.
    *
    * Permissions: `privacy`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val network: Typeofnetwork = js.native
  /**
    * Use the `browser.privacy` API to control usage of the features in the browser that can affect a user's privacy.
    *
    * Permissions: `privacy`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val services: Typeofservices = js.native
  /**
    * Use the `browser.privacy` API to control usage of the features in the browser that can affect a user's privacy.
    *
    * Permissions: `privacy`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val websites: Typeofwebsites = js.native
}

object Typeofprivacy {
  @scala.inline
  def apply(network: Typeofnetwork, services: Typeofservices, websites: Typeofwebsites): Typeofprivacy = {
    val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any], websites = websites.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofprivacy]
  }
  @scala.inline
  implicit class TypeofprivacyOps[Self <: Typeofprivacy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNetwork(value: Typeofnetwork): Self = this.set("network", value.asInstanceOf[js.Any])
    @scala.inline
    def setServices(value: Typeofservices): Self = this.set("services", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebsites(value: Typeofwebsites): Self = this.set("websites", value.asInstanceOf[js.Any])
  }
  
}

