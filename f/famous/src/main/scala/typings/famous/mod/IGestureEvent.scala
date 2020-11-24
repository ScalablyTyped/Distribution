package typings.famous.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGestureEvent extends js.Object {
  
  def callback(): Unit = js.native
  def callback(payload: IGesturePayload): Unit = js.native
  
  var event: String = js.native
}
