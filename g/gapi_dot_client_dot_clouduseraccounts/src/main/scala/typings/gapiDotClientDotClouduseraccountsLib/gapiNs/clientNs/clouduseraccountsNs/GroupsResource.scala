package typings
package gapiDotClientDotClouduseraccountsLib.gapiNs.clientNs.clouduseraccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsResource extends js.Object {
  /** Adds users to the specified group. */
  def addMember(request: gapiDotClientDotClouduseraccountsLib.Anon_ProjectPrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Deletes the specified Group resource. */
  def delete(request: gapiDotClientDotClouduseraccountsLib.Anon_ProjectPrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified Group resource. */
  def get(request: gapiDotClientDotClouduseraccountsLib.Anon_ProjectPrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[Group]
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(request: gapiDotClientDotClouduseraccountsLib.Anon_ProjectPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /** Creates a Group resource in the specified project using the data included in the request. */
  def insert(request: gapiDotClientDotClouduseraccountsLib.Anon_ProjectPrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves the list of groups contained within the specified project. */
  def list(request: gapiDotClientDotClouduseraccountsLib.Anon_ProjectMaxResults): gapiDotClientLib.gapiNs.clientNs.Request[GroupList]
  /** Removes users from the specified group. */
  def removeMember(request: gapiDotClientDotClouduseraccountsLib.Anon_ProjectPrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: gapiDotClientDotClouduseraccountsLib.Anon_ProjectPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: gapiDotClientDotClouduseraccountsLib.Anon_ProjectPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[TestPermissionsResponse]
}

