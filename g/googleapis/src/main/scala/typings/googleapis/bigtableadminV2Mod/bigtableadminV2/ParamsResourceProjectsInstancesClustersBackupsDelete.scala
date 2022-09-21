package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstancesClustersBackupsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the backup to delete. Values are of the form `projects/{project\}/instances/{instance\}/clusters/{cluster\}/backups/{backup\}`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsInstancesClustersBackupsDelete {
  
  inline def apply(): ParamsResourceProjectsInstancesClustersBackupsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesClustersBackupsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsInstancesClustersBackupsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
