package typings.devtoolsProtocol.mod.Protocol.Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHistogramResponse extends StObject {
  
  /**
    * Histogram.
    */
  var histogram: Histogram
}
object GetHistogramResponse {
  
  inline def apply(histogram: Histogram): GetHistogramResponse = {
    val __obj = js.Dynamic.literal(histogram = histogram.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHistogramResponse]
  }
  
  extension [Self <: GetHistogramResponse](x: Self) {
    
    inline def setHistogram(value: Histogram): Self = StObject.set(x, "histogram", value.asInstanceOf[js.Any])
  }
}
