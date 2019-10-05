package typings.firefoxDashWebextDashBrowser.browser.webNavigation

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.Anon_FrameIdProcessId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a navigation is committed. The document (and the resources it refers to, such as images and
  * subframes) might still be downloading, but at least part of the document has been received from the server and
  * the browser has decided to switch to the new document.
  */
@JSGlobal("browser.webNavigation.onCommitted")
@js.native
object onCommitted
  extends TopLevel[
      _WebNavigationOnCommittedEvent[js.Function1[/* details */ Anon_FrameIdProcessId, Unit]]
    ]

