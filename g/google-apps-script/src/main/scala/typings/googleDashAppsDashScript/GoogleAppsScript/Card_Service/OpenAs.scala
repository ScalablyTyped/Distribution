package typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OpenAs extends js.Object

/**
  * An enum that specifies how to open a URL.
  *
  * The client can open a URL as either a full size window (if that is the frame used by the
  * client), or an overlay (such as a pop-up). The implementation depends on the client platform
  * capabilities, and the value selected may be ignored if the client does not support it. FULL_SIZE is supported by all clients.
  *
  * Using OnClose may cause OpenAs to be ignored; if the client platform cannot
  * support both selected values together, OnClose takes precedence.
  */
@JSGlobal("GoogleAppsScript.Card_Service.OpenAs")
@js.native
object OpenAs extends js.Object {
  @js.native
  sealed trait FULL_SIZE extends OpenAs
  
  @js.native
  sealed trait OVERLAY extends OpenAs
  
  /* 0 */ val FULL_SIZE: typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service.OpenAs.FULL_SIZE with Double = js.native
  /* 1 */ val OVERLAY: typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service.OpenAs.OVERLAY with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OpenAs with Double] = js.native
}

