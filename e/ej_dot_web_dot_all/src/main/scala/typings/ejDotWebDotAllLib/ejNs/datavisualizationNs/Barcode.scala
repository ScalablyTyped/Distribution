package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.datavisualization.Barcode")
@js.native
class Barcode protected ()
  extends ejDotWebDotAllLib.ejNs.Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.Model = js.native
  @JSName("model")
  var model_Barcode: ejDotWebDotAllLib.ejNs.Model = js.native
  /** To disable the barcode
    * @returns {void}
    */
  def disable(): scala.Unit = js.native
  /** To enable the barcode
    * @returns {void}
    */
  def enable(): scala.Unit = js.native
}

/* static members */
@JSGlobal("ej.datavisualization.Barcode")
@js.native
object Barcode extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.datavisualizationNs.Barcode = js.native
}

