package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotCompute.Anon_AltFields
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenOperationPrettyPrintProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneOperationsResource extends js.Object {
  /** Deletes the specified zone-specific Operations resource. */
  def delete(request: Anon_AltFieldsKeyOauthtokenOperationPrettyPrintProject): Request[Unit]
  /** Retrieves the specified zone-specific Operations resource. */
  def get(request: Anon_AltFieldsKeyOauthtokenOperationPrettyPrintProject): Request[Operation]
  /** Retrieves a list of Operation resources contained within the specified zone. */
  def list(request: Anon_AltFields): Request[OperationList]
}

object ZoneOperationsResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsKeyOauthtokenOperationPrettyPrintProject => Request[Unit],
    get: Anon_AltFieldsKeyOauthtokenOperationPrettyPrintProject => Request[Operation],
    list: Anon_AltFields => Request[OperationList]
  ): ZoneOperationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ZoneOperationsResource]
  }
}

