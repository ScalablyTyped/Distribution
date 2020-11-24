package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndicesGetTemplate extends Generic {
  
  var flat_settings: js.UndefOr[Boolean] = js.native
  
  var include_type_name: js.UndefOr[Boolean] = js.native
  
  var local: js.UndefOr[Boolean] = js.native
  
  var master_timeout: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String | js.Array[String]] = js.native
}
object IndicesGetTemplate {
  
  @scala.inline
  def apply(): IndicesGetTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesGetTemplate]
  }
  
  @scala.inline
  implicit class IndicesGetTemplateOps[Self <: IndicesGetTemplate] (val x: Self) extends AnyVal {
    
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
    def setFlat_settings(value: Boolean): Self = this.set("flat_settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlat_settings: Self = this.set("flat_settings", js.undefined)
    
    @scala.inline
    def setInclude_type_name(value: Boolean): Self = this.set("include_type_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude_type_name: Self = this.set("include_type_name", js.undefined)
    
    @scala.inline
    def setLocal(value: Boolean): Self = this.set("local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocal: Self = this.set("local", js.undefined)
    
    @scala.inline
    def setMaster_timeout(value: String): Self = this.set("master_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaster_timeout: Self = this.set("master_timeout", js.undefined)
    
    @scala.inline
    def setNameVarargs(value: String*): Self = this.set("name", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String | js.Array[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
