package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Relation extends js.Object {
  /**
    * The type of the relation translated and formatted in the viewer's account
    * locale or the locale specified in the Accept-Language HTTP header.
    */
  var formattedType: js.UndefOr[java.lang.String] = js.undefined
  /** Metadata about the relation. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /** The name of the other person this relation refers to. */
  var person: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The person's relation to the other person. The type can be custom or predefined.
    * Possible values include, but are not limited to, the following values:
    *
    * &#42; `spouse`
    * &#42; `child`
    * &#42; `mother`
    * &#42; `father`
    * &#42; `parent`
    * &#42; `brother`
    * &#42; `sister`
    * &#42; `friend`
    * &#42; `relative`
    * &#42; `domesticPartner`
    * &#42; `manager`
    * &#42; `assistant`
    * &#42; `referredBy`
    * &#42; `partner`
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

