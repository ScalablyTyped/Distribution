package typings.diff.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diff", "diffArrays")
@js.native
object diffArrays extends js.Object {
  def apply[TOld, TNew](oldArr: js.Array[TOld], newArr: js.Array[TNew]): js.Array[ArrayChange[TOld | TNew]] = js.native
  def apply[TOld, TNew](oldArr: js.Array[TOld], newArr: js.Array[TNew], options: ArrayOptions[TOld, TNew]): js.Array[ArrayChange[TOld | TNew]] = js.native
}

