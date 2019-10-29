package typings.domdiff.domdiffMod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("domdiff", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[TCurrentItems /* <: js.Array[_] */, TFutureItems /* <: js.Array[_] */](parentNode: Node, currentNodes: TCurrentItems, futureNodes: TFutureItems): Unit = js.native
  def apply[TCurrentItems /* <: js.Array[_] */, TFutureItems /* <: js.Array[_] */](
    parentNode: Node,
    currentNodes: TCurrentItems,
    futureNodes: TFutureItems,
    options: IDomDiffNodeMarkerOptions[Node]
  ): Unit = js.native
  def apply[TCurrentItems /* <: js.Array[_] */, TFutureItems /* <: js.Array[_] */](
    parentNode: Node,
    currentNodes: TCurrentItems,
    futureNodes: TFutureItems,
    options: IDomDiffOPtionsEachNodeCallbackFn
  ): Unit = js.native
  def apply[TCurrentItems /* <: js.Array[_] */, TFutureItems /* <: js.Array[_] */](
    parentNode: Node,
    currentNodes: TCurrentItems,
    futureNodes: TFutureItems,
    options: IDomDiffOptionsGenericComparisonFn
  ): Unit = js.native
}

