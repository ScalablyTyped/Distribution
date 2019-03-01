package typings
package atFrctlFractalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_External extends js.Object {
  var external: js.UndefOr[java.lang.String] = js.undefined
  var local: js.UndefOr[java.lang.String] = js.undefined
  var ui: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_External {
  @scala.inline
  def apply(external: java.lang.String = null, local: java.lang.String = null, ui: java.lang.String = null): Anon_External = {
    val __obj = js.Dynamic.literal()
    if (external != null) __obj.updateDynamic("external")(external)
    if (local != null) __obj.updateDynamic("local")(local)
    if (ui != null) __obj.updateDynamic("ui")(ui)
    __obj.asInstanceOf[Anon_External]
  }
}

