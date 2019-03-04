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
  def apply(
    build: js.Function0[DataViewDefinition],
    setColumns: js.Function1[js.Array[js.Object], DataViewDefinitionBuilder]
  ): DataViewDefinitionBuilder = {
    val __obj = js.Dynamic.literal(build = build, setColumns = setColumns)
  
    __obj.asInstanceOf[DataViewDefinitionBuilder]
  }
}

