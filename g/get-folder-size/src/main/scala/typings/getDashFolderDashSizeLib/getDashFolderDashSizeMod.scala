package typings
package getDashFolderDashSizeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("get-folder-size", JSImport.Namespace)
@js.native
object getDashFolderDashSizeMod extends js.Object {
  def apply(
    folder: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* size */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def apply(
    folder: java.lang.String,
    regexIgnorePattern: stdLib.RegExp,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* size */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
}

