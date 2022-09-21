package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePublicdelegatedprefixesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the PublicDelegatedPrefix resource to return.
    */
  var publicDelegatedPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the region of this request.
    */
  var region: js.UndefOr[String] = js.undefined
}
object ParamsResourcePublicdelegatedprefixesGet {
  
  inline def apply(): ParamsResourcePublicdelegatedprefixesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePublicdelegatedprefixesGet]
  }
  
  extension [Self <: ParamsResourcePublicdelegatedprefixesGet](x: Self) {
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setPublicDelegatedPrefix(value: String): Self = StObject.set(x, "publicDelegatedPrefix", value.asInstanceOf[js.Any])
    
    inline def setPublicDelegatedPrefixUndefined: Self = StObject.set(x, "publicDelegatedPrefix", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
