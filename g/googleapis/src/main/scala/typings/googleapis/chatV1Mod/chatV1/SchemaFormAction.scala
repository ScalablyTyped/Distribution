package typings.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A form action describes the behavior when the form is submitted. For
  * example, an Apps Script can be invoked to handle the form.
  */
@js.native
trait SchemaFormAction extends js.Object {
  /**
    * Apps Script function to invoke when the containing element is
    * clicked/activated.
    */
  var actionMethodName: js.UndefOr[String] = js.native
  /**
    * List of action parameters.
    */
  var parameters: js.UndefOr[js.Array[SchemaActionParameter]] = js.native
}

object SchemaFormAction {
  @scala.inline
  def apply(): SchemaFormAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFormAction]
  }
  @scala.inline
  implicit class SchemaFormActionOps[Self <: SchemaFormAction] (val x: Self) extends AnyVal {
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
    def setActionMethodName(value: String): Self = this.set("actionMethodName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionMethodName: Self = this.set("actionMethodName", js.undefined)
    @scala.inline
    def setParametersVarargs(value: SchemaActionParameter*): Self = this.set("parameters", js.Array(value :_*))
    @scala.inline
    def setParameters(value: js.Array[SchemaActionParameter]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
  }
  
}

