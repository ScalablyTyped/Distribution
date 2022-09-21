package typings.dotenvParseVariables

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(parsed: Parsed): ParsedVariables = ^.asInstanceOf[js.Dynamic].apply(parsed.asInstanceOf[js.Any]).asInstanceOf[ParsedVariables]
  inline def apply(parsed: Parsed, options: Options): ParsedVariables = (^.asInstanceOf[js.Dynamic].apply(parsed.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedVariables]
  
  @JSImport("dotenv-parse-variables", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * whether or not to assign the parsed values to `process.env`
      * @default true
      */
    var assignToProcessEnv: js.UndefOr[Boolean] = js.undefined
    
    /**
      * whether or not to ignore functions in the parsed values returned
      * @default true
      */
    var ignoreFunctions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * whether or not to override existing values in `process.env`
      * @default false
      */
    var overrideProcessEnv: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAssignToProcessEnv(value: Boolean): Self = StObject.set(x, "assignToProcessEnv", value.asInstanceOf[js.Any])
      
      inline def setAssignToProcessEnvUndefined: Self = StObject.set(x, "assignToProcessEnv", js.undefined)
      
      inline def setIgnoreFunctions(value: Boolean): Self = StObject.set(x, "ignoreFunctions", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFunctionsUndefined: Self = StObject.set(x, "ignoreFunctions", js.undefined)
      
      inline def setOverrideProcessEnv(value: Boolean): Self = StObject.set(x, "overrideProcessEnv", value.asInstanceOf[js.Any])
      
      inline def setOverrideProcessEnvUndefined: Self = StObject.set(x, "overrideProcessEnv", js.undefined)
    }
  }
  
  type Parsed = Record[String, String]
  
  type ParsedVariables = Record[String, Any]
}
