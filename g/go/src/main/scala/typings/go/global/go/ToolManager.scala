package typings.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This special Tool is responsible for managing all of the Diagram's
  * mode-less tools.
  */
@JSGlobal("go.ToolManager")
@js.native
/**
  * You do not normally need to create an instance of this tool because one already exists as the Diagram.toolManager, which you can modify.
  */
class ToolManager ()
  extends typings.go.mod.ToolManager
object ToolManager {
  
  @JSGlobal("go.ToolManager")
  @js.native
  val ^ : js.Any = js.native
  
  /**This value for gestureBehavior indicates that the pointer/touch pinch gestures on the canvas intend to have no effect on the Diagram, but also no effect on the page.*/
  /* static member */
  @JSGlobal("go.ToolManager.GestureCancel")
  @js.native
  def GestureCancel: typings.go.mod.EnumValue = js.native
  inline def GestureCancel_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GestureCancel")(x.asInstanceOf[js.Any])
  
  /**This value for gestureBehavior indicates that the pointer/touch pinch gestures on the canvas intend to have no effect on the Diagram, but will not be prevented, and may bubble up the page to have other effects (such as zooming the page).*/
  /* static member */
  @JSGlobal("go.ToolManager.GestureNone")
  @js.native
  def GestureNone: typings.go.mod.EnumValue = js.native
  inline def GestureNone_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GestureNone")(x.asInstanceOf[js.Any])
  
  /**This value for gestureBehavior indicates that the pointer/touch pinch gestures on the canvas intend to zoom the Diagram.*/
  /* static member */
  @JSGlobal("go.ToolManager.GestureZoom")
  @js.native
  def GestureZoom: typings.go.mod.EnumValue = js.native
  inline def GestureZoom_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GestureZoom")(x.asInstanceOf[js.Any])
  
  /**This value for .mouseWheelBehavior indicates that the mouse wheel events are ignored, although scrolling or zooming by other means may still be allowed.*/
  /* static member */
  @JSGlobal("go.ToolManager.WheelNone")
  @js.native
  def WheelNone: typings.go.mod.EnumValue = js.native
  inline def WheelNone_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WheelNone")(x.asInstanceOf[js.Any])
  
  /**This default value for .mouseWheelBehavior indicates that mouse wheel events scroll the diagram.*/
  /* static member */
  @JSGlobal("go.ToolManager.WheelScroll")
  @js.native
  def WheelScroll: typings.go.mod.EnumValue = js.native
  inline def WheelScroll_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WheelScroll")(x.asInstanceOf[js.Any])
  
  /**This value for .mouseWheelBehavior indicates that the mouse wheel events change the scale of the diagram.*/
  /* static member */
  @JSGlobal("go.ToolManager.WheelZoom")
  @js.native
  def WheelZoom: typings.go.mod.EnumValue = js.native
  inline def WheelZoom_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WheelZoom")(x.asInstanceOf[js.Any])
}
