package typings
package atFirebaseUtilLib.distSrcSubscribeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util/dist/src/subscribe", JSImport.Namespace)
@js.native
object distSrcSubscribeModMembers extends js.Object {
  def async(fn: js.Function): js.Function = js.native
  def async(fn: js.Function, onError: ErrorFn): js.Function = js.native
  def createSubscribe[T](executor: Executor[T]): Subscribe[T] = js.native
  def createSubscribe[T](executor: Executor[T], onNoObservers: Executor[T]): Subscribe[T] = js.native
}

