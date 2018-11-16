package typings
package fpDashTsLib.libNonEmptyArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/NonEmptyArray", JSImport.Namespace)
@js.native
object libNonEmptyArrayModMembers extends js.Object {
  val URI: /* NonEmptyArray */ java.lang.String = js.native
  val fromArray: js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    fpDashTsLib.libOptionMod.Option[NonEmptyArray[js.Any]]
  ] = js.native
  val getSemigroup: js.Function0[fpDashTsLib.libSemigroupMod.Semigroup[NonEmptyArray[js.Any]]] = js.native
  val group: js.Function1[
    /* S */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    js.Function1[
      /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
      fpDashTsLib.libArrayMod.Global.Array[NonEmptyArray[js.Any]]
    ]
  ] = js.native
  val groupBy: js.Function2[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    /* f */ js.Function1[/* a */ js.Any, java.lang.String], 
    ScalablyTyped.runtime.StringDictionary[NonEmptyArray[js.Any]]
  ] = js.native
  val groupSort: js.Function1[
    /* O */ fpDashTsLib.libOrdMod.Ord[js.Any], 
    js.Function1[
      /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
      fpDashTsLib.libArrayMod.Global.Array[NonEmptyArray[js.Any]]
    ]
  ] = js.native
  val nonEmptyArray: fpDashTsLib.libMonadMod.Monad1[URI] with fpDashTsLib.libComonadMod.Comonad1[URI] with fpDashTsLib.libFoldable2vMod.Foldable2v1[URI] with fpDashTsLib.libTraversable2vMod.Traversable2v1[URI] = js.native
}

