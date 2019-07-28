package typings.ejDotWebDotAll.ejNs.datavisualizationNs

import typings.ejDotWebDotAll.JQuery
import typings.ejDotWebDotAll.ejNs.Model
import typings.ejDotWebDotAll.ejNs.Widget
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.datavisualization.Barcode")
@js.native
class Barcode protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: Model) = this()
  def this(element: Element, options: Model) = this()
  var defaults: Model = js.native
  @JSName("model")
  var model_Barcode: Model = js.native
  /** To disable the barcode
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** To enable the barcode
    * @returns {void}
    */
  def enable(): Unit = js.native
}

/* static members */
@JSGlobal("ej.datavisualization.Barcode")
@js.native
object Barcode extends js.Object {
  var Locale: js.Any = js.native
  var fn: Barcode = js.native
}

