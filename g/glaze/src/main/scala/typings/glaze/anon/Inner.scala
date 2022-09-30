package typings.glaze.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inner extends StObject {
  
  val inner: String
  
  val lg: String
  
  val md: String
  
  val outline: String
  
  val sm: String
  
  val xl: String
}
object Inner {
  
  inline def apply(): Inner = {
    val __obj = js.Dynamic.literal(inner = "inset 0 2px 4px 0 rgba(0,0,0,.06)", lg = "0 10px 15px -3px rgba(0,0,0,.1),0 4px 6px -2px rgba(0,0,0,.05)", md = "0 4px 6px -1px rgba(0,0,0,.1),0 2px 4px -1px rgba(0,0,0,.06)", outline = "0 0 0 3px rgba(66,153,225,.5)", sm = "0 1px 3px 0 rgba(0,0,0,.1),0 1px 2px 0 rgba(0,0,0,.06)", xl = "0 20px 25px -5px rgba(0,0,0,.1),0 10px 10px -5px rgba(0,0,0,.04)")
    __obj.asInstanceOf[Inner]
  }
  
  extension [Self <: Inner](x: Self) {
    
    inline def setInner(value: String): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
    
    inline def setLg(value: String): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
    
    inline def setMd(value: String): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
    
    inline def setOutline(value: String): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setSm(value: String): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
    
    inline def setXl(value: String): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
  }
}
