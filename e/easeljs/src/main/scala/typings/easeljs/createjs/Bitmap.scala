package typings.easeljs.createjs

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Bitmap")
@js.native
class Bitmap protected () extends DisplayObject {
  def this(imageOrUrl: String) = this()
  def this(imageOrUrl: js.Object) = this()
  def this(imageOrUrl: HTMLCanvasElement) = this()
  def this(imageOrUrl: HTMLImageElement) = this()
  def this(imageOrUrl: HTMLVideoElement) = this()
  // properties
  var image: HTMLImageElement | HTMLCanvasElement | HTMLVideoElement = js.native
  var sourceRect: Rectangle = js.native
}

