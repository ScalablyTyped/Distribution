package typings.formUrlencoded

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(data: Any): String = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(data: Any, opts: FormEncodedOptions): String = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("form-urlencoded", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FormEncodedOptions extends StObject {
    
    var ignorenull: js.UndefOr[Boolean] = js.undefined
    
    var skipBracket: js.UndefOr[Boolean] = js.undefined
    
    var skipIndex: js.UndefOr[Boolean] = js.undefined
    
    var sorted: js.UndefOr[Boolean] = js.undefined
    
    var useDot: js.UndefOr[Boolean] = js.undefined
    
    var whitespace: js.UndefOr[String] = js.undefined
  }
  object FormEncodedOptions {
    
    inline def apply(): FormEncodedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormEncodedOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormEncodedOptions] (val x: Self) extends AnyVal {
      
      inline def setIgnorenull(value: Boolean): Self = StObject.set(x, "ignorenull", value.asInstanceOf[js.Any])
      
      inline def setIgnorenullUndefined: Self = StObject.set(x, "ignorenull", js.undefined)
      
      inline def setSkipBracket(value: Boolean): Self = StObject.set(x, "skipBracket", value.asInstanceOf[js.Any])
      
      inline def setSkipBracketUndefined: Self = StObject.set(x, "skipBracket", js.undefined)
      
      inline def setSkipIndex(value: Boolean): Self = StObject.set(x, "skipIndex", value.asInstanceOf[js.Any])
      
      inline def setSkipIndexUndefined: Self = StObject.set(x, "skipIndex", js.undefined)
      
      inline def setSorted(value: Boolean): Self = StObject.set(x, "sorted", value.asInstanceOf[js.Any])
      
      inline def setSortedUndefined: Self = StObject.set(x, "sorted", js.undefined)
      
      inline def setUseDot(value: Boolean): Self = StObject.set(x, "useDot", value.asInstanceOf[js.Any])
      
      inline def setUseDotUndefined: Self = StObject.set(x, "useDot", js.undefined)
      
      inline def setWhitespace(value: String): Self = StObject.set(x, "whitespace", value.asInstanceOf[js.Any])
      
      inline def setWhitespaceUndefined: Self = StObject.set(x, "whitespace", js.undefined)
    }
  }
}
