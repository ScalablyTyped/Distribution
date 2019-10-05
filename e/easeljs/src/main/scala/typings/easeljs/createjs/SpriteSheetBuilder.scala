package typings.easeljs.createjs

import typings.createjsDashLib.createjs.EventDispatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.SpriteSheetBuilder")
@js.native
class SpriteSheetBuilder () extends EventDispatcher {
  // properties
  var maxHeight: Double = js.native
  var maxWidth: Double = js.native
  var padding: Double = js.native
  var progress: Double = js.native
  var scale: Double = js.native
  var spriteSheet: SpriteSheet = js.native
  var timeSlice: Double = js.native
  // methods
  def addAnimation(name: String, frames: js.Array[Double]): Unit = js.native
  def addAnimation(name: String, frames: js.Array[Double], next: String): Unit = js.native
  def addAnimation(name: String, frames: js.Array[Double], next: String, frequency: Double): Unit = js.native
  def addAnimation(name: String, frames: js.Array[Double], next: Boolean): Unit = js.native
  def addAnimation(name: String, frames: js.Array[Double], next: Boolean, frequency: Double): Unit = js.native
  def addFrame(source: DisplayObject): Double = js.native
  def addFrame(source: DisplayObject, sourceRect: Rectangle): Double = js.native
  def addFrame(source: DisplayObject, sourceRect: Rectangle, scale: Double): Double = js.native
  def addFrame(source: DisplayObject, sourceRect: Rectangle, scale: Double, setupFunction: js.Function0[_]): Double = js.native
  def addFrame(
    source: DisplayObject,
    sourceRect: Rectangle,
    scale: Double,
    setupFunction: js.Function0[_],
    setupData: js.Object
  ): Double = js.native
  def addMovieClip(source: MovieClip): Unit = js.native
  def addMovieClip(source: MovieClip, sourceRect: Rectangle): Unit = js.native
  def addMovieClip(source: MovieClip, sourceRect: Rectangle, scale: Double): Unit = js.native
  def addMovieClip(source: MovieClip, sourceRect: Rectangle, scale: Double, setupFunction: js.Function0[_]): Unit = js.native
  def addMovieClip(
    source: MovieClip,
    sourceRect: Rectangle,
    scale: Double,
    setupFunction: js.Function0[_],
    setupData: js.Object
  ): Unit = js.native
  def addMovieClip(
    source: MovieClip,
    sourceRect: Rectangle,
    scale: Double,
    setupFunction: js.Function0[_],
    setupData: js.Object,
    labelFunction: js.Function0[_]
  ): Unit = js.native
  def build(): SpriteSheet = js.native
  def buildAsync(): Unit = js.native
  def buildAsync(timeSlice: Double): Unit = js.native
   // throw error
  def stopAsync(): Unit = js.native
}

