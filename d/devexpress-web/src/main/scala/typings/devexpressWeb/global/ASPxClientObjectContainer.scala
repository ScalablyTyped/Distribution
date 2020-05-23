package typings.devexpressWeb.global

import typings.devexpressWeb.ASPxClientEventHandler
import typings.devexpressWeb.ASPxClientFlashScriptCommandEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxObjectContainer control.
  */
@JSGlobal("ASPxClientObjectContainer")
@js.native
class ASPxClientObjectContainer ()
  extends typings.devexpressWeb.ASPxClientObjectContainer {
  /**
    * Occurs on the client side when the FSCommand action is called within the associated flash object's action script.
    */
  /* CompleteClass */
  override var FlashScriptCommand: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientFlashScriptCommandEventHandler[typings.devexpressWeb.ASPxClientObjectContainer]
  ] = js.native
  /**
    * Occurs on the client side after the control has been initialized.
    */
  /* CompleteClass */
  override var Init: typings.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typings.devexpressWeb.ASPxClientControlBase]] = js.native
  /**
    * Gets the unique, hierarchically-qualified identifier for the control.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Modifies the control's size against the control's container.
    */
  /* CompleteClass */
  override def AdjustControl(): Unit = js.native
  /**
    * Play the Flash movie backwards.
    */
  /* CompleteClass */
  override def Back(): Unit = js.native
  /**
    * Play the Flash movie forwards.
    */
  /* CompleteClass */
  override def Forward(): Unit = js.native
  /** @deprecated Use the GetVisible method instead. */
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetClientVisible(): Boolean = js.native
  /**
    * Returns the control's height.
    */
  /* CompleteClass */
  override def GetHeight(): Double = js.native
  /**
    * Returns an HTML element that is the root of the control's hierarchy.
    */
  /* CompleteClass */
  override def GetMainElement(): js.Any = js.native
  /**
    * Returns a client instance of the control that is the parent for a specified control.
    */
  /* CompleteClass */
  override def GetParentControl(): js.Any = js.native
  /**
    * Returns the value of the Flash variable specified. A string value that represents the Flash variable's value.
    * @param name A string value that specifies the Flash variable.
    */
  /* CompleteClass */
  override def GetVariable(name: String): String = js.native
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetVisible(): Boolean = js.native
  /**
    * Returns the control's width.
    */
  /* CompleteClass */
  override def GetWidth(): Double = js.native
  /**
    * Activates the specified frame in the Flash movie.
    * @param frameNumber An integer value that specifies the requested frame.
    */
  /* CompleteClass */
  override def GotoFrame(frameNumber: Double): Unit = js.native
  /**
    * Returns a value that determines whether a callback request sent by a web control is being currently processed on the server side.
    */
  /* CompleteClass */
  override def InCallback(): Boolean = js.native
  /**
    * Indicates whether the Flash movie is currently playing.
    */
  /* CompleteClass */
  override def IsPlaying(): Boolean = js.native
  /**
    * Loads the Flash movie to the specified layer.
    * @param layerNumber An integer value that identifies a layer in which to load the movie.
    * @param url A string value that specifies the movie's URL.
    */
  /* CompleteClass */
  override def LoadMovie(layerNumber: Double, url: String): Unit = js.native
  /**
    * Pans a zoomed-in Flash movie to the specified coordinates.
    * @param x An integer value that specifies the X-coordinate.
    * @param y An integer value that specifies the Y-coordinate.
    * @param mode 0 the coordinates are pixels; 1 the coordinates are a percentage of the window.
    */
  /* CompleteClass */
  override def Pan(x: Double, y: Double, mode: Double): Unit = js.native
  /**
    * Returns the percent of the Flash Player movie that has streamed into the browser so far.
    */
  /* CompleteClass */
  override def PercentLoaded(): String = js.native
  /**
    * Starts playing media files.
    */
  /* CompleteClass */
  override def Play(): Unit = js.native
  /**
    * Starts playing a Quick Time movie.
    */
  /* CompleteClass */
  override def QTPlay(): Unit = js.native
  /**
    * Rewinds a Quick Time movie to the first frame.
    */
  /* CompleteClass */
  override def QTRewind(): Unit = js.native
  /**
    * Steps through a Quick Time video stream by a specified number of frames.
    * @param count An integer value that specifies the number of frames to step.
    */
  /* CompleteClass */
  override def QTStep(count: Double): Unit = js.native
  /**
    * Stops playing a Quick Time movie.
    */
  /* CompleteClass */
  override def QTStopPlay(): Unit = js.native
  /**
    * Rewinds the Flash movie to the first frame.
    */
  /* CompleteClass */
  override def Rewind(): Unit = js.native
  /**
    * Specifies the text that Assistive Technologies (screen readers or braille display, for example) will provide to a user.
    * @param message A String value that specifies a text.
    */
  /* CompleteClass */
  override def SendMessageToAssistiveTechnology(message: String): Unit = js.native
  /** @deprecated Use the SetVisible method instead. */
  /**
    * Specifies whether a control is displayed.
    */
  /* CompleteClass */
  override def SetClientVisible(visible: Boolean): Unit = js.native
  /**
    * Specifies the control's height.  Note that this method is not in effect for some controls.
    * @param height An integer value that specifies the control's height.
    */
  /* CompleteClass */
  override def SetHeight(height: Double): Unit = js.native
  /**
    * Sets the value of the specified Flash variable.
    * @param name A string value that specifies the Flash variable.
    * @param value A string value that represents a new value.
    */
  /* CompleteClass */
  override def SetVariable(name: String, value: String): Unit = js.native
  /**
    * Specifies whether a control is displayed.
    * @param visible true to make a control visible; false to make it hidden.
    */
  /* CompleteClass */
  override def SetVisible(visible: Boolean): Unit = js.native
  /**
    * Specifies the control's width in pixels.
    * @param width An integer value that specifies the control's width, in pixels.
    */
  /* CompleteClass */
  override def SetWidth(width: Double): Unit = js.native
  /**
    * Zooms in on the specified rectangular area of the Flash movie.
    * @param left An integer value that specifies the x-coordinate of the rectangle's left side, in twips.
    * @param top An integer value that specifies the y-coordinate of the rectangle's top side, in twips.
    * @param right An integer value that specifies the x-coordinate of the rectangle's right side, in twips.
    * @param bottom An integer value that specifies the y-coordinate of the rectangle's bottom side, in twips.
    */
  /* CompleteClass */
  override def SetZoomRect(left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  /**
    * Stops playing the Flash movie.
    */
  /* CompleteClass */
  override def StopPlay(): Unit = js.native
  /**
    * Returns the total number of frames in the Flash movie.
    */
  /* CompleteClass */
  override def TotalFrames(): Double = js.native
  /**
    * Zooms the Flash view by a relative scale factor.
    * @param percent An integer value that specifies the relative scale factor, as a  percentage.
    */
  /* CompleteClass */
  override def Zoom(percent: Double): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientObjectContainer")
@js.native
object ASPxClientObjectContainer extends js.Object {
  /**
    * Converts the specified object to the ASPxClientObjectContainer type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): typings.devexpressWeb.ASPxClientObjectContainer = js.native
}

