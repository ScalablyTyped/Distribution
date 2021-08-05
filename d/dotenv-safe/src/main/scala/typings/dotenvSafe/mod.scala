package typings.dotenvSafe

import typings.dotenv.mod.DotenvConfigOptions
import typings.dotenv.mod.DotenvConfigOutput
import typings.dotenv.mod.DotenvParseOutput
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dotenv-safe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def config(): DotenvSafeConfigOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("config")().asInstanceOf[DotenvSafeConfigOutput]
  inline def config(options: DotenvSafeOptions): DotenvSafeConfigOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(options.asInstanceOf[js.Any]).asInstanceOf[DotenvSafeConfigOutput]
  
  trait DotenvSafeConfigOutput
    extends StObject
       with DotenvConfigOutput {
    
    /**
      * key-value pairs required by .env.example
      */
    var required: DotenvParseOutput
  }
  object DotenvSafeConfigOutput {
    
    inline def apply(required: DotenvParseOutput): DotenvSafeConfigOutput = {
      val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
      __obj.asInstanceOf[DotenvSafeConfigOutput]
    }
    
    extension [Self <: DotenvSafeConfigOutput](x: Self) {
      
      inline def setRequired(value: DotenvParseOutput): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    }
  }
  
  trait DotenvSafeOptions
    extends StObject
       with DotenvConfigOptions {
    
    /**
      * Enabling this option will not throw an error after loading.
      * @default false
      */
    var allowEmptyValues: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Path to example environment file. (Option 1)
      * @default ".env.example"
      */
    var example: js.UndefOr[String] = js.undefined
    
    /**
      * Path to example environment file. (Option 2 -- example takes precedence)
      * @default ".env.example"
      */
    var sample: js.UndefOr[String] = js.undefined
  }
  object DotenvSafeOptions {
    
    inline def apply(): DotenvSafeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DotenvSafeOptions]
    }
    
    extension [Self <: DotenvSafeOptions](x: Self) {
      
      inline def setAllowEmptyValues(value: Boolean): Self = StObject.set(x, "allowEmptyValues", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyValuesUndefined: Self = StObject.set(x, "allowEmptyValues", js.undefined)
      
      inline def setExample(value: String): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
      
      inline def setExampleUndefined: Self = StObject.set(x, "example", js.undefined)
      
      inline def setSample(value: String): Self = StObject.set(x, "sample", value.asInstanceOf[js.Any])
      
      inline def setSampleUndefined: Self = StObject.set(x, "sample", js.undefined)
    }
  }
  
  trait MissingEnvVarsError
    extends StObject
       with Error {
    
    /**
      * Variables which existing in the sample file, but not in the loaded file.
      */
    var missing: js.Array[String]
    
    /**
      * Path to example environment file.
      */
    var sample: String
  }
  object MissingEnvVarsError {
    
    inline def apply(message: String, missing: js.Array[String], name: String, sample: String): MissingEnvVarsError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], missing = missing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sample = sample.asInstanceOf[js.Any])
      __obj.asInstanceOf[MissingEnvVarsError]
    }
    
    extension [Self <: MissingEnvVarsError](x: Self) {
      
      inline def setMissing(value: js.Array[String]): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
      
      inline def setMissingVarargs(value: String*): Self = StObject.set(x, "missing", js.Array(value :_*))
      
      inline def setSample(value: String): Self = StObject.set(x, "sample", value.asInstanceOf[js.Any])
    }
  }
}
