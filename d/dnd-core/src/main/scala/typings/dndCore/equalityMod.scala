package typings.dndCore

import typings.dndCore.interfacesMod.XYCoord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object equalityMod {
  
  @JSImport("dnd-core/lib/utils/equality", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def areArraysEqual[T](a: js.Array[T], b: js.Array[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areArraysEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def areArraysEqual[T](a: js.Array[T], b: js.Array[T], isEqual: EqualityCheck[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areArraysEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], isEqual.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def areCoordsEqual(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("areCoordsEqual")().asInstanceOf[Boolean]
  @scala.inline
  def areCoordsEqual(offsetA: Null, offsetB: XYCoord): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areCoordsEqual")(offsetA.asInstanceOf[js.Any], offsetB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def areCoordsEqual(offsetA: Unit, offsetB: XYCoord): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areCoordsEqual")(offsetA.asInstanceOf[js.Any], offsetB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def areCoordsEqual(offsetA: XYCoord): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("areCoordsEqual")(offsetA.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def areCoordsEqual(offsetA: XYCoord, offsetB: XYCoord): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areCoordsEqual")(offsetA.asInstanceOf[js.Any], offsetB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def strictEquality[T](a: T, b: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEquality")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type EqualityCheck[T] = js.Function2[/* a */ T, /* b */ T, Boolean]
}
