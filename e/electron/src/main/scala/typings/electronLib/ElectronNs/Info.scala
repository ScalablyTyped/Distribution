package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Info extends js.Object {
  /**
    * Content Security Policy for the isolated world.
    */
  var csp: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name for isolated world. Useful in devtools.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Security origin for the isolated world.
    */
  var securityOrigin: js.UndefOr[java.lang.String] = js.undefined
}

object Info {
  @scala.inline
  def apply(
    csp: java.lang.String = null,
    name: java.lang.String = null,
    securityOrigin: java.lang.String = null
  ): Info = {
    val __obj = js.Dynamic.literal()
    if (csp != null) __obj.updateDynamic("csp")(csp)
    if (name != null) __obj.updateDynamic("name")(name)
    if (securityOrigin != null) __obj.updateDynamic("securityOrigin")(securityOrigin)
    __obj.asInstanceOf[Info]
  }
}

