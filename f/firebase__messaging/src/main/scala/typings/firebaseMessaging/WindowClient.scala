package typings.firebaseMessaging

import typings.std.VisibilityState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowClient extends Client {
  
  def focus(): js.Promise[WindowClient] = js.native
  
  val focused: Boolean = js.native
  
  def navigate(url: String): js.Promise[WindowClient] = js.native
  
  val visibilityState: VisibilityState = js.native
}
