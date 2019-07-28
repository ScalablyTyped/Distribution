package typings.dockerode.dockerodeMod

import typings.dockerode.Anon_DriverConfig
import typings.dockerode.Anon_Mode
import typings.dockerode.Anon_Propagation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MountSettings extends js.Object {
  var BindOptions: js.UndefOr[Anon_Propagation] = js.undefined
  var Consistency: js.UndefOr[MountConsistency] = js.undefined
  var ReadOnly: js.UndefOr[Boolean] = js.undefined
  var Source: String
  var Target: String
  var TmpfsOptions: js.UndefOr[Anon_Mode] = js.undefined
  var Type: MountType
  var VolumeOptions: js.UndefOr[Anon_DriverConfig] = js.undefined
}

object MountSettings {
  @scala.inline
  def apply(
    Source: String,
    Target: String,
    Type: MountType,
    BindOptions: Anon_Propagation = null,
    Consistency: MountConsistency = null,
    ReadOnly: js.UndefOr[Boolean] = js.undefined,
    TmpfsOptions: Anon_Mode = null,
    VolumeOptions: Anon_DriverConfig = null
  ): MountSettings = {
    val __obj = js.Dynamic.literal(Source = Source, Target = Target, Type = Type)
    if (BindOptions != null) __obj.updateDynamic("BindOptions")(BindOptions)
    if (Consistency != null) __obj.updateDynamic("Consistency")(Consistency)
    if (!js.isUndefined(ReadOnly)) __obj.updateDynamic("ReadOnly")(ReadOnly)
    if (TmpfsOptions != null) __obj.updateDynamic("TmpfsOptions")(TmpfsOptions)
    if (VolumeOptions != null) __obj.updateDynamic("VolumeOptions")(VolumeOptions)
    __obj.asInstanceOf[MountSettings]
  }
}

