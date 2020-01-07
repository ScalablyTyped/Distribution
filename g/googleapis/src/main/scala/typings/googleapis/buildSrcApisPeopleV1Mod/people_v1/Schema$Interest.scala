package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One of the person&#39;s interests.
  */
@js.native
trait Schema$Interest extends js.Object {
  /**
    * Metadata about the interest.
    */
  var metadata: js.UndefOr[Schema$FieldMetadata] = js.native
  /**
    * The interest; for example, `stargazing`.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$Interest {
  @scala.inline
  def apply(metadata: Schema$FieldMetadata = null, value: String = null): Schema$Interest = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Interest]
  }
}

