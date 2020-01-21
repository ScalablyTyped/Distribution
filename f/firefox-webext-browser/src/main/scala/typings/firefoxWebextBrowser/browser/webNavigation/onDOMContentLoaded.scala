package typings.firefoxWebextBrowser.browser.webNavigation

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.AnonFrameIdProcessIdTabId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when the page's DOM is fully constructed, but the referenced resources may not finish loading. */
@JSGlobal("browser.webNavigation.onDOMContentLoaded")
@js.native
object onDOMContentLoaded
  extends TopLevel[
      WebNavigationOnDOMContentLoadedEvent[js.Function1[/* details */ AnonFrameIdProcessIdTabId, Unit]]
    ]

