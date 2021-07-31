package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A CloudWorkspaceId is a unique identifier for a cloud workspace. A cloud
  * workspace is a place associated with a repo where modified files can be
  * stored before they are committed.
  */
trait SchemaCloudWorkspaceId extends StObject {
  
  /**
    * The unique name of the workspace within the repo.  This is the name
    * chosen by the client in the Source API&#39;s CreateWorkspace method.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the repo containing the workspace.
    */
  var repoId: js.UndefOr[SchemaRepoId] = js.undefined
}
object SchemaCloudWorkspaceId {
  
  @scala.inline
  def apply(): SchemaCloudWorkspaceId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudWorkspaceId]
  }
  
  @scala.inline
  implicit class SchemaCloudWorkspaceIdMutableBuilder[Self <: SchemaCloudWorkspaceId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRepoId(value: SchemaRepoId): Self = StObject.set(x, "repoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepoIdUndefined: Self = StObject.set(x, "repoId", js.undefined)
  }
}
