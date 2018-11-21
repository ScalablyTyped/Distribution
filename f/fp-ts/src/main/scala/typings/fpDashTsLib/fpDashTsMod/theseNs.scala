package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "these")
@js.native
object theseNs extends js.Object {
  @js.native
  class Both[L, A] protected ()
    extends fpDashTsLib.libTheseMod.Both[L, A] {
    def this(l: L, a: A) = this()
  }
  
  @js.native
  class That[L, A] protected ()
    extends fpDashTsLib.libTheseMod.That[L, A] {
    def this(value: A) = this()
  }
  
  @js.native
  class This[L, A] protected ()
    extends fpDashTsLib.libTheseMod.This[L, A] {
    def this(value: L) = this()
  }
  
  val URI: /* These */ java.lang.String = js.native
  val both: js.Function2[/* l */ js.Any, /* a */ js.Any, fpDashTsLib.libTheseMod.These[js.Any, js.Any]] = js.native
  val fromThese: js.Function2[
    /* defaultThis */ js.Any, 
    /* defaultThat */ js.Any, 
    js.Function1[/* fa */ fpDashTsLib.libTheseMod.These[js.Any, js.Any], js.Tuple2[js.Any, js.Any]]
  ] = js.native
  val getMonad: js.Function1[
    /* S */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.These, js.Any]
  ] = js.native
  val getSemigroup: js.Function2[
    /* SL */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    /* SA */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libTheseMod.These[js.Any, js.Any]]
  ] = js.native
  val getSetoid: js.Function2[
    /* SL */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    /* SA */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    fpDashTsLib.libSetoidMod.Setoid[fpDashTsLib.libTheseMod.These[js.Any, js.Any]]
  ] = js.native
  val isBoth: js.Function1[/* fa */ fpDashTsLib.libTheseMod.These[js.Any, js.Any], /* is Both */scala.Boolean] = js.native
  val isThat: js.Function1[/* fa */ fpDashTsLib.libTheseMod.These[js.Any, js.Any], /* is That */scala.Boolean] = js.native
  val isThis: js.Function1[/* fa */ fpDashTsLib.libTheseMod.These[js.Any, js.Any], /* is This */scala.Boolean] = js.native
  val that: js.Function1[/* a */ js.Any, fpDashTsLib.libTheseMod.These[js.Any, js.Any]] = js.native
  val these: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.libTheseMod.URI] with fpDashTsLib.libBifunctorMod.Bifunctor2[fpDashTsLib.libTheseMod.URI] with fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.libTheseMod.URI] with fpDashTsLib.libTraversableMod.Traversable2[fpDashTsLib.libTheseMod.URI] = js.native
  val theseLeft: js.Function1[
    /* fa */ fpDashTsLib.libTheseMod.These[js.Any, js.Any], 
    fpDashTsLib.libOptionMod.Option[js.Any]
  ] = js.native
  val theseRight: js.Function1[
    /* fa */ fpDashTsLib.libTheseMod.These[js.Any, js.Any], 
    fpDashTsLib.libOptionMod.Option[js.Any]
  ] = js.native
  val `this_`: js.Function1[/* l */ js.Any, fpDashTsLib.libTheseMod.These[js.Any, js.Any]] = js.native
}

