package typings.firefoxWebextBrowser.browser.contextualIdentities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Details about the contextual identity being created. */
@js.native
trait UpdateDetails extends js.Object {
  
  /** The color of the contextual identity. */
  var color: js.UndefOr[String] = js.native
  
  /** The icon of the contextual identity. */
  var icon: js.UndefOr[String] = js.native
  
  /** The name of the contextual identity. */
  var name: js.UndefOr[String] = js.native
}
object UpdateDetails {
  
  @scala.inline
  def apply(): UpdateDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDetails]
  }
  
  @scala.inline
  implicit class UpdateDetailsOps[Self <: UpdateDetails] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
