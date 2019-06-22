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
  
  val URI: fpDashTsLib.fpDashTsLibStrings.FreeGroup = js.native
  val empty: fpDashTsLib.libFreeGroupMod.FreeGroup[scala.Nothing] = js.native
  val freeGroup: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.libFreeGroupMod.URI] = js.native
  def fromArray[A](E: fpDashTsLib.libEqMod.Eq[A]): js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libEitherMod.Either[A, A]], 
    fpDashTsLib.libFreeGroupMod.FreeGroup[A]
  ] = js.native
  def getEq[A](S: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[fpDashTsLib.libFreeGroupMod.FreeGroup[A]] = js.native
  def getGroup[A](E: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libGroupMod.Group[fpDashTsLib.libFreeGroupMod.FreeGroup[A]] = js.native
  def getSetoid[A](S: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[fpDashTsLib.libFreeGroupMod.FreeGroup[A]] = js.native
  def normalize[A](E: fpDashTsLib.libEqMod.Eq[A]): js.Function1[
    /* g */ fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libEitherMod.Either[A, A]], 
    fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libEitherMod.Either[A, A]]
  ] = js.native
}

