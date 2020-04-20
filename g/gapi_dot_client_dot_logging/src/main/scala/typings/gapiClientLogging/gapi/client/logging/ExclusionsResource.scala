package typings.gapiClientLogging.gapi.client.logging

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientLogging.AnonAccesstoken
import typings.gapiClientLogging.AnonAlt
import typings.gapiClientLogging.AnonBearertoken
import typings.gapiClientLogging.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExclusionsResource extends js.Object {
  /**
    * Creates a new exclusion in a specified parent resource. Only log entries belonging to that resource can be excluded. You can have up to 10 exclusions
    * in a resource.
    */
  def create(request: AnonAccesstoken): Request_[LogExclusion]
  /** Deletes an exclusion. */
  def delete(request: AnonAlt): Request_[js.Object]
  /** Gets the description of an exclusion. */
  def get(request: AnonAlt): Request_[LogExclusion]
  /** Lists all the exclusions in a parent resource. */
  def list(request: AnonBearertoken): Request_[ListExclusionsResponse]
  /** Changes one or more properties of an existing exclusion. */
  def patch(request: AnonCallback): Request_[LogExclusion]
}

object ExclusionsResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => Request_[LogExclusion],
    delete: AnonAlt => Request_[js.Object],
    get: AnonAlt => Request_[LogExclusion],
    list: AnonBearertoken => Request_[ListExclusionsResponse],
    patch: AnonCallback => Request_[LogExclusion]
  ): ExclusionsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
    __obj.asInstanceOf[ExclusionsResource]
  }
}

