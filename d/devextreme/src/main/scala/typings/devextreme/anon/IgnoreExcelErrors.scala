package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgnoreExcelErrors extends js.Object {
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var fileName: js.UndefOr[String] = js.native
  
  var ignoreExcelErrors: js.UndefOr[Boolean] = js.native
  
  var proxyUrl: js.UndefOr[String] = js.native
}
object IgnoreExcelErrors {
  
  @scala.inline
  def apply(): IgnoreExcelErrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreExcelErrors]
  }
  
  @scala.inline
  implicit class IgnoreExcelErrorsOps[Self <: IgnoreExcelErrors] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    
    @scala.inline
    def setIgnoreExcelErrors(value: Boolean): Self = this.set("ignoreExcelErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreExcelErrors: Self = this.set("ignoreExcelErrors", js.undefined)
    
    @scala.inline
    def setProxyUrl(value: String): Self = this.set("proxyUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyUrl: Self = this.set("proxyUrl", js.undefined)
  }
}
