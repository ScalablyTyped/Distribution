package typings.getopts

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(argv: js.Array[String]): ParsedOptions = ^.asInstanceOf[js.Dynamic].apply(argv.asInstanceOf[js.Any]).asInstanceOf[ParsedOptions]
  inline def apply(argv: js.Array[String], options: Options): ParsedOptions = (^.asInstanceOf[js.Dynamic].apply(argv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedOptions]
  
  @JSImport("getopts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var default: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var alias: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.undefined
    
    var boolean: js.UndefOr[js.Array[String]] = js.undefined
    
    var stopEarly: js.UndefOr[Boolean] = js.undefined
    
    var string: js.UndefOr[js.Array[String]] = js.undefined
    
    var unknown: js.UndefOr[js.Function1[/* optionName */ String, Boolean]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAlias(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setBoolean(value: js.Array[String]): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      inline def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      inline def setBooleanVarargs(value: String*): Self = StObject.set(x, "boolean", js.Array(value :_*))
      
      inline def setDefault(value: StringDictionary[js.Any]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setStopEarly(value: Boolean): Self = StObject.set(x, "stopEarly", value.asInstanceOf[js.Any])
      
      inline def setStopEarlyUndefined: Self = StObject.set(x, "stopEarly", js.undefined)
      
      inline def setString(value: js.Array[String]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      inline def setStringVarargs(value: String*): Self = StObject.set(x, "string", js.Array(value :_*))
      
      inline def setUnknown(value: /* optionName */ String => Boolean): Self = StObject.set(x, "unknown", js.Any.fromFunction1(value))
      
      inline def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
    }
  }
  
  trait ParsedOptions
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    @JSName("_")
    var _underscore: js.Array[String]
  }
  object ParsedOptions {
    
    inline def apply(_underscore: js.Array[String]): ParsedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedOptions]
    }
    
    extension [Self <: ParsedOptions](x: Self) {
      
      inline def set_underscore(value: js.Array[String]): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
      
      inline def set_underscoreVarargs(value: String*): Self = StObject.set(x, "_", js.Array(value :_*))
    }
  }
}
