package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASPxClientCustomizeDataSourceWizardEventArgs extends ASPxClientEventArgs {
  var Type: String = js.native
  var Wizard: js.Any = js.native
}

object ASPxClientCustomizeDataSourceWizardEventArgs {
  @scala.inline
  def apply(Type: String, Wizard: js.Any): ASPxClientCustomizeDataSourceWizardEventArgs = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Wizard = Wizard.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCustomizeDataSourceWizardEventArgs]
  }
  @scala.inline
  implicit class ASPxClientCustomizeDataSourceWizardEventArgsOps[Self <: ASPxClientCustomizeDataSourceWizardEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWizard(value: js.Any): Self = this.set("Wizard", value.asInstanceOf[js.Any])
  }
  
}

