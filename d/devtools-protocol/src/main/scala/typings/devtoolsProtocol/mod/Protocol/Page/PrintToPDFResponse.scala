package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.IO.StreamHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintToPDFResponse extends StObject {
  
  /**
    * Base64-encoded pdf data. Empty if |returnAsStream| is specified. (Encoded as a base64 string when passed over JSON)
    */
  var data: String
  
  /**
    * A handle of the stream that holds resulting PDF data.
    */
  var stream: js.UndefOr[StreamHandle] = js.undefined
}
object PrintToPDFResponse {
  
  inline def apply(data: String): PrintToPDFResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintToPDFResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrintToPDFResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setStream(value: StreamHandle): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
