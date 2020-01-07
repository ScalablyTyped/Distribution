package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A read-only brief one-line description of the person.
  */
@js.native
trait Schema$Tagline extends js.Object {
  /**
    * Metadata about the tagline.
    */
  var metadata: js.UndefOr[Schema$FieldMetadata] = js.native
  /**
    * The tagline.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$Tagline {
  @scala.inline
  def apply(metadata: Schema$FieldMetadata = null, value: String = null): Schema$Tagline = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Tagline]
  }
}

