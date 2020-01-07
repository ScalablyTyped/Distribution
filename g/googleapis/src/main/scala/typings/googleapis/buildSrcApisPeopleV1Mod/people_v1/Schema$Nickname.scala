package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s nickname.
  */
@js.native
trait Schema$Nickname extends js.Object {
  /**
    * Metadata about the nickname.
    */
  var metadata: js.UndefOr[Schema$FieldMetadata] = js.native
  /**
    * The type of the nickname.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The nickname.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$Nickname {
  @scala.inline
  def apply(metadata: Schema$FieldMetadata = null, `type`: String = null, value: String = null): Schema$Nickname = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Nickname]
  }
}

