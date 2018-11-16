package typings
package gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs.androidmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PoliciesResource extends js.Object {
  /** Deletes a policy. This operation is only permitted if no devices are currently referencing the policy. */
  def delete(request: gapiDotClientDotAndroidmanagementLib.Anon_Name): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Gets a policy. */
  def get(request: gapiDotClientDotAndroidmanagementLib.Anon_Name): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /** Lists policies for a given enterprise. */
  def list(request: gapiDotClientDotAndroidmanagementLib.Anon_ParentAccesstoken): gapiDotClientLib.gapiNs.clientNs.Request[ListPoliciesResponse]
  /** Updates or creates a policy. */
  def patch(request: gapiDotClientDotAndroidmanagementLib.Anon_NameAccesstokenPrettyPrintBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
}

