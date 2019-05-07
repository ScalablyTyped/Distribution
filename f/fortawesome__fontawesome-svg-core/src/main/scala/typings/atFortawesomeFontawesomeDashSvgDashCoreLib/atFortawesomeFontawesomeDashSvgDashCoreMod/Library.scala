package typings
package atFortawesomeFontawesomeDashSvgDashCoreLib.atFortawesomeFontawesomeDashSvgDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Library extends js.Object {
  def add(definitions: IconDefinitionOrPack*): scala.Unit
  def reset(): scala.Unit
}

object Library {
  @scala.inline
  def apply(add: /* repeated */ IconDefinitionOrPack => scala.Unit, reset: () => scala.Unit): Library = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), reset = js.Any.fromFunction0(reset))
  
    __obj.asInstanceOf[Library]
  }
}

