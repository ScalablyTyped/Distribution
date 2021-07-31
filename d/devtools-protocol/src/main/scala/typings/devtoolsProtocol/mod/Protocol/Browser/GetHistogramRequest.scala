package typings.devtoolsProtocol.mod.Protocol.Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHistogramRequest extends StObject {
  
  /**
    * If true, retrieve delta since last call.
    */
  var delta: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Requested histogram name.
    */
  var name: String
}
object GetHistogramRequest {
  
  @scala.inline
  def apply(name: String): GetHistogramRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHistogramRequest]
  }
  
  @scala.inline
  implicit class GetHistogramRequestMutableBuilder[Self <: GetHistogramRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelta(value: Boolean): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
