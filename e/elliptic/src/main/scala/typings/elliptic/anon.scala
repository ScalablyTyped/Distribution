package typings.elliptic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Reason extends StObject {
    
    val reason: String
    
    val result: Boolean
  }
  object Reason {
    
    @scala.inline
    def apply(reason: String, result: Boolean): Reason = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reason]
    }
    
    @scala.inline
    implicit class ReasonMutableBuilder[Self <: Reason] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: String
    
    var y: String
  }
  object X {
    
    @scala.inline
    def apply(x: String, y: String): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
