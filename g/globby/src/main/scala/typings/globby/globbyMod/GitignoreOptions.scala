package typings.globby.globbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitignoreOptions extends js.Object {
  val cwd: js.UndefOr[String] = js.undefined
  val ignore: js.UndefOr[js.Array[String]] = js.undefined
}

object GitignoreOptions {
  @scala.inline
  def apply(cwd: String = null, ignore: js.Array[String] = null): GitignoreOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitignoreOptions]
  }
}

