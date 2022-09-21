package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstancesClustersDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The unique name of the cluster to be deleted. Values are of the form `projects/{project\}/instances/{instance\}/clusters/{cluster\}`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsInstancesClustersDelete {
  
  inline def apply(): ParamsResourceProjectsInstancesClustersDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesClustersDelete]
  }
  
  extension [Self <: ParamsResourceProjectsInstancesClustersDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
