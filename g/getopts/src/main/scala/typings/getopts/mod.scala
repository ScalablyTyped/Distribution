package typings.getopts

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("getopts", JSImport.Namespace)
  @js.native
  def apply(argv: js.Array[String]): ParsedOptions = js.native
  @JSImport("getopts", JSImport.Namespace)
  @js.native
  def apply(argv: js.Array[String], options: Options): ParsedOptions = js.native
  
  @js.native
  trait Options extends StObject {
    
    var default: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var alias: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.native
    
    var boolean: js.UndefOr[js.Array[String]] = js.native
    
    var stopEarly: js.UndefOr[Boolean] = js.native
    
    var string: js.UndefOr[js.Array[String]] = js.native
    
    var unknown: js.UndefOr[js.Function1[/* optionName */ String, Boolean]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setBoolean(value: js.Array[String]): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      @scala.inline
      def setBooleanVarargs(value: String*): Self = StObject.set(x, "boolean", js.Array(value :_*))
      
      @scala.inline
      def setDefault(value: StringDictionary[js.Any]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setStopEarly(value: Boolean): Self = StObject.set(x, "stopEarly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopEarlyUndefined: Self = StObject.set(x, "stopEarly", js.undefined)
      
      @scala.inline
      def setString(value: js.Array[String]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      @scala.inline
      def setStringVarargs(value: String*): Self = StObject.set(x, "string", js.Array(value :_*))
      
      @scala.inline
      def setUnknown(value: /* optionName */ String => Boolean): Self = StObject.set(x, "unknown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
    }
  }
  
  @js.native
  trait ParsedOptions
    extends /* key */ StringDictionary[js.Any] {
    
    @JSName("_")
    var _underscore: js.Array[String] = js.native
  }
  object ParsedOptions {
    
    @scala.inline
    def apply(_underscore: js.Array[String]): ParsedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedOptions]
    }
    
    @scala.inline
    implicit class ParsedOptionsMutableBuilder[Self <: ParsedOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_underscore(value: js.Array[String]): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_underscoreVarargs(value: String*): Self = StObject.set(x, "_", js.Array(value :_*))
    }
  }
}
