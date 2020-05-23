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
    blockSize: Double = null.asInstanceOf[Double],
    busVersion: String = null,
    devicePath: String = null,
    isCard: Boolean = null.asInstanceOf[Boolean],
    isRemovable: Boolean = null.asInstanceOf[Boolean],
    isSCSI: Boolean = null.asInstanceOf[Boolean],
    isUAS: Boolean = null.asInstanceOf[Boolean],
    isUSB: Boolean = null.asInstanceOf[Boolean],
    isVirtual: Boolean = null.asInstanceOf[Boolean],
    logicalBlockSize: Double = null.asInstanceOf[Double],
    size: Double = null.asInstanceOf[Double]
  ): Drive = {
    val __obj = js.Dynamic.literal(busType = busType.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], enumerator = enumerator.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], isSystem = isSystem.asInstanceOf[js.Any], mountpoints = mountpoints.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], blockSize = blockSize.asInstanceOf[js.Any], busVersion = busVersion.asInstanceOf[js.Any], devicePath = devicePath.asInstanceOf[js.Any], isCard = isCard.asInstanceOf[js.Any], isRemovable = isRemovable.asInstanceOf[js.Any], isSCSI = isSCSI.asInstanceOf[js.Any], isUAS = isUAS.asInstanceOf[js.Any], isUSB = isUSB.asInstanceOf[js.Any], isVirtual = isVirtual.asInstanceOf[js.Any], logicalBlockSize = logicalBlockSize.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Drive]
  }
}

