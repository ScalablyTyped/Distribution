package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstancesClustersBackupsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The id of the backup to be created. The `backup_id` along with the parent `parent` are combined as {parent\}/backups/{backup_id\} to create the full backup name, of the form: `projects/{project\}/instances/{instance\}/clusters/{cluster\}/backups/{backup_id\}`. This string must be between 1 and 50 characters in length and match the regex _a-zA-Z0-9*.
    */
  var backupId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. This must be one of the clusters in the instance in which this table is located. The backup will be stored in this cluster. Values are of the form `projects/{project\}/instances/{instance\}/clusters/{cluster\}`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBackup] = js.undefined
}
object ParamsResourceProjectsInstancesClustersBackupsCreate {
  
  inline def apply(): ParamsResourceProjectsInstancesClustersBackupsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesClustersBackupsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsInstancesClustersBackupsCreate](x: Self) {
    
    inline def setBackupId(value: String): Self = StObject.set(x, "backupId", value.asInstanceOf[js.Any])
    
    inline def setBackupIdUndefined: Self = StObject.set(x, "backupId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaBackup): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
