package typings.dotenvParseVariables

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dotenv-parse-variables", JSImport.Namespace)
  @js.native
  def apply(parsed: Parsed): ParsedVariables = js.native
  @JSImport("dotenv-parse-variables", JSImport.Namespace)
  @js.native
  def apply(parsed: Parsed, options: Options): ParsedVariables = js.native
  
  @js.native
  trait Options extends StObject {
    
    var assignToProcessEnv: js.UndefOr[Boolean] = js.native
    
    var overrideProcessEnv: js.UndefOr[Boolean] = js.native
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
      def setAssignToProcessEnv(value: Boolean): Self = StObject.set(x, "assignToProcessEnv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssignToProcessEnvUndefined: Self = StObject.set(x, "assignToProcessEnv", js.undefined)
      
      @scala.inline
      def setOverrideProcessEnv(value: Boolean): Self = StObject.set(x, "overrideProcessEnv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideProcessEnvUndefined: Self = StObject.set(x, "overrideProcessEnv", js.undefined)
    }
  }
  
  type Parsed = Record[String, String]
  
  type ParsedVariables = Record[String, js.Any]
}
