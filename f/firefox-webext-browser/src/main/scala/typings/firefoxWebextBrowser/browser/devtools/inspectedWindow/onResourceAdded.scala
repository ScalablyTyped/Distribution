package typings.firefoxWebextBrowser.browser.devtools.inspectedWindow

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* devtools.inspectedWindow events */
/**
  * Fired when a new resource is added to the inspected page.
  * @deprecated Unsupported on Firefox at this time.
  */
@JSGlobal("browser.devtools.inspectedWindow.onResourceAdded")
@js.native
object onResourceAdded
  extends TopLevel[js.UndefOr[WebExtEvent[js.Function1[/* resource */ Resource, Unit]]]]

