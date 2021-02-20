package typings.gaxios

import typings.gaxios.commonMod.GaxiosOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Config extends StObject {
    
    var config: js.UndefOr[scala.Nothing] = js.native
    
    var shouldRetry: Boolean = js.native
  }
  object Config {
    
    @scala.inline
    def apply(shouldRetry: Boolean): Config = {
      val __obj = js.Dynamic.literal(shouldRetry = shouldRetry.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShouldRetry(value: Boolean): Self = StObject.set(x, "shouldRetry", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ShouldRetry extends StObject {
    
    var config: GaxiosOptions = js.native
    
    var shouldRetry: Boolean = js.native
  }
  object ShouldRetry {
    
    @scala.inline
    def apply(config: GaxiosOptions, shouldRetry: Boolean): ShouldRetry = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], shouldRetry = shouldRetry.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShouldRetry]
    }
    
    @scala.inline
    implicit class ShouldRetryMutableBuilder[Self <: ShouldRetry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: GaxiosOptions): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldRetry(value: Boolean): Self = StObject.set(x, "shouldRetry", value.asInstanceOf[js.Any])
    }
  }
}
