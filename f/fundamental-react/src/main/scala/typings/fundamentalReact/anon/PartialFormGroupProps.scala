package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/Forms/FormGroup.FormGroupProps> */
@js.native
trait PartialFormGroupProps extends StObject {
  
  var disableStyles: js.UndefOr[Boolean] = js.native
}
object PartialFormGroupProps {
  
  @scala.inline
  def apply(): PartialFormGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFormGroupProps]
  }
  
  @scala.inline
  implicit class PartialFormGroupPropsMutableBuilder[Self <: PartialFormGroupProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
  }
}
