package typings.globalTunnelNg.mod

import org.scalablytyped.runtime.StringDictionary
import typings.globalTunnelNg.globalTunnelNgStrings.both
import typings.globalTunnelNg.globalTunnelNgStrings.httpColon
import typings.globalTunnelNg.globalTunnelNgStrings.https
import typings.globalTunnelNg.globalTunnelNgStrings.httpsColon
import typings.globalTunnelNg.globalTunnelNgStrings.neither
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var connect: js.UndefOr[neither | https | both] = js.native
  var host: String = js.native
  var originHttpsOptions: js.UndefOr[StringDictionary[js.Any]] = js.native
  var port: Double = js.native
  var protocol: js.UndefOr[httpColon | httpsColon] = js.native
  var proxyAuth: js.UndefOr[String] = js.native
  var proxyHttpsOptions: js.UndefOr[StringDictionary[js.Any]] = js.native
  var sockets: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(host: String, port: Double): Options = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnect(value: neither | https | both): Self = this.set("connect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnect: Self = this.set("connect", js.undefined)
    @scala.inline
    def setOriginHttpsOptions(value: StringDictionary[js.Any]): Self = this.set("originHttpsOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginHttpsOptions: Self = this.set("originHttpsOptions", js.undefined)
    @scala.inline
    def setProtocol(value: httpColon | httpsColon): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setProxyAuth(value: String): Self = this.set("proxyAuth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyAuth: Self = this.set("proxyAuth", js.undefined)
    @scala.inline
    def setProxyHttpsOptions(value: StringDictionary[js.Any]): Self = this.set("proxyHttpsOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyHttpsOptions: Self = this.set("proxyHttpsOptions", js.undefined)
    @scala.inline
    def setSockets(value: Double): Self = this.set("sockets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSockets: Self = this.set("sockets", js.undefined)
  }
  
}

