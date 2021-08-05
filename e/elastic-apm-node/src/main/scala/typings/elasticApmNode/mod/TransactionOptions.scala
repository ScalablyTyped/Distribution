package typings.elasticApmNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionOptions extends StObject {
  
  var childOf: js.UndefOr[Transaction | Span | String] = js.undefined
  
  var startTime: js.UndefOr[Double] = js.undefined
}
object TransactionOptions {
  
  inline def apply(): TransactionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionOptions]
  }
  
  extension [Self <: TransactionOptions](x: Self) {
    
    inline def setChildOf(value: Transaction | Span | String): Self = StObject.set(x, "childOf", value.asInstanceOf[js.Any])
    
    inline def setChildOfUndefined: Self = StObject.set(x, "childOf", js.undefined)
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
