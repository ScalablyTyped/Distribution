package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.IO.StreamHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintToPDFResponse extends StObject {
  
  /**
    * Base64-encoded pdf data. Empty if |returnAsStream| is specified.
    */
  var data: String = js.native
  
  /**
    * A handle of the stream that holds resulting PDF data.
    */
  var stream: js.UndefOr[StreamHandle] = js.native
}
object PrintToPDFResponse {
  
  @scala.inline
  def apply(data: String): PrintToPDFResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintToPDFResponse]
  }
  
  @scala.inline
  implicit class PrintToPDFResponseMutableBuilder[Self <: PrintToPDFResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStream(value: StreamHandle): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
