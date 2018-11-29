package typings
package fpDashTsLib.libTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Tree", JSImport.Namespace)
@js.native
object libTreeModMembers extends js.Object {
  val URI: /* Tree */ java.lang.String = js.native
  val drawForest: js.Function1[
    /* forest */ fpDashTsLib.libArrayMod.Global.Array[Tree[java.lang.String]], 
    java.lang.String
  ] = js.native
  val drawTree: js.Function1[/* tree */ Tree[java.lang.String], java.lang.String] = js.native
  val getSetoid: js.Function1[
    /* S */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    fpDashTsLib.libSetoidMod.Setoid[Tree[js.Any]]
  ] = js.native
  val tree: fpDashTsLib.libMonadMod.Monad1[URI] with fpDashTsLib.libFoldable2vMod.Foldable2v1[URI] with fpDashTsLib.libTraversable2vMod.Traversable2v1[URI] with fpDashTsLib.libComonadMod.Comonad1[URI] = js.native
  val unfoldForest: js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    /* f */ js.Function1[/* b */ js.Any, js.Tuple2[js.Any, fpDashTsLib.libArrayMod.Global.Array[js.Any]]], 
    fpDashTsLib.libArrayMod.Global.Array[Tree[js.Any]]
  ] = js.native
  val unfoldTree: js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[/* b */ js.Any, js.Tuple2[js.Any, fpDashTsLib.libArrayMod.Global.Array[js.Any]]], 
    Tree[js.Any]
  ] = js.native
  def unfoldForestM[M](M: fpDashTsLib.libMonadMod.Monad[M]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.HKT[M, js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]]
    ], 
    fpDashTsLib.libHKTMod.HKT[M, Forest[_]]
  ] = js.native
  def unfoldForestM[M /* <: fpDashTsLib.libHKTMod.URIS */](M: fpDashTsLib.libMonadMod.Monad1[M]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type[M, js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]]
    ], 
    fpDashTsLib.libHKTMod.Type[M, Forest[_]]
  ] = js.native
  def unfoldForestM[M /* <: fpDashTsLib.libHKTMod.URIS2 */](M: fpDashTsLib.libMonadMod.Monad2[M]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[M, _, js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]]
    ], 
    fpDashTsLib.libHKTMod.Type2[M, _, Forest[_]]
  ] = js.native
  def unfoldForestM[M /* <: fpDashTsLib.libHKTMod.URIS3 */](M: fpDashTsLib.libMonadMod.Monad3[M]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[M, _, _, js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]]
    ], 
    fpDashTsLib.libHKTMod.Type3[M, _, _, Forest[_]]
  ] = js.native
  def unfoldForestM[M /* <: fpDashTsLib.libHKTMod.URIS2 */, L](M: fpDashTsLib.libMonadMod.Monad2C[M, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[M, L, js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]]
    ], 
    fpDashTsLib.libHKTMod.Type2[M, L, Forest[_]]
  ] = js.native
  def unfoldForestM[M /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](M: fpDashTsLib.libMonadMod.Monad3C[M, U, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[M, U, L, js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]]
    ], 
    fpDashTsLib.libHKTMod.Type3[M, U, L, Forest[_]]
  ] = js.native
  def unfoldTreeM[M](M: fpDashTsLib.libMonadMod.Monad[M]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.HKT[M, js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]]
    ], 
    fpDashTsLib.libHKTMod.HKT[M, Tree[_]]
  ] = js.native
  def unfoldTreeM[M /* <: fpDashTsLib.libHKTMod.URIS */](M: fpDashTsLib.libMonadMod.Monad1[M]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type[M, js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]]
    ], 
    fpDashTsLib.libHKTMod.Type[M, Tree[_]]
  ] = js.native
  def unfoldTreeM[M /* <: fpDashTsLib.libHKTMod.URIS2 */](M: fpDashTsLib.libMonadMod.Monad2[M]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[M, _, js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]]
    ], 
    fpDashTsLib.libHKTMod.Type2[M, _, Tree[_]]
  ] = js.native
  def unfoldTreeM[M /* <: fpDashTsLib.libHKTMod.URIS3 */](M: fpDashTsLib.libMonadMod.Monad3[M]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[M, _, _, js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]]
    ], 
    fpDashTsLib.libHKTMod.Type3[M, _, _, Tree[_]]
  ] = js.native
  def unfoldTreeM[M /* <: fpDashTsLib.libHKTMod.URIS2 */, L](M: fpDashTsLib.libMonadMod.Monad2C[M, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[M, L, js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]]
    ], 
    fpDashTsLib.libHKTMod.Type2[M, L, Tree[_]]
  ] = js.native
  def unfoldTreeM[M /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](M: fpDashTsLib.libMonadMod.Monad3C[M, U, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[M, U, L, js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]]
    ], 
    fpDashTsLib.libHKTMod.Type3[M, U, L, Tree[_]]
  ] = js.native
}

