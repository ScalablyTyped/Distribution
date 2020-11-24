package typings.emojiMart.nimblePickerMod

import typings.emojiMart.dataMod.Data
import typings.emojiMart.sharedPropsMod.PickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NimblePickerProps extends PickerProps {
  
  var data: Data = js.native
}
object NimblePickerProps {
  
  @scala.inline
  def apply(data: Data): NimblePickerProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[NimblePickerProps]
  }
  
  @scala.inline
  implicit class NimblePickerPropsOps[Self <: NimblePickerProps] (val x: Self) extends AnyVal {
    
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
    def setData(value: Data): Self = this.set("data", value.asInstanceOf[js.Any])
  }
}
