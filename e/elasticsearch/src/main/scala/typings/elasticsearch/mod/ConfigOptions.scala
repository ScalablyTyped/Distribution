package typings.elasticsearch.mod

import org.scalablytyped.runtime.Instantiable2
import typings.elasticsearch.httpMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigOptions extends js.Object {
  var apiVersion: js.UndefOr[String] = js.native
  var connectionClass: js.UndefOr[String | (Instantiable2[/* host */ js.Any, /* config */ js.Any, ^])] = js.native
  var createNodeAgent: js.UndefOr[js.Any] = js.native
  var deadTimeout: js.UndefOr[Double] = js.native
  var defer: js.UndefOr[js.Function0[Unit]] = js.native
  var host: js.UndefOr[js.Any] = js.native
  var hosts: js.UndefOr[js.Any] = js.native
  var httpAuth: js.UndefOr[String] = js.native
  var keepAlive: js.UndefOr[Boolean] = js.native
  var log: js.UndefOr[js.Any] = js.native
  var maxRetries: js.UndefOr[Double] = js.native
  var maxSockets: js.UndefOr[Double] = js.native
  var nodesToHostCallback: js.UndefOr[js.Any] = js.native
  var pingTimeout: js.UndefOr[Double] = js.native
  var plugins: js.UndefOr[js.Any] = js.native
  var requestTimeout: js.UndefOr[Double] = js.native
  var selector: js.UndefOr[js.Any] = js.native
  var sniffInterval: js.UndefOr[Double] = js.native
  var sniffOnConnectionFault: js.UndefOr[Boolean] = js.native
  var sniffOnStart: js.UndefOr[Boolean] = js.native
  var sniffedNodesProtocol: js.UndefOr[String] = js.native
  var ssl: js.UndefOr[js.Object] = js.native
  var suggestCompression: js.UndefOr[Boolean] = js.native
}

object ConfigOptions {
  @scala.inline
  def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions]
  }
  @scala.inline
  implicit class ConfigOptionsOps[Self <: ConfigOptions] (val x: Self) extends AnyVal {
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
    def setApiVersion(value: String): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    @scala.inline
    def setConnectionClass(value: String | (Instantiable2[/* host */ js.Any, /* config */ js.Any, ^])): Self = this.set("connectionClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionClass: Self = this.set("connectionClass", js.undefined)
    @scala.inline
    def setCreateNodeAgent(value: js.Any): Self = this.set("createNodeAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateNodeAgent: Self = this.set("createNodeAgent", js.undefined)
    @scala.inline
    def setDeadTimeout(value: Double): Self = this.set("deadTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeadTimeout: Self = this.set("deadTimeout", js.undefined)
    @scala.inline
    def setDefer(value: () => Unit): Self = this.set("defer", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDefer: Self = this.set("defer", js.undefined)
    @scala.inline
    def setHost(value: js.Any): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setHosts(value: js.Any): Self = this.set("hosts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHosts: Self = this.set("hosts", js.undefined)
    @scala.inline
    def setHttpAuth(value: String): Self = this.set("httpAuth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpAuth: Self = this.set("httpAuth", js.undefined)
    @scala.inline
    def setKeepAlive(value: Boolean): Self = this.set("keepAlive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepAlive: Self = this.set("keepAlive", js.undefined)
    @scala.inline
    def setLog(value: js.Any): Self = this.set("log", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    @scala.inline
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRetries: Self = this.set("maxRetries", js.undefined)
    @scala.inline
    def setMaxSockets(value: Double): Self = this.set("maxSockets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSockets: Self = this.set("maxSockets", js.undefined)
    @scala.inline
    def setNodesToHostCallback(value: js.Any): Self = this.set("nodesToHostCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodesToHostCallback: Self = this.set("nodesToHostCallback", js.undefined)
    @scala.inline
    def setPingTimeout(value: Double): Self = this.set("pingTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePingTimeout: Self = this.set("pingTimeout", js.undefined)
    @scala.inline
    def setPlugins(value: js.Any): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setRequestTimeout(value: Double): Self = this.set("requestTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestTimeout: Self = this.set("requestTimeout", js.undefined)
    @scala.inline
    def setSelector(value: js.Any): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    @scala.inline
    def setSniffInterval(value: Double): Self = this.set("sniffInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSniffInterval: Self = this.set("sniffInterval", js.undefined)
    @scala.inline
    def setSniffOnConnectionFault(value: Boolean): Self = this.set("sniffOnConnectionFault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSniffOnConnectionFault: Self = this.set("sniffOnConnectionFault", js.undefined)
    @scala.inline
    def setSniffOnStart(value: Boolean): Self = this.set("sniffOnStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSniffOnStart: Self = this.set("sniffOnStart", js.undefined)
    @scala.inline
    def setSniffedNodesProtocol(value: String): Self = this.set("sniffedNodesProtocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSniffedNodesProtocol: Self = this.set("sniffedNodesProtocol", js.undefined)
    @scala.inline
    def setSsl(value: js.Object): Self = this.set("ssl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
    @scala.inline
    def setSuggestCompression(value: Boolean): Self = this.set("suggestCompression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestCompression: Self = this.set("suggestCompression", js.undefined)
  }
  
}

