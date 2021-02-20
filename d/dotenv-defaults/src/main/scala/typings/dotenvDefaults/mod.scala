package typings.dotenvDefaults

import typings.dotenv.mod.DotenvConfigOptions
import typings.dotenv.mod.DotenvConfigOutput
import typings.dotenv.mod.DotenvParseOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dotenv-defaults", "config")
  @js.native
  def config(): DotenvConfigOutput = js.native
  @JSImport("dotenv-defaults", "config")
  @js.native
  def config(options: DotenvConfigOptions): DotenvConfigOutput = js.native
  
  @JSImport("dotenv-defaults", "parse")
  @js.native
  def parse(src: String): DotenvParseOutput = js.native
  @JSImport("dotenv-defaults", "parse")
  @js.native
  def parse(src: String, defaultSrc: String): DotenvParseOutput = js.native
  
  /**
    * A dotenv system that supports defaults
    */
  /* augmented module */
  object dotenvAugmentingMod {
    
    @js.native
    trait DotenvConfigOptions extends StObject {
      
      /**
        * @default '.env.defaults'
        */
      var defaults: js.UndefOr[String] = js.native
    }
    object DotenvConfigOptions {
      
      @scala.inline
      def apply(): typings.dotenvDefaults.mod.dotenvAugmentingMod.DotenvConfigOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.dotenvDefaults.mod.dotenvAugmentingMod.DotenvConfigOptions]
      }
      
      @scala.inline
      implicit class DotenvConfigOptionsMutableBuilder[Self <: typings.dotenvDefaults.mod.dotenvAugmentingMod.DotenvConfigOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDefaults(value: String): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      }
    }
  }
}
