package typings
package fpDashTsLib.libOptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Option", JSImport.Namespace)
@js.native
object libOptionModMembers extends js.Object {
  val URI: /* Option */ java.lang.String = js.native
  val fromEither: js.Function1[/* fa */ fpDashTsLib.libEitherMod.Either[js.Any, js.Any], Option[js.Any]] = js.native
  val fromNullable: js.Function1[/* a */ js.UndefOr[js.Any | scala.Null], Option[js.Any]] = js.native
  val fromPredicate: js.Function1[
    /* predicate */ fpDashTsLib.libFunctionMod.Predicate[js.Any], 
    js.Function1[/* a */ js.Any, Option[js.Any]]
  ] = js.native
  val fromRefinement: js.Function1[
    /* refinement */ fpDashTsLib.libFunctionMod.Refinement[js.Any, js.Any], 
    js.Function1[/* a */ js.Any, Option[js.Any]]
  ] = js.native
  val getApplyMonoid: js.Function1[
    /* M */ fpDashTsLib.libMonoidMod.Monoid[js.Any], 
    fpDashTsLib.libMonoidMod.Monoid[Option[js.Any]]
  ] = js.native
  val getApplySemigroup: js.Function1[
    /* S */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libSemigroupMod.Semigroup[Option[js.Any]]
  ] = js.native
  val getFirstMonoid: js.Function0[fpDashTsLib.libMonoidMod.Monoid[Option[js.Any]]] = js.native
  val getLastMonoid: js.Function0[fpDashTsLib.libMonoidMod.Monoid[Option[js.Any]]] = js.native
  val getMonoid: js.Function1[
    /* S */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libMonoidMod.Monoid[Option[js.Any]]
  ] = js.native
  val getOrd: js.Function1[
    /* O */ fpDashTsLib.libOrdMod.Ord[js.Any], 
    fpDashTsLib.libOrdMod.Ord[Option[js.Any]]
  ] = js.native
  val getRefinement: js.Function1[
    /* getOption */ js.Function1[/* a */ js.Any, Option[js.Any]], 
    fpDashTsLib.libFunctionMod.Refinement[js.Any, js.Any]
  ] = js.native
  val getSetoid: js.Function1[
    /* S */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    fpDashTsLib.libSetoidMod.Setoid[Option[js.Any]]
  ] = js.native
  val isNone: js.Function1[/* fa */ Option[js.Any], /* is None */scala.Boolean] = js.native
  val isSome: js.Function1[/* fa */ Option[js.Any], /* is Some */scala.Boolean] = js.native
  val none: Option[scala.Nothing] = js.native
  val option: fpDashTsLib.libMonadMod.Monad1[URI] with fpDashTsLib.libFoldableMod.Foldable1[URI] with fpDashTsLib.libPlusMod.Plus1[URI] with fpDashTsLib.libTraversableMod.Traversable1[URI] with fpDashTsLib.libAlternativeMod.Alternative1[URI] with fpDashTsLib.libExtendMod.Extend1[URI] with fpDashTsLib.libCompactableMod.Compactable1[URI] with fpDashTsLib.libFilterableMod.Filterable1[URI] with fpDashTsLib.libWitherableMod.Witherable1[URI] = js.native
  val some: js.Function1[/* a */ js.Any, Option[js.Any]] = js.native
  val tryCatch: js.Function1[/* f */ fpDashTsLib.libFunctionMod.Lazy[js.Any], Option[js.Any]] = js.native
}

