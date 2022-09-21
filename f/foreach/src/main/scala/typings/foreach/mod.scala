package typings.foreach

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[O /* <: ArrayLike[Any] */, THIS_ARG](
    array: O,
    callbackfn: js.ThisFunction3[/* this */ THIS_ARG, /* value */ Any, /* index */ Double, /* array */ O, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply[O /* <: ArrayLike[Any] */, THIS_ARG](
    array: O,
    callbackfn: js.ThisFunction3[/* this */ THIS_ARG, /* value */ Any, /* index */ Double, /* array */ O, Unit],
    thisArg: THIS_ARG
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("foreach", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
