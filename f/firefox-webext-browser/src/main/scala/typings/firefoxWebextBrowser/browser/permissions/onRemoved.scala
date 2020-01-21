package typings.firefoxWebextBrowser.browser.permissions

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when permissions are removed from the extension.
  * @deprecated Unsupported on Firefox at this time.
  */
@JSGlobal("browser.permissions.onRemoved")
@js.native
object onRemoved
  extends TopLevel[js.UndefOr[WebExtEvent[js.Function1[/* permissions */ Permissions, Unit]]]]

