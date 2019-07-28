package typings.googleDashAppsDashScript.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridValidationBuilder extends js.Object {
  def requireLimitOneResponsePerColumn(): GridValidationBuilder
}

object GridValidationBuilder {
  @scala.inline
  def apply(requireLimitOneResponsePerColumn: () => GridValidationBuilder): GridValidationBuilder = {
    val __obj = js.Dynamic.literal(requireLimitOneResponsePerColumn = js.Any.fromFunction0(requireLimitOneResponsePerColumn))
  
    __obj.asInstanceOf[GridValidationBuilder]
  }
}

