package typings.firefoxWebextBrowser.browser.webNavigation

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.AnonTimeStamp
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
      WebNavigationOnHistoryStateUpdatedEvent[js.Function1[/* details */ AnonTimeStamp, Unit]]
    ]

