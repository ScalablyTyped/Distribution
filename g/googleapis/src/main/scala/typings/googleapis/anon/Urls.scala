package typings.googleapis.anon

import typings.googleapis.pagespeedonlineV2Mod.pagespeedonlineV2.SchemaPagespeedApiFormatStringV2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Urls extends StObject {
  
  var header: js.UndefOr[SchemaPagespeedApiFormatStringV2] = js.undefined
  
  var urls: js.UndefOr[js.Array[DetailsResult]] = js.undefined
}
object Urls {
  
  inline def apply(): Urls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Urls]
  }
  
  extension [Self <: Urls](x: Self) {
    
    inline def setHeader(value: SchemaPagespeedApiFormatStringV2): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setUrls(value: js.Array[DetailsResult]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    inline def setUrlsVarargs(value: DetailsResult*): Self = StObject.set(x, "urls", js.Array(value :_*))
  }
}
