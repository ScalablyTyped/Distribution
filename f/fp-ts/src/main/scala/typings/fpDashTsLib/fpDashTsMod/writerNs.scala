package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "writer")
@js.native
object writerNs extends js.Object {
  @js.native
  class Writer[W, A] protected ()
    extends fpDashTsLib.libWriterMod.Writer[W, A] {
    def this(run: js.Function0[js.Tuple2[A, W]]) = this()
  }
  
  val URI: /* Writer */ java.lang.String = js.native
  val censor: js.Function2[
    /* fa */ fpDashTsLib.libWriterMod.Writer[js.Any, js.Any], 
    /* f */ js.Function1[/* w */ js.Any, js.Any], 
    fpDashTsLib.libWriterMod.Writer[js.Any, js.Any]
  ] = js.native
  val getMonad: js.Function1[
    /* M */ fpDashTsLib.libMonoidMod.Monoid[js.Any], 
    fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Writer, js.Any]
  ] = js.native
  val listen: js.Function1[
    /* fa */ fpDashTsLib.libWriterMod.Writer[js.Any, js.Any], 
    fpDashTsLib.libWriterMod.Writer[js.Any, js.Tuple2[js.Any, js.Any]]
  ] = js.native
  val listens: js.Function2[
    /* fa */ fpDashTsLib.libWriterMod.Writer[js.Any, js.Any], 
    /* f */ js.Function1[/* w */ js.Any, js.Any], 
    fpDashTsLib.libWriterMod.Writer[js.Any, js.Tuple2[js.Any, js.Any]]
  ] = js.native
  val pass: js.Function1[
    /* fa */ fpDashTsLib.libWriterMod.Writer[js.Any, js.Tuple2[js.Any, js.Function1[/* w */ js.Any, js.Any]]], 
    fpDashTsLib.libWriterMod.Writer[js.Any, js.Any]
  ] = js.native
  val tell: js.Function1[/* w */ js.Any, fpDashTsLib.libWriterMod.Writer[js.Any, scala.Unit]] = js.native
  val writer: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.libWriterMod.URI] = js.native
}

