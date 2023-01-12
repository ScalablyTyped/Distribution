package typings.filenamify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filenamifyMod {
  
  @JSImport("filenamify/filenamify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(string: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    /**
    	Truncate the filename to the given length.
    	Only the base of the filename is truncated, preserving the extension. If the extension itself is longer than `maxLength`, you will get a string that is longer than `maxLength`, so you need to check for that if you allow arbitrary extensions.
    	Systems generally allow up to 255 characters, but we default to 100 for usability reasons.
    	@default 100
    	*/
    val maxLength: js.UndefOr[Double] = js.undefined
    
    /**
    	String to use as replacement for reserved filename characters.
    	Cannot contain: `<` `>` `:` `"` `/` `\` `|` `?` `*`
    	@default '!'
    	*/
    val replacement: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setReplacement(value: String): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
      
      inline def setReplacementUndefined: Self = StObject.set(x, "replacement", js.undefined)
    }
  }
}
