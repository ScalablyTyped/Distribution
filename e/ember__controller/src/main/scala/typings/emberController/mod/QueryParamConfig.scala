package typings.emberController.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line strict-export-declare-modifiers
@js.native
trait QueryParamConfig extends js.Object {
  
  var as: js.UndefOr[String] = js.native
  
  var scope: js.UndefOr[QueryParamScopeTypes] = js.native
  
  var `type`: js.UndefOr[QueryParamTypes] = js.native
}
object QueryParamConfig {
  
  @scala.inline
  def apply(): QueryParamConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryParamConfig]
  }
  
  @scala.inline
  implicit class QueryParamConfigOps[Self <: QueryParamConfig] (val x: Self) extends AnyVal {
    
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
    def setScope(value: QueryParamScopeTypes): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setType(value: QueryParamTypes): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
