package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomizeText[T] extends js.Object {
  
  var customizeText: js.UndefOr[js.Function1[/* e */ FilterValue[T], String]] = js.native
  
  var filterEnabled: js.UndefOr[Boolean] = js.native
  
  var texts: js.UndefOr[ClearFilter] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object CustomizeText {
  
  @scala.inline
  def apply[T](): CustomizeText[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomizeText[T]]
  }
  
  @scala.inline
  implicit class CustomizeTextOps[Self <: CustomizeText[_], T] (val x: Self with CustomizeText[T]) extends AnyVal {
    
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
    def setCustomizeText(value: /* e */ FilterValue[T] => String): Self = this.set("customizeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeText: Self = this.set("customizeText", js.undefined)
    
    @scala.inline
    def setFilterEnabled(value: Boolean): Self = this.set("filterEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterEnabled: Self = this.set("filterEnabled", js.undefined)
    
    @scala.inline
    def setTexts(value: ClearFilter): Self = this.set("texts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTexts: Self = this.set("texts", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
