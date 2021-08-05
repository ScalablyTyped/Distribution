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
    
    var assignToProcessEnv: js.UndefOr[Boolean] = js.undefined
    
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
      
      inline def setOverrideProcessEnv(value: Boolean): Self = StObject.set(x, "overrideProcessEnv", value.asInstanceOf[js.Any])
      
      inline def setOverrideProcessEnvUndefined: Self = StObject.set(x, "overrideProcessEnv", js.undefined)
    }
  }
  
  type Parsed = Record[String, String]
  
  type ParsedVariables = Record[String, js.Any]
}
