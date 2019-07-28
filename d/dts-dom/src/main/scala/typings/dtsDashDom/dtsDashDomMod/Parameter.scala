package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.parameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameter extends js.Object {
  var flags: js.UndefOr[ParameterFlags] = js.undefined
  var kind: parameter
  var name: String
  var `type`: Type
}

object Parameter {
  @scala.inline
  def apply(kind: parameter, name: String, `type`: Type, flags: ParameterFlags = null): Parameter = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags)
    __obj.asInstanceOf[Parameter]
  }
}

