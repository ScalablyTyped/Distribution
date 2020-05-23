package typings.easeljs.createjs

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bitmap extends DisplayObject {
  // properties
  var image: HTMLImageElement | HTMLCanvasElement | HTMLVideoElement = js.native
  var sourceRect: Rectangle = js.native
}

