package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.anon.Boundary
import typings.googleapis.anon.Lang
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGeolayerdata extends StObject {
  
  var common: js.UndefOr[Lang] = js.undefined
  
  var geo: js.UndefOr[Boundary] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaGeolayerdata {
  
  inline def apply(): SchemaGeolayerdata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGeolayerdata]
  }
  
  extension [Self <: SchemaGeolayerdata](x: Self) {
    
    inline def setCommon(value: Lang): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
    
    inline def setGeo(value: Boundary): Self = StObject.set(x, "geo", value.asInstanceOf[js.Any])
    
    inline def setGeoUndefined: Self = StObject.set(x, "geo", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
