package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.PivotSchemaDesigner")
@js.native
class PivotSchemaDesigner protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.PivotSchemaDesignerNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.PivotSchemaDesignerNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.PivotSchemaDesignerNs.Model = js.native
  @JSName("model")
  var model_PivotSchemaDesigner: ejDotWebDotAllLib.ejNs.PivotSchemaDesignerNs.Model = js.native
  /** Performs an asynchronous HTTP (AJAX) request.
    * @returns {void}
    */
  def doAjaxPost(): scala.Unit = js.native
  /** Re-renders the control with the data source bound to the pivot control at that instant.
    * @returns {void}
    */
  def refreshControl(): scala.Unit = js.native
}

@JSGlobal("ej.PivotSchemaDesigner")
@js.native
object PivotSchemaDesigner extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.PivotSchemaDesigner = js.native
}

