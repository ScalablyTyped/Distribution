package typings.firefoxWebextBrowser.browser.webNavigation

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.AnonFrameIdParentFrameId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* webNavigation events */
/** Fired when a navigation is about to occur. */
@JSGlobal("browser.webNavigation.onBeforeNavigate")
@js.native
object onBeforeNavigate
  extends TopLevel[
      WebNavigationOnBeforeNavigateEvent[js.Function1[/* details */ AnonFrameIdParentFrameId, Unit]]
    ]

