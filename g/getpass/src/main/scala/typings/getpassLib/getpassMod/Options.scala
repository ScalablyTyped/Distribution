package typings
package getpassLib.getpassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var prompt: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(prompt: java.lang.String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    __obj.asInstanceOf[Options]
  }
}

