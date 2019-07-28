package typings.easeljs.createjsNs

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.ScaleBitmap")
@js.native
class ScaleBitmap protected () extends DisplayObject {
  def this(imageOrUrl: String, scale9Grid: Rectangle) = this()
  def this(imageOrUrl: js.Object, scale9Grid: Rectangle) = this()
  def this(imageOrUrl: HTMLCanvasElement, scale9Grid: Rectangle) = this()
  def this(imageOrUrl: HTMLImageElement, scale9Grid: Rectangle) = this()
  def this(imageOrUrl: HTMLVideoElement, scale9Grid: Rectangle) = this()
  var drawHeight: Double = js.native
  var drawWidth: Double = js.native
  // properties
  var image: HTMLImageElement | HTMLCanvasElement | HTMLVideoElement = js.native
  var scale9Grid: Rectangle = js.native
  var sourceRect: Rectangle = js.native
  // methods
  def setDrawSize(newWidth: Double, newHeight: Double): Unit = js.native
}

