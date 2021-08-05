package typings.ethersprojectBytes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait R extends StObject {
    
    var _vs: js.UndefOr[String] = js.undefined
    
    var r: String
    
    var recoveryParam: js.UndefOr[Double] = js.undefined
    
    var s: js.UndefOr[String] = js.undefined
    
    var v: js.UndefOr[Double] = js.undefined
  }
  object R {
    
    inline def apply(r: String): R = {
      val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[R]
    }
    
    extension [Self <: R](x: Self) {
      
      inline def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setRecoveryParam(value: Double): Self = StObject.set(x, "recoveryParam", value.asInstanceOf[js.Any])
      
      inline def setRecoveryParamUndefined: Self = StObject.set(x, "recoveryParam", js.undefined)
      
      inline def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
      
      inline def set_vs(value: String): Self = StObject.set(x, "_vs", value.asInstanceOf[js.Any])
      
      inline def set_vsUndefined: Self = StObject.set(x, "_vs", js.undefined)
    }
  }
}
