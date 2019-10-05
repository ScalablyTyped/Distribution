package typings.googleDashAppsDashScript.GoogleAppsScript.Charts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewDefinitionBuilder extends js.Object {
  def build(): DataViewDefinition
  def setColumns(columns: js.Array[_]): DataViewDefinitionBuilder
}

object DataViewDefinitionBuilder {
  @scala.inline
  def apply(build: () => DataViewDefinition, setColumns: js.Array[_] => DataViewDefinitionBuilder): DataViewDefinitionBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), setColumns = js.Any.fromFunction1(setColumns))
  
    __obj.asInstanceOf[DataViewDefinitionBuilder]
  }
}

