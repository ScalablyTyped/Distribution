package typings.ethersprojectJsonWallets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait N extends StObject {
    
    var N: js.UndefOr[Double] = js.undefined
    
    var p: js.UndefOr[Double] = js.undefined
    
    var r: js.UndefOr[Double] = js.undefined
  }
  object N {
    
    @scala.inline
    def apply(): N = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[N]
    }
    
    @scala.inline
    implicit class NMutableBuilder[Self <: N] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setN(value: Double): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNUndefined: Self = StObject.set(x, "N", js.undefined)
      
      @scala.inline
      def setP(value: Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    }
  }
}
