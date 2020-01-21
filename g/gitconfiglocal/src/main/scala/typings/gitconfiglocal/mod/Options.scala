package typings.gitconfiglocal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var gitDir: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(gitDir: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (gitDir != null) __obj.updateDynamic("gitDir")(gitDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

