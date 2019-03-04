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
    findFocusable: js.Function1[js.Object, js.Object],
    handleKey: js.Function3[js.Any, js.Any, js.Any, scala.Unit],
    parseKey: js.Function1[js.Any, java.lang.String]
  ): Keyboard = {
    val __obj = js.Dynamic.literal(findFocusable = findFocusable, handleKey = handleKey, parseKey = parseKey)
  
    __obj.asInstanceOf[Keyboard]
  }
}

