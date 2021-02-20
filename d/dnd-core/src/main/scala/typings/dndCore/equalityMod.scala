package typings.dndCore

import typings.dndCore.interfacesMod.XYCoord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object equalityMod {
  
  @JSImport("dnd-core/lib/utils/equality", "areArraysEqual")
  @js.native
  def areArraysEqual[T](a: js.Array[T], b: js.Array[T]): Boolean = js.native
  @JSImport("dnd-core/lib/utils/equality", "areArraysEqual")
  @js.native
  def areArraysEqual[T](a: js.Array[T], b: js.Array[T], isEqual: EqualityCheck[T]): Boolean = js.native
  
  @JSImport("dnd-core/lib/utils/equality", "areCoordsEqual")
  @js.native
  def areCoordsEqual(): Boolean = js.native
  @JSImport("dnd-core/lib/utils/equality", "areCoordsEqual")
  @js.native
  def areCoordsEqual(offsetA: js.UndefOr[scala.Nothing], offsetB: XYCoord): Boolean = js.native
  @JSImport("dnd-core/lib/utils/equality", "areCoordsEqual")
  @js.native
  def areCoordsEqual(offsetA: Null, offsetB: XYCoord): Boolean = js.native
  @JSImport("dnd-core/lib/utils/equality", "areCoordsEqual")
  @js.native
  def areCoordsEqual(offsetA: XYCoord): Boolean = js.native
  @JSImport("dnd-core/lib/utils/equality", "areCoordsEqual")
  @js.native
  def areCoordsEqual(offsetA: XYCoord, offsetB: XYCoord): Boolean = js.native
  
  @JSImport("dnd-core/lib/utils/equality", "strictEquality")
  @js.native
  def strictEquality[T](a: T, b: T): Boolean = js.native
  
  type EqualityCheck[T] = js.Function2[/* a */ T, /* b */ T, Boolean]
}
