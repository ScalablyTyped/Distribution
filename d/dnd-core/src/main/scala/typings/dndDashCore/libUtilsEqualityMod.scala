package typings.dndDashCore

import typings.dndDashCore.libInterfacesMod.XYCoord
import typings.dndDashCore.libUtilsEqualityMod.EqualityCheck
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnd-core/lib/utils/equality", JSImport.Namespace)
@js.native
object libUtilsEqualityMod extends js.Object {
  def areArraysEqual[T](a: js.Array[T], b: js.Array[T]): Boolean = js.native
  def areArraysEqual[T](a: js.Array[T], b: js.Array[T], isEqual: EqualityCheck[T]): Boolean = js.native
  def areCoordsEqual(): Boolean = js.native
  def areCoordsEqual(offsetA: js.UndefOr[scala.Nothing], offsetB: XYCoord): Boolean = js.native
  def areCoordsEqual(offsetA: Null, offsetB: XYCoord): Boolean = js.native
  def areCoordsEqual(offsetA: XYCoord): Boolean = js.native
  def areCoordsEqual(offsetA: XYCoord, offsetB: XYCoord): Boolean = js.native
  def strictEquality[T](a: T, b: T): Boolean = js.native
  type EqualityCheck[T] = js.Function2[/* a */ T, /* b */ T, Boolean]
}

