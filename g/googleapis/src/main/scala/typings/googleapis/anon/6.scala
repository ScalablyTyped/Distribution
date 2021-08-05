package typings.googleapis.anon

import typings.googleapis.pagespeedonlineV4Mod.pagespeedonlineV4.SchemaPagespeedApiFormatStringV4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  var details: js.UndefOr[js.Array[SchemaPagespeedApiFormatStringV4]] = js.undefined
  
  var result: js.UndefOr[SchemaPagespeedApiFormatStringV4] = js.undefined
}
object `6` {
  
  inline def apply(): `6` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`6`]
  }
  
  extension [Self <: `6`](x: Self) {
    
    inline def setDetails(value: js.Array[SchemaPagespeedApiFormatStringV4]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDetailsVarargs(value: SchemaPagespeedApiFormatStringV4*): Self = StObject.set(x, "details", js.Array(value :_*))
    
    inline def setResult(value: SchemaPagespeedApiFormatStringV4): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
