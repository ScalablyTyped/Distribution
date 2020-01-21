package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryScanCallbacks extends js.Object {
  /**
    * Called when there was a memory access error while scanning.
    *
    * @param reason Why the memory access failed.
    */
  var onError: js.UndefOr[js.Function1[/* reason */ String, Unit]] = js.undefined
  /**
    * Called when the memory range has been fully scanned.
    */
  def onComplete(): Unit
  /**
    * Called with each occurence that was found.
    *
    * @param address Memory address where a match was found.
    * @param size Size of this match.
    */
  def onMatch(address: NativePointer, size: Double): Unit | EnumerateAction
}

object MemoryScanCallbacks {
  @scala.inline
  def apply(
    onComplete: () => Unit,
    onMatch: (NativePointer, Double) => Unit | EnumerateAction,
    onError: /* reason */ String => Unit = null
  ): MemoryScanCallbacks = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onMatch = js.Any.fromFunction2(onMatch))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    __obj.asInstanceOf[MemoryScanCallbacks]
  }
}

