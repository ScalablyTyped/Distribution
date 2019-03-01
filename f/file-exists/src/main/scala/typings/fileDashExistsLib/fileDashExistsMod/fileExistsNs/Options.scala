package typings
package fileDashExistsLib.fileDashExistsMod.fileExistsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var root: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(root: java.lang.String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[Options]
  }
}

