package typings
package elementDashReadyLib.elementDashReadyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  	The element that's expected to contain a match.
  	@default document
  	*/
  val target: js.UndefOr[stdLib.Element | stdLib.Document] = js.undefined
}

object Options {
  @scala.inline
  def apply(target: stdLib.Element | stdLib.Document = null): Options = {
    val __obj = js.Dynamic.literal()
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

