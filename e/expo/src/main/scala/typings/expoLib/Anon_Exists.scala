package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Exists
  extends expoLib.expoMod.FileSystemNs.FileInfo {
  var exists: expoLib.expoLibNumbers.`true`
  var isDirectory: scala.Boolean
  var md5: js.UndefOr[expoLib.expoMod.Md5] = js.undefined
  var modificationTime: scala.Double
  var size: scala.Double
  var uri: java.lang.String
}

object Anon_Exists {
  @scala.inline
  def apply(
    exists: expoLib.expoLibNumbers.`true`,
    isDirectory: scala.Boolean,
    modificationTime: scala.Double,
    size: scala.Double,
    uri: java.lang.String,
    md5: expoLib.expoMod.Md5 = null
  ): Anon_Exists = {
    val __obj = js.Dynamic.literal(exists = exists, isDirectory = isDirectory, modificationTime = modificationTime, size = size, uri = uri)
    if (md5 != null) __obj.updateDynamic("md5")(md5)
    __obj.asInstanceOf[Anon_Exists]
  }
}

