package typings.drivelist.drivelistMod

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
    val __obj = js.Dynamic.literal(busType = busType, description = description, device = device, enumerator = enumerator, error = error, isReadOnly = isReadOnly, isSystem = isSystem, mountpoints = mountpoints, raw = raw)
    if (blockSize != null) __obj.updateDynamic("blockSize")(blockSize.asInstanceOf[js.Any])
    if (busVersion != null) __obj.updateDynamic("busVersion")(busVersion)
    if (devicePath != null) __obj.updateDynamic("devicePath")(devicePath)
    if (!js.isUndefined(isCard)) __obj.updateDynamic("isCard")(isCard)
    if (!js.isUndefined(isRemovable)) __obj.updateDynamic("isRemovable")(isRemovable)
    if (!js.isUndefined(isSCSI)) __obj.updateDynamic("isSCSI")(isSCSI)
    if (!js.isUndefined(isUAS)) __obj.updateDynamic("isUAS")(isUAS)
    if (!js.isUndefined(isUSB)) __obj.updateDynamic("isUSB")(isUSB)
    if (!js.isUndefined(isVirtual)) __obj.updateDynamic("isVirtual")(isVirtual)
    if (logicalBlockSize != null) __obj.updateDynamic("logicalBlockSize")(logicalBlockSize.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Drive]
  }
}

