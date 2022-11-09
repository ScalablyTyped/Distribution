package typings.difflib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Fromfile extends StObject {
    
    var fromfile: js.UndefOr[String] = js.undefined
    
    var fromfiledate: js.UndefOr[String] = js.undefined
    
    var lineterm: js.UndefOr[String] = js.undefined
    
    var tofile: js.UndefOr[String] = js.undefined
    
    var tofiledate: js.UndefOr[String] = js.undefined
  }
  object Fromfile {
    
    inline def apply(): Fromfile = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fromfile]
    }
    
    extension [Self <: Fromfile](x: Self) {
      
      inline def setFromfile(value: String): Self = StObject.set(x, "fromfile", value.asInstanceOf[js.Any])
      
      inline def setFromfileUndefined: Self = StObject.set(x, "fromfile", js.undefined)
      
      inline def setFromfiledate(value: String): Self = StObject.set(x, "fromfiledate", value.asInstanceOf[js.Any])
      
      inline def setFromfiledateUndefined: Self = StObject.set(x, "fromfiledate", js.undefined)
      
      inline def setLineterm(value: String): Self = StObject.set(x, "lineterm", value.asInstanceOf[js.Any])
      
      inline def setLinetermUndefined: Self = StObject.set(x, "lineterm", js.undefined)
      
      inline def setTofile(value: String): Self = StObject.set(x, "tofile", value.asInstanceOf[js.Any])
      
      inline def setTofileUndefined: Self = StObject.set(x, "tofile", js.undefined)
      
      inline def setTofiledate(value: String): Self = StObject.set(x, "tofiledate", value.asInstanceOf[js.Any])
      
      inline def setTofiledateUndefined: Self = StObject.set(x, "tofiledate", js.undefined)
    }
  }
}
