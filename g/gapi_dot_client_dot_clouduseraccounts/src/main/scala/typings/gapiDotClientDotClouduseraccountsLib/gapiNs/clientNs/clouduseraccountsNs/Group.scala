package typings
package gapiDotClientDotClouduseraccountsLib.gapiNs.clientNs.clouduseraccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** An optional textual description of the resource; provided by the client when the resource is created. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Unique identifier for the resource; defined by the server. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Type of the resource. Always clouduseraccounts#group for groups. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] A list of URLs to User resources who belong to the group. Users may only be members of groups in the same project. */
  var members: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Name of the resource; provided by the client when the resource is created. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Server defined URL for the resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
}

