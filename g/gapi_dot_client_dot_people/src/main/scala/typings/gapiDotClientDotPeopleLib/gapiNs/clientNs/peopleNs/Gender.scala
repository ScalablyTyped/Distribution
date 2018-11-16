package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Gender extends js.Object {
  /**
               * The read-only value of the gender translated and formatted in the viewer's
               * account locale or the `Accept-Language` HTTP header locale.
               */
  var formattedValue: js.UndefOr[java.lang.String] = js.undefined
  /** Metadata about the gender. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /**
               * The gender for the person. The gender can be custom or predefined.
               * Possible values include, but are not limited to, the
               * following:
               *
               * &#42; `male`
               * &#42; `female`
               * &#42; `other`
               * &#42; `unknown`
               */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

