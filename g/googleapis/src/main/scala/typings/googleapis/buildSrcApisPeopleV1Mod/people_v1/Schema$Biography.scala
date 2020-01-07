package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s short biography.
  */
@js.native
trait Schema$Biography extends js.Object {
  /**
    * The content type of the biography.
    */
  var contentType: js.UndefOr[String] = js.native
  /**
    * Metadata about the biography.
    */
  var metadata: js.UndefOr[Schema$FieldMetadata] = js.native
  /**
    * The short biography.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$Biography {
  @scala.inline
  def apply(contentType: String = null, metadata: Schema$FieldMetadata = null, value: String = null): Schema$Biography = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Biography]
  }
}

