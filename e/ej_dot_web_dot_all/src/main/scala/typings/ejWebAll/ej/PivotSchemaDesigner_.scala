package typings.ejWebAll.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.PivotSchemaDesigner")
@js.native
class PivotSchemaDesigner_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.PivotSchemaDesigner.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.PivotSchemaDesigner.Model) = this()
  var defaults: typings.ejWebAll.ej.PivotSchemaDesigner.Model = js.native
  @JSName("model")
  var model_PivotSchemaDesigner_ : typings.ejWebAll.ej.PivotSchemaDesigner.Model = js.native
  /** Performs an asynchronous HTTP (AJAX) request.
    * @returns {void}
    */
  def doAjaxPost(): Unit = js.native
  /** Re-renders the control with the data source bound to the pivot control at that instant.
    * @returns {void}
    */
  def refreshControl(): Unit = js.native
}

