package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration info for an HTTP proxy. For a direct proxy, set the host,
  * port, and excluded_hosts fields. For a PAC script proxy, set the pac_uri
  * field.
  */
@js.native
trait SchemaProxyInfo extends js.Object {
  
  /**
    * For a direct proxy, the hosts for which the proxy is bypassed. The host
    * names may contain wildcards such as *.example.com.
    */
  var excludedHosts: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The host of the direct proxy.
    */
  var host: js.UndefOr[String] = js.native
  
  /**
    * The URI of the PAC script used to configure the proxy.
    */
  var pacUri: js.UndefOr[String] = js.native
  
  /**
    * The port of the direct proxy.
    */
  var port: js.UndefOr[Double] = js.native
}
object SchemaProxyInfo {
  
  @scala.inline
  def apply(): SchemaProxyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProxyInfo]
  }
  
  @scala.inline
  implicit class SchemaProxyInfoOps[Self <: SchemaProxyInfo] (val x: Self) extends AnyVal {
    
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
    def setExcludedHostsVarargs(value: String*): Self = this.set("excludedHosts", js.Array(value :_*))
    
    @scala.inline
    def setExcludedHosts(value: js.Array[String]): Self = this.set("excludedHosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedHosts: Self = this.set("excludedHosts", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setPacUri(value: String): Self = this.set("pacUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePacUri: Self = this.set("pacUri", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
}
