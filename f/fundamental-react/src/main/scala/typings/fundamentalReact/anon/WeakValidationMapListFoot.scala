package typings.fundamentalReact.anon

import typings.react.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/List/List.ListFooterProps> */
@js.native
trait WeakValidationMapListFoot extends StObject {
  
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
}
object WeakValidationMapListFoot {
  
  @scala.inline
  def apply(): WeakValidationMapListFoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapListFoot]
  }
  
  @scala.inline
  implicit class WeakValidationMapListFootMutableBuilder[Self <: WeakValidationMapListFoot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
  }
}
