package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "validation")
@js.native
object validationNs extends js.Object {
  @js.native
  class Failure[L, A] protected ()
    extends fpDashTsLib.libValidationMod.Failure[L, A] {
    def this(value: L) = this()
  }
  
  @js.native
  class Success[L, A] protected ()
    extends fpDashTsLib.libValidationMod.Success[L, A] {
    def this(value: A) = this()
  }
  
  val URI: /* Validation */ java.lang.String = js.native
  val failure: js.Function1[/* l */ js.Any, fpDashTsLib.libValidationMod.Validation[js.Any, js.Any]] = js.native
  val fromEither: js.Function1[
    /* e */ fpDashTsLib.libEitherMod.Either[js.Any, js.Any], 
    fpDashTsLib.libValidationMod.Validation[js.Any, js.Any]
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
    fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libValidationMod.Validation[js.Any, js.Any]]
  ] = js.native
  val getSemigroup: js.Function2[
    /* SL */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    /* SA */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libValidationMod.Validation[js.Any, js.Any]]
  ] = js.native
  val getSetoid: js.Function2[
    /* SL */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    /* SA */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    fpDashTsLib.libSetoidMod.Setoid[fpDashTsLib.libValidationMod.Validation[js.Any, js.Any]]
  ] = js.native
  val isFailure: js.Function1[
    /* fa */ fpDashTsLib.libValidationMod.Validation[js.Any, js.Any], 
    /* is Failure */scala.Boolean
  ] = js.native
  val isSuccess: js.Function1[
    /* fa */ fpDashTsLib.libValidationMod.Validation[js.Any, js.Any], 
    /* is Success */scala.Boolean
  ] = js.native
  val success: js.Function1[/* a */ js.Any, fpDashTsLib.libValidationMod.Validation[js.Any, js.Any]] = js.native
  val validation: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.libValidationMod.URI] with fpDashTsLib.libBifunctorMod.Bifunctor2[fpDashTsLib.libValidationMod.URI] with fpDashTsLib.libFoldable2vMod.Foldable2v2[fpDashTsLib.libValidationMod.URI] with fpDashTsLib.libTraversable2vMod.Traversable2v2[fpDashTsLib.libValidationMod.URI] = js.native
  def fromPredicate[L, A](predicate: fpDashTsLib.libFunctionMod.Predicate[A], f: js.Function1[/* a */ A, L]): js.Function1[/* a */ A, fpDashTsLib.libValidationMod.Validation[L, A]] = js.native
  @JSName("fromPredicate")
  def fromPredicate_LABA[L, A, B /* <: A */](predicate: fpDashTsLib.libFunctionMod.Refinement[A, B], f: js.Function1[/* a */ A, L]): js.Function1[/* a */ A, fpDashTsLib.libValidationMod.Validation[L, B]] = js.native
  def getCompactable[L](ML: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libCompactableMod.Compactable2C[fpDashTsLib.libValidationMod.URI, L] = js.native
  def getFilterable[L](ML: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libFilterableMod.Filterable2C[fpDashTsLib.libValidationMod.URI, L] = js.native
  def getWitherable[L](ML: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libWitherableMod.Witherable2C[fpDashTsLib.libValidationMod.URI, L] = js.native
}

