package typings
package atEmotionStylisLib.atEmotionStylisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var prefix: js.UndefOr[Prefix] = js.undefined
}

object Options {
  @scala.inline
  def apply(prefix: Prefix = null): Options = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

