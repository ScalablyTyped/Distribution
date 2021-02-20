package typings.dndCore

import typings.dndCore.dragOffsetMod.State
import typings.dndCore.interfacesMod.XYCoord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coordsMod {
  
  @JSImport("dnd-core/lib/utils/coords", "add")
  @js.native
  def add(a: XYCoord, b: XYCoord): XYCoord = js.native
  
  @JSImport("dnd-core/lib/utils/coords", "getDifferenceFromInitialOffset")
  @js.native
  def getDifferenceFromInitialOffset(state: State): XYCoord | Null = js.native
  
  @JSImport("dnd-core/lib/utils/coords", "getSourceClientOffset")
  @js.native
  def getSourceClientOffset(state: State): XYCoord | Null = js.native
  
  @JSImport("dnd-core/lib/utils/coords", "subtract")
  @js.native
  def subtract(a: XYCoord, b: XYCoord): XYCoord = js.native
}
