package typings.firefoxDashWebextDashBrowser.browser.privacy.websites

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.browser.types.Setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * If enabled, the browser will associate all data (including cookies, HSTS data, cached images, and more) for any
  * third party domains with the domain in the address bar. This prevents third party trackers from using directly
  * stored information to identify you across different websites, but may break websites where you login with a
  * third party account (such as a Facebook or Google login.) The value of this preference is of type boolean, and
  * the default value is `false`.
  */
@JSGlobal("browser.privacy.websites.firstPartyIsolate")
@js.native
object firstPartyIsolate extends TopLevel[Setting]

