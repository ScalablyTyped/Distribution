package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keyboard extends js.Object {
  def findFocusable($element: js.Object): js.Object
  def handleKey(event: js.Any, component: js.Any, functions: js.Any): scala.Unit
  def parseKey(event: js.Any): java.lang.String
}

object Keyboard {
  @scala.inline
  def apply(
    findFocusable: js.Object => js.Object,
    handleKey: (js.Any, js.Any, js.Any) => scala.Unit,
    parseKey: js.Any => java.lang.String
  ): Keyboard = {
    val __obj = js.Dynamic.literal(findFocusable = js.Any.fromFunction1(findFocusable), handleKey = js.Any.fromFunction3(handleKey), parseKey = js.Any.fromFunction1(parseKey))
  
    __obj.asInstanceOf[Keyboard]
  }
}

