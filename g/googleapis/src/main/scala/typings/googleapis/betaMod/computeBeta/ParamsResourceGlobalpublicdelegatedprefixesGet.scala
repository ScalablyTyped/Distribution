package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceGlobalpublicdelegatedprefixesGet
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
}
object ParamsResourceGlobalpublicdelegatedprefixesGet {
  
  inline def apply(): ParamsResourceGlobalpublicdelegatedprefixesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGlobalpublicdelegatedprefixesGet]
  }
  
  extension [Self <: ParamsResourceGlobalpublicdelegatedprefixesGet](x: Self) {
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setPublicDelegatedPrefix(value: String): Self = StObject.set(x, "publicDelegatedPrefix", value.asInstanceOf[js.Any])
    
    inline def setPublicDelegatedPrefixUndefined: Self = StObject.set(x, "publicDelegatedPrefix", js.undefined)
  }
}
