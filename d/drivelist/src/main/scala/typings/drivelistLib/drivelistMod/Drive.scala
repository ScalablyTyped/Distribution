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

