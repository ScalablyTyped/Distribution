package typings.fridaGum.Java

import typings.fridaGum.EnumerateAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseCallbacks extends js.Object {
  /**
    * Called when all instances have been enumerated.
    */
  def onComplete(): Unit
  /**
    * Called with each live instance found with a ready-to-use `instance`
    * just as if you would have called `Java.cast()` with a raw handle to
    * this particular instance.
    *
    * May return `EnumerateAction.Stop` to stop the enumeration early.
    */
  def onMatch(instance: typings.fridaGum.anon.Wrapper): Unit | EnumerateAction
}

object ChooseCallbacks {
  @scala.inline
  def apply(onComplete: () => Unit, onMatch: typings.fridaGum.anon.Wrapper => Unit | EnumerateAction): ChooseCallbacks = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onMatch = js.Any.fromFunction1(onMatch))
    __obj.asInstanceOf[ChooseCallbacks]
  }
}

