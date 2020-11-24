package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotSchemaDesigner_ extends Widget_ {
  
  var defaults: typings.ejWebAll.ej.PivotSchemaDesigner.Model = js.native
  
  /** Performs an asynchronous HTTP (AJAX) request.
    * @returns {void}
    */
  def doAjaxPost(): Unit = js.native
  
  @JSName("model")
  var model_PivotSchemaDesigner_ : typings.ejWebAll.ej.PivotSchemaDesigner.Model = js.native
  
  /** Re-renders the control with the data source bound to the pivot control at that instant.
    * @returns {void}
    */
  def refreshControl(): Unit = js.native
}
