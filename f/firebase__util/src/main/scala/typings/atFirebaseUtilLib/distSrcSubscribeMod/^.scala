package typings
package atFirebaseUtilLib.distSrcSubscribeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util/dist/src/subscribe", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def async(fn: js.Function): js.Function = js.native
  def async(fn: js.Function, onError: atFirebaseUtilLib.distSrcSubscribeMod.ErrorFn): js.Function = js.native
  def createSubscribe[T](executor: atFirebaseUtilLib.distSrcSubscribeMod.Executor[T]): atFirebaseUtilLib.distSrcSubscribeMod.Subscribe[T] = js.native
  def createSubscribe[T](
    executor: atFirebaseUtilLib.distSrcSubscribeMod.Executor[T],
    onNoObservers: atFirebaseUtilLib.distSrcSubscribeMod.Executor[T]
  ): atFirebaseUtilLib.distSrcSubscribeMod.Subscribe[T] = js.native
}

