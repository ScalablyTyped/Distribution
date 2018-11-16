package typings
package fpDashTsLib.libWriterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Writer", JSImport.Namespace)
@js.native
object libWriterModMembers extends js.Object {
  val URI: /* Writer */ java.lang.String = js.native
  val censor: js.Function2[
    /* fa */ Writer[js.Any, js.Any], 
    /* f */ js.Function1[/* w */ js.Any, js.Any], 
    Writer[js.Any, js.Any]
  ] = js.native
  val getMonad: js.Function1[
    /* M */ fpDashTsLib.libMonoidMod.Monoid[js.Any], 
    fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Writer, js.Any]
  ] = js.native
  val listen: js.Function1[/* fa */ Writer[js.Any, js.Any], Writer[js.Any, js.Tuple2[js.Any, js.Any]]] = js.native
  val listens: js.Function2[
    /* fa */ Writer[js.Any, js.Any], 
    /* f */ js.Function1[/* w */ js.Any, js.Any], 
    Writer[js.Any, js.Tuple2[js.Any, js.Any]]
  ] = js.native
  val pass: js.Function1[
    /* fa */ Writer[js.Any, js.Tuple2[js.Any, js.Function1[/* w */ js.Any, js.Any]]], 
    Writer[js.Any, js.Any]
  ] = js.native
  val tell: js.Function1[/* w */ js.Any, Writer[js.Any, scala.Unit]] = js.native
  val writer: fpDashTsLib.libFunctorMod.Functor2[URI] = js.native
}

