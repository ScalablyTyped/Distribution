package typings.firebaseUtil.subscribeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/util/dist/src/subscribe", "createSubscribe")
@js.native
object createSubscribe extends js.Object {
  
  def apply[T](executor: Executor[T]): Subscribe[T] = js.native
  def apply[T](executor: Executor[T], onNoObservers: Executor[T]): Subscribe[T] = js.native
}
