package typings
package gapiDotClientDotTaskqueueLib.gapiNs.clientNs.taskqueueNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tasks2 extends js.Object {
  /** The actual list of tasks currently active in the TaskQueue. */
  var items: js.UndefOr[js.Array[Task]] = js.undefined
  /** The kind of object returned, a list of tasks. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object Tasks2 {
  @scala.inline
  def apply(items: js.Array[Task] = null, kind: java.lang.String = null): Tasks2 = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[Tasks2]
  }
}

