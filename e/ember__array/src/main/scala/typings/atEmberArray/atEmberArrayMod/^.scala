package typings.atEmberArray.atEmberArrayMod

import typings.atEmberArray.dashPrivateNativeDashArrayMod.NativeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/array", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // Ember.Array rather than Array because the `array-type` lint rule doesn't realize the global is shadowed
  // tslint:disable-next-line:array-type
  val default: typings.atEmberObject.mixinMod.default[Array[js.Any], typings.atEmberObject.atEmberObjectMod.default] = js.native
  def A[T](): NativeArray[T] = js.native
  def A[T](arr: Array[T]): NativeArray[T] = js.native
  def isArray(obj: js.Any): /* is std.ArrayLike<any> */ Boolean = js.native
}

