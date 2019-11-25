package typings.gapiDotClientDotPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BraggingRights extends js.Object {
  /** Metadata about the bragging rights. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /** The bragging rights; for example, `climbed mount everest`. */
  var value: js.UndefOr[String] = js.undefined
}

object BraggingRights {
  @scala.inline
  def apply(metadata: FieldMetadata = null, value: String = null): BraggingRights = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BraggingRights]
  }
}

