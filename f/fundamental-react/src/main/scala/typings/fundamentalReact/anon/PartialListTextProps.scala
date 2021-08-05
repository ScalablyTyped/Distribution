package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/List/List.ListTextProps> */
trait PartialListTextProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var noWrap: js.UndefOr[Boolean] = js.undefined
  
  var secondary: js.UndefOr[Boolean] = js.undefined
}
object PartialListTextProps {
  
  inline def apply(): PartialListTextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListTextProps]
  }
  
  extension [Self <: PartialListTextProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
    
    inline def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
    
    inline def setSecondary(value: Boolean): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    inline def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
  }
}
