package typings.dotenvExpand

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dotenv-expand", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def expand(): DotenvExpandOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("expand")().asInstanceOf[DotenvExpandOutput]
  inline def expand(options: DotenvExpandOptions): DotenvExpandOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("expand")(options.asInstanceOf[js.Any]).asInstanceOf[DotenvExpandOutput]
  
  trait DotenvExpandOptions extends StObject {
    
    var error: js.UndefOr[js.Error] = js.undefined
    
    var ignoreProcessEnv: js.UndefOr[Boolean] = js.undefined
    
    var parsed: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object DotenvExpandOptions {
    
    inline def apply(): DotenvExpandOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DotenvExpandOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DotenvExpandOptions] (val x: Self) extends AnyVal {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setIgnoreProcessEnv(value: Boolean): Self = StObject.set(x, "ignoreProcessEnv", value.asInstanceOf[js.Any])
      
      inline def setIgnoreProcessEnvUndefined: Self = StObject.set(x, "ignoreProcessEnv", js.undefined)
      
      inline def setParsed(value: StringDictionary[String]): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
      
      inline def setParsedUndefined: Self = StObject.set(x, "parsed", js.undefined)
    }
  }
  
  trait DotenvExpandOutput extends StObject {
    
    var error: js.UndefOr[js.Error] = js.undefined
    
    var ignoreProcessEnv: js.UndefOr[Boolean] = js.undefined
    
    var parsed: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object DotenvExpandOutput {
    
    inline def apply(): DotenvExpandOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DotenvExpandOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DotenvExpandOutput] (val x: Self) extends AnyVal {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setIgnoreProcessEnv(value: Boolean): Self = StObject.set(x, "ignoreProcessEnv", value.asInstanceOf[js.Any])
      
      inline def setIgnoreProcessEnvUndefined: Self = StObject.set(x, "ignoreProcessEnv", js.undefined)
      
      inline def setParsed(value: StringDictionary[String]): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
      
      inline def setParsedUndefined: Self = StObject.set(x, "parsed", js.undefined)
    }
  }
}
