package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "nonEmptyArray")
@js.native
object nonEmptyArrayNs extends js.Object {
  @js.native
  class NonEmptyArray[A] protected ()
    extends fpDashTsLib.libNonEmptyArrayMod.NonEmptyArray[A] {
    def this(head: A, tail: fpDashTsLib.libArrayMod.Global.Array[A]) = this()
  }
  
  val URI: /* NonEmptyArray */ java.lang.String = js.native
  val fromArray: js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    fpDashTsLib.libOptionMod.Option[fpDashTsLib.libNonEmptyArrayMod.NonEmptyArray[js.Any]]
  ] = js.native
  val getSemigroup: js.Function0[
    fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libNonEmptyArrayMod.NonEmptyArray[js.Any]]
  ] = js.native
  val group: js.Function1[
    /* S */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    js.Function1[
      /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
      fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libNonEmptyArrayMod.NonEmptyArray[js.Any]]
    ]
  ] = js.native
  val groupSort: js.Function1[
    /* O */ fpDashTsLib.libOrdMod.Ord[js.Any], 
    js.Function1[
      /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
      fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libNonEmptyArrayMod.NonEmptyArray[js.Any]]
    ]
  ] = js.native
  val nonEmptyArray: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.libNonEmptyArrayMod.URI] with fpDashTsLib.libComonadMod.Comonad1[fpDashTsLib.libNonEmptyArrayMod.URI] with fpDashTsLib.libFoldableMod.Foldable1[fpDashTsLib.libNonEmptyArrayMod.URI] with fpDashTsLib.libTraversableMod.Traversable1[fpDashTsLib.libNonEmptyArrayMod.URI] = js.native
}

