package typings.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  /** The date of the event. */
  var date: js.UndefOr[Date] = js.undefined
  /**
    * Output only. The type of the event translated and formatted in the
    * viewer's account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[String] = js.undefined
  /** Metadata about the event. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /**
    * The type of the event. The type can be custom or one of these predefined
    * values:
    *
    * &#42; `anniversary`
    * &#42; `other`
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object Event {
  @scala.inline
  def apply(
    date: Date = null,
    formattedType: String = null,
    metadata: FieldMetadata = null,
    `type`: String = null
  ): Event = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (formattedType != null) __obj.updateDynamic("formattedType")(formattedType.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

