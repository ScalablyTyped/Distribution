package typings.elasticApmNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpanOptions extends StObject {
  
  var childOf: js.UndefOr[Transaction | Span | String] = js.undefined
}
object SpanOptions {
  
  inline def apply(): SpanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpanOptions]
  }
  
  extension [Self <: SpanOptions](x: Self) {
    
    inline def setChildOf(value: Transaction | Span | String): Self = StObject.set(x, "childOf", value.asInstanceOf[js.Any])
    
    inline def setChildOfUndefined: Self = StObject.set(x, "childOf", js.undefined)
  }
}
