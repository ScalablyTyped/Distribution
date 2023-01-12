package typings.fluentuiTheme

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesIspacingMod {
  
  trait ISpacing extends StObject {
    
    var l1: String
    
    var l2: String
    
    var m: String
    
    var s1: String
    
    var s2: String
  }
  object ISpacing {
    
    inline def apply(l1: String, l2: String, m: String, s1: String, s2: String): ISpacing = {
      val __obj = js.Dynamic.literal(l1 = l1.asInstanceOf[js.Any], l2 = l2.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], s1 = s1.asInstanceOf[js.Any], s2 = s2.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISpacing]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISpacing] (val x: Self) extends AnyVal {
      
      inline def setL1(value: String): Self = StObject.set(x, "l1", value.asInstanceOf[js.Any])
      
      inline def setL2(value: String): Self = StObject.set(x, "l2", value.asInstanceOf[js.Any])
      
      inline def setM(value: String): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      inline def setS1(value: String): Self = StObject.set(x, "s1", value.asInstanceOf[js.Any])
      
      inline def setS2(value: String): Self = StObject.set(x, "s2", value.asInstanceOf[js.Any])
    }
  }
}
