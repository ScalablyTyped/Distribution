package typings
package easeljsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.SpriteSheetBuilder")
@js.native
class SpriteSheetBuilder ()
  extends createjsDashLibLib.createjsNs.EventDispatcher {
  // properties
  var maxHeight: scala.Double = js.native
  var maxWidth: scala.Double = js.native
  var padding: scala.Double = js.native
  var progress: scala.Double = js.native
  var scale: scala.Double = js.native
  var spriteSheet: SpriteSheet = js.native
  var timeSlice: scala.Double = js.native
  // methods
  def addAnimation(name: java.lang.String, frames: js.Array[scala.Double]): scala.Unit = js.native
  def addAnimation(name: java.lang.String, frames: js.Array[scala.Double], next: java.lang.String): scala.Unit = js.native
  def addAnimation(
    name: java.lang.String,
    frames: js.Array[scala.Double],
    next: java.lang.String,
    frequency: scala.Double
  ): scala.Unit = js.native
  def addAnimation(name: java.lang.String, frames: js.Array[scala.Double], next: scala.Boolean): scala.Unit = js.native
  def addAnimation(
    name: java.lang.String,
    frames: js.Array[scala.Double],
    next: scala.Boolean,
    frequency: scala.Double
  ): scala.Unit = js.native
  def addFrame(source: DisplayObject): scala.Double = js.native
  def addFrame(source: DisplayObject, sourceRect: Rectangle): scala.Double = js.native
  def addFrame(source: DisplayObject, sourceRect: Rectangle, scale: scala.Double): scala.Double = js.native
  def addFrame(source: DisplayObject, sourceRect: Rectangle, scale: scala.Double, setupFunction: js.Function0[_]): scala.Double = js.native
  def addFrame(
    source: DisplayObject,
    sourceRect: Rectangle,
    scale: scala.Double,
    setupFunction: js.Function0[_],
    setupData: js.Object
  ): scala.Double = js.native
  def addMovieClip(source: MovieClip): scala.Unit = js.native
  def addMovieClip(source: MovieClip, sourceRect: Rectangle): scala.Unit = js.native
  def addMovieClip(source: MovieClip, sourceRect: Rectangle, scale: scala.Double): scala.Unit = js.native
  def addMovieClip(source: MovieClip, sourceRect: Rectangle, scale: scala.Double, setupFunction: js.Function0[_]): scala.Unit = js.native
  def addMovieClip(
    source: MovieClip,
    sourceRect: Rectangle,
    scale: scala.Double,
    setupFunction: js.Function0[_],
    setupData: js.Object
  ): scala.Unit = js.native
  def addMovieClip(
    source: MovieClip,
    sourceRect: Rectangle,
    scale: scala.Double,
    setupFunction: js.Function0[_],
    setupData: js.Object,
    labelFunction: js.Function0[_]
  ): scala.Unit = js.native
  def build(): SpriteSheet = js.native
  def buildAsync(): scala.Unit = js.native
  def buildAsync(timeSlice: scala.Double): scala.Unit = js.native
   // throw error
  def stopAsync(): scala.Unit = js.native
}

