package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridValidationBuilder extends js.Object {
  def requireLimitOneResponsePerColumn(): GridValidationBuilder
}

object GridValidationBuilder {
  @scala.inline
  def apply(requireLimitOneResponsePerColumn: js.Function0[GridValidationBuilder]): GridValidationBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requireLimitOneResponsePerColumn")(requireLimitOneResponsePerColumn)
    __obj.asInstanceOf[GridValidationBuilder]
  }
}

