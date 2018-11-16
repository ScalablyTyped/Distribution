package typings
package fpDashTsLib.libTheseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/These", JSImport.Namespace)
@js.native
object libTheseModMembers extends js.Object {
  val URI: /* These */ java.lang.String = js.native
  val both: js.Function2[/* l */ js.Any, /* a */ js.Any, These[js.Any, js.Any]] = js.native
  val fromThese: js.Function2[
    /* defaultThis */ js.Any, 
    /* defaultThat */ js.Any, 
    js.Function1[/* fa */ These[js.Any, js.Any], js.Tuple2[js.Any, js.Any]]
  ] = js.native
  val getMonad: js.Function1[
    /* S */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.These, js.Any]
  ] = js.native
  val getSemigroup: js.Function2[
    /* SL */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    /* SA */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libSemigroupMod.Semigroup[These[js.Any, js.Any]]
  ] = js.native
  val getSetoid: js.Function2[
    /* SL */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    /* SA */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    fpDashTsLib.libSetoidMod.Setoid[These[js.Any, js.Any]]
  ] = js.native
  val isBoth: js.Function1[/* fa */ These[js.Any, js.Any], /* is Both */scala.Boolean] = js.native
  val isThat: js.Function1[/* fa */ These[js.Any, js.Any], /* is That */scala.Boolean] = js.native
  val isThis: js.Function1[/* fa */ These[js.Any, js.Any], /* is This */scala.Boolean] = js.native
  val that: js.Function1[/* a */ js.Any, These[js.Any, js.Any]] = js.native
  val these: fpDashTsLib.libFunctorMod.Functor2[URI] with fpDashTsLib.libBifunctorMod.Bifunctor2[URI] with fpDashTsLib.libFoldable2vMod.Foldable2v2[URI] with fpDashTsLib.libTraversable2vMod.Traversable2v2[URI] = js.native
  val theseLeft: js.Function1[/* fa */ These[js.Any, js.Any], fpDashTsLib.libOptionMod.Option[js.Any]] = js.native
  val theseRight: js.Function1[/* fa */ These[js.Any, js.Any], fpDashTsLib.libOptionMod.Option[js.Any]] = js.native
  val `this_`: js.Function1[/* l */ js.Any, These[js.Any, js.Any]] = js.native
}

