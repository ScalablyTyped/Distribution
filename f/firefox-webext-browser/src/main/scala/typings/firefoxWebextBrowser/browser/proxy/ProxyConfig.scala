package typings.firefoxWebextBrowser.browser.proxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* proxy types */
/** An object which describes proxy settings. */
@js.native
trait ProxyConfig extends js.Object {
  
  /** A URL to use to configure the proxy. */
  var autoConfigUrl: js.UndefOr[String] = js.native
  
  /** Do not prompt for authentication if password is saved. */
  var autoLogin: js.UndefOr[Boolean] = js.native
  
  /** The address of the ftp proxy, can include a port. */
  var ftp: js.UndefOr[String] = js.native
  
  /** The address of the http proxy, can include a port. */
  var http: js.UndefOr[String] = js.native
  
  /** Use the http proxy server for all protocols. */
  var httpProxyAll: js.UndefOr[Boolean] = js.native
  
  /** A list of hosts which should not be proxied. */
  var passthrough: js.UndefOr[String] = js.native
  
  /** Proxy DNS when using SOCKS v5. */
  var proxyDNS: js.UndefOr[Boolean] = js.native
  
  /** The type of proxy to use. */
  var proxyType: js.UndefOr[ProxyConfigProxyType] = js.native
  
  /**
    * If true (the default value), do not use newer TLS protocol features that might have interoperability problems on the Internet. This is intended only for use with critical infrastructure like the updates, and is only available to privileged addons.
    */
  var respectBeConservative: js.UndefOr[Boolean] = js.native
  
  /** The address of the socks proxy, can include a port. */
  var socks: js.UndefOr[String] = js.native
  
  /** The version of the socks proxy. */
  var socksVersion: js.UndefOr[Double] = js.native
  
  /** The address of the ssl proxy, can include a port. */
  var ssl: js.UndefOr[String] = js.native
}
object ProxyConfig {
  
  @scala.inline
  def apply(): ProxyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyConfig]
  }
  
  @scala.inline
  implicit class ProxyConfigOps[Self <: ProxyConfig] (val x: Self) extends AnyVal {
    
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
    def setAutoConfigUrl(value: String): Self = this.set("autoConfigUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoConfigUrl: Self = this.set("autoConfigUrl", js.undefined)
    
    @scala.inline
    def setAutoLogin(value: Boolean): Self = this.set("autoLogin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoLogin: Self = this.set("autoLogin", js.undefined)
    
    @scala.inline
    def setFtp(value: String): Self = this.set("ftp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFtp: Self = this.set("ftp", js.undefined)
    
    @scala.inline
    def setHttp(value: String): Self = this.set("http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttp: Self = this.set("http", js.undefined)
    
    @scala.inline
    def setHttpProxyAll(value: Boolean): Self = this.set("httpProxyAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpProxyAll: Self = this.set("httpProxyAll", js.undefined)
    
    @scala.inline
    def setPassthrough(value: String): Self = this.set("passthrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassthrough: Self = this.set("passthrough", js.undefined)
    
    @scala.inline
    def setProxyDNS(value: Boolean): Self = this.set("proxyDNS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyDNS: Self = this.set("proxyDNS", js.undefined)
    
    @scala.inline
    def setProxyType(value: ProxyConfigProxyType): Self = this.set("proxyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyType: Self = this.set("proxyType", js.undefined)
    
    @scala.inline
    def setRespectBeConservative(value: Boolean): Self = this.set("respectBeConservative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRespectBeConservative: Self = this.set("respectBeConservative", js.undefined)
    
    @scala.inline
    def setSocks(value: String): Self = this.set("socks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocks: Self = this.set("socks", js.undefined)
    
    @scala.inline
    def setSocksVersion(value: Double): Self = this.set("socksVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocksVersion: Self = this.set("socksVersion", js.undefined)
    
    @scala.inline
    def setSsl(value: String): Self = this.set("ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
  }
}
