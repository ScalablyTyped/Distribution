package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndicesDeleteAliasParams extends GenericParams {
  
  var index: NameList = js.native
  
  var masterTimeout: js.UndefOr[TimeSpan] = js.native
  
  var name: NameList = js.native
  
  var timeout: js.UndefOr[TimeSpan] = js.native
}
object IndicesDeleteAliasParams {
  
  @scala.inline
  def apply(index: NameList, name: NameList): IndicesDeleteAliasParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesDeleteAliasParams]
  }
  
  @scala.inline
  implicit class IndicesDeleteAliasParamsOps[Self <: IndicesDeleteAliasParams] (val x: Self) extends AnyVal {
    
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
    def setIndexVarargs(value: String*): Self = this.set("index", js.Array(value :_*))
    
    @scala.inline
    def setIndex(value: NameList): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameVarargs(value: String*): Self = this.set("name", js.Array(value :_*))
    
    @scala.inline
    def setName(value: NameList): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterTimeout(value: TimeSpan): Self = this.set("masterTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterTimeout: Self = this.set("masterTimeout", js.undefined)
    
    @scala.inline
    def setTimeout(value: TimeSpan): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
