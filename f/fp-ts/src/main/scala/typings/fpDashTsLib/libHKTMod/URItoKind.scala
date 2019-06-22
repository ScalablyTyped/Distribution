package typings
package fpDashTsLib.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URItoKind[A] extends URI2HKT[A] {
  var Array: fpDashTsLib.libArrayMod.Global.Array[A]
  var Eq: fpDashTsLib.libEqMod.Eq[A]
  var FreeGroup: fpDashTsLib.libFreeGroupMod.FreeGroup[A]
  var IO: fpDashTsLib.libIOMod.IO[A]
  var Identity: fpDashTsLib.libIdentityMod.Identity[A]
  var NonEmptyArray: fpDashTsLib.libNonEmptyArrayMod.NonEmptyArray[A]
  var NonEmptyArray2v: fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]
  var Option: stdLib.Option
  var Ord: fpDashTsLib.libOrdMod.Ord[A]
  var Pair: fpDashTsLib.libPairMod.Pair[A]
  var Record: stdLib.Record[java.lang.String, A]
  var StrMap: fpDashTsLib.libStrMapMod.StrMap[A]
  var Task: fpDashTsLib.libTaskMod.Task[A]
  var Tree: fpDashTsLib.libTreeMod.Tree[A]
  var Zipper: fpDashTsLib.libZipperMod.Zipper[A]
}

object URItoKind {
  @scala.inline
  def apply[A](
    Array: fpDashTsLib.libArrayMod.Global.Array[A],
    Eq: fpDashTsLib.libEqMod.Eq[A],
    FreeGroup: fpDashTsLib.libFreeGroupMod.FreeGroup[A],
    IO: fpDashTsLib.libIOMod.IO[A],
    Identity: fpDashTsLib.libIdentityMod.Identity[A],
    NonEmptyArray: fpDashTsLib.libNonEmptyArrayMod.NonEmptyArray[A],
    NonEmptyArray2v: fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A],
    Option: stdLib.Option,
    Ord: fpDashTsLib.libOrdMod.Ord[A],
    Pair: fpDashTsLib.libPairMod.Pair[A],
    Record: stdLib.Record[java.lang.String, A],
    StrMap: fpDashTsLib.libStrMapMod.StrMap[A],
    Task: fpDashTsLib.libTaskMod.Task[A],
    Tree: fpDashTsLib.libTreeMod.Tree[A],
    Zipper: fpDashTsLib.libZipperMod.Zipper[A]
  ): URItoKind[A] = {
    val __obj = js.Dynamic.literal(Array = Array, Eq = Eq, FreeGroup = FreeGroup, IO = IO, Identity = Identity, NonEmptyArray = NonEmptyArray, NonEmptyArray2v = NonEmptyArray2v, Option = Option, Ord = Ord, Pair = Pair, Record = Record, StrMap = StrMap, Task = Task, Tree = Tree, Zipper = Zipper)
  
    __obj.asInstanceOf[URItoKind[A]]
  }
}

