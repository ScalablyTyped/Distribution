package typings.electron.Electron

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeforeSendResponse extends StObject {
  
  var cancel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When provided, request will be made with these headers.
    */
  var requestHeaders: js.UndefOr[Record[String, String | js.Array[String]]] = js.undefined
}
object BeforeSendResponse {
  
  inline def apply(): BeforeSendResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeforeSendResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BeforeSendResponse] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setRequestHeaders(value: Record[String, String | js.Array[String]]): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
    
    inline def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
  }
}
