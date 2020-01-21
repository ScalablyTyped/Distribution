package typings.gapiClientLogging.gapi.client.logging

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientLogging.AnonAccesstoken
import typings.gapiClientLogging.AnonAccesstokenAlt
import typings.gapiClientLogging.AnonAccesstokenAltBearertoken
import typings.gapiClientLogging.AnonAccesstokenAltBearertokenCallback
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
  def delete(request: AnonAccesstokenAlt): Request_[js.Object]
  /** Gets the description of an exclusion. */
  def get(request: AnonAccesstokenAlt): Request_[LogExclusion]
  /** Lists all the exclusions in a parent resource. */
  def list(request: AnonAccesstokenAltBearertoken): Request_[ListExclusionsResponse]
  /** Changes one or more properties of an existing exclusion. */
  def patch(request: AnonAccesstokenAltBearertokenCallback): Request_[LogExclusion]
}

object ExclusionsResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => Request_[LogExclusion],
    delete: AnonAccesstokenAlt => Request_[js.Object],
    get: AnonAccesstokenAlt => Request_[LogExclusion],
    list: AnonAccesstokenAltBearertoken => Request_[ListExclusionsResponse],
    patch: AnonAccesstokenAltBearertokenCallback => Request_[LogExclusion]
  ): ExclusionsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
  
    __obj.asInstanceOf[ExclusionsResource]
  }
}

