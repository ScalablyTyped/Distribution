package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePublicadvertisedprefixesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the PublicAdvertisedPrefix resource to return.
    */
  var publicAdvertisedPrefix: js.UndefOr[String] = js.undefined
}
object ParamsResourcePublicadvertisedprefixesGet {
  
  inline def apply(): ParamsResourcePublicadvertisedprefixesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePublicadvertisedprefixesGet]
  }
  
  extension [Self <: ParamsResourcePublicadvertisedprefixesGet](x: Self) {
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setPublicAdvertisedPrefix(value: String): Self = StObject.set(x, "publicAdvertisedPrefix", value.asInstanceOf[js.Any])
    
    inline def setPublicAdvertisedPrefixUndefined: Self = StObject.set(x, "publicAdvertisedPrefix", js.undefined)
  }
}
