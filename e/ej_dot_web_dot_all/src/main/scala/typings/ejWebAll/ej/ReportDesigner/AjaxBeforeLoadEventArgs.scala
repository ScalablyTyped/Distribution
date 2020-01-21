package typings.ejWebAll.ej.ReportDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxBeforeLoadEventArgs extends js.Object {
  /** Action type of AJAX call back.
    */
  var actionType: js.UndefOr[String] = js.undefined
  /** To pass the custom data while AJAX post back.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** AJAX headers, we can pass any custom header through this property.
    */
  var headers: js.UndefOr[js.Array[_]] = js.undefined
  /** Token of report designer.
    */
  var reportDesignerToken: js.UndefOr[String] = js.undefined
  /** Token of ReportingService.
    */
  var serviceAuthorizationToken: js.UndefOr[String] = js.undefined
}

object AjaxBeforeLoadEventArgs {
  @scala.inline
  def apply(
    actionType: String = null,
    data: js.Any = null,
    headers: js.Array[_] = null,
    reportDesignerToken: String = null,
    serviceAuthorizationToken: String = null
  ): AjaxBeforeLoadEventArgs = {
    val __obj = js.Dynamic.literal()
    if (actionType != null) __obj.updateDynamic("actionType")(actionType.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (reportDesignerToken != null) __obj.updateDynamic("reportDesignerToken")(reportDesignerToken.asInstanceOf[js.Any])
    if (serviceAuthorizationToken != null) __obj.updateDynamic("serviceAuthorizationToken")(serviceAuthorizationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxBeforeLoadEventArgs]
  }
}

