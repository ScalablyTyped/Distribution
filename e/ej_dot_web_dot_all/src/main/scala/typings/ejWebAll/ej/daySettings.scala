package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait daySettings extends StObject {
  
  var names: js.Array[String]
  
  var namesAbbr: js.Array[String]
  
  var namesShort: js.Array[String]
}
object daySettings {
  
  @scala.inline
  def apply(names: js.Array[String], namesAbbr: js.Array[String], namesShort: js.Array[String]): daySettings = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any], namesAbbr = namesAbbr.asInstanceOf[js.Any], namesShort = namesShort.asInstanceOf[js.Any])
    __obj.asInstanceOf[daySettings]
  }
  
  @scala.inline
  implicit class daySettingsMutableBuilder[Self <: daySettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesAbbr(value: js.Array[String]): Self = StObject.set(x, "namesAbbr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesAbbrVarargs(value: String*): Self = StObject.set(x, "namesAbbr", js.Array(value :_*))
    
    @scala.inline
    def setNamesShort(value: js.Array[String]): Self = StObject.set(x, "namesShort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesShortVarargs(value: String*): Self = StObject.set(x, "namesShort", js.Array(value :_*))
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
  }
}
