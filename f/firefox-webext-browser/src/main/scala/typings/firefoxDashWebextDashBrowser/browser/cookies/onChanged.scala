package typings.firefoxDashWebextDashBrowser.browser.cookies

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.Anon_Cause
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cookies events */
/**
  * Fired when a cookie is set or removed. As a special case, note that updating a cookie's properties is
  * implemented as a two step process: the cookie to be updated is first removed entirely, generating a notification
  * with "cause" of "overwrite" . Afterwards, a new cookie is written with the updated values, generating a second
  * notification with "cause" "explicit".
  */
@JSGlobal("browser.cookies.onChanged")
@js.native
object onChanged
  extends TopLevel[WebExtEvent[js.Function1[/* changeInfo */ Anon_Cause, Unit]]]

