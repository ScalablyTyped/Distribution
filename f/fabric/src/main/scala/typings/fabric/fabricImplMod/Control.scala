package typings.fabric.fabricImplMod

import typings.fabric.anon.PartialControl
import typings.fabric.anon.X
import typings.std.CanvasRenderingContext2D
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric/fabric-impl", "Control")
@js.native
open class Control () extends StObject {
  def this(options: PartialControl) = this()
  
  /**
    * The control actionHandler, provide one to handle action ( control being moved )
    * @return {Boolean} true if the action/event modified the object
    */
  def actionHandler(eventData: MouseEvent, transformData: Transform, x: Double, y: Double): Boolean = js.native
  
  /**
    * Name of the action that the control will likely execute.
    * This is optional. FabricJS uses to identify what the user is doing for some
    * extra optimizations. If you are writing a custom control and you want to know
    * somewhere else in the code what is going on, you can use this string here.
    * you can also provide a custom getActionName if your control run multiple actions
    * depending on some external state.
    * default to scale since is the most common, used on 4 corners by default
    * @default 'scale'
    */
  var actionName: String = js.native
  
  /**
    * Drawing angle of the control.
    * NOT used for now, but name marked as needed for internal logic
    * example: to reuse the same drawing function for different rotated controls
    * @default 0
    */
  var angle: Double = js.native
  
  /**
    * Returns the coords for this control based on object values.
    */
  def calcCornerCoords(objectAngle: Double, objectCornerSize: Double, centerX: Double, centerY: Double, isTouch: Boolean): Unit = js.native
  
  /**
    * Css cursor style to display when the control is hovered.
    * if the method `cursorStyleHandler` is provided, this property is ignored.
    * @default 'crosshair'
    */
  var cursorStyle: String = js.native
  
  /**
    * Returns control cursorStyle for css using cursorStyle. If you need a more elaborate
    * function you can pass one in the constructor
    * the cursorStyle property
    */
  def cursorStyleHandler(eventData: MouseEvent, control: Control, fabricObject: Object): String = js.native
  
  /**
    * Returns control actionHandler
    */
  def getActionHandler(eventData: MouseEvent, fabricObject: Object, control: Control): ControlMouseEventHandler = js.native
  
  /**
    * Returns the action name. The basic implementation just return the actionName property.
    */
  def getActionName(eventData: MouseEvent, control: Control, fabricObject: Object): String = js.native
  
  /**
    * Returns control mouseDown handler
    */
  def getMouseDownHandler(eventData: MouseEvent, fabricObject: Object, control: Control): ControlMouseEventHandler = js.native
  
  /**
    * Returns control mouseUp handler
    */
  def getMouseUpHandler(eventData: MouseEvent, fabricObject: Object, control: Control): ControlMouseEventHandler = js.native
  
  /**
    * Returns controls visibility
    */
  def getVisibility(fabricObject: Object, controlKey: String): Boolean = js.native
  
  /**
    * The control handler for mouse down, provide one to handle mouse down on control
    */
  def mouseDownHandler(eventData: MouseEvent, transformData: Transform, x: Double, y: Double): Boolean = js.native
  
  /**
    * The control mouseUpHandler, provide one to handle an effect on mouse up.
    */
  def mouseUpHandler(eventData: MouseEvent, transformData: Transform, x: Double, y: Double): Boolean = js.native
  
  /**
    * Horizontal offset of the control from the defined position. In pixels
    * Positive offset moves the control to the right, negative to the left.
    * It used when you want to have position of control that does not scale with
    * the bounding box. Example: rotation control is placed at x:0, y: 0.5 on
    * the boundindbox, with an offset of 30 pixels vertically. Those 30 pixels will
    * stay 30 pixels no matter how the object is big. Another example is having 2
    * controls in the corner, that stay in the same position when the object scale.
    * of the bounding box.
    * @default 0
    */
  var offsetX: Double = js.native
  
  /**
    * Vertical offset of the control from the defined position. In pixels
    * Positive offset moves the control to the bottom, negative to the top.
    * @default 0
    */
  var offsetY: Double = js.native
  
  def positionHandler(dim: X, finalMatrix: Any, fabricObject: Object, currentControl: Control): Point = js.native
  
  /**
    * Render function for the control.
    * When this function runs the context is unscaled. unrotate. Just retina scaled.
    * all the functions will have to translate to the point left,top before starting Drawing
    * if they want to draw a control where the position is detected.
    * left and top are the result of the positionHandler function
    */
  def render(ctx: CanvasRenderingContext2D, left: Double, top: Double, styleOverride: Any, fabricObject: Object): Unit = js.native
  
  /**
    * Sets controls visibility
    */
  def setVisibility(visibility: Boolean): Unit = js.native
  
  /**
    * Sets the length of the control. If null, defaults to object's cornerSize.
    * Expects both sizeX and sizeY to be set when set.
    */
  var sizeX: js.UndefOr[Double] = js.native
  
  /**
    * Sets the height of the control. If null, defaults to object's cornerSize.
    * Expects both sizeX and sizeY to be set when set.
    */
  var sizeY: js.UndefOr[Double] = js.native
  
  /**
    * Sets the length of the touch area of the control. If null, defaults to object's touchCornerSize.
    * Expects both touchSizeX and touchSizeY to be set when set.
    * @default null
    */
  var touchSizeX: js.UndefOr[Double] = js.native
  
  /**
    * Sets the height of the touch area of the control. If null, defaults to object's touchCornerSize.
    * Expects both touchSizeX and touchSizeY to be set when set.
    * @default null
    */
  var touchSizeY: js.UndefOr[Double] = js.native
  
  /**
    * keep track of control visibility.
    * mainly for backward compatibility.
    * if you do not want to see a control, you can remove it
    * from the controlset.
    * @default true
    */
  var visible: Boolean = js.native
  
  /**
    * If controls has an offsetY or offsetX, draw a line that connects
    * the control to the bounding box
    * @default false
    */
  var withConnection: Boolean = js.native
  
  /**
    * Relative position of the control. X
    * 0,0 is the center of the Object, while -0.5 (left) or 0.5 (right) are the extremities
    * of the bounding box.
    * @default 0
    */
  var x: Double = js.native
  
  /**
    * Relative position of the control. Y
    * 0,0 is the center of the Object, while -0.5 (top) or 0.5 (bottom) are the extremities
    * of the bounding box.
    * @default 0
    */
  var y: Double = js.native
}
