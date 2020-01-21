package typings.firefoxWebextBrowser.browser.contextualIdentities

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.AnonContextualIdentity
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* contextualIdentities events */
/** Fired when a container is updated. */
@JSGlobal("browser.contextualIdentities.onUpdated")
@js.native
object onUpdated
  extends TopLevel[WebExtEvent[js.Function1[/* changeInfo */ AnonContextualIdentity, Unit]]]

