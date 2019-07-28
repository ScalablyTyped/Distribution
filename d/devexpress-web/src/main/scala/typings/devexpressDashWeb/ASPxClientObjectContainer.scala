package typings.devexpressDashWeb

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
  def Back(): Unit
  /**
    * Play the Flash movie forwards.
    */
  def Forward(): Unit
  /**
    * Returns the value of the Flash variable specified.
    * @param name A string value that specifies the Flash variable.
    */
  def GetVariable(name: String): String
  /**
    * Activates the specified frame in the Flash movie.
    * @param frameNumber An integer value that specifies the requested frame.
    */
  def GotoFrame(frameNumber: Double): Unit
  /**
    * Indicates whether the Flash movie is currently playing.
    */
  def IsPlaying(): Boolean
  /**
    * Loads the Flash movie to the specified layer.
    * @param layerNumber An integer value that identifies a layer in which to load the movie.
    * @param url A string value that specifies the movie's URL.
    */
  def LoadMovie(layerNumber: Double, url: String): Unit
  /**
    * Pans a zoomed-in Flash movie to the specified coordinates.
    * @param x An integer value that specifies the X-coordinate.
    * @param y An integer value that specifies the Y-coordinate.
    * @param mode 0 the coordinates are pixels; 1 the coordinates are a percentage of the window.
    */
  def Pan(x: Double, y: Double, mode: Double): Unit
  /**
    * Returns the percent of the Flash Player movie that has streamed into the browser so far.
    */
  def PercentLoaded(): String
  /**
    * Starts playing media files.
    */
  def Play(): Unit
  /**
    * Starts playing a Quick Time movie.
    */
  def QTPlay(): Unit
  /**
    * Rewinds a Quick Time movie to the first frame.
    */
  def QTRewind(): Unit
  /**
    * Steps through a Quick Time video stream by a specified number of frames.
    * @param count An integer value that specifies the number of frames to step.
    */
  def QTStep(count: Double): Unit
  /**
    * Stops playing a Quick Time movie.
    */
  def QTStopPlay(): Unit
  /**
    * Rewinds the Flash movie to the first frame.
    */
  def Rewind(): Unit
  /**
    * Sets the value of the specified Flash variable.
    * @param name A string value that specifies the Flash variable.
    * @param value A string value that represents a new value.
    */
  def SetVariable(name: String, value: String): Unit
  /**
    * Zooms in on the specified rectangular area of the Flash movie.
    * @param left An integer value that specifies the x-coordinate of the rectangle's left side, in twips.
    * @param top An integer value that specifies the y-coordinate of the rectangle's top side, in twips.
    * @param right An integer value that specifies the x-coordinate of the rectangle's right side, in twips.
    * @param bottom An integer value that specifies the y-coordinate of the rectangle's bottom side, in twips.
    */
  def SetZoomRect(left: Double, top: Double, right: Double, bottom: Double): Unit
  /**
    * Stops playing the Flash movie.
    */
  def StopPlay(): Unit
  /**
    * Returns the total number of frames in the Flash movie.
    */
  def TotalFrames(): Double
  /**
    * Zooms the Flash view by a relative scale factor.
    * @param percent An integer value that specifies the relative scale factor, as a  percentage.
    */
  def Zoom(percent: Double): Unit
}

object ASPxClientObjectContainer {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    Back: () => Unit,
    FlashScriptCommand: ASPxClientEvent[ASPxClientFlashScriptCommandEventHandler[ASPxClientObjectContainer]],
    Forward: () => Unit,
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
    GetMainElement: () => js.Object,
    GetParentControl: () => js.Object,
    GetVariable: String => String,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    GotoFrame: Double => Unit,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    IsPlaying: () => Boolean,
    LoadMovie: (Double, String) => Unit,
    Pan: (Double, Double, Double) => Unit,
    PercentLoaded: () => String,
    Play: () => Unit,
    QTPlay: () => Unit,
    QTRewind: () => Unit,
    QTStep: Double => Unit,
    QTStopPlay: () => Unit,
    Rewind: () => Unit,
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetHeight: Double => Unit,
    SetVariable: (String, String) => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    SetZoomRect: (Double, Double, Double, Double) => Unit,
    StopPlay: () => Unit,
    TotalFrames: () => Double,
    Zoom: Double => Unit,
    name: String
  ): ASPxClientObjectContainer = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), Back = js.Any.fromFunction0(Back), FlashScriptCommand = FlashScriptCommand, Forward = js.Any.fromFunction0(Forward), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVariable = js.Any.fromFunction1(GetVariable), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), GotoFrame = js.Any.fromFunction1(GotoFrame), InCallback = js.Any.fromFunction0(InCallback), Init = Init, IsPlaying = js.Any.fromFunction0(IsPlaying), LoadMovie = js.Any.fromFunction2(LoadMovie), Pan = js.Any.fromFunction3(Pan), PercentLoaded = js.Any.fromFunction0(PercentLoaded), Play = js.Any.fromFunction0(Play), QTPlay = js.Any.fromFunction0(QTPlay), QTRewind = js.Any.fromFunction0(QTRewind), QTStep = js.Any.fromFunction1(QTStep), QTStopPlay = js.Any.fromFunction0(QTStopPlay), Rewind = js.Any.fromFunction0(Rewind), SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetVariable = js.Any.fromFunction2(SetVariable), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), SetZoomRect = js.Any.fromFunction4(SetZoomRect), StopPlay = js.Any.fromFunction0(StopPlay), TotalFrames = js.Any.fromFunction0(TotalFrames), Zoom = js.Any.fromFunction1(Zoom), name = name)
  
    __obj.asInstanceOf[ASPxClientObjectContainer]
  }
}

