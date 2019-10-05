package typings.firefoxDashWebextDashBrowser.browser.proxy

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Notifies about proxy script errors. */
@JSGlobal("browser.proxy.onError")
@js.native
object onError
  extends TopLevel[WebExtEvent[js.Function1[/* error */ Error, Unit]]]

