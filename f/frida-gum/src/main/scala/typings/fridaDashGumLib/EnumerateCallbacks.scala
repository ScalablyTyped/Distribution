package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumerateCallbacks[T] extends js.Object {
  def onComplete(): scala.Unit
  def onMatch(item: T): scala.Unit | EnumerateAction
}

object EnumerateCallbacks {
  @scala.inline
  def apply[T](onComplete: () => scala.Unit, onMatch: T => scala.Unit | EnumerateAction): EnumerateCallbacks[T] = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onMatch = js.Any.fromFunction1(onMatch))
  
    __obj.asInstanceOf[EnumerateCallbacks[T]]
  }
}

