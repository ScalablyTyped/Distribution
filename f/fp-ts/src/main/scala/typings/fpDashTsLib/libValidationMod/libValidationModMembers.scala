package typings
package fpDashTsLib.libValidationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Validation", JSImport.Namespace)
@js.native
object libValidationModMembers extends js.Object {
  val URI: /* Validation */ java.lang.String = js.native
  val failure: js.Function1[/* l */ js.Any, Validation[js.Any, js.Any]] = js.native
  val fromEither: js.Function1[
    /* e */ fpDashTsLib.libEitherMod.Either[js.Any, js.Any], 
    Validation[js.Any, js.Any]
  ] = js.native
  val fromPredicate: js.Function2[
    /* predicate */ fpDashTsLib.libFunctionMod.Predicate[js.Any], 
    /* f */ js.Function1[/* a */ js.Any, js.Any], 
    js.Function1[/* a */ js.Any, Validation[js.Any, js.Any]]
  ] = js.native
  val getAlt: js.Function1[
    /* S */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libAltMod.Alt2C[fpDashTsLib.fpDashTsLibStrings.Validation, js.Any]
  ] = js.native
  val getApplicative: js.Function1[
    /* S */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Validation, js.Any]
  ] = js.native
  val getMonad: js.Function1[
    /* S */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Validation, js.Any]
  ] = js.native
  val getMonoid: js.Function2[
    /* SL */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    /* SA */ fpDashTsLib.libMonoidMod.Monoid[js.Any], 
    fpDashTsLib.libMonoidMod.Monoid[Validation[js.Any, js.Any]]
  ] = js.native
  val getSemigroup: js.Function2[
    /* SL */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    /* SA */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libSemigroupMod.Semigroup[Validation[js.Any, js.Any]]
  ] = js.native
  val getSetoid: js.Function2[
    /* SL */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    /* SA */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    fpDashTsLib.libSetoidMod.Setoid[Validation[js.Any, js.Any]]
  ] = js.native
  val isFailure: js.Function1[/* fa */ Validation[js.Any, js.Any], /* is Failure */scala.Boolean] = js.native
  val isSuccess: js.Function1[/* fa */ Validation[js.Any, js.Any], /* is Success */scala.Boolean] = js.native
  val success: js.Function1[/* a */ js.Any, Validation[js.Any, js.Any]] = js.native
  val validation: fpDashTsLib.libFunctorMod.Functor2[URI] with fpDashTsLib.libBifunctorMod.Bifunctor2[URI] with fpDashTsLib.libFoldable2vMod.Foldable2v2[URI] with fpDashTsLib.libTraversable2vMod.Traversable2v2[URI] = js.native
  def getCompactable[L](ML: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libCompactableMod.Compactable2C[URI, L] = js.native
  def getFilterable[L](ML: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libFilterableMod.Filterable2C[URI, L] = js.native
  def getWitherable[L](ML: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libWitherableMod.Witherable2C[URI, L] = js.native
}

