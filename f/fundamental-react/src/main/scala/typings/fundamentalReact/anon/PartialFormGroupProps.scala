package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/Forms/FormGroup.FormGroupProps> */
trait PartialFormGroupProps extends StObject {
  
  var disableStyles: js.UndefOr[Boolean] = js.undefined
}
object PartialFormGroupProps {
  
  inline def apply(): PartialFormGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFormGroupProps]
  }
  
  extension [Self <: PartialFormGroupProps](x: Self) {
    
    inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
    
    inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
  }
}
