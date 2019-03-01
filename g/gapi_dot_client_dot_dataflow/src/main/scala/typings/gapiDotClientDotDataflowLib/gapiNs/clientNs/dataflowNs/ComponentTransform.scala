package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentTransform extends js.Object {
  /** Dataflow service generated name for this source. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * User name for the original user transform with which this transform is
    * most closely associated.
    */
  var originalTransform: js.UndefOr[java.lang.String] = js.undefined
  /** Human-readable name for this transform; may be user or system generated. */
  var userName: js.UndefOr[java.lang.String] = js.undefined
}

object ComponentTransform {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    originalTransform: java.lang.String = null,
    userName: java.lang.String = null
  ): ComponentTransform = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (originalTransform != null) __obj.updateDynamic("originalTransform")(originalTransform)
    if (userName != null) __obj.updateDynamic("userName")(userName)
    __obj.asInstanceOf[ComponentTransform]
  }
}

