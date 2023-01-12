package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponsiveAccordionTabs extends StObject {
  
  def close(_target: Any, args: Any*): Any
  
  def open(_target: Any, args: Any*): Any
  
  var storezfData: Any
  
  def toggle(_target: Any, args: Any*): Any
}
object ResponsiveAccordionTabs {
  
  inline def apply(
    close: (Any, /* repeated */ Any) => Any,
    open: (Any, /* repeated */ Any) => Any,
    storezfData: Any,
    toggle: (Any, /* repeated */ Any) => Any
  ): ResponsiveAccordionTabs = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction2(close), open = js.Any.fromFunction2(open), storezfData = storezfData.asInstanceOf[js.Any], toggle = js.Any.fromFunction2(toggle))
    __obj.asInstanceOf[ResponsiveAccordionTabs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponsiveAccordionTabs] (val x: Self) extends AnyVal {
    
    inline def setClose(value: (Any, /* repeated */ Any) => Any): Self = StObject.set(x, "close", js.Any.fromFunction2(value))
    
    inline def setOpen(value: (Any, /* repeated */ Any) => Any): Self = StObject.set(x, "open", js.Any.fromFunction2(value))
    
    inline def setStorezfData(value: Any): Self = StObject.set(x, "storezfData", value.asInstanceOf[js.Any])
    
    inline def setToggle(value: (Any, /* repeated */ Any) => Any): Self = StObject.set(x, "toggle", js.Any.fromFunction2(value))
  }
}
