package typings.firefoxDashWebextDashBrowser.browser.webNavigation

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.Anon_FrameIdProcessId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the frame's history was updated to a new URL. All future events for that frame will use the updated
  * URL.
  */
@JSGlobal("browser.webNavigation.onHistoryStateUpdated")
@js.native
object onHistoryStateUpdated
  extends TopLevel[
      _WebNavigationOnHistoryStateUpdatedEvent[js.Function1[/* details */ Anon_FrameIdProcessId, Unit]]
    ]

