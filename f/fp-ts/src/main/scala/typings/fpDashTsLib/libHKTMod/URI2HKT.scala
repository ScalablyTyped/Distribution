package typings
package fpDashTsLib.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URI2HKT[A] extends js.Object {
  var Array: fpDashTsLib.libArrayMod.Global.Array[A]
  var FreeGroup: fpDashTsLib.libFreeGroupMod.FreeGroup[A]
  var IO: fpDashTsLib.libIOMod.IO[A]
  var Identity: fpDashTsLib.libIdentityMod.Identity[A]
  var NonEmptyArray: fpDashTsLib.libNonEmptyArrayMod.NonEmptyArray[A]
  var Option: fpDashTsLib.libOptionMod.Option[A]
  var Pair: fpDashTsLib.libPairMod.Pair[A]
  var StrMap: fpDashTsLib.libStrMapMod.StrMap[A]
  var Task: fpDashTsLib.libTaskMod.Task[A]
  var Tree: fpDashTsLib.libTreeMod.Tree[A]
  var Zipper: fpDashTsLib.libZipperMod.Zipper[A]
}

object URI2HKT {
  @scala.inline
  def apply[A](
    Array: fpDashTsLib.libArrayMod.Global.Array[A],
    FreeGroup: fpDashTsLib.libFreeGroupMod.FreeGroup[A],
    IO: fpDashTsLib.libIOMod.IO[A],
    Identity: fpDashTsLib.libIdentityMod.Identity[A],
    NonEmptyArray: fpDashTsLib.libNonEmptyArrayMod.NonEmptyArray[A],
    Option: fpDashTsLib.libOptionMod.Option[A],
    Pair: fpDashTsLib.libPairMod.Pair[A],
    StrMap: fpDashTsLib.libStrMapMod.StrMap[A],
    Task: fpDashTsLib.libTaskMod.Task[A],
    Tree: fpDashTsLib.libTreeMod.Tree[A],
    Zipper: fpDashTsLib.libZipperMod.Zipper[A]
  ): URI2HKT[A] = {
    val __obj = js.Dynamic.literal(Array = Array, FreeGroup = FreeGroup, IO = IO, Identity = Identity, NonEmptyArray = NonEmptyArray, Option = Option, Pair = Pair, StrMap = StrMap, Task = Task, Tree = Tree, Zipper = Zipper)
  
    __obj.asInstanceOf[URI2HKT[A]]
  }
}

