package typings
package easeljsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Stage")
@js.native
class Stage protected () extends Container {
  def this(canvas: java.lang.String) = this()
  def this(canvas: js.Object) = this()
  def this(canvas: stdLib.HTMLCanvasElement) = this()
  // properties
  var autoClear: scala.Boolean = js.native
  var canvas: stdLib.HTMLCanvasElement | js.Object = js.native
  var drawRect: Rectangle = js.native
  var handleEvent: js.Function = js.native
  var mouseInBounds: scala.Boolean = js.native
  var mouseMoveOutside: scala.Boolean = js.native
  var mouseX: scala.Double = js.native
  var mouseY: scala.Double = js.native
  var nextStage: Stage = js.native
  /**
           * @deprecated
           */
  var preventSelection: scala.Boolean = js.native
  var snapToPixelEnabled: scala.Boolean = js.native
    // deprecated
  var tickOnUpdate: scala.Boolean = js.native
  // methods
  def clear(): scala.Unit = js.native
  def enableDOMEvents(): scala.Unit = js.native
  def enableDOMEvents(enable: scala.Boolean): scala.Unit = js.native
  def enableMouseOver(): scala.Unit = js.native
  def enableMouseOver(frequency: scala.Double): scala.Unit = js.native
  def tick(): scala.Unit = js.native
  def tick(props: js.Object): scala.Unit = js.native
  def toDataURL(backgroundColor: java.lang.String, mimeType: java.lang.String): java.lang.String = js.native
  def update(arg: js.Any*): scala.Unit = js.native
}

