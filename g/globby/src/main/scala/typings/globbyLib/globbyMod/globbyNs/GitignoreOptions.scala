package typings
package globbyLib.globbyMod.globbyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitignoreOptions extends js.Object {
  val cwd: js.UndefOr[java.lang.String] = js.undefined
  val ignore: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object GitignoreOptions {
  @scala.inline
  def apply(cwd: java.lang.String = null, ignore: js.Array[java.lang.String] = null): GitignoreOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore)
    __obj.asInstanceOf[GitignoreOptions]
  }
}

