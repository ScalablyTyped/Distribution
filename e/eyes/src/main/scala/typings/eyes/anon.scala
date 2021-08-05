package typings.eyes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait All extends StObject {
    
    /** Overall base style applied to everything */
    var all: js.UndefOr[String] = js.undefined
    
    /** Style when printing booleans */
    var bool: js.UndefOr[String] = js.undefined
    
    /** Style when printing the keys in object literals, like 'a' in `{a: 1}` */
    var key: js.UndefOr[String] = js.undefined
    
    /** Style when printing inspection labels, like 'array' in `array: [1, 2, 3]` */
    var label: js.UndefOr[String] = js.undefined
    
    /** Style when printing numbers */
    var number: js.UndefOr[String] = js.undefined
    
    /** Style when printing objects which don't have a literal representation, such as functions */
    var other: js.UndefOr[String] = js.undefined
    
    /** Style when printing RegExps */
    var regexp: js.UndefOr[String] = js.undefined
    
    /** Style when printing `null`, `undefined`, etc. */
    var special: js.UndefOr[String] = js.undefined
    
    /** Style when printing strings */
    var string: js.UndefOr[String] = js.undefined
  }
  object All {
    
    inline def apply(): All = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[All]
    }
    
    extension [Self <: All](x: Self) {
      
      inline def setAll(value: String): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      inline def setBool(value: String): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
      
      inline def setBoolUndefined: Self = StObject.set(x, "bool", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setOther(value: String): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      inline def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
      
      inline def setRegexp(value: String): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
      
      inline def setRegexpUndefined: Self = StObject.set(x, "regexp", js.undefined)
      
      inline def setSpecial(value: String): Self = StObject.set(x, "special", value.asInstanceOf[js.Any])
      
      inline def setSpecialUndefined: Self = StObject.set(x, "special", js.undefined)
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    }
  }
}
