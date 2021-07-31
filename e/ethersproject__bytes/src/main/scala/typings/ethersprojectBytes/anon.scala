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
    
    @scala.inline
    def apply(r: String): R = {
      val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[R]
    }
    
    @scala.inline
    implicit class RMutableBuilder[Self <: R] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecoveryParam(value: Double): Self = StObject.set(x, "recoveryParam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecoveryParamUndefined: Self = StObject.set(x, "recoveryParam", js.undefined)
      
      @scala.inline
      def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      @scala.inline
      def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVUndefined: Self = StObject.set(x, "v", js.undefined)
      
      @scala.inline
      def set_vs(value: String): Self = StObject.set(x, "_vs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_vsUndefined: Self = StObject.set(x, "_vs", js.undefined)
    }
  }
}
