package typings.dotenvDefaults

import typings.dotenv.mod.DotenvConfigOptions
import typings.dotenv.mod.DotenvConfigOutput
import typings.dotenv.mod.DotenvParseOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dotenv-defaults", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def config(): DotenvConfigOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("config")().asInstanceOf[DotenvConfigOutput]
  inline def config(options: DotenvConfigOptions): DotenvConfigOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(options.asInstanceOf[js.Any]).asInstanceOf[DotenvConfigOutput]
  
  inline def parse(src: String): DotenvParseOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any]).asInstanceOf[DotenvParseOutput]
  inline def parse(src: String, defaultSrc: String): DotenvParseOutput = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], defaultSrc.asInstanceOf[js.Any])).asInstanceOf[DotenvParseOutput]
  
  /**
    * A dotenv system that supports defaults
    */
  /* augmented module */
  object dotenvAugmentingMod {
    
    trait DotenvConfigOptions extends StObject {
      
      /**
        * @default '.env.defaults'
        */
      var defaults: js.UndefOr[String] = js.undefined
    }
    object DotenvConfigOptions {
      
      inline def apply(): typings.dotenvDefaults.mod.dotenvAugmentingMod.DotenvConfigOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.dotenvDefaults.mod.dotenvAugmentingMod.DotenvConfigOptions]
      }
      
      extension [Self <: typings.dotenvDefaults.mod.dotenvAugmentingMod.DotenvConfigOptions](x: Self) {
        
        inline def setDefaults(value: String): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
        
        inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      }
    }
  }
}
