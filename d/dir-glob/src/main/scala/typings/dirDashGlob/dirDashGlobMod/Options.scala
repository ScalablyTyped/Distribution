package typings.dirDashGlob.dirDashGlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cwd: js.UndefOr[String] = js.undefined
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  var files: js.UndefOr[js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(cwd: String = null, extensions: js.Array[String] = null, files: js.Array[String] = null): Options = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

