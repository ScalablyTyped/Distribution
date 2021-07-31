package typings.fundamentalReact.anon

import typings.react.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Forms/FormGroup.FormGroupProps> */
trait WeakValidationMapFormGrou extends StObject {
  
  var disableStyles: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
}
object WeakValidationMapFormGrou {
  
  @scala.inline
  def apply(): WeakValidationMapFormGrou = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapFormGrou]
  }
  
  @scala.inline
  implicit class WeakValidationMapFormGrouMutableBuilder[Self <: WeakValidationMapFormGrou] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableStyles(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
  }
}
