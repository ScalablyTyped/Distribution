package typings
package gapiDotClientDotClouddebuggerLib.gapiNs.clientNs.clouddebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasContext extends js.Object {
  /** The alias kind. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The alias name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object AliasContext {
  @scala.inline
  def apply(kind: java.lang.String = null, name: java.lang.String = null): AliasContext = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[AliasContext]
  }
}

