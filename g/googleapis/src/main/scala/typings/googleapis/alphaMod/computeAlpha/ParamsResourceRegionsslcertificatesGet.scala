package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRegionsslcertificatesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the region scoping this request.
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the SslCertificate resource to return.
    */
  var sslCertificate: js.UndefOr[String] = js.undefined
}
object ParamsResourceRegionsslcertificatesGet {
  
  inline def apply(): ParamsResourceRegionsslcertificatesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRegionsslcertificatesGet]
  }
  
  extension [Self <: ParamsResourceRegionsslcertificatesGet](x: Self) {
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSslCertificate(value: String): Self = StObject.set(x, "sslCertificate", value.asInstanceOf[js.Any])
    
    inline def setSslCertificateUndefined: Self = StObject.set(x, "sslCertificate", js.undefined)
  }
}
