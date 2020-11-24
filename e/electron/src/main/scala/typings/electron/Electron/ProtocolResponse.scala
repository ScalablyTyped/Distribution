package typings.electron.Electron

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtocolResponse extends js.Object {
  
  // Docs: https://electronjs.org/docs/api/structures/protocol-response
  /**
    * The charset of response body, default is `"utf-8"`.
    */
  var charset: js.UndefOr[String] = js.native
  
  /**
    * The response body. When returning stream as response, this is a Node.js readable
    * stream representing the response body. When returning `Buffer` as response, this
    * is a `Buffer`. When returning `String` as response, this is a `String`. This is
    * ignored for other types of responses.
    */
  var data: js.UndefOr[Buffer | String | ReadableStream] = js.native
  
  /**
    * When assigned, the `request` will fail with the `error` number . For the
    * available error numbers you can use, please see the net error list.
    */
  var error: js.UndefOr[Double] = js.native
  
  /**
    * An object containing the response headers. The keys must be String, and values
    * must be either String or Array of String.
    */
  var headers: js.UndefOr[Record[String, String | js.Array[String]]] = js.native
  
  /**
    * The HTTP `method`. This is only used for file and URL responses.
    */
  var method: js.UndefOr[String] = js.native
  
  /**
    * The MIME type of response body, default is `"text/html"`. Setting `mimeType`
    * would implicitly set the `content-type` header in response, but if
    * `content-type` is already set in `headers`, the `mimeType` would be ignored.
    */
  var mimeType: js.UndefOr[String] = js.native
  
  /**
    * Path to the file which would be sent as response body. This is only used for
    * file responses.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * The `referrer` URL. This is only used for file and URL responses.
    */
  var referrer: js.UndefOr[String] = js.native
  
  /**
    * The session used for requesting URL, by default the HTTP request will reuse the
    * current session. Setting `session` to `null` would use a random independent
    * session. This is only used for URL responses.
    */
  var session: js.UndefOr[Session_] = js.native
  
  /**
    * The HTTP response code, default is 200.
    */
  var statusCode: js.UndefOr[Double] = js.native
  
  /**
    * The data used as upload data. This is only used for URL responses when `method`
    * is `"POST"`.
    */
  var uploadData: js.UndefOr[ProtocolResponseUploadData] = js.native
  
  /**
    * Download the `url` and pipe the result as response body. This is only used for
    * URL responses.
    */
  var url: js.UndefOr[String] = js.native
}
object ProtocolResponse {
  
  @scala.inline
  def apply(): ProtocolResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProtocolResponse]
  }
  
  @scala.inline
  implicit class ProtocolResponseOps[Self <: ProtocolResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCharset(value: String): Self = this.set("charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharset: Self = this.set("charset", js.undefined)
    
    @scala.inline
    def setData(value: Buffer | String | ReadableStream): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setError(value: Double): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setHeaders(value: Record[String, String | js.Array[String]]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setReferrer(value: String): Self = this.set("referrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferrer: Self = this.set("referrer", js.undefined)
    
    @scala.inline
    def setSession(value: Session_): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
    
    @scala.inline
    def setUploadData(value: ProtocolResponseUploadData): Self = this.set("uploadData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadData: Self = this.set("uploadData", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
