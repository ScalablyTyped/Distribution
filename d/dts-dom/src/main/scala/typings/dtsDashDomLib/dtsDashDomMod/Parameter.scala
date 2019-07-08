package typings
package dtsDashDomLib.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameter extends js.Object {
  var flags: js.UndefOr[ParameterFlags] = js.undefined
  var kind: dtsDashDomLib.dtsDashDomLibStrings.parameter
  var name: java.lang.String
  var `type`: Type
}

object Parameter {
  @scala.inline
  def apply(
    kind: dtsDashDomLib.dtsDashDomLibStrings.parameter,
    name: java.lang.String,
    `type`: Type,
    flags: ParameterFlags = null
  ): Parameter = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags)
    __obj.asInstanceOf[Parameter]
  }
}

