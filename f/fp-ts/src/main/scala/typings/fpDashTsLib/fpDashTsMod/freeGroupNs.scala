package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "freeGroup")
@js.native
object freeGroupNs extends js.Object {
  @js.native
  class FreeGroup[A] protected ()
    extends fpDashTsLib.libFreeGroupMod.FreeGroup[A] {
    def this(value: fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libEitherMod.Either[A, A]]) = this()
  }
  
  val URI: /* FreeGroup */ java.lang.String = js.native
  val empty: fpDashTsLib.libFreeGroupMod.FreeGroup[scala.Nothing] = js.native
  val freeGroup: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.libFreeGroupMod.URI] = js.native
  def fromArray[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libEitherMod.Either[A, A]], 
    fpDashTsLib.libFreeGroupMod.FreeGroup[A]
  ] = js.native
  def getGroup[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): fpDashTsLib.libGroupMod.Group[fpDashTsLib.libFreeGroupMod.FreeGroup[A]] = js.native
  def getSetoid[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): fpDashTsLib.libSetoidMod.Setoid[fpDashTsLib.libFreeGroupMod.FreeGroup[A]] = js.native
  def normalize[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function1[
    /* g */ fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libEitherMod.Either[A, A]], 
    fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libEitherMod.Either[A, A]]
  ] = js.native
}

