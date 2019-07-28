package typings.emptyDashDir

import typings.node.NodeJSNs.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("empty-dir", JSImport.Namespace)
@js.native
object emptyDashDirMod extends js.Object {
  def apply(dir: String): js.Promise[Boolean] = js.native
  def apply(dir: String, cb: js.Function2[/* err */ ErrnoException, /* isEmpty */ Boolean, Unit]): Unit = js.native
  def apply(dir: String, filter: js.Function1[/* path */ String, Boolean]): js.Promise[Boolean] = js.native
  def apply(
    dir: String,
    filter: js.Function1[/* path */ String, Boolean],
    cb: js.Function2[/* err */ ErrnoException, /* isEmpty */ Boolean, Unit]
  ): Unit = js.native
  def sync(dir: String): Boolean = js.native
  def sync(dir: String, filter: js.Function1[/* path */ String, Boolean]): Boolean = js.native
}

