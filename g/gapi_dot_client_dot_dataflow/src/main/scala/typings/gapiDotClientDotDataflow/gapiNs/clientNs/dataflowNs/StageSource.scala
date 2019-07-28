package typings.gapiDotClientDotDataflow.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StageSource extends js.Object {
  /** Dataflow service generated name for this source. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * User name for the original user transform or collection with which this
    * source is most closely associated.
    */
  var originalTransformOrCollection: js.UndefOr[String] = js.undefined
  /** Size of the source, if measurable. */
  var sizeBytes: js.UndefOr[String] = js.undefined
  /** Human-readable name for this source; may be user or system generated. */
  var userName: js.UndefOr[String] = js.undefined
}

object StageSource {
  @scala.inline
  def apply(
    name: String = null,
    originalTransformOrCollection: String = null,
    sizeBytes: String = null,
    userName: String = null
  ): StageSource = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (originalTransformOrCollection != null) __obj.updateDynamic("originalTransformOrCollection")(originalTransformOrCollection)
    if (sizeBytes != null) __obj.updateDynamic("sizeBytes")(sizeBytes)
    if (userName != null) __obj.updateDynamic("userName")(userName)
    __obj.asInstanceOf[StageSource]
  }
}

