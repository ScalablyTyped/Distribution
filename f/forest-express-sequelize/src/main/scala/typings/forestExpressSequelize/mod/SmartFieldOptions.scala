package typings.forestExpressSequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartFieldOptions extends StObject {
  
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
  implicit class SmartFieldOptionsMutableBuilder[Self <: SmartFieldOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnums(value: js.Array[String]): Self = StObject.set(x, "enums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumsUndefined: Self = StObject.set(x, "enums", js.undefined)
    
    @scala.inline
    def setEnumsVarargs(value: String*): Self = StObject.set(x, "enums", js.Array(value :_*))
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: /* record */ js.Any => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    @scala.inline
    def setIsReadOnly(value: Boolean): Self = StObject.set(x, "isReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReadOnlyUndefined: Self = StObject.set(x, "isReadOnly", js.undefined)
    
    @scala.inline
    def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    @scala.inline
    def setSearch(value: (/* query */ js.Any, /* search */ String) => js.Object): Self = StObject.set(x, "search", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    @scala.inline
    def setSet(value: (/* record */ js.Any, /* attributeValue */ js.Any) => js.Object): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    
    @scala.inline
    def setType(value: String | js.Array[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
