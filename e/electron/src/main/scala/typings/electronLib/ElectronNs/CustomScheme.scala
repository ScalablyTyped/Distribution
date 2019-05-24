package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomScheme extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/custom-scheme
  var privileges: js.UndefOr[Privileges] = js.undefined
  /**
    * Custom schemes to be registered with options.
    */
  var scheme: java.lang.String
}

object CustomScheme {
  @scala.inline
  def apply(scheme: java.lang.String, privileges: Privileges = null): CustomScheme = {
    val __obj = js.Dynamic.literal(scheme = scheme)
    if (privileges != null) __obj.updateDynamic("privileges")(privileges)
    __obj.asInstanceOf[CustomScheme]
  }
}

