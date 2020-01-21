package typings.drivelist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Drive extends js.Object {
  var blockSize: Double | Null
  var busType: BusType
  var busVersion: String | Null
  var description: String
  var device: String
  var devicePath: String | Null
  var enumerator: String
  var error: js.Any
  var isCard: Boolean | Null
  var isReadOnly: Boolean
  var isRemovable: Boolean | Null
  var isSCSI: Boolean | Null
  var isSystem: Boolean
  var isUAS: Boolean | Null
  var isUSB: Boolean | Null
  var isVirtual: Boolean | Null
  var logicalBlockSize: Double | Null
  var mountpoints: js.Array[MountPoint]
  var raw: String
   // can be null
  var size: Double | Null
}

object Drive {
  @scala.inline
  def apply(
    busType: BusType,
    description: String,
    device: String,
    enumerator: String,
    error: js.Any,
    isReadOnly: Boolean,
    isSystem: Boolean,
    mountpoints: js.Array[MountPoint],
    raw: String,
    blockSize: Int | Double = null,
    busVersion: String = null,
    devicePath: String = null,
    isCard: js.UndefOr[Boolean] = js.undefined,
    isRemovable: js.UndefOr[Boolean] = js.undefined,
    isSCSI: js.UndefOr[Boolean] = js.undefined,
    isUAS: js.UndefOr[Boolean] = js.undefined,
    isUSB: js.UndefOr[Boolean] = js.undefined,
    isVirtual: js.UndefOr[Boolean] = js.undefined,
    logicalBlockSize: Int | Double = null,
    size: Int | Double = null
  ): Drive = {
    val __obj = js.Dynamic.literal(busType = busType.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], enumerator = enumerator.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], isSystem = isSystem.asInstanceOf[js.Any], mountpoints = mountpoints.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    if (blockSize != null) __obj.updateDynamic("blockSize")(blockSize.asInstanceOf[js.Any])
    if (busVersion != null) __obj.updateDynamic("busVersion")(busVersion.asInstanceOf[js.Any])
    if (devicePath != null) __obj.updateDynamic("devicePath")(devicePath.asInstanceOf[js.Any])
    if (!js.isUndefined(isCard)) __obj.updateDynamic("isCard")(isCard.asInstanceOf[js.Any])
    if (!js.isUndefined(isRemovable)) __obj.updateDynamic("isRemovable")(isRemovable.asInstanceOf[js.Any])
    if (!js.isUndefined(isSCSI)) __obj.updateDynamic("isSCSI")(isSCSI.asInstanceOf[js.Any])
    if (!js.isUndefined(isUAS)) __obj.updateDynamic("isUAS")(isUAS.asInstanceOf[js.Any])
    if (!js.isUndefined(isUSB)) __obj.updateDynamic("isUSB")(isUSB.asInstanceOf[js.Any])
    if (!js.isUndefined(isVirtual)) __obj.updateDynamic("isVirtual")(isVirtual.asInstanceOf[js.Any])
    if (logicalBlockSize != null) __obj.updateDynamic("logicalBlockSize")(logicalBlockSize.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Drive]
  }
}

