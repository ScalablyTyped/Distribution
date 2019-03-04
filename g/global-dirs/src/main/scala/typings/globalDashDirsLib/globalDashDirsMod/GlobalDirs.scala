package typings
package globalDashDirsLib.globalDashDirsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalDirs extends js.Object {
  var binaries: java.lang.String
  var packages: java.lang.String
  var prefix: java.lang.String
}

object GlobalDirs {
  @scala.inline
  def apply(binaries: java.lang.String, packages: java.lang.String, prefix: java.lang.String): GlobalDirs = {
    val __obj = js.Dynamic.literal(binaries = binaries, packages = packages, prefix = prefix)
  
    __obj.asInstanceOf[GlobalDirs]
  }
}

