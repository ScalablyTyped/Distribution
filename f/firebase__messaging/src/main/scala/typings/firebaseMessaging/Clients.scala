package typings.firebaseMessaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Clients extends js.Object {
  
  def claim(): js.Promise[Unit] = js.native
  
  def get(id: String): js.Promise[_] = js.native
  
  def matchAll(): js.Promise[js.Array[Client]] = js.native
  def matchAll(options: ClientQueryOptions): js.Promise[js.Array[Client]] = js.native
  
  def openWindow(url: String): js.Promise[WindowClient | Null] = js.native
}
