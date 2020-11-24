package typings.forestExpressSequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartFieldOptions extends js.Object {
  
  var defaultValue: js.UndefOr[js.Any] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var enums: js.UndefOr[js.Array[String]] = js.native
  
  var field: String = js.native
  
  var get: js.UndefOr[SmartFieldValueGetter] = js.native
  
  var isReadOnly: js.UndefOr[Boolean] = js.native
  
  var reference: js.UndefOr[String] = js.native
  
  var search: js.UndefOr[SmartFieldSearcher] = js.native
  
  var set: js.UndefOr[SmartFieldValueSetter] = js.native
  
  var `type`: String | js.Array[String] = js.native
}
object SmartFieldOptions {
  
  @scala.inline
  def apply(field: String, `type`: String | js.Array[String]): SmartFieldOptions = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartFieldOptions]
  }
  
  @scala.inline
  implicit class SmartFieldOptionsOps[Self <: SmartFieldOptions] (val x: Self) extends AnyVal {
    
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
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: String*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String | js.Array[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEnumsVarargs(value: String*): Self = this.set("enums", js.Array(value :_*))
    
    @scala.inline
    def setEnums(value: js.Array[String]): Self = this.set("enums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnums: Self = this.set("enums", js.undefined)
    
    @scala.inline
    def setGet(value: /* record */ js.Any => js.Any): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    
    @scala.inline
    def setIsReadOnly(value: Boolean): Self = this.set("isReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsReadOnly: Self = this.set("isReadOnly", js.undefined)
    
    @scala.inline
    def setReference(value: String): Self = this.set("reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReference: Self = this.set("reference", js.undefined)
    
    @scala.inline
    def setSearch(value: (/* query */ js.Any, /* search */ String) => js.Object): Self = this.set("search", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    
    @scala.inline
    def setSet(value: (/* record */ js.Any, /* attributeValue */ js.Any) => js.Object): Self = this.set("set", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
  }
}
