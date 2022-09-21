package typings.domChromiumInstallationEvents

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeforeInstallPromptEvent
  extends StObject
     with Event {
  
  val platforms: js.Array[BeforeInstallPromptEventPlatform] = js.native
  
  def prompt(): js.Promise[Unit] = js.native
  
  val userChoice: js.Promise[PromptResponseObject] = js.native
}
