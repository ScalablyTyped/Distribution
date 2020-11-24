package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureRename extends js.Object {
  
  var newName: js.UndefOr[String] = js.native
}
object FeatureRename {
  
  @scala.inline
  def apply(): FeatureRename = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureRename]
  }
  
  @scala.inline
  implicit class FeatureRenameOps[Self <: FeatureRename] (val x: Self) extends AnyVal {
    
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
    def setNewName(value: String): Self = this.set("newName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewName: Self = this.set("newName", js.undefined)
  }
}
