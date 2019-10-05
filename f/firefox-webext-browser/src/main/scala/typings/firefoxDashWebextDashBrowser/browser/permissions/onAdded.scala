package typings.firefoxDashWebextDashBrowser.browser.permissions

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* permissions events */
/**
  * Fired when the extension acquires new permissions.
  * @deprecated Unsupported on Firefox at this time.
  */
@JSGlobal("browser.permissions.onAdded")
@js.native
object onAdded
  extends TopLevel[js.UndefOr[WebExtEvent[js.Function1[/* permissions */ Permissions, Unit]]]]

