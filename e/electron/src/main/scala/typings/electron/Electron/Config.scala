package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  /**
    * The URL associated with the PAC file.
    */
  var pacScript: js.UndefOr[String] = js.native
  /**
    * Rules indicating which URLs should bypass the proxy settings.
    */
  var proxyBypassRules: js.UndefOr[String] = js.native
  /**
    * Rules indicating which proxies to use.
    */
  var proxyRules: js.UndefOr[String] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setPacScript(value: String): Self = this.set("pacScript", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePacScript: Self = this.set("pacScript", js.undefined)
    @scala.inline
    def setProxyBypassRules(value: String): Self = this.set("proxyBypassRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyBypassRules: Self = this.set("proxyBypassRules", js.undefined)
    @scala.inline
    def setProxyRules(value: String): Self = this.set("proxyRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyRules: Self = this.set("proxyRules", js.undefined)
  }
  
}

