package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersonMetadata extends js.Object {
  /**
    * True if the person resource has been deleted. Populated only for
    * [`connections.list`](/people/api/rest/v1/people.connections/list) requests
    * that include a sync token.
    */
  var deleted: js.UndefOr[scala.Boolean] = js.undefined
  /** Resource names of people linked to this resource. */
  var linkedPeopleResourceNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * &#42;&#42;DEPRECATED&#42;&#42; (Please use
    * `person.metadata.sources.profileMetadata.objectType` instead)
    *
    * The type of the person object.
    */
  var objectType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Any former resource names this person has had. Populated only for
    * [`connections.list`](/people/api/rest/v1/people.connections/list) requests
    * that include a sync token.
    *
    * The resource name may change when adding or removing fields that link a
    * contact and profile such as a verified email, verified phone number, or
    * profile URL.
    */
  var previousResourceNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The sources of data for the person. */
  var sources: js.UndefOr[js.Array[Source]] = js.undefined
}

