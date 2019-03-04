package typings
package drivelistLib.drivelistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Drive extends js.Object {
  var blockSize: scala.Double | scala.Null
  var busType: BusType
  var busVersion: java.lang.String | scala.Null
  var description: java.lang.String
  var device: java.lang.String
  var devicePath: java.lang.String | scala.Null
  var enumerator: java.lang.String
  var error: js.Any
  var isCard: scala.Boolean | scala.Null
  var isReadOnly: scala.Boolean
  var isRemovable: scala.Boolean | scala.Null
  var isSCSI: scala.Boolean | scala.Null
  var isSystem: scala.Boolean
  var isUAS: scala.Boolean | scala.Null
  var isUSB: scala.Boolean | scala.Null
  var isVirtual: scala.Boolean | scala.Null
  var logicalBlockSize: scala.Double | scala.Null
  var mountpoints: js.Array[MountPoint]
  var raw: java.lang.String
   // can be null
  var size: scala.Double | scala.Null
}

object Drive {
  @scala.inline
  def apply(
    busType: BusType,
    description: java.lang.String,
    device: java.lang.String,
    enumerator: java.lang.String,
    error: js.Any,
    isReadOnly: scala.Boolean,
    isSystem: scala.Boolean,
    mountpoints: js.Array[MountPoint],
    raw: java.lang.String,
    blockSize: scala.Int | scala.Double = null,
    busVersion: java.lang.String = null,
    devicePath: java.lang.String = null,
    isCard: js.UndefOr[scala.Boolean] = js.undefined,
    isRemovable: js.UndefOr[scala.Boolean] = js.undefined,
    isSCSI: js.UndefOr[scala.Boolean] = js.undefined,
    isUAS: js.UndefOr[scala.Boolean] = js.undefined,
    isUSB: js.UndefOr[scala.Boolean] = js.undefined,
    isVirtual: js.UndefOr[scala.Boolean] = js.undefined,
    logicalBlockSize: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null
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

