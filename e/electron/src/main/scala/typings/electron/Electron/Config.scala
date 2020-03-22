package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    * The URL associated with the PAC file.
    */
  var pacScript: js.UndefOr[String] = js.undefined
  /**
    * Rules indicating which URLs should bypass the proxy settings.
    */
  var proxyBypassRules: js.UndefOr[String] = js.undefined
  /**
    * Rules indicating which proxies to use.
    */
  var proxyRules: js.UndefOr[String] = js.undefined
}

object Config {
  @scala.inline
  def apply(pacScript: String = null, proxyBypassRules: String = null, proxyRules: String = null): Config = {
    val __obj = js.Dynamic.literal()
    if (pacScript != null) __obj.updateDynamic("pacScript")(pacScript.asInstanceOf[js.Any])
    if (proxyBypassRules != null) __obj.updateDynamic("proxyBypassRules")(proxyBypassRules.asInstanceOf[js.Any])
    if (proxyRules != null) __obj.updateDynamic("proxyRules")(proxyRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

