package typings
package easeljsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.ScaleBitmap")
@js.native
class ScaleBitmap protected () extends DisplayObject {
  def this(imageOrUrl: java.lang.String, scale9Grid: Rectangle) = this()
  def this(imageOrUrl: js.Object, scale9Grid: Rectangle) = this()
  def this(imageOrUrl: stdLib.HTMLCanvasElement, scale9Grid: Rectangle) = this()
  def this(imageOrUrl: stdLib.HTMLImageElement, scale9Grid: Rectangle) = this()
  def this(imageOrUrl: stdLib.HTMLVideoElement, scale9Grid: Rectangle) = this()
  var drawHeight: scala.Double = js.native
  var drawWidth: scala.Double = js.native
  // properties
  var image: stdLib.HTMLImageElement | stdLib.HTMLCanvasElement | stdLib.HTMLVideoElement = js.native
  var scale9Grid: Rectangle = js.native
  var sourceRect: Rectangle = js.native
  // methods
  def setDrawSize(newWidth: scala.Double, newHeight: scala.Double): scala.Unit = js.native
}

