package typings.egg.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Form extends StObject {
  
  var form: js.Array[String]
  
  var json: js.Array[String]
  
  var text: js.Array[String]
}
object Form {
  
  inline def apply(form: js.Array[String], json: js.Array[String], text: js.Array[String]): Form = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Form]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Form] (val x: Self) extends AnyVal {
    
    inline def setForm(value: js.Array[String]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormVarargs(value: String*): Self = StObject.set(x, "form", js.Array(value*))
    
    inline def setJson(value: js.Array[String]): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonVarargs(value: String*): Self = StObject.set(x, "json", js.Array(value*))
    
    inline def setText(value: js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value*))
  }
}
