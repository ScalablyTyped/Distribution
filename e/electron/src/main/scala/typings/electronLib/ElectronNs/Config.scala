package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    * The URL associated with the PAC file.
    */
  var pacScript: java.lang.String
  /**
    * Rules indicating which URLs should bypass the proxy settings.
    */
  var proxyBypassRules: java.lang.String
  /**
    * Rules indicating which proxies to use.
    */
  var proxyRules: java.lang.String
}

object Config {
  @scala.inline
  def apply(pacScript: java.lang.String, proxyBypassRules: java.lang.String, proxyRules: java.lang.String): Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pacScript")(pacScript)
    __obj.updateDynamic("proxyBypassRules")(proxyBypassRules)
    __obj.updateDynamic("proxyRules")(proxyRules)
    __obj.asInstanceOf[Config]
  }
}

