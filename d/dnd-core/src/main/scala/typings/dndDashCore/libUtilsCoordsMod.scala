package typings.dndDashCore

import typings.dndDashCore.libInterfacesMod.XYCoord
import typings.dndDashCore.libReducersDragOffsetMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnd-core/lib/utils/coords", JSImport.Namespace)
@js.native
object libUtilsCoordsMod extends js.Object {
  def add(a: XYCoord, b: XYCoord): XYCoord = js.native
  def getDifferenceFromInitialOffset(state: State): XYCoord | Null = js.native
  def getSourceClientOffset(state: State): XYCoord | Null = js.native
  def subtract(a: XYCoord, b: XYCoord): XYCoord = js.native
}

