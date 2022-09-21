package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceImagesGetfromfamily
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the image family to search for.
    */
  var family: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
}
object ParamsResourceImagesGetfromfamily {
  
  inline def apply(): ParamsResourceImagesGetfromfamily = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceImagesGetfromfamily]
  }
  
  extension [Self <: ParamsResourceImagesGetfromfamily](x: Self) {
    
    inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
