package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientRequestConstructorOptions extends StObject {
  
  /**
    * The server host provided as a concatenation of the hostname and the port number
    * 'hostname:port'.
    */
  var host: js.UndefOr[String] = js.undefined
  
  /**
    * The server host name.
    */
  var hostname: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP request method. Defaults to the GET method.
    */
  var method: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the `partition` with which the request is associated. Defaults to
    * the empty string. The `session` option prevails on `partition`. Thus if a
    * `session` is explicitly specified, `partition` is ignored.
    */
  var partition: js.UndefOr[String] = js.undefined
  
  /**
    * The path part of the request URL.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The server's listening port number.
    */
  var port: js.UndefOr[Double] = js.undefined
  
  /**
    * The protocol scheme in the form 'scheme:'. Currently supported values are
    * 'http:' or 'https:'. Defaults to 'http:'.
    */
  var protocol: js.UndefOr[String] = js.undefined
  
  /**
    * The redirect mode for this request. Should be one of `follow`, `error` or
    * `manual`. Defaults to `follow`. When mode is `error`, any redirection will be
    * aborted. When mode is `manual` the redirection will be cancelled unless
    * `request.followRedirect` is invoked synchronously during the `redirect` event.
    */
  var redirect: js.UndefOr[String] = js.undefined
  
  /**
    * The `Session` instance with which the request is associated.
    */
  var session: js.UndefOr[Session_] = js.undefined
  
  /**
    * The request URL. Must be provided in the absolute form with the protocol scheme
    * specified as http or https.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to send cookies with this request from the provided session.  This will
    * make the `net` request's cookie behavior match a `fetch` request. Default is
    * `false`.
    */
  var useSessionCookies: js.UndefOr[Boolean] = js.undefined
}
object ClientRequestConstructorOptions {
  
  inline def apply(): ClientRequestConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientRequestConstructorOptions]
  }
  
  extension [Self <: ClientRequestConstructorOptions](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setPartition(value: String): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    inline def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setRedirect(value: String): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    
    inline def setSession(value: Session_): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUseSessionCookies(value: Boolean): Self = StObject.set(x, "useSessionCookies", value.asInstanceOf[js.Any])
    
    inline def setUseSessionCookiesUndefined: Self = StObject.set(x, "useSessionCookies", js.undefined)
  }
}
