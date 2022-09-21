package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstancesClustersGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The unique name of the requested cluster. Values are of the form `projects/{project\}/instances/{instance\}/clusters/{cluster\}`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsInstancesClustersGet {
  
  inline def apply(): ParamsResourceProjectsInstancesClustersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesClustersGet]
  }
  
  extension [Self <: ParamsResourceProjectsInstancesClustersGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
