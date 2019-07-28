package typings.fileDashExists.fileDashExistsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var root: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(root: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[Options]
  }
}

