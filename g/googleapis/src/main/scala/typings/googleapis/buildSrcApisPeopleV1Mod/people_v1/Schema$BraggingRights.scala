package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s bragging rights.
  */
@js.native
trait Schema$BraggingRights extends js.Object {
  /**
    * Metadata about the bragging rights.
    */
  var metadata: js.UndefOr[Schema$FieldMetadata] = js.native
  /**
    * The bragging rights; for example, `climbed mount everest`.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$BraggingRights {
  @scala.inline
  def apply(metadata: Schema$FieldMetadata = null, value: String = null): Schema$BraggingRights = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BraggingRights]
  }
}

