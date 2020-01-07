package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s occupation.
  */
@js.native
trait Schema$Occupation extends js.Object {
  /**
    * Metadata about the occupation.
    */
  var metadata: js.UndefOr[Schema$FieldMetadata] = js.native
  /**
    * The occupation; for example, `carpenter`.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$Occupation {
  @scala.inline
  def apply(metadata: Schema$FieldMetadata = null, value: String = null): Schema$Occupation = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Occupation]
  }
}

