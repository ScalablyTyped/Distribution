package typings
package envDashToDashObjectLib.envDashToDashObjectMod.envNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var parsers: Parsers
}

object Options {
  @scala.inline
  def apply(parsers: Parsers): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parsers")(parsers)
    __obj.asInstanceOf[Options]
  }
}

