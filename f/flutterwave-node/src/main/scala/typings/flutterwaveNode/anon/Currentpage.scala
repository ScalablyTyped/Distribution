package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Currentpage extends StObject {
  
  var current_page: Double
  
  var total: Double
  
  var total_pages: Double
}
object Currentpage {
  
  inline def apply(current_page: Double, total: Double, total_pages: Double): Currentpage = {
    val __obj = js.Dynamic.literal(current_page = current_page.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], total_pages = total_pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currentpage]
  }
  
  extension [Self <: Currentpage](x: Self) {
    
    inline def setCurrent_page(value: Double): Self = StObject.set(x, "current_page", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotal_pages(value: Double): Self = StObject.set(x, "total_pages", value.asInstanceOf[js.Any])
  }
}
