package typings.gapiDotClientDotPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  /** The date of the event. */
  var date: js.UndefOr[Date] = js.undefined
  /**
    * The read-only type of the event translated and formatted in the
    * viewer's account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[String] = js.undefined
  /** Metadata about the event. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /**
    * The type of the event. The type can be custom or predefined.
    * Possible values include, but are not limited to, the following:
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
    if (date != null) __obj.updateDynamic("date")(date)
    if (formattedType != null) __obj.updateDynamic("formattedType")(formattedType)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Event]
  }
}

