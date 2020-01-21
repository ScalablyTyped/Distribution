package typings.ejWebAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxBeforeLoadEventArgs extends js.Object {
  /** Send the custom data.
    */
  var data: js.UndefOr[String] = js.undefined
  /** Send the headerReq collection.
    */
  var headerReq: js.UndefOr[js.Any] = js.undefined
  /** Send the headers collection.
    */
  var headers: js.UndefOr[js.Any] = js.undefined
  /** returns the reportViewerToken.
    */
  var reportViewerToken: js.UndefOr[String] = js.undefined
  /** returns the serviceAuthorizationToken.
    */
  var serviceAuthorizationToken: js.UndefOr[String] = js.undefined
}

object AjaxBeforeLoadEventArgs {
  @scala.inline
  def apply(
    data: String = null,
    headerReq: js.Any = null,
    headers: js.Any = null,
    reportViewerToken: String = null,
    serviceAuthorizationToken: String = null
  ): AjaxBeforeLoadEventArgs = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (headerReq != null) __obj.updateDynamic("headerReq")(headerReq.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (reportViewerToken != null) __obj.updateDynamic("reportViewerToken")(reportViewerToken.asInstanceOf[js.Any])
    if (serviceAuthorizationToken != null) __obj.updateDynamic("serviceAuthorizationToken")(serviceAuthorizationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxBeforeLoadEventArgs]
  }
}

