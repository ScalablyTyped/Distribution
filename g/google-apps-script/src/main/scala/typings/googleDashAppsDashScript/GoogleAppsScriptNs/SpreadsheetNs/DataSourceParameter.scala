package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceParameter extends js.Object {
  def getName(): String
  def getSourceCell(): String
  def getType(): DataSourceParameterType
}

object DataSourceParameter {
  @scala.inline
  def apply(getName: () => String, getSourceCell: () => String, getType: () => DataSourceParameterType): DataSourceParameter = {
    val __obj = js.Dynamic.literal(getName = js.Any.fromFunction0(getName), getSourceCell = js.Any.fromFunction0(getSourceCell), getType = js.Any.fromFunction0(getType))
  
    __obj.asInstanceOf[DataSourceParameter]
  }
}

