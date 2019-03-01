package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentSource extends js.Object {
  /** Dataflow service generated name for this source. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * User name for the original user transform or collection with which this
    * source is most closely associated.
    */
  var originalTransformOrCollection: js.UndefOr[java.lang.String] = js.undefined
  /** Human-readable name for this transform; may be user or system generated. */
  var userName: js.UndefOr[java.lang.String] = js.undefined
}

object ComponentSource {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    originalTransformOrCollection: java.lang.String = null,
    userName: java.lang.String = null
  ): ComponentSource = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (originalTransformOrCollection != null) __obj.updateDynamic("originalTransformOrCollection")(originalTransformOrCollection)
    if (userName != null) __obj.updateDynamic("userName")(userName)
    __obj.asInstanceOf[ComponentSource]
  }
}

