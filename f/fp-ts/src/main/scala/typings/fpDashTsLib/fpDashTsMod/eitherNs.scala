package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "either")
@js.native
object eitherNs extends js.Object {
  @js.native
  class Left[L, A] protected ()
    extends fpDashTsLib.libEitherMod.Left[L, A] {
    def this(value: L) = this()
  }
  
  @js.native
  class Right[L, A] protected ()
    extends fpDashTsLib.libEitherMod.Right[L, A] {
    def this(value: A) = this()
  }
  
  val URI: /* Either */ java.lang.String = js.native
  val either: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.libEitherMod.URI] with fpDashTsLib.libFoldable2vMod.Foldable2v2[fpDashTsLib.libEitherMod.URI] with fpDashTsLib.libTraversable2vMod.Traversable2v2[fpDashTsLib.libEitherMod.URI] with fpDashTsLib.libBifunctorMod.Bifunctor2[fpDashTsLib.libEitherMod.URI] with fpDashTsLib.libAltMod.Alt2[fpDashTsLib.libEitherMod.URI] with fpDashTsLib.libExtendMod.Extend2[fpDashTsLib.libEitherMod.URI] with fpDashTsLib.libChainRecMod.ChainRec2[fpDashTsLib.libEitherMod.URI] = js.native
  val fromNullable: js.Function1[
    /* defaultValue */ js.Any, 
    js.Function1[
      /* a */ js.UndefOr[js.Any | scala.Null], 
      fpDashTsLib.libEitherMod.Either[js.Any, js.Any]
    ]
  ] = js.native
  val fromOption: js.Function1[
    /* defaultValue */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libOptionMod.Option[js.Any], 
      fpDashTsLib.libEitherMod.Either[js.Any, js.Any]
    ]
  ] = js.native
  val fromOptionL: js.Function1[
    /* defaultValue */ fpDashTsLib.libFunctionMod.Lazy[js.Any], 
    js.Function1[
      /* fa */ fpDashTsLib.libOptionMod.Option[js.Any], 
      fpDashTsLib.libEitherMod.Either[js.Any, js.Any]
    ]
  ] = js.native
  val fromPredicate: js.Function2[
    /* predicate */ fpDashTsLib.libFunctionMod.Predicate[js.Any], 
    /* whenFalse */ js.Function1[/* a */ js.Any, js.Any], 
    js.Function1[/* a */ js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]
  ] = js.native
  val fromRefinement: js.Function2[
    /* refinement */ fpDashTsLib.libFunctionMod.Refinement[js.Any, js.Any], 
    /* whenFalse */ js.Function1[/* a */ js.Any, js.Any], 
    js.Function1[/* a */ js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]
  ] = js.native
  val fromValidation: js.Function1[
    /* fa */ fpDashTsLib.libValidationMod.Validation[js.Any, js.Any], 
    fpDashTsLib.libEitherMod.Either[js.Any, js.Any]
  ] = js.native
  val getApplyMonoid: js.Function1[
    /* M */ fpDashTsLib.libMonoidMod.Monoid[js.Any], 
    fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]
  ] = js.native
  val getApplySemigroup: js.Function1[
    /* S */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]
  ] = js.native
  val getSemigroup: js.Function1[
    /* S */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]
  ] = js.native
  val getSetoid: js.Function2[
    /* SL */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    /* SA */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    fpDashTsLib.libSetoidMod.Setoid[fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]
  ] = js.native
  val isLeft: js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[js.Any, js.Any], 
    /* is Left */scala.Boolean
  ] = js.native
  val isRight: js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[js.Any, js.Any], 
    /* is Right */scala.Boolean
  ] = js.native
  val left: js.Function1[/* l */ js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]] = js.native
  val right: js.Function1[/* a */ js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]] = js.native
  val toError: js.Function1[/* e */ js.Object, stdLib.Error] = js.native
  val tryCatch: js.Function2[
    /* f */ fpDashTsLib.libFunctionMod.Lazy[js.Any], 
    /* onerror */ js.UndefOr[js.Function1[/* e */ js.Object, stdLib.Error]], 
    fpDashTsLib.libEitherMod.Either[stdLib.Error, js.Any]
  ] = js.native
  def getCompactable[L](ML: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libCompactableMod.Compactable2C[fpDashTsLib.libEitherMod.URI, L] = js.native
  def getFilterable[L](ML: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libFilterableMod.Filterable2C[fpDashTsLib.libEitherMod.URI, L] = js.native
  def getWitherable[L](ML: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libWitherableMod.Witherable2C[fpDashTsLib.libEitherMod.URI, L] = js.native
}

