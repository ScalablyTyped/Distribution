package typings.ffiNapi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait RTLDDEFAUL extends StObject {
    
    var RTLD_DEFAUL: Buffer = js.native
    
    var RTLD_GLOBAL: Double = js.native
    
    var RTLD_LAZY: Double = js.native
    
    var RTLD_LOCAL: Double = js.native
    
    var RTLD_NEXT: Buffer = js.native
    
    var RTLD_NODELETE: Double = js.native
    
    var RTLD_NOLOAD: Double = js.native
    
    var RTLD_NOW: Double = js.native
  }
  object RTLDDEFAUL {
    
    @scala.inline
    def apply(
      RTLD_DEFAUL: Buffer,
      RTLD_GLOBAL: Double,
      RTLD_LAZY: Double,
      RTLD_LOCAL: Double,
      RTLD_NEXT: Buffer,
      RTLD_NODELETE: Double,
      RTLD_NOLOAD: Double,
      RTLD_NOW: Double
    ): RTLDDEFAUL = {
      val __obj = js.Dynamic.literal(RTLD_DEFAUL = RTLD_DEFAUL.asInstanceOf[js.Any], RTLD_GLOBAL = RTLD_GLOBAL.asInstanceOf[js.Any], RTLD_LAZY = RTLD_LAZY.asInstanceOf[js.Any], RTLD_LOCAL = RTLD_LOCAL.asInstanceOf[js.Any], RTLD_NEXT = RTLD_NEXT.asInstanceOf[js.Any], RTLD_NODELETE = RTLD_NODELETE.asInstanceOf[js.Any], RTLD_NOLOAD = RTLD_NOLOAD.asInstanceOf[js.Any], RTLD_NOW = RTLD_NOW.asInstanceOf[js.Any])
      __obj.asInstanceOf[RTLDDEFAUL]
    }
    
    @scala.inline
    implicit class RTLDDEFAULMutableBuilder[Self <: RTLDDEFAUL] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRTLD_DEFAUL(value: Buffer): Self = StObject.set(x, "RTLD_DEFAUL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRTLD_GLOBAL(value: Double): Self = StObject.set(x, "RTLD_GLOBAL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRTLD_LAZY(value: Double): Self = StObject.set(x, "RTLD_LAZY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRTLD_LOCAL(value: Double): Self = StObject.set(x, "RTLD_LOCAL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRTLD_NEXT(value: Buffer): Self = StObject.set(x, "RTLD_NEXT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRTLD_NODELETE(value: Double): Self = StObject.set(x, "RTLD_NODELETE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRTLD_NOLOAD(value: Double): Self = StObject.set(x, "RTLD_NOLOAD", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRTLD_NOW(value: Double): Self = StObject.set(x, "RTLD_NOW", value.asInstanceOf[js.Any])
    }
  }
}
