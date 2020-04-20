package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAltFields
import typings.gapiClientCompute.AnonQuotaUserRoute
import typings.gapiClientCompute.AnonRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutesResource extends js.Object {
  /** Deletes the specified Route resource. */
  def delete(request: AnonRoute): Request_[Operation]
  /** Returns the specified Route resource. Get a list of available routes by making a list() request. */
  def get(request: AnonQuotaUserRoute): Request_[Route]
  /** Creates a Route resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation]
  /** Retrieves the list of Route resources available to the specified project. */
  def list(request: AnonAlt): Request_[RouteList]
}

object RoutesResource {
  @scala.inline
  def apply(
    delete: AnonRoute => Request_[Operation],
    get: AnonQuotaUserRoute => Request_[Route],
    insert: AnonAltFields => Request_[Operation],
    list: AnonAlt => Request_[RouteList]
  ): RoutesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[RoutesResource]
  }
}

