package typings.dockerode.mod

import typings.dockerode.anon.DriverConfig
import typings.dockerode.anon.Propagation
import typings.dockerode.anon.SizeBytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MountSettings extends js.Object {
  var BindOptions: js.UndefOr[Propagation] = js.undefined
  var Consistency: js.UndefOr[MountConsistency] = js.undefined
  var ReadOnly: js.UndefOr[Boolean] = js.undefined
  var Source: String
  var Target: String
  var TmpfsOptions: js.UndefOr[SizeBytes] = js.undefined
  var Type: MountType
  var VolumeOptions: js.UndefOr[DriverConfig] = js.undefined
}

object MountSettings {
  @scala.inline
  def apply(
    Source: String,
    Target: String,
    Type: MountType,
    BindOptions: Propagation = null,
    Consistency: MountConsistency = null,
    ReadOnly: js.UndefOr[Boolean] = js.undefined,
    TmpfsOptions: SizeBytes = null,
    VolumeOptions: DriverConfig = null
  ): MountSettings = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    if (BindOptions != null) __obj.updateDynamic("BindOptions")(BindOptions.asInstanceOf[js.Any])
    if (Consistency != null) __obj.updateDynamic("Consistency")(Consistency.asInstanceOf[js.Any])
    if (!js.isUndefined(ReadOnly)) __obj.updateDynamic("ReadOnly")(ReadOnly.get.asInstanceOf[js.Any])
    if (TmpfsOptions != null) __obj.updateDynamic("TmpfsOptions")(TmpfsOptions.asInstanceOf[js.Any])
    if (VolumeOptions != null) __obj.updateDynamic("VolumeOptions")(VolumeOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[MountSettings]
  }
}

