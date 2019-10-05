package typings.firefoxDashWebextDashBrowser.browser.runtime

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when a connection is made from another extension. */
@JSGlobal("browser.runtime.onConnectExternal")
@js.native
object onConnectExternal
  extends TopLevel[WebExtEvent[js.Function1[/* port */ Port, Unit]]]

