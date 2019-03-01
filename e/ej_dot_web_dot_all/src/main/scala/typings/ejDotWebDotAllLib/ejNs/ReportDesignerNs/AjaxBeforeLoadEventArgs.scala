package typings
package ejDotWebDotAllLib.ejNs.ReportDesignerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxBeforeLoadEventArgs extends js.Object {
  /** Action type of AJAX call back.
    */
  var actionType: js.UndefOr[java.lang.String] = js.undefined
  /** To pass the custom data while AJAX post back.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** AJAX headers, we can pass any custom header through this property.
    */
  var headers: js.UndefOr[js.Array[_]] = js.undefined
  /** Token of report designer.
    */
  var reportDesignerToken: js.UndefOr[java.lang.String] = js.undefined
  /** Token of ReportingService.
    */
  var serviceAuthorizationToken: js.UndefOr[java.lang.String] = js.undefined
}

object AjaxBeforeLoadEventArgs {
  @scala.inline
  def apply(
    actionType: java.lang.String = null,
    data: js.Any = null,
    headers: js.Array[_] = null,
    reportDesignerToken: java.lang.String = null,
    serviceAuthorizationToken: java.lang.String = null
  ): AjaxBeforeLoadEventArgs = {
    val __obj = js.Dynamic.literal()
    if (actionType != null) __obj.updateDynamic("actionType")(actionType)
    if (data != null) __obj.updateDynamic("data")(data)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (reportDesignerToken != null) __obj.updateDynamic("reportDesignerToken")(reportDesignerToken)
    if (serviceAuthorizationToken != null) __obj.updateDynamic("serviceAuthorizationToken")(serviceAuthorizationToken)
    __obj.asInstanceOf[AjaxBeforeLoadEventArgs]
  }
}

