package typings.egg.mod

import org.scalablytyped.runtime.StringDictionary
import typings.urllib.mod.RequestOptions2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpClientConfig extends HttpClientBaseConfig {
  /** Whether enable dns cache */
  var enableDNSCache: js.UndefOr[Boolean] = js.native
  /** Enable proxy request, default is false. */
  var enableProxy: js.UndefOr[Boolean] = js.native
  /** http.Agent */
  var httpAgent: js.UndefOr[HttpClientBaseConfig] = js.native
  /** https.Agent */
  var httpsAgent: js.UndefOr[HttpClientBaseConfig] = js.native
  /** proxy agent uri or options, default is null. */
  var proxy: js.UndefOr[String | StringDictionary[js.Any]] = js.native
  /** Default request args for httpclient */
  var request: js.UndefOr[RequestOptions2] = js.native
}

object HttpClientConfig {
  @scala.inline
  def apply(): HttpClientConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpClientConfig]
  }
  @scala.inline
  implicit class HttpClientConfigOps[Self <: HttpClientConfig] (val x: Self) extends AnyVal {
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
    def setEnableDNSCache(value: Boolean): Self = this.set("enableDNSCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableDNSCache: Self = this.set("enableDNSCache", js.undefined)
    @scala.inline
    def setEnableProxy(value: Boolean): Self = this.set("enableProxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableProxy: Self = this.set("enableProxy", js.undefined)
    @scala.inline
    def setHttpAgent(value: HttpClientBaseConfig): Self = this.set("httpAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpAgent: Self = this.set("httpAgent", js.undefined)
    @scala.inline
    def setHttpsAgent(value: HttpClientBaseConfig): Self = this.set("httpsAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpsAgent: Self = this.set("httpsAgent", js.undefined)
    @scala.inline
    def setProxy(value: String | StringDictionary[js.Any]): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    @scala.inline
    def setRequest(value: RequestOptions2): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
  }
  
}

