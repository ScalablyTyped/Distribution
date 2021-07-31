package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpcMessageEvent
  extends StObject
     with Event {
  
  var args: js.Array[js.Any] = js.native
  
  var channel: String = js.native
}
