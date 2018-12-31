package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This special Tool is responsible for managing all of the Diagram's
  * mode-less tools.
  */
@JSImport("go", "ToolManager")
@js.native
/**
  * You do not normally need to create an instance of this tool because one already exists as the Diagram.toolManager, which you can modify.
  */
class ToolManager ()
  extends goLib.goMod.goNs.ToolManager

/**
  * This special Tool is responsible for managing all of the Diagram's
  * mode-less tools.
  */
@JSImport("go", "ToolManager")
@js.native
object ToolManager extends js.Object {
  /**This value for gestureBehavior indicates that the pointer/touch pinch gestures on the canvas intend to have no effect on the Diagram, but also no effect on the page.*/
  var GestureCancel: goLib.goMod.goNs.EnumValue = js.native
  /**This value for gestureBehavior indicates that the pointer/touch pinch gestures on the canvas intend to have no effect on the Diagram, but will not be prevented, and may bubble up the page to have other effects (such as zooming the page).*/
  var GestureNone: goLib.goMod.goNs.EnumValue = js.native
  /**This value for gestureBehavior indicates that the pointer/touch pinch gestures on the canvas intend to zoom the Diagram.*/
  var GestureZoom: goLib.goMod.goNs.EnumValue = js.native
  /**This value for .mouseWheelBehavior indicates that the mouse wheel events are ignored, although scrolling or zooming by other means may still be allowed.*/
  var WheelNone: goLib.goMod.goNs.EnumValue = js.native
  /**This default value for .mouseWheelBehavior indicates that mouse wheel events scroll the diagram.*/
  var WheelScroll: goLib.goMod.goNs.EnumValue = js.native
  /**This value for .mouseWheelBehavior indicates that the mouse wheel events change the scale of the diagram.*/
  var WheelZoom: goLib.goMod.goNs.EnumValue = js.native
}

