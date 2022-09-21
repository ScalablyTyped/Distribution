package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCloudWorkspaceId extends StObject {
  
  /**
    * The unique name of the workspace within the repo. This is the name chosen by the client in the Source API's CreateWorkspace method.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the repo containing the workspace.
    */
  var repoId: js.UndefOr[SchemaRepoId] = js.undefined
}
object SchemaCloudWorkspaceId {
  
  inline def apply(): SchemaCloudWorkspaceId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudWorkspaceId]
  }
  
  extension [Self <: SchemaCloudWorkspaceId](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRepoId(value: SchemaRepoId): Self = StObject.set(x, "repoId", value.asInstanceOf[js.Any])
    
    inline def setRepoIdUndefined: Self = StObject.set(x, "repoId", js.undefined)
  }
}
