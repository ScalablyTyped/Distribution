package typings.electron.Electron

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtocolResponse extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/protocol-response
  /**
    * The charset of response body, default is `"utf-8"`.
    */
  var charset: js.UndefOr[String] = js.undefined
  
  /**
    * The response body. When returning stream as response, this is a Node.js readable
    * stream representing the response body. When returning `Buffer` as response, this
    * is a `Buffer`. When returning `String` as response, this is a `String`. This is
    * ignored for other types of responses.
    */
  var data: js.UndefOr[Buffer | String | ReadableStream] = js.undefined
  
  /**
    * When assigned, the `request` will fail with the `error` number . For the
    * available error numbers you can use, please see the net error list.
    */
  var error: js.UndefOr[Double] = js.undefined
  
  /**
    * An object containing the response headers. The keys must be String, and values
    * must be either String or Array of String.
    */
  var headers: js.UndefOr[Record[String, String | js.Array[String]]] = js.undefined
  
  /**
    * The HTTP `method`. This is only used for file and URL responses.
    */
  var method: js.UndefOr[String] = js.undefined
  
  /**
    * The MIME type of response body, default is `"text/html"`. Setting `mimeType`
    * would implicitly set the `content-type` header in response, but if
    * `content-type` is already set in `headers`, the `mimeType` would be ignored.
    */
  var mimeType: js.UndefOr[String] = js.undefined
  
  /**
    * Path to the file which would be sent as response body. This is only used for
    * file responses.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The `referrer` URL. This is only used for file and URL responses.
    */
  var referrer: js.UndefOr[String] = js.undefined
  
  /**
    * The session used for requesting URL, by default the HTTP request will reuse the
    * current session. Setting `session` to `null` would use a random independent
    * session. This is only used for URL responses.
    */
  var session: js.UndefOr[Session_] = js.undefined
  
  /**
    * The HTTP response code, default is 200.
    */
  var statusCode: js.UndefOr[Double] = js.undefined
  
  /**
    * The data used as upload data. This is only used for URL responses when `method`
    * is `"POST"`.
    */
  var uploadData: js.UndefOr[ProtocolResponseUploadData] = js.undefined
  
  /**
    * Download the `url` and pipe the result as response body. This is only used for
    * URL responses.
    */
  var url: js.UndefOr[String] = js.undefined
}
object ProtocolResponse {
  
  @scala.inline
  def apply(): ProtocolResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProtocolResponse]
  }
  
  @scala.inline
  implicit class ProtocolResponseMutableBuilder[Self <: ProtocolResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
    
    @scala.inline
    def setData(value: Buffer | String | ReadableStream): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setHeaders(value: Record[String, String | js.Array[String]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
    
    @scala.inline
    def setSession(value: Session_): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    @scala.inline
    def setUploadData(value: ProtocolResponseUploadData): Self = StObject.set(x, "uploadData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadDataUndefined: Self = StObject.set(x, "uploadData", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
