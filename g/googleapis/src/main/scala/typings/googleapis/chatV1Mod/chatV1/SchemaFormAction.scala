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
  def apply(actionMethodName: String = null, parameters: js.Array[SchemaActionParameter] = null): SchemaFormAction = {
    val __obj = js.Dynamic.literal()
    if (actionMethodName != null) __obj.updateDynamic("actionMethodName")(actionMethodName.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFormAction]
  }
}

