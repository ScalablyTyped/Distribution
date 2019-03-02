package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceParameter extends js.Object {
  def getName(): java.lang.String
  def getSourceCell(): java.lang.String
  def getType(): DataSourceParameterType
}

object DataSourceParameter {
  @scala.inline
  def apply(
    getName: js.Function0[java.lang.String],
    getSourceCell: js.Function0[java.lang.String],
    getType: js.Function0[DataSourceParameterType]
  ): DataSourceParameter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getSourceCell")(getSourceCell)
    __obj.updateDynamic("getType")(getType)
    __obj.asInstanceOf[DataSourceParameter]
  }
}

