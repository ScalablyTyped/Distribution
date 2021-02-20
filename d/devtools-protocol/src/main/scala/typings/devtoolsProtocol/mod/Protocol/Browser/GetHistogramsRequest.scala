package typings.devtoolsProtocol.mod.Protocol.Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetHistogramsRequest extends StObject {
  
  /**
    * If true, retrieve delta since last call.
    */
  var delta: js.UndefOr[Boolean] = js.native
  
  /**
    * Requested substring in name. Only histograms which have query as a
    * substring in their name are extracted. An empty or absent query returns
    * all histograms.
    */
  var query: js.UndefOr[String] = js.native
}
object GetHistogramsRequest {
  
  @scala.inline
  def apply(): GetHistogramsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetHistogramsRequest]
  }
  
  @scala.inline
  implicit class GetHistogramsRequestMutableBuilder[Self <: GetHistogramsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelta(value: Boolean): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
