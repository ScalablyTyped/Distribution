package typings.glaze.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inner extends StObject {
  
  val inner: /* inset 0 2px 4px 0 rgba(0,0,0,.06) */ String
  
  val lg: /* 0 10px 15px -3px rgba(0,0,0,.1),0 4px 6px -2px rgba(0,0,0,.05) */ String
  
  val md: /* 0 4px 6px -1px rgba(0,0,0,.1),0 2px 4px -1px rgba(0,0,0,.06) */ String
  
  val outline: /* 0 0 0 3px rgba(66,153,225,.5) */ String
  
  val sm: /* 0 1px 3px 0 rgba(0,0,0,.1),0 1px 2px 0 rgba(0,0,0,.06) */ String
  
  val xl: /* 0 20px 25px -5px rgba(0,0,0,.1),0 10px 10px -5px rgba(0,0,0,.04) */ String
}
object Inner {
  
  inline def apply(): Inner = {
    val __obj = js.Dynamic.literal(inner = "inset 0 2px 4px 0 rgba(0,0,0,.06)", lg = "0 10px 15px -3px rgba(0,0,0,.1),0 4px 6px -2px rgba(0,0,0,.05)", md = "0 4px 6px -1px rgba(0,0,0,.1),0 2px 4px -1px rgba(0,0,0,.06)", outline = "0 0 0 3px rgba(66,153,225,.5)", sm = "0 1px 3px 0 rgba(0,0,0,.1),0 1px 2px 0 rgba(0,0,0,.06)", xl = "0 20px 25px -5px rgba(0,0,0,.1),0 10px 10px -5px rgba(0,0,0,.04)")
    __obj.asInstanceOf[Inner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Inner] (val x: Self) extends AnyVal {
    
    inline def setInner(value: /* inset 0 2px 4px 0 rgba(0,0,0,.06) */ String): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
    
    inline def setLg(value: /* 0 10px 15px -3px rgba(0,0,0,.1),0 4px 6px -2px rgba(0,0,0,.05) */ String): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
    
    inline def setMd(value: /* 0 4px 6px -1px rgba(0,0,0,.1),0 2px 4px -1px rgba(0,0,0,.06) */ String): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
    
    inline def setOutline(value: /* 0 0 0 3px rgba(66,153,225,.5) */ String): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setSm(value: /* 0 1px 3px 0 rgba(0,0,0,.1),0 1px 2px 0 rgba(0,0,0,.06) */ String): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
    
    inline def setXl(value: /* 0 20px 25px -5px rgba(0,0,0,.1),0 10px 10px -5px rgba(0,0,0,.04) */ String): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
  }
}
