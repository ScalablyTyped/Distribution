package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "freeGroup")
@js.native
object freeGroupNs extends js.Object {
  @js.native
  class FreeGroup[A] protected ()
    extends fpDashTsLib.es6FreeGroupMod.FreeGroup[A] {
    def this(value: fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.es6EitherMod.Either[A, A]]) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.FreeGroup = js.native
  val empty: fpDashTsLib.es6FreeGroupMod.FreeGroup[scala.Nothing] = js.native
  val freeGroup: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.es6FreeGroupMod.URI] = js.native
  def fromArray[A](S: fpDashTsLib.es6SetoidMod.Setoid[A]): js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.es6EitherMod.Either[A, A]], 
    fpDashTsLib.es6FreeGroupMod.FreeGroup[A]
  ] = js.native
  def getGroup[A](S: fpDashTsLib.es6SetoidMod.Setoid[A]): fpDashTsLib.es6GroupMod.Group[fpDashTsLib.es6FreeGroupMod.FreeGroup[A]] = js.native
  def getSetoid[A](S: fpDashTsLib.es6SetoidMod.Setoid[A]): fpDashTsLib.es6SetoidMod.Setoid[fpDashTsLib.es6FreeGroupMod.FreeGroup[A]] = js.native
  def normalize[A](S: fpDashTsLib.es6SetoidMod.Setoid[A]): js.Function1[
    /* g */ fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.es6EitherMod.Either[A, A]], 
    fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.es6EitherMod.Either[A, A]]
  ] = js.native
}

