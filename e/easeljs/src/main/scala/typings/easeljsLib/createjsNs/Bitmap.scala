package typings
package easeljsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Bitmap")
@js.native
class Bitmap protected () extends DisplayObject {
  def this(imageOrUrl: java.lang.String) = this()
  def this(imageOrUrl: js.Object) = this()
  def this(imageOrUrl: stdLib.HTMLCanvasElement) = this()
  def this(imageOrUrl: stdLib.HTMLImageElement) = this()
  def this(imageOrUrl: stdLib.HTMLVideoElement) = this()
  // properties
  var image: stdLib.HTMLImageElement | stdLib.HTMLCanvasElement | stdLib.HTMLVideoElement = js.native
  var sourceRect: Rectangle = js.native
}

