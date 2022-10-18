package typings.esfxCanceltoken

import typings.esfxCanceltoken.mod.CancelToken
import typings.std.Blob
import typings.std.FormData
import typings.std.Headers
import typings.std.ReferrerPolicy
import typings.std.Request
import typings.std.RequestCache
import typings.std.RequestCredentials
import typings.std.RequestDestination
import typings.std.RequestMode
import typings.std.RequestRedirect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<std.Request, 'signal'> */
trait RequestWithCancelToken extends StObject {
  
  def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer]
  @JSName("arrayBuffer")
  var arrayBuffer_Original: js.Function0[js.Promise[js.typedarray.ArrayBuffer]]
  
  def blob(): js.Promise[Blob]
  @JSName("blob")
  var blob_Original: js.Function0[js.Promise[Blob]]
  
  var body: js.UndefOr[typings.std.ReadableStream[js.typedarray.Uint8Array] | Null] = js.undefined
  
  var bodyUsed: Boolean
  
  var cache: RequestCache
  
  @JSName("clone")
  var clone_Original: js.Function0[Request]
  
  var credentials: RequestCredentials
  
  var destination: RequestDestination
  
  def formData(): js.Promise[FormData]
  @JSName("formData")
  var formData_Original: js.Function0[js.Promise[FormData]]
  
  var headers: Headers
  
  var integrity: String
  
  def json(): js.Promise[Any]
  @JSName("json")
  var json_Original: js.Function0[js.Promise[Any]]
  
  var keepalive: Boolean
  
  var method: String
  
  var mode: RequestMode
  
  var redirect: RequestRedirect
  
  var referrer: String
  
  var referrerPolicy: ReferrerPolicy
  
  val signal: CancelToken
  
  def text(): js.Promise[String]
  @JSName("text")
  var text_Original: js.Function0[js.Promise[String]]
  
  var url: String
}
object RequestWithCancelToken {
  
  inline def apply(
    arrayBuffer: () => js.Promise[js.typedarray.ArrayBuffer],
    blob: () => js.Promise[Blob],
    bodyUsed: Boolean,
    cache: RequestCache,
    clone_ : () => Request,
    credentials: RequestCredentials,
    destination: RequestDestination,
    formData: () => js.Promise[FormData],
    headers: Headers,
    integrity: String,
    json: () => js.Promise[Any],
    keepalive: Boolean,
    method: String,
    mode: RequestMode,
    redirect: RequestRedirect,
    referrer: String,
    referrerPolicy: ReferrerPolicy,
    signal: CancelToken,
    text: () => js.Promise[String],
    url: String
  ): RequestWithCancelToken = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), headers = headers.asInstanceOf[js.Any], integrity = integrity.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), keepalive = keepalive.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], referrerPolicy = referrerPolicy.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(js.Any.fromFunction0(clone_))
    __obj.asInstanceOf[RequestWithCancelToken]
  }
  
  extension [Self <: RequestWithCancelToken](x: Self) {
    
    inline def setArrayBuffer(value: () => js.Promise[js.typedarray.ArrayBuffer]): Self = StObject.set(x, "arrayBuffer", js.Any.fromFunction0(value))
    
    inline def setBlob(value: () => js.Promise[Blob]): Self = StObject.set(x, "blob", js.Any.fromFunction0(value))
    
    inline def setBody(value: typings.std.ReadableStream[js.typedarray.Uint8Array]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setBodyUsed(value: Boolean): Self = StObject.set(x, "bodyUsed", value.asInstanceOf[js.Any])
    
    inline def setCache(value: RequestCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setClone_(value: () => Request): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setCredentials(value: RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setDestination(value: RequestDestination): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setFormData(value: () => js.Promise[FormData]): Self = StObject.set(x, "formData", js.Any.fromFunction0(value))
    
    inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
    
    inline def setJson(value: () => js.Promise[Any]): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
    
    inline def setKeepalive(value: Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMode(value: RequestMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    inline def setReferrerPolicy(value: ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    inline def setSignal(value: CancelToken): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setText(value: () => js.Promise[String]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
