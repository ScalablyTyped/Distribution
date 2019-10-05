package typings.firefoxDashWebextDashBrowser.browser.runtime

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sent to the event page just before it is unloaded. This gives the extension opportunity to do some clean up.
  * Note that since the page is unloading, any asynchronous operations started while handling this event are not
  * guaranteed to complete. If more activity for the event page occurs before it gets unloaded the onSuspendCanceled
  * event will be sent and the page won't be unloaded.
  * @deprecated Unsupported on Firefox at this time.
  */
@JSGlobal("browser.runtime.onSuspend")
@js.native
object onSuspend
  extends TopLevel[js.UndefOr[WebExtEvent[js.Function0[Unit]]]]

