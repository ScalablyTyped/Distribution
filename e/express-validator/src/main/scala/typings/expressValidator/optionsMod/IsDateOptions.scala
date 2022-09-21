package typings.expressValidator.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsDateOptions extends StObject {
  
  var delimiters: js.UndefOr[js.Array[String]] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var strictMode: js.UndefOr[Boolean] = js.undefined
}
object IsDateOptions {
  
  inline def apply(): IsDateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsDateOptions]
  }
  
  extension [Self <: IsDateOptions](x: Self) {
    
    inline def setDelimiters(value: js.Array[String]): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
    
    inline def setDelimitersUndefined: Self = StObject.set(x, "delimiters", js.undefined)
    
    inline def setDelimitersVarargs(value: String*): Self = StObject.set(x, "delimiters", js.Array(value*))
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setStrictMode(value: Boolean): Self = StObject.set(x, "strictMode", value.asInstanceOf[js.Any])
    
    inline def setStrictModeUndefined: Self = StObject.set(x, "strictMode", js.undefined)
  }
}
