package typings
package fileDashExistsLib.fileDashExistsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("file-exists", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(filepath: java.lang.String): scala.Unit = js.native
  def apply(
    filepath: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* exists */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def apply(filepath: java.lang.String, options: Options): scala.Unit = js.native
  def apply(
    filepath: java.lang.String,
    options: Options,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* exists */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def sync(filepath: java.lang.String): scala.Boolean = js.native
  def sync(filepath: java.lang.String, options: Options): scala.Boolean = js.native
}

