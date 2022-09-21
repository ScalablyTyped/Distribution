package typings.googleapis.certificatemanagerV1Mod.certificatemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. A name of the certificate map entry to describe. Must be in the format `projects/x/locations/x/certificateMaps/x/certificateMapEntries/x`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesGet {
  
  inline def apply(): ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
