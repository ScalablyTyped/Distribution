package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A CloudWorkspaceSourceContext denotes a workspace at a particular snapshot.
  */
trait SchemaCloudWorkspaceSourceContext extends StObject {
  
  /**
    * The ID of the snapshot. An empty snapshot_id refers to the most recent
    * snapshot.
    */
  var snapshotId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the workspace.
    */
  var workspaceId: js.UndefOr[SchemaCloudWorkspaceId] = js.undefined
}
object SchemaCloudWorkspaceSourceContext {
  
  inline def apply(): SchemaCloudWorkspaceSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudWorkspaceSourceContext]
  }
  
  extension [Self <: SchemaCloudWorkspaceSourceContext](x: Self) {
    
    inline def setSnapshotId(value: String): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "snapshotId", js.undefined)
    
    inline def setWorkspaceId(value: SchemaCloudWorkspaceId): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
  }
}
