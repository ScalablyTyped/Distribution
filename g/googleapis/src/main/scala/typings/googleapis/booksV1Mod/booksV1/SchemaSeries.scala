package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.anon.BannerImageUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSeries extends StObject {
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  var series: js.UndefOr[js.Array[BannerImageUrl]] = js.undefined
}
object SchemaSeries {
  
  inline def apply(): SchemaSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSeries]
  }
  
  extension [Self <: SchemaSeries](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSeries(value: js.Array[BannerImageUrl]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setSeriesVarargs(value: BannerImageUrl*): Self = StObject.set(x, "series", js.Array(value :_*))
  }
}
