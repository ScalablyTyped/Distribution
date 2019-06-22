package typings
package fpDashTsLib.libFreeGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/FreeGroup", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.FreeGroup = js.native
  val empty: FreeGroup[scala.Nothing] = js.native
  val freeGroup: fpDashTsLib.libMonadMod.Monad1[URI] = js.native
  def fromArray[A](E: fpDashTsLib.libEqMod.Eq[A]): js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libEitherMod.Either[A, A]], 
    FreeGroup[A]
  ] = js.native
  def getEq[A](S: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[FreeGroup[A]] = js.native
  def getGroup[A](E: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libGroupMod.Group[FreeGroup[A]] = js.native
  def getSetoid[A](S: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[FreeGroup[A]] = js.native
  def normalize[A](E: fpDashTsLib.libEqMod.Eq[A]): js.Function1[
    /* g */ fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libEitherMod.Either[A, A]], 
    fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libEitherMod.Either[A, A]]
  ] = js.native
}

