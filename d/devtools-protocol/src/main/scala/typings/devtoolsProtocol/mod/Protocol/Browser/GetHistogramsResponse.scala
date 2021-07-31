package typings.devtoolsProtocol.mod.Protocol.Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHistogramsResponse extends StObject {
  
  /**
    * Histograms.
    */
  var histograms: js.Array[Histogram]
}
object GetHistogramsResponse {
  
  @scala.inline
  def apply(histograms: js.Array[Histogram]): GetHistogramsResponse = {
    val __obj = js.Dynamic.literal(histograms = histograms.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHistogramsResponse]
  }
  
  @scala.inline
  implicit class GetHistogramsResponseMutableBuilder[Self <: GetHistogramsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHistograms(value: js.Array[Histogram]): Self = StObject.set(x, "histograms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistogramsVarargs(value: Histogram*): Self = StObject.set(x, "histograms", js.Array(value :_*))
  }
}
