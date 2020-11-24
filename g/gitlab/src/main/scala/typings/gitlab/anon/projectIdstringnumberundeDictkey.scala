package typings.gitlab.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  projectId :string | number | undefined,   groupId :string | number | undefined} & gitlab.gitlab/dist/types/core/infrastructure.BaseRequestOptions */
@js.native
trait projectIdstringnumberundeDictkey
  extends /* key */ StringDictionary[js.Any] {
  
  var groupId: js.UndefOr[String | Double] = js.native
  
  var projectId: js.UndefOr[String | Double] = js.native
  
  var sudo: js.UndefOr[String | Double] = js.native
}
object projectIdstringnumberundeDictkey {
  
  @scala.inline
  def apply(): projectIdstringnumberundeDictkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[projectIdstringnumberundeDictkey]
  }
  
  @scala.inline
  implicit class projectIdstringnumberundeDictkeyOps[Self <: projectIdstringnumberundeDictkey] (val x: Self) extends AnyVal {
    
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
    def setGroupId(value: String | Double): Self = this.set("groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupId: Self = this.set("groupId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String | Double): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setSudo(value: String | Double): Self = this.set("sudo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSudo: Self = this.set("sudo", js.undefined)
  }
}
