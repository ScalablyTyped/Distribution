package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /** Retrieves an instance operation that has been performed on an instance. */
  def get(request: gapiDotClientDotSqladminLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Lists all instance operations that have been performed on the given Cloud SQL instance in the reverse chronological order of the start time. */
  def list(request: gapiDotClientDotSqladminLib.Anon_AltFieldsInstance): gapiDotClientLib.gapiNs.clientNs.Request[OperationsListResponse]
}

object OperationsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotSqladminLib.Anon_AltFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    list: js.Function1[
      gapiDotClientDotSqladminLib.Anon_AltFieldsInstance, 
      gapiDotClientLib.gapiNs.clientNs.Request[OperationsListResponse]
    ]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[OperationsResource]
  }
}

