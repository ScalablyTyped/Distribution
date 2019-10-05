package typings.gapiDotClientDotCompute.gapi.client.compute

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrint
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestId
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutesResource extends js.Object {
  /** Deletes the specified Route resource. */
  def delete(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestId): Request[Operation]
  /** Returns the specified Route resource. Get a list of available routes by making a list() request. */
  def get(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRoute): Request[Route]
  /** Creates a Route resource in the specified project using the data included in the request. */
  def insert(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Operation]
  /** Retrieves the list of Route resources available to the specified project. */
  def list(request: Anon_Alt): Request[RouteList]
}

object RoutesResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestId => Request[Operation],
    get: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRoute => Request[Route],
    insert: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Operation],
    list: Anon_Alt => Request[RouteList]
  ): RoutesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[RoutesResource]
  }
}

