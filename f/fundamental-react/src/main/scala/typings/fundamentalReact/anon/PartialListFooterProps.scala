package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/List/List.ListFooterProps> */
trait PartialListFooterProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
}
object PartialListFooterProps {
  
  inline def apply(): PartialListFooterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListFooterProps]
  }
  
  extension [Self <: PartialListFooterProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
  }
}
