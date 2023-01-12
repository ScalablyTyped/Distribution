package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pagesize extends StObject {
  
  var current_page: Double
  
  var page_size: Double
  
  var total: Double
  
  var total_pages: Double
}
object Pagesize {
  
  inline def apply(current_page: Double, page_size: Double, total: Double, total_pages: Double): Pagesize = {
    val __obj = js.Dynamic.literal(current_page = current_page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], total_pages = total_pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pagesize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pagesize] (val x: Self) extends AnyVal {
    
    inline def setCurrent_page(value: Double): Self = StObject.set(x, "current_page", value.asInstanceOf[js.Any])
    
    inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotal_pages(value: Double): Self = StObject.set(x, "total_pages", value.asInstanceOf[js.Any])
  }
}
