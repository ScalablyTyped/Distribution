package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientRequestConstructorOptions extends StObject {
  
  /**
    * The server host provided as a concatenation of the hostname and the port number
    * 'hostname:port'.
    */
  var host: js.UndefOr[String] = js.native
  
  /**
    * The server host name.
    */
  var hostname: js.UndefOr[String] = js.native
  
  /**
    * The HTTP request method. Defaults to the GET method.
    */
  var method: js.UndefOr[String] = js.native
  
  /**
    * The name of the `partition` with which the request is associated. Defaults to
    * the empty string. The `session` option prevails on `partition`. Thus if a
    * `session` is explicitly specified, `partition` is ignored.
    */
  var partition: js.UndefOr[String] = js.native
  
  /**
    * The path part of the request URL.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * The server's listening port number.
    */
  var port: js.UndefOr[Double] = js.native
  
  /**
    * The protocol scheme in the form 'scheme:'. Currently supported values are
    * 'http:' or 'https:'. Defaults to 'http:'.
    */
  var protocol: js.UndefOr[String] = js.native
  
  /**
    * The redirect mode for this request. Should be one of `follow`, `error` or
    * `manual`. Defaults to `follow`. When mode is `error`, any redirection will be
    * aborted. When mode is `manual` the redirection will be cancelled unless
    * `request.followRedirect` is invoked synchronously during the `redirect` event.
    */
  var redirect: js.UndefOr[String] = js.native
  
  /**
    * The `Session` instance with which the request is associated.
    */
  var session: js.UndefOr[Session_] = js.native
  
  /**
    * The request URL. Must be provided in the absolute form with the protocol scheme
    * specified as http or https.
    */
  var url: js.UndefOr[String] = js.native
  
  /**
    * Whether to send cookies with this request from the provided session.  This will
    * make the `net` request's cookie behavior match a `fetch` request. Default is
    * `false`.
    */
  var useSessionCookies: js.UndefOr[Boolean] = js.native
}
object ClientRequestConstructorOptions {
  
  @scala.inline
  def apply(): ClientRequestConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientRequestConstructorOptions]
  }
  
  @scala.inline
  implicit class ClientRequestConstructorOptionsMutableBuilder[Self <: ClientRequestConstructorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setPartition(value: String): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setRedirect(value: String): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    
    @scala.inline
    def setSession(value: Session_): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setUseSessionCookies(value: Boolean): Self = StObject.set(x, "useSessionCookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseSessionCookiesUndefined: Self = StObject.set(x, "useSessionCookies", js.undefined)
  }
}
