package typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service

import org.scalablytyped.runtime.TopLevel
import typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service.OnClose.NOTHING
import typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service.OnClose.RELOAD_ADD_ON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OnClose extends js.Object

/**
  * An enum that specifies what to do when a URL opened through an OpenLink is closed.
  *
  * When a link is opened, the client either forgets about it or waits until the window is closed.
  * The implementation depends on the client platform capabilities. OnClose may cause OpenAs to be ignored; if the client platform cannot support both selected values together,
  * OnClose takes precedence.
  */
@JSGlobal("GoogleAppsScript.Card_Service.OnClose")
@js.native
object OnClose extends js.Object {
  @js.native
  sealed trait NOTHING extends OnClose
  
  @js.native
  sealed trait RELOAD_ADD_ON extends OnClose
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OnClose with Double] = js.native
  /* 0 */ @js.native
  object NOTHING extends TopLevel[NOTHING with Double]
  
  /* 1 */ @js.native
  object RELOAD_ADD_ON extends TopLevel[RELOAD_ADD_ON with Double]
  
}

