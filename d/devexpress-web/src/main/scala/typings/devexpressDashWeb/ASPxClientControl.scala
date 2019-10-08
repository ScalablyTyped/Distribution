package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as the base type for all the objects included in the client-side object model.
  */
@JSGlobal("ASPxClientControl")
@js.native
class ASPxClientControl () extends ASPxClientControlBase {
  /**
    * Modifies the control's size against the control's container.
    */
  def AdjustControl(): Unit = js.native
  /**
    * Returns the control's height.
    */
  def GetHeight(): Double = js.native
  /**
    * Returns the control's width.
    */
  def GetWidth(): Double = js.native
  /**
    * Specifies the control's height.  Note that this method is not in effect for some controls.
    * @param height An integer value that specifies the control's height.
    */
  def SetHeight(height: Double): Unit = js.native
  /**
    * Specifies the control's width in pixels.
    * @param width An integer value that specifies the control's width, in pixels.
    */
  def SetWidth(width: Double): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientControl")
@js.native
object ASPxClientControl extends js.Object {
  /**
    * Modifies the controls size within the specified container.
    * @param container An HTML element that is the container of the controls.
    */
  def AdjustControls(): Unit = js.native
  def AdjustControls(container: js.Any): Unit = js.native
  /**
    * Converts the specified object to the current object's type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientControl = js.native
  /**
    * Returns a collection of client web control objects.
    */
  def GetControlCollection(): ASPxClientControlCollection = js.native
}

