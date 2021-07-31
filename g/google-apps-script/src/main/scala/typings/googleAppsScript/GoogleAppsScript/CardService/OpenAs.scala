package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OpenAs extends StObject
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
object OpenAs extends StObject {
  
  @js.native
  sealed trait FULL_SIZE
    extends StObject
       with OpenAs
  
  @js.native
  sealed trait OVERLAY
    extends StObject
       with OpenAs
}
