package typings.formstate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formstate/lib/internal/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def debounce[T /* <: js.Function */](func: T, milliseconds: Double): T = js.native
  def debounce[T /* <: js.Function */](func: T, milliseconds: Double, immediate: Boolean): T = js.native
  def isMapLike(thing: js.Any): Boolean = js.native
  def isPromiseLike(arg: js.Any): /* is std.Promise<any> */ Boolean = js.native
}

