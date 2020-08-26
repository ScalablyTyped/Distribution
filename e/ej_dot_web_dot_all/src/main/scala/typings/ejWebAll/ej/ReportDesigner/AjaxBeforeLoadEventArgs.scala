package typings.ejWebAll.ej.ReportDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AjaxBeforeLoadEventArgs extends js.Object {
  /** Action type of AJAX call back.
    */
  var actionType: js.UndefOr[String] = js.native
  /** To pass the custom data while AJAX post back.
    */
  var data: js.UndefOr[js.Any] = js.native
  /** AJAX headers, we can pass any custom header through this property.
    */
  var headers: js.UndefOr[js.Array[_]] = js.native
  /** Token of report designer.
    */
  var reportDesignerToken: js.UndefOr[String] = js.native
  /** Token of ReportingService.
    */
  var serviceAuthorizationToken: js.UndefOr[String] = js.native
}

object AjaxBeforeLoadEventArgs {
  @scala.inline
  def apply(): AjaxBeforeLoadEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AjaxBeforeLoadEventArgs]
  }
  @scala.inline
  implicit class AjaxBeforeLoadEventArgsOps[Self <: AjaxBeforeLoadEventArgs] (val x: Self) extends AnyVal {
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
    def setActionType(value: String): Self = this.set("actionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionType: Self = this.set("actionType", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setHeadersVarargs(value: js.Any*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: js.Array[_]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setReportDesignerToken(value: String): Self = this.set("reportDesignerToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportDesignerToken: Self = this.set("reportDesignerToken", js.undefined)
    @scala.inline
    def setServiceAuthorizationToken(value: String): Self = this.set("serviceAuthorizationToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceAuthorizationToken: Self = this.set("serviceAuthorizationToken", js.undefined)
  }
  
}

