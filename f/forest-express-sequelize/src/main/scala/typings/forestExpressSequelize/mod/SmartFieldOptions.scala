package typings.forestExpressSequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartFieldOptions extends StObject {
  
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var enums: js.UndefOr[js.Array[String]] = js.undefined
  
  var field: String
  
  var get: js.UndefOr[SmartFieldValueGetter] = js.undefined
  
  var isReadOnly: js.UndefOr[Boolean] = js.undefined
  
  var reference: js.UndefOr[String] = js.undefined
  
  var search: js.UndefOr[SmartFieldSearcher] = js.undefined
  
  var set: js.UndefOr[SmartFieldValueSetter] = js.undefined
  
  var `type`: String | js.Array[String]
}
object SmartFieldOptions {
  
  inline def apply(field: String, `type`: String | js.Array[String]): SmartFieldOptions = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartFieldOptions]
  }
  
  extension [Self <: SmartFieldOptions](x: Self) {
    
    inline def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnums(value: js.Array[String]): Self = StObject.set(x, "enums", value.asInstanceOf[js.Any])
    
    inline def setEnumsUndefined: Self = StObject.set(x, "enums", js.undefined)
    
    inline def setEnumsVarargs(value: String*): Self = StObject.set(x, "enums", js.Array(value :_*))
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setGet(value: /* record */ js.Any => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    inline def setIsReadOnly(value: Boolean): Self = StObject.set(x, "isReadOnly", value.asInstanceOf[js.Any])
    
    inline def setIsReadOnlyUndefined: Self = StObject.set(x, "isReadOnly", js.undefined)
    
    inline def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    inline def setSearch(value: (/* query */ js.Any, /* search */ String) => js.Object): Self = StObject.set(x, "search", js.Any.fromFunction2(value))
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    inline def setSet(value: (/* record */ js.Any, /* attributeValue */ js.Any) => js.Object): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    
    inline def setType(value: String | js.Array[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
