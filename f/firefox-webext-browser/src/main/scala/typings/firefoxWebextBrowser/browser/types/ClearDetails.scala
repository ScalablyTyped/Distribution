package typings.firefoxWebextBrowser.browser.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Which setting to clear. */
@js.native
trait ClearDetails extends js.Object {
  
  /** Where to clear the setting (default: regular). */
  var scope: js.UndefOr[SettingScope] = js.native
}
object ClearDetails {
  
  @scala.inline
  def apply(): ClearDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearDetails]
  }
  
  @scala.inline
  implicit class ClearDetailsOps[Self <: ClearDetails] (val x: Self) extends AnyVal {
    
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
    def setScope(value: SettingScope): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
}
