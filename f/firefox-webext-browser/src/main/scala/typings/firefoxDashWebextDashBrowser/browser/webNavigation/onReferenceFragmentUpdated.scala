package typings.firefoxDashWebextDashBrowser.browser.webNavigation

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.Anon_FrameIdProcessId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the reference fragment of a frame was updated. All future events for that frame will use the updated
  * URL.
  */
@JSGlobal("browser.webNavigation.onReferenceFragmentUpdated")
@js.native
object onReferenceFragmentUpdated
  extends TopLevel[
      _WebNavigationOnReferenceFragmentUpdatedEvent[js.Function1[/* details */ Anon_FrameIdProcessId, Unit]]
    ]

