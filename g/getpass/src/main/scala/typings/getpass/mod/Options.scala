package typings.getpass.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var prompt: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(prompt: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

