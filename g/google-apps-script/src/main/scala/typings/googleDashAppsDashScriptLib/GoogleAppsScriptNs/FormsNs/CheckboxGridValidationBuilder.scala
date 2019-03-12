package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxGridValidationBuilder extends js.Object {
  def requireLimitOneResponsePerColumn(): CheckboxGridValidationBuilder
}

object CheckboxGridValidationBuilder {
  @scala.inline
  def apply(requireLimitOneResponsePerColumn: () => CheckboxGridValidationBuilder): CheckboxGridValidationBuilder = {
    val __obj = js.Dynamic.literal(requireLimitOneResponsePerColumn = js.Any.fromFunction0(requireLimitOneResponsePerColumn))
  
    __obj.asInstanceOf[CheckboxGridValidationBuilder]
  }
}

