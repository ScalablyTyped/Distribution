package typings.foreach

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("foreach", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply[O /* <: ArrayLike[_] */, THIS_ARG](
    array: O,
    callbackfn: js.ThisFunction3[/* this */ THIS_ARG, /* value */ js.Any, /* index */ Double, /* array */ O, Unit]
  ): Unit = js.native
  def apply[O /* <: ArrayLike[_] */, THIS_ARG](
    array: O,
    callbackfn: js.ThisFunction3[/* this */ THIS_ARG, /* value */ js.Any, /* index */ Double, /* array */ O, Unit],
    thisArg: THIS_ARG
  ): Unit = js.native
}
