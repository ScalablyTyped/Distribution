package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

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
  var formattedType: js.UndefOr[java.lang.String] = js.undefined
  /** Metadata about the event. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /**
    * The type of the event. The type can be custom or predefined.
    * Possible values include, but are not limited to, the following:
    *
    * &#42; `anniversary`
    * &#42; `other`
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

