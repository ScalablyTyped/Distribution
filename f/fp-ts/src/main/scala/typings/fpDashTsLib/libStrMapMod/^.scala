package typings
package fpDashTsLib.libStrMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/StrMap", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: /* StrMap */ java.lang.String = js.native
  val strmap: (fpDashTsLib.libFunctorWithIndexMod.FunctorWithIndex1[fpDashTsLib.libStrMapMod.URI, java.lang.String]) with fpDashTsLib.libFoldable2vMod.Foldable2v1[fpDashTsLib.libStrMapMod.URI] with (fpDashTsLib.libTraversableWithIndexMod.TraversableWithIndex1[fpDashTsLib.libStrMapMod.URI, java.lang.String]) with fpDashTsLib.libCompactableMod.Compactable1[fpDashTsLib.libStrMapMod.URI] with (fpDashTsLib.libFilterableWithIndexMod.FilterableWithIndex1[fpDashTsLib.libStrMapMod.URI, java.lang.String]) with fpDashTsLib.libWitherableMod.Witherable1[fpDashTsLib.libStrMapMod.URI] with (fpDashTsLib.libFoldableWithIndexMod.FoldableWithIndex1[fpDashTsLib.libStrMapMod.URI, java.lang.String]) = js.native
  def collect[A, B](d: fpDashTsLib.libStrMapMod.StrMap[A], f: js.Function2[/* k */ java.lang.String, /* a */ A, B]): fpDashTsLib.libArrayMod.Global.Array[B] = js.native
  def elem[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[/* a */ A, /* fa */ fpDashTsLib.libStrMapMod.StrMap[A], scala.Boolean] = js.native
  def fromFoldable[F](F: fpDashTsLib.libFoldableMod.Foldable[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[java.lang.String, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.libStrMapMod.StrMap[_]
  ] = js.native
  def fromFoldable[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFoldableMod.Foldable1[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type[F, js.Tuple2[java.lang.String, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.libStrMapMod.StrMap[_]
  ] = js.native
  def fromFoldable[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFoldableMod.Foldable2[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[F, _, js.Tuple2[java.lang.String, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.libStrMapMod.StrMap[_]
  ] = js.native
  def fromFoldable[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libFoldableMod.Foldable3[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type3[F, _, _, js.Tuple2[java.lang.String, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.libStrMapMod.StrMap[_]
  ] = js.native
  def getMonoid[A](): fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libStrMapMod.StrMap[A]] = js.native
  def getMonoid[A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libStrMapMod.StrMap[A]] = js.native
  def getSetoid[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): fpDashTsLib.libSetoidMod.Setoid[fpDashTsLib.libStrMapMod.StrMap[A]] = js.native
  def insert[A](k: java.lang.String, a: A, d: fpDashTsLib.libStrMapMod.StrMap[A]): fpDashTsLib.libStrMapMod.StrMap[A] = js.native
  def isEmpty[A](d: fpDashTsLib.libStrMapMod.StrMap[A]): scala.Boolean = js.native
  def isSubdictionary[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* d1 */ fpDashTsLib.libStrMapMod.StrMap[A], 
    /* d2 */ fpDashTsLib.libStrMapMod.StrMap[A], 
    scala.Boolean
  ] = js.native
  def lookup[A](k: java.lang.String, d: fpDashTsLib.libStrMapMod.StrMap[A]): fpDashTsLib.libOptionMod.Option[A] = js.native
  def pop[A](k: java.lang.String, d: fpDashTsLib.libStrMapMod.StrMap[A]): fpDashTsLib.libOptionMod.Option[js.Tuple2[A, fpDashTsLib.libStrMapMod.StrMap[A]]] = js.native
  def remove[A](k: java.lang.String, d: fpDashTsLib.libStrMapMod.StrMap[A]): fpDashTsLib.libStrMapMod.StrMap[A] = js.native
  def singleton[A](k: java.lang.String, a: A): fpDashTsLib.libStrMapMod.StrMap[A] = js.native
  def size[A](d: fpDashTsLib.libStrMapMod.StrMap[A]): scala.Double = js.native
  def toArray[A](d: fpDashTsLib.libStrMapMod.StrMap[A]): fpDashTsLib.libArrayMod.Global.Array[js.Tuple2[java.lang.String, A]] = js.native
  def toUnfoldable[F](U: fpDashTsLib.libUnfoldableMod.Unfoldable[F]): js.Function1[
    /* d */ fpDashTsLib.libStrMapMod.StrMap[_], 
    fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[java.lang.String, _]]
  ] = js.native
  def toUnfoldable[F /* <: fpDashTsLib.libHKTMod.URIS */](U: fpDashTsLib.libUnfoldableMod.Unfoldable1[F]): js.Function1[
    /* d */ fpDashTsLib.libStrMapMod.StrMap[_], 
    fpDashTsLib.libHKTMod.Type[F, js.Tuple2[java.lang.String, _]]
  ] = js.native
  def traverseWithKey[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function2[
    /* ta */ fpDashTsLib.libStrMapMod.StrMap[_], 
    /* f */ js.Function2[/* k */ java.lang.String, /* a */ js.Any, fpDashTsLib.libHKTMod.HKT[F, _]], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libStrMapMod.StrMap[_]]
  ] = js.native
  def traverseWithKey[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function2[
    /* ta */ fpDashTsLib.libStrMapMod.StrMap[_], 
    /* f */ js.Function2[/* k */ java.lang.String, /* a */ js.Any, fpDashTsLib.libHKTMod.Type[F, _]], 
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libStrMapMod.StrMap[_]]
  ] = js.native
  def traverseWithKey[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function2[
    /* ta */ fpDashTsLib.libStrMapMod.StrMap[_], 
    /* f */ js.Function2[/* k */ java.lang.String, /* a */ js.Any, fpDashTsLib.libHKTMod.Type2[F, _, _]], 
    fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libStrMapMod.StrMap[_]]
  ] = js.native
  def traverseWithKey[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function2[
    /* ta */ fpDashTsLib.libStrMapMod.StrMap[_], 
    /* f */ js.Function2[/* k */ java.lang.String, /* a */ js.Any, fpDashTsLib.libHKTMod.Type3[F, _, _, _]], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, fpDashTsLib.libStrMapMod.StrMap[_]]
  ] = js.native
}

