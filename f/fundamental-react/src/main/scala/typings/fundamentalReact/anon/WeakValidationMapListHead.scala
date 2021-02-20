package typings.fundamentalReact.anon

import typings.react.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/List/List.ListHeaderProps> */
@js.native
trait WeakValidationMapListHead extends StObject {
  
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
}
object WeakValidationMapListHead {
  
  @scala.inline
  def apply(): WeakValidationMapListHead = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapListHead]
  }
  
  @scala.inline
  implicit class WeakValidationMapListHeadMutableBuilder[Self <: WeakValidationMapListHead] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
  }
}
