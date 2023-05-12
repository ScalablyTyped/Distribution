package typings.devtoolsProtocol.mod.Protocol.Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHistogramsRequest extends StObject {
  
  /**
    * If true, retrieve delta since last delta call.
    */
  var delta: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Requested substring in name. Only histograms which have query as a
    * substring in their name are extracted. An empty or absent query returns
    * all histograms.
    */
  var query: js.UndefOr[String] = js.undefined
}
object GetHistogramsRequest {
  
  inline def apply(): GetHistogramsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetHistogramsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetHistogramsRequest] (val x: Self) extends AnyVal {
    
    inline def setDelta(value: Boolean): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
