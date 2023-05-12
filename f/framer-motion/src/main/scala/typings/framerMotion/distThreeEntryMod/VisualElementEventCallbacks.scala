package typings.framerMotion.distThreeEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VisualElementEventCallbacks extends StObject {
  
  def AnimationComplete(definition: AnimationDefinition): Unit = js.native
  
  def AnimationStart(definition: AnimationDefinition): Unit = js.native
  
  def BeforeLayoutMeasure(): Unit = js.native
  
  def LayoutAnimationComplete(): Unit = js.native
  
  def LayoutAnimationStart(): Unit = js.native
  
  def LayoutMeasure(layout: Box): Unit = js.native
  def LayoutMeasure(layout: Box, prevLayout: Box): Unit = js.native
  
  def LayoutUpdate(layout: Axis, prevLayout: Axis): Unit = js.native
  
  def SetAxisTarget(): Unit = js.native
  
  def Unmount(): Unit = js.native
  
  def Update(latest: ResolvedValues): Unit = js.native
}
