package typings.foreach

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("foreach", JSImport.Namespace)
  @js.native
  def apply[O /* <: ArrayLike[_] */, THIS_ARG](
    array: O,
    callbackfn: js.ThisFunction3[/* this */ THIS_ARG, /* value */ js.Any, /* index */ Double, /* array */ O, Unit]
  ): Unit = js.native
  @JSImport("foreach", JSImport.Namespace)
  @js.native
  def apply[O /* <: ArrayLike[_] */, THIS_ARG](
    array: O,
    callbackfn: js.ThisFunction3[/* this */ THIS_ARG, /* value */ js.Any, /* index */ Double, /* array */ O, Unit],
    thisArg: THIS_ARG
  ): Unit = js.native
}
