package typings.firebaseMessaging

import typings.std.ClientTypes
import typings.std.Transferable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Client extends StObject {
  
  val id: String = js.native
  
  def postMessage(message: js.Any): Unit = js.native
  def postMessage(message: js.Any, transfer: js.Array[Transferable]): Unit = js.native
  
  val `type`: ClientTypes = js.native
  
  val url: String = js.native
}
