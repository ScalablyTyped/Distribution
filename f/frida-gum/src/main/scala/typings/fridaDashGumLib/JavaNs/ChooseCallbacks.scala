package typings
package fridaDashGumLib.JavaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseCallbacks extends js.Object {
  /**
    * Called when all instances have been enumerated.
    */
  def onComplete(): scala.Unit
  /**
    * Called with each live instance found with a ready-to-use `instance`
    * just as if you would have called `Java.cast()` with a raw handle to
    * this particular instance.
    *
    * May return `EnumerateAction.Stop` to stop the enumeration early.
    */
  def onMatch(instance: Wrapper): scala.Unit | fridaDashGumLib.EnumerateAction
}

object ChooseCallbacks {
  @scala.inline
  def apply(onComplete: () => scala.Unit, onMatch: Wrapper => scala.Unit | fridaDashGumLib.EnumerateAction): ChooseCallbacks = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onMatch = js.Any.fromFunction1(onMatch))
  
    __obj.asInstanceOf[ChooseCallbacks]
  }
}

