package typings.gapiDotClientDotPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nickname extends js.Object {
  /** Metadata about the nickname. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /** The type of the nickname. */
  var `type`: js.UndefOr[String] = js.undefined
  /** The nickname. */
  var value: js.UndefOr[String] = js.undefined
}

object Nickname {
  @scala.inline
  def apply(metadata: FieldMetadata = null, `type`: String = null, value: String = null): Nickname = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Nickname]
  }
}

