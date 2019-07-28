package typings.ejDotWebDotAll.ejNs

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.PivotSchemaDesigner")
@js.native
class PivotSchemaDesigner protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ejNs.PivotSchemaDesignerNs.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ejNs.PivotSchemaDesignerNs.Model) = this()
  var defaults: typings.ejDotWebDotAll.ejNs.PivotSchemaDesignerNs.Model = js.native
  @JSName("model")
  var model_PivotSchemaDesigner: typings.ejDotWebDotAll.ejNs.PivotSchemaDesignerNs.Model = js.native
  /** Performs an asynchronous HTTP (AJAX) request.
    * @returns {void}
    */
  def doAjaxPost(): Unit = js.native
  /** Re-renders the control with the data source bound to the pivot control at that instant.
    * @returns {void}
    */
  def refreshControl(): Unit = js.native
}

/* static members */
@JSGlobal("ej.PivotSchemaDesigner")
@js.native
object PivotSchemaDesigner extends js.Object {
  var Locale: js.Any = js.native
  var fn: PivotSchemaDesigner = js.native
}

