package typings.googleapis.anon

import typings.googleapis.pagespeedonlineV2Mod.pagespeedonlineV2.SchemaPagespeedApiFormatStringV2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetailsResult extends StObject {
  
  var details: js.UndefOr[js.Array[SchemaPagespeedApiFormatStringV2]] = js.undefined
  
  var result: js.UndefOr[SchemaPagespeedApiFormatStringV2] = js.undefined
}
object DetailsResult {
  
  inline def apply(): DetailsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetailsResult]
  }
  
  extension [Self <: DetailsResult](x: Self) {
    
    inline def setDetails(value: js.Array[SchemaPagespeedApiFormatStringV2]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDetailsVarargs(value: SchemaPagespeedApiFormatStringV2*): Self = StObject.set(x, "details", js.Array(value :_*))
    
    inline def setResult(value: SchemaPagespeedApiFormatStringV2): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
