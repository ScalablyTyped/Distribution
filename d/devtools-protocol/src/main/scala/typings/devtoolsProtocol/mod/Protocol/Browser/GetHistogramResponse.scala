package typings.devtoolsProtocol.mod.Protocol.Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetHistogramResponse extends StObject {
  
  /**
    * Histogram.
    */
  var histogram: Histogram = js.native
}
object GetHistogramResponse {
  
  @scala.inline
  def apply(histogram: Histogram): GetHistogramResponse = {
    val __obj = js.Dynamic.literal(histogram = histogram.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHistogramResponse]
  }
  
  @scala.inline
  implicit class GetHistogramResponseMutableBuilder[Self <: GetHistogramResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHistogram(value: Histogram): Self = StObject.set(x, "histogram", value.asInstanceOf[js.Any])
  }
}
