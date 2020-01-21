package typings.gapiClientSqladmin.gapi.client.sqladmin

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientSqladmin.AnonAltFieldsInstance
import typings.gapiClientSqladmin.AnonAltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /** Retrieves an instance operation that has been performed on an instance. */
  def get(request: AnonAltFieldsKeyOauthtoken): Request_[Operation]
  /** Lists all instance operations that have been performed on the given Cloud SQL instance in the reverse chronological order of the start time. */
  def list(request: AnonAltFieldsInstance): Request_[OperationsListResponse]
}

object OperationsResource {
  @scala.inline
  def apply(
    get: AnonAltFieldsKeyOauthtoken => Request_[Operation],
    list: AnonAltFieldsInstance => Request_[OperationsListResponse]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OperationsResource]
  }
}

