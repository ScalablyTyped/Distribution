package typings.firefoxWebextBrowser.browser.browserAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information sent when a browser action is clicked. */
@js.native
trait OnClickData extends js.Object {
  
  /** An integer value of button by which menu item was clicked. */
  var button: js.UndefOr[Double] = js.native
  
  /** An array of keyboard modifiers that were held while the menu item was clicked. */
  var modifiers: js.Array[OnClickDataModifiers] = js.native
}
object OnClickData {
  
  @scala.inline
  def apply(modifiers: js.Array[OnClickDataModifiers]): OnClickData = {
    val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnClickData]
  }
  
  @scala.inline
  implicit class OnClickDataOps[Self <: OnClickData] (val x: Self) extends AnyVal {
    
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
    def setModifiersVarargs(value: OnClickDataModifiers*): Self = this.set("modifiers", js.Array(value :_*))
    
    @scala.inline
    def setModifiers(value: js.Array[OnClickDataModifiers]): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButton(value: Double): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
  }
}
