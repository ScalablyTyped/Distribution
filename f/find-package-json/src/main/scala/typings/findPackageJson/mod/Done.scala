package typings.findPackageJson.mod

import typings.findPackageJson.findPackageJsonBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Done extends FindResult {
  var done: `true`
  var filename: js.UndefOr[scala.Nothing] = js.undefined
  var value: js.UndefOr[scala.Nothing] = js.undefined
}

object Done {
  @scala.inline
  def apply(done: `true`): Done = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any])
    __obj.asInstanceOf[Done]
  }
}

