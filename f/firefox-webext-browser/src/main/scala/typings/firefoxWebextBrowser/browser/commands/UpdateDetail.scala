package typings.firefoxWebextBrowser.browser.commands

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The new description for the command. */
@js.native
trait UpdateDetail extends js.Object {
  
  /** The new description for the command. */
  var description: js.UndefOr[String] = js.native
  
  /** The name of the command. */
  var name: String = js.native
  
  var shortcut: js.UndefOr[String] = js.native
}
object UpdateDetail {
  
  @scala.inline
  def apply(name: String): UpdateDetail = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDetail]
  }
  
  @scala.inline
  implicit class UpdateDetailOps[Self <: UpdateDetail] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setShortcut(value: String): Self = this.set("shortcut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortcut: Self = this.set("shortcut", js.undefined)
  }
}
