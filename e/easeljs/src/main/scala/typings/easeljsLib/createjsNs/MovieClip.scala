package typings
package easeljsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.MovieClip")
@js.native
class MovieClip () extends Container {
  def this(mode: java.lang.String) = this()
  def this(mode: java.lang.String, startPosition: scala.Double) = this()
  def this(mode: java.lang.String, startPosition: scala.Double, loop: scala.Boolean) = this()
  def this(mode: java.lang.String, startPosition: scala.Double, loop: scala.Boolean, labels: js.Object) = this()
  // properties
  var actionsEnabled: scala.Boolean = js.native
  var autoReset: scala.Boolean = js.native
  var currentFrame: scala.Double = js.native
  var currentLabel: java.lang.String = js.native
  var duration: scala.Double = js.native
  var frameBounds: js.Array[Rectangle] = js.native
  var framerate: scala.Double = js.native
  var labels: js.Array[js.Object] = js.native
  var loop: scala.Boolean = js.native
  var mode: java.lang.String = js.native
  var paused: scala.Boolean = js.native
  var startPosition: scala.Double = js.native
  var timeline: tweenjsLib.createjsNs.Timeline = js.native
  var totalFrames: scala.Double = js.native
  // methods
  def advance(): scala.Unit = js.native
  def advance(time: scala.Double): scala.Unit = js.native
   // not supported
  /**
    * @deprecated - use 'currentLabel' property instead
    */
  def getCurrentLabel(): java.lang.String = js.native
    // deprecated
  /**
    * @deprecated - use 'labels' property instead
    */
  def getLabels(): js.Array[js.Object] = js.native
  def gotoAndPlay(positionOrLabel: java.lang.String): scala.Unit = js.native
  def gotoAndPlay(positionOrLabel: scala.Double): scala.Unit = js.native
  def gotoAndStop(positionOrLabel: java.lang.String): scala.Unit = js.native
  def gotoAndStop(positionOrLabel: scala.Double): scala.Unit = js.native
  def play(): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

/* static members */
@JSGlobal("createjs.MovieClip")
@js.native
object MovieClip extends js.Object {
  var INDEPENDENT: java.lang.String = js.native
  var SINGLE_FRAME: java.lang.String = js.native
  var SYNCHED: java.lang.String = js.native
  var buildDate: java.lang.String = js.native
  var version: java.lang.String = js.native
}

