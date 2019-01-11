package typings
package fpDashTsLib.libTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Tree", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: /* Tree */ java.lang.String = js.native
  val tree: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.libTreeMod.URI] with fpDashTsLib.libFoldable2vMod.Foldable2v1[fpDashTsLib.libTreeMod.URI] with fpDashTsLib.libTraversable2vMod.Traversable2v1[fpDashTsLib.libTreeMod.URI] with fpDashTsLib.libComonadMod.Comonad1[fpDashTsLib.libTreeMod.URI] = js.native
  def drawForest(forest: fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libTreeMod.Tree[java.lang.String]]): java.lang.String = js.native
  def drawTree(tree: fpDashTsLib.libTreeMod.Tree[java.lang.String]): java.lang.String = js.native
  def getSetoid[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): fpDashTsLib.libSetoidMod.Setoid[fpDashTsLib.libTreeMod.Tree[A]] = js.native
  def unfoldForest[A, B](
    bs: fpDashTsLib.libArrayMod.Global.Array[B],
    f: js.Function1[/* b */ B, js.Tuple2[A, fpDashTsLib.libArrayMod.Global.Array[B]]]
  ): fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libTreeMod.Tree[A]] = js.native
  def unfoldForestM[M](M: fpDashTsLib.libMonadMod.Monad[M]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.HKT[M, js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]]
    ], 
    fpDashTsLib.libHKTMod.HKT[M, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  def unfoldForestM[M /* <: fpDashTsLib.libHKTMod.URIS */](M: fpDashTsLib.libMonadMod.Monad1[M]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type[M, js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]]
    ], 
    fpDashTsLib.libHKTMod.Type[M, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  def unfoldForestM[M /* <: fpDashTsLib.libHKTMod.URIS2 */](M: fpDashTsLib.libMonadMod.Monad2[M]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[M, _, js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]]
    ], 
    fpDashTsLib.libHKTMod.Type2[M, _, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  def unfoldForestM[M /* <: fpDashTsLib.libHKTMod.URIS3 */](M: fpDashTsLib.libMonadMod.Monad3[M]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[M, _, _, js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]]
    ], 
    fpDashTsLib.libHKTMod.Type3[M, _, _, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  def unfoldForestM[M /* <: fpDashTsLib.libHKTMod.URIS2 */, L](M: fpDashTsLib.libMonadMod.Monad2C[M, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[M, L, js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]]
    ], 
    fpDashTsLib.libHKTMod.Type2[M, L, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  def unfoldForestM[M /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](M: fpDashTsLib.libMonadMod.Monad3C[M, U, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[M, U, L, js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]]
    ], 
    fpDashTsLib.libHKTMod.Type3[M, U, L, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  def unfoldTree[A, B](b: B, f: js.Function1[/* b */ B, js.Tuple2[A, fpDashTsLib.libArrayMod.Global.Array[B]]]): fpDashTsLib.libTreeMod.Tree[A] = js.native
  def unfoldTreeM[M](M: fpDashTsLib.libMonadMod.Monad[M]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.HKT[M, js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]]
    ], 
    fpDashTsLib.libHKTMod.HKT[M, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  def unfoldTreeM[M /* <: fpDashTsLib.libHKTMod.URIS */](M: fpDashTsLib.libMonadMod.Monad1[M]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type[M, js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]]
    ], 
    fpDashTsLib.libHKTMod.Type[M, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  def unfoldTreeM[M /* <: fpDashTsLib.libHKTMod.URIS2 */](M: fpDashTsLib.libMonadMod.Monad2[M]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[M, _, js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]]
    ], 
    fpDashTsLib.libHKTMod.Type2[M, _, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  def unfoldTreeM[M /* <: fpDashTsLib.libHKTMod.URIS3 */](M: fpDashTsLib.libMonadMod.Monad3[M]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[M, _, _, js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]]
    ], 
    fpDashTsLib.libHKTMod.Type3[M, _, _, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  def unfoldTreeM[M /* <: fpDashTsLib.libHKTMod.URIS2 */, L](M: fpDashTsLib.libMonadMod.Monad2C[M, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[M, L, js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]]
    ], 
    fpDashTsLib.libHKTMod.Type2[M, L, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  def unfoldTreeM[M /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](M: fpDashTsLib.libMonadMod.Monad3C[M, U, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[M, U, L, js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]]
    ], 
    fpDashTsLib.libHKTMod.Type3[M, U, L, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
}

