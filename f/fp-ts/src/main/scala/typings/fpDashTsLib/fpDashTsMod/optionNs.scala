package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "option")
@js.native
object optionNs extends js.Object {
  @js.native
  class None[A] protected ()
    extends fpDashTsLib.libOptionMod.None[A]
  
  @js.native
  class Some[A] protected ()
    extends fpDashTsLib.libOptionMod.Some[A] {
    def this(value: A) = this()
  }
  
  val URI: /* Option */ java.lang.String = js.native
  val fromEither: js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[js.Any, js.Any], 
    fpDashTsLib.libOptionMod.Option[js.Any]
  ] = js.native
  val fromNullable: js.Function1[/* a */ js.UndefOr[js.Any | scala.Null], fpDashTsLib.libOptionMod.Option[js.Any]] = js.native
  val fromRefinement: js.Function1[
    /* refinement */ fpDashTsLib.libFunctionMod.Refinement[js.Any, js.Any], 
    js.Function1[/* a */ js.Any, fpDashTsLib.libOptionMod.Option[js.Any]]
  ] = js.native
  val getApplyMonoid: js.Function1[
    /* M */ fpDashTsLib.libMonoidMod.Monoid[js.Any], 
    fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libOptionMod.Option[js.Any]]
  ] = js.native
  val getApplySemigroup: js.Function1[
    /* S */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libOptionMod.Option[js.Any]]
  ] = js.native
  val getFirstMonoid: js.Function0[fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libOptionMod.Option[js.Any]]] = js.native
  val getLastMonoid: js.Function0[fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libOptionMod.Option[js.Any]]] = js.native
  val getMonoid: js.Function1[
    /* S */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libOptionMod.Option[js.Any]]
  ] = js.native
  val getOrd: js.Function1[
    /* O */ fpDashTsLib.libOrdMod.Ord[js.Any], 
    fpDashTsLib.libOrdMod.Ord[fpDashTsLib.libOptionMod.Option[js.Any]]
  ] = js.native
  val getRefinement: js.Function1[
    /* getOption */ js.Function1[/* a */ js.Any, fpDashTsLib.libOptionMod.Option[js.Any]], 
    fpDashTsLib.libFunctionMod.Refinement[js.Any, js.Any]
  ] = js.native
  val getSetoid: js.Function1[
    /* S */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    fpDashTsLib.libSetoidMod.Setoid[fpDashTsLib.libOptionMod.Option[js.Any]]
  ] = js.native
  val isNone: js.Function1[/* fa */ fpDashTsLib.libOptionMod.Option[js.Any], /* is None */scala.Boolean] = js.native
  val isSome: js.Function1[/* fa */ fpDashTsLib.libOptionMod.Option[js.Any], /* is Some */scala.Boolean] = js.native
  val none: fpDashTsLib.libOptionMod.Option[scala.Nothing] = js.native
  val option: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.libOptionMod.URI] with fpDashTsLib.libFoldable2vMod.Foldable2v1[fpDashTsLib.libOptionMod.URI] with fpDashTsLib.libPlusMod.Plus1[fpDashTsLib.libOptionMod.URI] with fpDashTsLib.libTraversable2vMod.Traversable2v1[fpDashTsLib.libOptionMod.URI] with fpDashTsLib.libAlternativeMod.Alternative1[fpDashTsLib.libOptionMod.URI] with fpDashTsLib.libExtendMod.Extend1[fpDashTsLib.libOptionMod.URI] with fpDashTsLib.libCompactableMod.Compactable1[fpDashTsLib.libOptionMod.URI] with fpDashTsLib.libFilterableMod.Filterable1[fpDashTsLib.libOptionMod.URI] with fpDashTsLib.libWitherableMod.Witherable1[fpDashTsLib.libOptionMod.URI] = js.native
  val some: js.Function1[/* a */ js.Any, fpDashTsLib.libOptionMod.Option[js.Any]] = js.native
  val tryCatch: js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Lazy[js.Any], 
    fpDashTsLib.libOptionMod.Option[js.Any]
  ] = js.native
  def fromPredicate[A](predicate: fpDashTsLib.libFunctionMod.Predicate[A]): js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[A]] = js.native
  @JSName("fromPredicate")
  def fromPredicate_ABA[A, B /* <: A */](predicate: fpDashTsLib.libFunctionMod.Refinement[A, B]): js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[B]] = js.native
  @js.native
  object None extends js.Object {
    var value: fpDashTsLib.libOptionMod.Option[scala.Nothing] = js.native
  }
  
}

