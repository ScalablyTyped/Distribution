package typings.devcert

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CaCertPath extends StObject {
    
    var caCertPath: String
    
    var caKeyPath: String
  }
  object CaCertPath {
    
    @scala.inline
    def apply(caCertPath: String, caKeyPath: String): CaCertPath = {
      val __obj = js.Dynamic.literal(caCertPath = caCertPath.asInstanceOf[js.Any], caKeyPath = caKeyPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[CaCertPath]
    }
    
    @scala.inline
    implicit class CaCertPathMutableBuilder[Self <: CaCertPath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaCertPath(value: String): Self = StObject.set(x, "caCertPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaKeyPath(value: String): Self = StObject.set(x, "caKeyPath", value.asInstanceOf[js.Any])
    }
  }
}
