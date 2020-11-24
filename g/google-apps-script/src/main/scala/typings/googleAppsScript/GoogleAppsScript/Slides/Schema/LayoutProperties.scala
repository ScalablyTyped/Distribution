package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayoutProperties extends js.Object {
  
  var displayName: js.UndefOr[String] = js.native
  
  var masterObjectId: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object LayoutProperties {
  
  @scala.inline
  def apply(): LayoutProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutProperties]
  }
  
  @scala.inline
  implicit class LayoutPropertiesOps[Self <: LayoutProperties] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setMasterObjectId(value: String): Self = this.set("masterObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterObjectId: Self = this.set("masterObjectId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
