package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportOptionArguments extends js.Object {
  
  var apiVersion: js.UndefOr[String] = js.native
  
  var includeZeroImpressions: js.UndefOr[Boolean] = js.native
  
  var resolveGeoNames: js.UndefOr[Boolean] = js.native
  
  var returnMoneyInMicros: js.UndefOr[Boolean] = js.native
}
object ReportOptionArguments {
  
  @scala.inline
  def apply(): ReportOptionArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportOptionArguments]
  }
  
  @scala.inline
  implicit class ReportOptionArgumentsOps[Self <: ReportOptionArguments] (val x: Self) extends AnyVal {
    
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
    def setApiVersion(value: String): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    
    @scala.inline
    def setIncludeZeroImpressions(value: Boolean): Self = this.set("includeZeroImpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeZeroImpressions: Self = this.set("includeZeroImpressions", js.undefined)
    
    @scala.inline
    def setResolveGeoNames(value: Boolean): Self = this.set("resolveGeoNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolveGeoNames: Self = this.set("resolveGeoNames", js.undefined)
    
    @scala.inline
    def setReturnMoneyInMicros(value: Boolean): Self = this.set("returnMoneyInMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnMoneyInMicros: Self = this.set("returnMoneyInMicros", js.undefined)
  }
}
