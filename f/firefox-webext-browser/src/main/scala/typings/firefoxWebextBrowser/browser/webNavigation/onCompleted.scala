package typings.firefoxWebextBrowser.browser.webNavigation

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.AnonFrameIdProcessIdTabId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when a document, including the resources it refers to, is completely loaded and initialized. */
@JSGlobal("browser.webNavigation.onCompleted")
@js.native
object onCompleted
  extends TopLevel[
      WebNavigationOnCompletedEvent[js.Function1[/* details */ AnonFrameIdProcessIdTabId, Unit]]
    ]

