package typings.djangoBananas.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageData[T] extends StObject {
  
  var body: T
  
  var headers: Record[String, String]
  
  var obj: T
  
  var ok: Boolean
  
  var status: Double
  
  var statusText: String
  
  var text: String
  
  var url: String
}
object PageData {
  
  inline def apply[T](
    body: T,
    headers: Record[String, String],
    obj: T,
    ok: Boolean,
    status: Double,
    statusText: String,
    text: String,
    url: String
  ): PageData[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageData[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageData[?], T] (val x: Self & PageData[T]) extends AnyVal {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setObj(value: T): Self = StObject.set(x, "obj", value.asInstanceOf[js.Any])
    
    inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
