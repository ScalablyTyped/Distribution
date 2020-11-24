package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientRequestConstructorOptions extends js.Object {
  
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
  implicit class ClientRequestConstructorOptionsOps[Self <: ClientRequestConstructorOptions] (val x: Self) extends AnyVal {
    
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setPartition(value: String): Self = this.set("partition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartition: Self = this.set("partition", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setRedirect(value: String): Self = this.set("redirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirect: Self = this.set("redirect", js.undefined)
    
    @scala.inline
    def setSession(value: Session_): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUseSessionCookies(value: Boolean): Self = this.set("useSessionCookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSessionCookies: Self = this.set("useSessionCookies", js.undefined)
  }
}
