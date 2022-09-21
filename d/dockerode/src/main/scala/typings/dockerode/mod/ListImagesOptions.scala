package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImagesOptions extends StObject {
  
  var all: js.UndefOr[Boolean] = js.undefined
  
  var digests: js.UndefOr[Boolean] = js.undefined
  
  var filters: js.UndefOr[String] = js.undefined
}
object ListImagesOptions {
  
  inline def apply(): ListImagesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImagesOptions]
  }
  
  extension [Self <: ListImagesOptions](x: Self) {
    
    inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    inline def setDigests(value: Boolean): Self = StObject.set(x, "digests", value.asInstanceOf[js.Any])
    
    inline def setDigestsUndefined: Self = StObject.set(x, "digests", js.undefined)
    
    inline def setFilters(value: String): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
  }
}
