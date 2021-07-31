package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OnClose extends StObject
/**
  * An enum that specifies what to do when a URL opened through an OpenLink is closed.
  *
  * When a link is opened, the client either forgets about it or waits until the window is closed.
  * The implementation depends on the client platform capabilities. OnClose may cause OpenAs to be ignored; if the client platform cannot support both selected values together,
  * OnClose takes precedence.
  */
@JSGlobal("GoogleAppsScript.Card_Service.OnClose")
@js.native
object OnClose extends StObject {
  
  @js.native
  sealed trait NOTHING
    extends StObject
       with OnClose
  
  @js.native
  sealed trait RELOAD_ADD_ON
    extends StObject
       with OnClose
}
