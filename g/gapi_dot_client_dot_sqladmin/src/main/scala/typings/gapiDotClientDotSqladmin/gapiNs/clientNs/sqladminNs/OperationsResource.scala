package typings.gapiDotClientDotSqladmin.gapiNs.clientNs.sqladminNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotSqladmin.Anon_AltFieldsInstance
import typings.gapiDotClientDotSqladmin.Anon_AltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /** Retrieves an instance operation that has been performed on an instance. */
  def get(request: Anon_AltFieldsKeyOauthtoken): Request[Operation]
  /** Lists all instance operations that have been performed on the given Cloud SQL instance in the reverse chronological order of the start time. */
  def list(request: Anon_AltFieldsInstance): Request[OperationsListResponse]
}

object OperationsResource {
  @scala.inline
  def apply(
    get: Anon_AltFieldsKeyOauthtoken => Request[Operation],
    list: Anon_AltFieldsInstance => Request[OperationsListResponse]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OperationsResource]
  }
}

