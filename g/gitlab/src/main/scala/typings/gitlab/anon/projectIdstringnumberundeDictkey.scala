package typings.gitlab.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
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
  implicit class projectIdstringnumberundeDictkeyMutableBuilder[Self <: projectIdstringnumberundeDictkey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupId(value: String | Double): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String | Double): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
  }
}
