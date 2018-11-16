package typings
package easeljsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Text")
@js.native
class Text () extends DisplayObject {
  def this(text: java.lang.String) = this()
  def this(text: java.lang.String, font: java.lang.String) = this()
  def this(text: java.lang.String, font: java.lang.String, color: java.lang.String) = this()
  // properties
  var color: java.lang.String = js.native
  var font: java.lang.String = js.native
  var lineHeight: scala.Double = js.native
  var lineWidth: scala.Double = js.native
  var maxWidth: scala.Double = js.native
  var outline: scala.Double = js.native
  var text: java.lang.String = js.native
  var textAlign: java.lang.String = js.native
  var textBaseline: java.lang.String = js.native
  def getMeasuredHeight(): scala.Double = js.native
  def getMeasuredLineHeight(): scala.Double = js.native
  def getMeasuredWidth(): scala.Double = js.native
  def getMetrics(): js.Object = js.native
}

