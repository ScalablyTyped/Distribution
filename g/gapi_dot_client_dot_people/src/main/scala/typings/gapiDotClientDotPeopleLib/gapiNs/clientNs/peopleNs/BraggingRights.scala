package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BraggingRights extends js.Object {
  /** Metadata about the bragging rights. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /** The bragging rights; for example, `climbed mount everest`. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object BraggingRights {
  @scala.inline
  def apply(metadata: FieldMetadata = null, value: java.lang.String = null): BraggingRights = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[BraggingRights]
  }
}

