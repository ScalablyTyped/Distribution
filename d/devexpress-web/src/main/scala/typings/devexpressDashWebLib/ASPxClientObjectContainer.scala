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

