package typings
package gitconfiglocalLib.gitconfiglocalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var gitDir: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(gitDir: java.lang.String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (gitDir != null) __obj.updateDynamic("gitDir")(gitDir)
    __obj.asInstanceOf[Options]
  }
}

