package typings
package fpDashTsLib.libFreeGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/FreeGroup", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: /* FreeGroup */ java.lang.String = js.native
  val empty: FreeGroup[scala.Nothing] = js.native
  val freeGroup: fpDashTsLib.libMonadMod.Monad1[URI] = js.native
  def fromArray[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libEitherMod.Either[A, A]], 
    FreeGroup[A]
  ] = js.native
  def getGroup[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): fpDashTsLib.libGroupMod.Group[FreeGroup[A]] = js.native
  def getSetoid[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): fpDashTsLib.libSetoidMod.Setoid[FreeGroup[A]] = js.native
  def normalize[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function1[
    /* g */ fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libEitherMod.Either[A, A]], 
    fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libEitherMod.Either[A, A]]
  ] = js.native
}

