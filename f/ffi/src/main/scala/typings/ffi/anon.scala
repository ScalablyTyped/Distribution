package typings.ffi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait RTLDDEFAUL extends StObject {
    
    var RTLD_DEFAUL: Buffer
    
    var RTLD_GLOBAL: Double
    
    var RTLD_LAZY: Double
    
    var RTLD_LOCAL: Double
    
    var RTLD_NEXT: Buffer
    
    var RTLD_NODELETE: Double
    
    var RTLD_NOLOAD: Double
    
    var RTLD_NOW: Double
  }
  object RTLDDEFAUL {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: RTLDDEFAUL] (val x: Self) extends AnyVal {
      
      inline def setRTLD_DEFAUL(value: Buffer): Self = StObject.set(x, "RTLD_DEFAUL", value.asInstanceOf[js.Any])
      
      inline def setRTLD_GLOBAL(value: Double): Self = StObject.set(x, "RTLD_GLOBAL", value.asInstanceOf[js.Any])
      
      inline def setRTLD_LAZY(value: Double): Self = StObject.set(x, "RTLD_LAZY", value.asInstanceOf[js.Any])
      
      inline def setRTLD_LOCAL(value: Double): Self = StObject.set(x, "RTLD_LOCAL", value.asInstanceOf[js.Any])
      
      inline def setRTLD_NEXT(value: Buffer): Self = StObject.set(x, "RTLD_NEXT", value.asInstanceOf[js.Any])
      
      inline def setRTLD_NODELETE(value: Double): Self = StObject.set(x, "RTLD_NODELETE", value.asInstanceOf[js.Any])
      
      inline def setRTLD_NOLOAD(value: Double): Self = StObject.set(x, "RTLD_NOLOAD", value.asInstanceOf[js.Any])
      
      inline def setRTLD_NOW(value: Double): Self = StObject.set(x, "RTLD_NOW", value.asInstanceOf[js.Any])
    }
  }
}
