package typings
package fpDashTsLib.es6HKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URItoKind[A] extends URI2HKT[A] {
  var Array: fpDashTsLib.libArrayMod.Global.Array[A]
  var Eq: fpDashTsLib.es6EqMod.Eq[A]
  var FreeGroup: fpDashTsLib.es6FreeGroupMod.FreeGroup[A]
  var IO: fpDashTsLib.es6IOMod.IO[A]
  var Identity: fpDashTsLib.es6IdentityMod.Identity[A]
  var NonEmptyArray: fpDashTsLib.es6NonEmptyArrayMod.NonEmptyArray[A]
  var NonEmptyArray2v: fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A]
  var Option: stdLib.Option
  var Ord: fpDashTsLib.es6OrdMod.Ord[A]
  var Pair: fpDashTsLib.es6PairMod.Pair[A]
  var Record: stdLib.Record[java.lang.String, A]
  var StrMap: fpDashTsLib.es6StrMapMod.StrMap[A]
  var Task: fpDashTsLib.es6TaskMod.Task[A]
  var Tree: fpDashTsLib.es6TreeMod.Tree[A]
  var Zipper: fpDashTsLib.es6ZipperMod.Zipper[A]
}

object URItoKind {
  @scala.inline
  def apply[A](
    Array: fpDashTsLib.libArrayMod.Global.Array[A],
    Eq: fpDashTsLib.es6EqMod.Eq[A],
    FreeGroup: fpDashTsLib.es6FreeGroupMod.FreeGroup[A],
    IO: fpDashTsLib.es6IOMod.IO[A],
    Identity: fpDashTsLib.es6IdentityMod.Identity[A],
    NonEmptyArray: fpDashTsLib.es6NonEmptyArrayMod.NonEmptyArray[A],
    NonEmptyArray2v: fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A],
    Option: stdLib.Option,
    Ord: fpDashTsLib.es6OrdMod.Ord[A],
    Pair: fpDashTsLib.es6PairMod.Pair[A],
    Record: stdLib.Record[java.lang.String, A],
    StrMap: fpDashTsLib.es6StrMapMod.StrMap[A],
    Task: fpDashTsLib.es6TaskMod.Task[A],
    Tree: fpDashTsLib.es6TreeMod.Tree[A],
    Zipper: fpDashTsLib.es6ZipperMod.Zipper[A]
  ): URItoKind[A] = {
    val __obj = js.Dynamic.literal(Array = Array, Eq = Eq, FreeGroup = FreeGroup, IO = IO, Identity = Identity, NonEmptyArray = NonEmptyArray, NonEmptyArray2v = NonEmptyArray2v, Option = Option, Ord = Ord, Pair = Pair, Record = Record, StrMap = StrMap, Task = Task, Tree = Tree, Zipper = Zipper)
  
    __obj.asInstanceOf[URItoKind[A]]
  }
}

