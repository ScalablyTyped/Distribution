package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s birthday. At least one of the `date` and `text` fields are
  * specified. The `date` and `text` fields typically represent the same date,
  * but are not guaranteed to.
  */
@js.native
trait Schema$Birthday extends js.Object {
  /**
    * The date of the birthday.
    */
  var date: js.UndefOr[Schema$Date] = js.native
  /**
    * Metadata about the birthday.
    */
  var metadata: js.UndefOr[Schema$FieldMetadata] = js.native
  /**
    * A free-form string representing the user&#39;s birthday.
    */
  var text: js.UndefOr[String] = js.native
}

object Schema$Birthday {
  @scala.inline
  def apply(date: Schema$Date = null, metadata: Schema$FieldMetadata = null, text: String = null): Schema$Birthday = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Birthday]
  }
}

