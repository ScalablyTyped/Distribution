package typings.fundamentalReact.anon

import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/InputGroup/InputGroup.InputGroupAddonProps> */
@js.native
trait WeakValidationMapInputGro extends js.Object {
  
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var compact: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var isButton: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
}
object WeakValidationMapInputGro {
  
  @scala.inline
  def apply(): WeakValidationMapInputGro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapInputGro]
  }
  
  @scala.inline
  implicit class WeakValidationMapInputGroOps[Self <: WeakValidationMapInputGro] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCompact(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    
    @scala.inline
    def setIsButton(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("isButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsButton: Self = this.set("isButton", js.undefined)
  }
}
