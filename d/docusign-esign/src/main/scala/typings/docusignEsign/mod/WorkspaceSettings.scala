package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceSettings extends js.Object {
  
  /**
    * When **true**, commenting on the documents in the workspace is allowed.
    */
  var commentsAllowed: js.UndefOr[String] = js.native
}
object WorkspaceSettings {
  
  @scala.inline
  def apply(): WorkspaceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceSettings]
  }
  
  @scala.inline
  implicit class WorkspaceSettingsOps[Self <: WorkspaceSettings] (val x: Self) extends AnyVal {
    
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
    def setCommentsAllowed(value: String): Self = this.set("commentsAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommentsAllowed: Self = this.set("commentsAllowed", js.undefined)
  }
}
