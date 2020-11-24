package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XpackInfo extends Generic {
  
  var accept_enterprise: js.UndefOr[Boolean] = js.native
  
  var categories: js.UndefOr[String | js.Array[String]] = js.native
}
object XpackInfo {
  
  @scala.inline
  def apply(): XpackInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XpackInfo]
  }
  
  @scala.inline
  implicit class XpackInfoOps[Self <: XpackInfo] (val x: Self) extends AnyVal {
    
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
    def setAccept_enterprise(value: Boolean): Self = this.set("accept_enterprise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccept_enterprise: Self = this.set("accept_enterprise", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: String | js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
  }
}
