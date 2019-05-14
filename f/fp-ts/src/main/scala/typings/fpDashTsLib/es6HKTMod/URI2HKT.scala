package typings
package fpDashTsLib.es6HKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URI2HKT[A] extends js.Object {
  var Array: fpDashTsLib.libArrayMod.Global.Array[A]
  var FreeGroup: fpDashTsLib.es6FreeGroupMod.FreeGroup[A]
  var IO: fpDashTsLib.es6IOMod.IO[A]
  var Identity: fpDashTsLib.es6IdentityMod.Identity[A]
  var NonEmptyArray: fpDashTsLib.es6NonEmptyArrayMod.NonEmptyArray[A]
  var NonEmptyArray2v: fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A]
  var Option: stdLib.Option
  var Pair: fpDashTsLib.es6PairMod.Pair[A]
  var StrMap: fpDashTsLib.es6StrMapMod.StrMap[A]
  var Task: fpDashTsLib.es6TaskMod.Task[A]
  var Tree: fpDashTsLib.es6TreeMod.Tree[A]
  var Zipper: fpDashTsLib.es6ZipperMod.Zipper[A]
}

object URI2HKT {
  @scala.inline
  def apply[A](
    Array: fpDashTsLib.libArrayMod.Global.Array[A],
    FreeGroup: fpDashTsLib.es6FreeGroupMod.FreeGroup[A],
    IO: fpDashTsLib.es6IOMod.IO[A],
    Identity: fpDashTsLib.es6IdentityMod.Identity[A],
    NonEmptyArray: fpDashTsLib.es6NonEmptyArrayMod.NonEmptyArray[A],
    NonEmptyArray2v: fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A],
    Option: stdLib.Option,
    Pair: fpDashTsLib.es6PairMod.Pair[A],
    StrMap: fpDashTsLib.es6StrMapMod.StrMap[A],
    Task: fpDashTsLib.es6TaskMod.Task[A],
    Tree: fpDashTsLib.es6TreeMod.Tree[A],
    Zipper: fpDashTsLib.es6ZipperMod.Zipper[A]
  ): URI2HKT[A] = {
    val __obj = js.Dynamic.literal(Array = Array, FreeGroup = FreeGroup, IO = IO, Identity = Identity, NonEmptyArray = NonEmptyArray, NonEmptyArray2v = NonEmptyArray2v, Option = Option, Pair = Pair, StrMap = StrMap, Task = Task, Tree = Tree, Zipper = Zipper)
  
    __obj.asInstanceOf[URI2HKT[A]]
  }
}

