package typings
package farbtasticLib.JQueryFarbtasticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Farbtastic extends js.Object {
  var color: java.lang.String = js.native
  var hsl: js.Array[scala.Double] = js.native
  var linked: CallbackFunction | farbtasticLib.JQuery = js.native
  def linkTo(callback: Callback): Farbtastic = js.native
  def setColor(color: java.lang.String): Farbtastic = js.native
  def setColor(color: js.Array[scala.Double]): Farbtastic = js.native
  def setHSL(hsl: js.Array[scala.Double]): Farbtastic = js.native
}

