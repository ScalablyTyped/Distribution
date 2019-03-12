package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewDefinitionBuilder extends js.Object {
  def build(): DataViewDefinition
  def setColumns(columns: js.Array[js.Object]): DataViewDefinitionBuilder
}

object DataViewDefinitionBuilder {
  @scala.inline
  def apply(build: () => DataViewDefinition, setColumns: js.Array[js.Object] => DataViewDefinitionBuilder): DataViewDefinitionBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), setColumns = js.Any.fromFunction1(setColumns))
  
    __obj.asInstanceOf[DataViewDefinitionBuilder]
  }
}

