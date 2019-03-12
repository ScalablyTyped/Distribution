package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxObjectContainer control.
  */
trait ASPxClientObjectContainer extends ASPxClientControl {
  /**
    * Occurs on the client side when the FSCommand action is called within the associated flash object's action script.
    */
  var FlashScriptCommand: ASPxClientEvent[ASPxClientFlashScriptCommandEventHandler[ASPxClientObjectContainer]]
  /**
    * Play the Flash movie backwards.
    */
  def Back(): scala.Unit
  /**
    * Play the Flash movie forwards.
    */
  def Forward(): scala.Unit
  /**
    * Returns the value of the Flash variable specified.
    * @param name A string value that specifies the Flash variable.
    */
  def GetVariable(name: java.lang.String): java.lang.String
  /**
    * Activates the specified frame in the Flash movie.
    * @param frameNumber An integer value that specifies the requested frame.
    */
  def GotoFrame(frameNumber: scala.Double): scala.Unit
  /**
    * Indicates whether the Flash movie is currently playing.
    */
  def IsPlaying(): scala.Boolean
  /**
    * Loads the Flash movie to the specified layer.
    * @param layerNumber An integer value that identifies a layer in which to load the movie.
    * @param url A string value that specifies the movie's URL.
    */
  def LoadMovie(layerNumber: scala.Double, url: java.lang.String): scala.Unit
  /**
    * Pans a zoomed-in Flash movie to the specified coordinates.
    * @param x An integer value that specifies the X-coordinate.
    * @param y An integer value that specifies the Y-coordinate.
    * @param mode 0 the coordinates are pixels; 1 the coordinates are a percentage of the window.
    */
  def Pan(x: scala.Double, y: scala.Double, mode: scala.Double): scala.Unit
  /**
    * Returns the percent of the Flash Player movie that has streamed into the browser so far.
    */
  def PercentLoaded(): java.lang.String
  /**
    * Starts playing media files.
    */
  def Play(): scala.Unit
  /**
    * Starts playing a Quick Time movie.
    */
  def QTPlay(): scala.Unit
  /**
    * Rewinds a Quick Time movie to the first frame.
    */
  def QTRewind(): scala.Unit
  /**
    * Steps through a Quick Time video stream by a specified number of frames.
    * @param count An integer value that specifies the number of frames to step.
    */
  def QTStep(count: scala.Double): scala.Unit
  /**
    * Stops playing a Quick Time movie.
    */
  def QTStopPlay(): scala.Unit
  /**
    * Rewinds the Flash movie to the first frame.
    */
  def Rewind(): scala.Unit
  /**
    * Sets the value of the specified Flash variable.
    * @param name A string value that specifies the Flash variable.
    * @param value A string value that represents a new value.
    */
  def SetVariable(name: java.lang.String, value: java.lang.String): scala.Unit
  /**
    * Zooms in on the specified rectangular area of the Flash movie.
    * @param left An integer value that specifies the x-coordinate of the rectangle's left side, in twips.
    * @param top An integer value that specifies the y-coordinate of the rectangle's top side, in twips.
    * @param right An integer value that specifies the x-coordinate of the rectangle's right side, in twips.
    * @param bottom An integer value that specifies the y-coordinate of the rectangle's bottom side, in twips.
    */
  def SetZoomRect(left: scala.Double, top: scala.Double, right: scala.Double, bottom: scala.Double): scala.Unit
  /**
    * Stops playing the Flash movie.
    */
  def StopPlay(): scala.Unit
  /**
    * Returns the total number of frames in the Flash movie.
    */
  def TotalFrames(): scala.Double
  /**
    * Zooms the Flash view by a relative scale factor.
    * @param percent An integer value that specifies the relative scale factor, as a  percentage.
    */
  def Zoom(percent: scala.Double): scala.Unit
}

object ASPxClientObjectContainer {
  @scala.inline
  def apply(
    AdjustControl: () => scala.Unit,
    Back: () => scala.Unit,
    FlashScriptCommand: ASPxClientEvent[ASPxClientFlashScriptCommandEventHandler[ASPxClientObjectContainer]],
    Forward: () => scala.Unit,
    GetClientVisible: () => scala.Boolean,
    GetHeight: () => scala.Double,
    GetMainElement: () => js.Object,
    GetParentControl: () => js.Object,
    GetVariable: java.lang.String => java.lang.String,
    GetVisible: () => scala.Boolean,
    GetWidth: () => scala.Double,
    GotoFrame: scala.Double => scala.Unit,
    InCallback: () => scala.Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    IsPlaying: () => scala.Boolean,
    LoadMovie: (scala.Double, java.lang.String) => scala.Unit,
    Pan: (scala.Double, scala.Double, scala.Double) => scala.Unit,
    PercentLoaded: () => java.lang.String,
    Play: () => scala.Unit,
    QTPlay: () => scala.Unit,
    QTRewind: () => scala.Unit,
    QTStep: scala.Double => scala.Unit,
    QTStopPlay: () => scala.Unit,
    Rewind: () => scala.Unit,
    SendMessageToAssistiveTechnology: java.lang.String => scala.Unit,
    SetClientVisible: scala.Boolean => scala.Unit,
    SetHeight: scala.Double => scala.Unit,
    SetVariable: (java.lang.String, java.lang.String) => scala.Unit,
    SetVisible: scala.Boolean => scala.Unit,
    SetWidth: scala.Double => scala.Unit,
    SetZoomRect: (scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    StopPlay: () => scala.Unit,
    TotalFrames: () => scala.Double,
    Zoom: scala.Double => scala.Unit,
    name: java.lang.String
  ): ASPxClientObjectContainer = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), Back = js.Any.fromFunction0(Back), FlashScriptCommand = FlashScriptCommand, Forward = js.Any.fromFunction0(Forward), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVariable = js.Any.fromFunction1(GetVariable), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), GotoFrame = js.Any.fromFunction1(GotoFrame), InCallback = js.Any.fromFunction0(InCallback), Init = Init, IsPlaying = js.Any.fromFunction0(IsPlaying), LoadMovie = js.Any.fromFunction2(LoadMovie), Pan = js.Any.fromFunction3(Pan), PercentLoaded = js.Any.fromFunction0(PercentLoaded), Play = js.Any.fromFunction0(Play), QTPlay = js.Any.fromFunction0(QTPlay), QTRewind = js.Any.fromFunction0(QTRewind), QTStep = js.Any.fromFunction1(QTStep), QTStopPlay = js.Any.fromFunction0(QTStopPlay), Rewind = js.Any.fromFunction0(Rewind), SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetVariable = js.Any.fromFunction2(SetVariable), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), SetZoomRect = js.Any.fromFunction4(SetZoomRect), StopPlay = js.Any.fromFunction0(StopPlay), TotalFrames = js.Any.fromFunction0(TotalFrames), Zoom = js.Any.fromFunction1(Zoom), name = name)
  
    __obj.asInstanceOf[ASPxClientObjectContainer]
  }
}

