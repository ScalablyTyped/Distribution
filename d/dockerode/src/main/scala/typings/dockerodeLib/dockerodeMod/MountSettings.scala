package typings
package dockerodeLib.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MountSettings extends js.Object {
  var BindOptions: js.UndefOr[dockerodeLib.Anon_Propagation] = js.undefined
  var Consistency: js.UndefOr[MountConsistency] = js.undefined
  var ReadOnly: js.UndefOr[scala.Boolean] = js.undefined
  var Source: java.lang.String
  var Target: java.lang.String
  var Type: MountType
}

object MountSettings {
  @scala.inline
  def apply(
    Source: java.lang.String,
    Target: java.lang.String,
    Type: MountType,
    BindOptions: dockerodeLib.Anon_Propagation = null,
    Consistency: MountConsistency = null,
    ReadOnly: js.UndefOr[scala.Boolean] = js.undefined
  ): MountSettings = {
    val __obj = js.Dynamic.literal(Source = Source, Target = Target, Type = Type)
    if (BindOptions != null) __obj.updateDynamic("BindOptions")(BindOptions)
    if (Consistency != null) __obj.updateDynamic("Consistency")(Consistency)
    if (!js.isUndefined(ReadOnly)) __obj.updateDynamic("ReadOnly")(ReadOnly)
    __obj.asInstanceOf[MountSettings]
  }
}

