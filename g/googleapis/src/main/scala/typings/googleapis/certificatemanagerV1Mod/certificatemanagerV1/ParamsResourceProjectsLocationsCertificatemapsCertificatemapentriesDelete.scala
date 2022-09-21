package typings.googleapis.certificatemanagerV1Mod.certificatemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. A name of the certificate map entry to delete. Must be in the format `projects/x/locations/x/certificateMaps/x/certificateMapEntries/x`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
