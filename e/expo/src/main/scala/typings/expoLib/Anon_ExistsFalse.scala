package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExistsFalse
  extends expoLib.expoMod.FileSystemNs.FileInfo {
  var exists: expoLib.expoLibNumbers.`false`
  var isDirectory: expoLib.expoLibNumbers.`false`
}

object Anon_ExistsFalse {
  @scala.inline
  def apply(exists: expoLib.expoLibNumbers.`false`, isDirectory: expoLib.expoLibNumbers.`false`): Anon_ExistsFalse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exists")(exists)
    __obj.updateDynamic("isDirectory")(isDirectory)
    __obj.asInstanceOf[Anon_ExistsFalse]
  }
}

