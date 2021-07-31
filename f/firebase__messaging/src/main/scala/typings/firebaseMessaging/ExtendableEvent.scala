package typings.firebaseMessaging

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtendableEvent
  extends StObject
     with Event {
  
  def waitUntil(f: js.Promise[js.Any]): Unit = js.native
}
