package typings
package dirDashGlobLib.dirDashGlobMod.dirGlobNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var extensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var files: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cwd: java.lang.String = null,
    extensions: js.Array[java.lang.String] = null,
    files: js.Array[java.lang.String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (files != null) __obj.updateDynamic("files")(files)
    __obj.asInstanceOf[Options]
  }
}

