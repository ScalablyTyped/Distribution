package typings.formUrlencoded

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(data: js.Any): String = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(data: js.Any, opts: FormEncodedOptions): String = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("form-urlencoded", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FormEncodedOptions extends StObject {
    
    var ignorenull: js.UndefOr[Boolean] = js.undefined
    
    var skipIndex: js.UndefOr[Boolean] = js.undefined
    
    var sorted: js.UndefOr[Boolean] = js.undefined
  }
  object FormEncodedOptions {
    
    inline def apply(): FormEncodedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormEncodedOptions]
    }
    
    extension [Self <: FormEncodedOptions](x: Self) {
      
      inline def setIgnorenull(value: Boolean): Self = StObject.set(x, "ignorenull", value.asInstanceOf[js.Any])
      
      inline def setIgnorenullUndefined: Self = StObject.set(x, "ignorenull", js.undefined)
      
      inline def setSkipIndex(value: Boolean): Self = StObject.set(x, "skipIndex", value.asInstanceOf[js.Any])
      
      inline def setSkipIndexUndefined: Self = StObject.set(x, "skipIndex", js.undefined)
      
      inline def setSorted(value: Boolean): Self = StObject.set(x, "sorted", value.asInstanceOf[js.Any])
      
      inline def setSortedUndefined: Self = StObject.set(x, "sorted", js.undefined)
    }
  }
}
