package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientCustomizeDataSourceWizardEventArgs extends ASPxClientEventArgs {
  var Type: String
  var Wizard: js.Any
}

object ASPxClientCustomizeDataSourceWizardEventArgs {
  @scala.inline
  def apply(Type: String, Wizard: js.Any): ASPxClientCustomizeDataSourceWizardEventArgs = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Wizard = Wizard.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCustomizeDataSourceWizardEventArgs]
  }
}

