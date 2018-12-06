package typings
package emptyDashDirLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("empty-dir", JSImport.Namespace)
@js.native
object emptyDashDirMod extends js.Object {
  def apply(
    dir: java.lang.String,
    cb: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* isEmpty */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def apply(
    dir: java.lang.String,
    filter: js.Function1[/* path */ java.lang.String, scala.Boolean],
    cb: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* isEmpty */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def sync(dir: java.lang.String): scala.Boolean = js.native
  def sync(dir: java.lang.String, filter: js.Function1[/* path */ java.lang.String, scala.Boolean]): scala.Boolean = js.native
}

