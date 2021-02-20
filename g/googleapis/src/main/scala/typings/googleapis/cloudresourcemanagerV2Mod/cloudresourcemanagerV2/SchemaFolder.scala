package typings.googleapis.cloudresourcemanagerV2Mod.cloudresourcemanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Folder in an Organization&#39;s resource hierarchy, used to organize that
  * Organization&#39;s resources.
  */
@js.native
trait SchemaFolder extends StObject {
  
  /**
    * Output only. Timestamp when the Folder was created. Assigned by the
    * server.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * The folder’s display name. A folder’s display name must be unique amongst
    * its siblings, e.g. no two folders with the same parent can share the same
    * display name. The display name must start and end with a letter or digit,
    * may contain letters, digits, spaces, hyphens and underscores and can be
    * no longer than 30 characters. This is captured by the regular expression:
    * [\p{L}\p{N}]([\p{L}\p{N}_- ]{0,28}[\p{L}\p{N}])?.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Output only.  The lifecycle state of the folder. Updates to the
    * lifecycle_state must be performed via DeleteFolder and UndeleteFolder.
    */
  var lifecycleState: js.UndefOr[String] = js.native
  
  /**
    * Output only. The resource name of the Folder. Its format is
    * `folders/{folder_id}`, for example: &quot;folders/1234&quot;.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The Folder’s parent&#39;s resource name. Updates to the folder&#39;s
    * parent must be performed via MoveFolder.
    */
  var parent: js.UndefOr[String] = js.native
}
object SchemaFolder {
  
  @scala.inline
  def apply(): SchemaFolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFolder]
  }
  
  @scala.inline
  implicit class SchemaFolderMutableBuilder[Self <: SchemaFolder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setLifecycleState(value: String): Self = StObject.set(x, "lifecycleState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleStateUndefined: Self = StObject.set(x, "lifecycleState", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
