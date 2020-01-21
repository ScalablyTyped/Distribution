package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxObjectContainer control.
  */
@JSGlobal("ASPxClientObjectContainer")
@js.native
class ASPxClientObjectContainer () extends ASPxClientControl {
  /**
    * Occurs on the client side when the FSCommand action is called within the associated flash object's action script.
    */
  var FlashScriptCommand: ASPxClientEvent[ASPxClientFlashScriptCommandEventHandler[ASPxClientObjectContainer]] = js.native
  /**
    * Play the Flash movie backwards.
    */
  def Back(): Unit = js.native
  /**
    * Play the Flash movie forwards.
    */
  def Forward(): Unit = js.native
  /**
    * Returns the value of the Flash variable specified. A string value that represents the Flash variable's value.
    * @param name A string value that specifies the Flash variable.
    */
  def GetVariable(name: String): String = js.native
  /**
    * Activates the specified frame in the Flash movie.
    * @param frameNumber An integer value that specifies the requested frame.
    */
  def GotoFrame(frameNumber: Double): Unit = js.native
  /**
    * Indicates whether the Flash movie is currently playing.
    */
  def IsPlaying(): Boolean = js.native
  /**
    * Loads the Flash movie to the specified layer.
    * @param layerNumber An integer value that identifies a layer in which to load the movie.
    * @param url A string value that specifies the movie's URL.
    */
  def LoadMovie(layerNumber: Double, url: String): Unit = js.native
  /**
    * Pans a zoomed-in Flash movie to the specified coordinates.
    * @param x An integer value that specifies the X-coordinate.
    * @param y An integer value that specifies the Y-coordinate.
    * @param mode 0 the coordinates are pixels; 1 the coordinates are a percentage of the window.
    */
  def Pan(x: Double, y: Double, mode: Double): Unit = js.native
  /**
    * Returns the percent of the Flash Player movie that has streamed into the browser so far.
    */
  def PercentLoaded(): String = js.native
  /**
    * Starts playing media files.
    */
  def Play(): Unit = js.native
  /**
    * Starts playing a Quick Time movie.
    */
  def QTPlay(): Unit = js.native
  /**
    * Rewinds a Quick Time movie to the first frame.
    */
  def QTRewind(): Unit = js.native
  /**
    * Steps through a Quick Time video stream by a specified number of frames.
    * @param count An integer value that specifies the number of frames to step.
    */
  def QTStep(count: Double): Unit = js.native
  /**
    * Stops playing a Quick Time movie.
    */
  def QTStopPlay(): Unit = js.native
  /**
    * Rewinds the Flash movie to the first frame.
    */
  def Rewind(): Unit = js.native
  /**
    * Sets the value of the specified Flash variable.
    * @param name A string value that specifies the Flash variable.
    * @param value A string value that represents a new value.
    */
  def SetVariable(name: String, value: String): Unit = js.native
  /**
    * Zooms in on the specified rectangular area of the Flash movie.
    * @param left An integer value that specifies the x-coordinate of the rectangle's left side, in twips.
    * @param top An integer value that specifies the y-coordinate of the rectangle's top side, in twips.
    * @param right An integer value that specifies the x-coordinate of the rectangle's right side, in twips.
    * @param bottom An integer value that specifies the y-coordinate of the rectangle's bottom side, in twips.
    */
  def SetZoomRect(left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  /**
    * Stops playing the Flash movie.
    */
  def StopPlay(): Unit = js.native
  /**
    * Returns the total number of frames in the Flash movie.
    */
  def TotalFrames(): Double = js.native
  /**
    * Zooms the Flash view by a relative scale factor.
    * @param percent An integer value that specifies the relative scale factor, as a  percentage.
    */
  def Zoom(percent: Double): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientObjectContainer")
@js.native
object ASPxClientObjectContainer extends js.Object {
  /**
    * Converts the specified object to the ASPxClientObjectContainer type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientObjectContainer = js.native
}

