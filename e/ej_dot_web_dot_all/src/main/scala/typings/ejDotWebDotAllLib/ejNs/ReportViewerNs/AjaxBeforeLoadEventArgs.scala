package typings
package ejDotWebDotAllLib.ejNs.ReportViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxBeforeLoadEventArgs extends js.Object {
  /** Send the custom data.
    */
  var data: js.UndefOr[java.lang.String] = js.undefined
  /** Send the headerReq collection.
    */
  var headerReq: js.UndefOr[js.Any] = js.undefined
  /** Send the headers collection.
    */
  var headers: js.UndefOr[js.Any] = js.undefined
  /** returns the reportViewerToken.
    */
  var reportViewerToken: js.UndefOr[java.lang.String] = js.undefined
  /** returns the serviceAuthorizationToken.
    */
  var serviceAuthorizationToken: js.UndefOr[java.lang.String] = js.undefined
}

object AjaxBeforeLoadEventArgs {
  @scala.inline
  def apply(
    data: java.lang.String = null,
    headerReq: js.Any = null,
    headers: js.Any = null,
    reportViewerToken: java.lang.String = null,
    serviceAuthorizationToken: java.lang.String = null
  ): AjaxBeforeLoadEventArgs = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (headerReq != null) __obj.updateDynamic("headerReq")(headerReq)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (reportViewerToken != null) __obj.updateDynamic("reportViewerToken")(reportViewerToken)
    if (serviceAuthorizationToken != null) __obj.updateDynamic("serviceAuthorizationToken")(serviceAuthorizationToken)
    __obj.asInstanceOf[AjaxBeforeLoadEventArgs]
  }
}

