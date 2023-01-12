package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RateOptions extends StObject {
  
  /** Controls rate-limiting of requests. Maximum number of requests per period. (Default: 50). */
  var limit: js.UndefOr[Double] = js.undefined
  
  /** Period for rate limit, in milliseconds. (Default: 1000 ms). */
  var period: js.UndefOr[Double] = js.undefined
}
object RateOptions {
  
  inline def apply(): RateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RateOptions] (val x: Self) extends AnyVal {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
