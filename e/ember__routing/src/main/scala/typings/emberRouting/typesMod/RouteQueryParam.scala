package typings.emberRouting.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteQueryParam extends js.Object {
  
  var as: js.UndefOr[String] = js.native
  
  var refreshModel: js.UndefOr[Boolean] = js.native
  
  var replace: js.UndefOr[Boolean] = js.native
}
object RouteQueryParam {
  
  @scala.inline
  def apply(): RouteQueryParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteQueryParam]
  }
  
  @scala.inline
  implicit class RouteQueryParamOps[Self <: RouteQueryParam] (val x: Self) extends AnyVal {
    
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
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setRefreshModel(value: Boolean): Self = this.set("refreshModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshModel: Self = this.set("refreshModel", js.undefined)
    
    @scala.inline
    def setReplace(value: Boolean): Self = this.set("replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
  }
}
