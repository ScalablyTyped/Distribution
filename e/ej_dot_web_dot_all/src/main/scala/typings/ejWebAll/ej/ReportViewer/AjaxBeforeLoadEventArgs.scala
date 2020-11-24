package typings.ejWebAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AjaxBeforeLoadEventArgs extends js.Object {
  
  /** Send the custom data.
    */
  var data: js.UndefOr[String] = js.native
  
  /** Send the headerReq collection.
    */
  var headerReq: js.UndefOr[js.Any] = js.native
  
  /** Send the headers collection.
    */
  var headers: js.UndefOr[js.Any] = js.native
  
  /** returns the reportViewerToken.
    */
  var reportViewerToken: js.UndefOr[String] = js.native
  
  /** returns the serviceAuthorizationToken.
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setHeaderReq(value: js.Any): Self = this.set("headerReq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderReq: Self = this.set("headerReq", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setReportViewerToken(value: String): Self = this.set("reportViewerToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportViewerToken: Self = this.set("reportViewerToken", js.undefined)
    
    @scala.inline
    def setServiceAuthorizationToken(value: String): Self = this.set("serviceAuthorizationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAuthorizationToken: Self = this.set("serviceAuthorizationToken", js.undefined)
  }
}
