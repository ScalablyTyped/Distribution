package typings.gapiClientLogging.gapi.client.logging

import typings.gapiClient.gapi.client.Request
import typings.gapiClientLogging.anon.Accesstoken
import typings.gapiClientLogging.anon.Alt
import typings.gapiClientLogging.anon.Bearertoken
import typings.gapiClientLogging.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExclusionsResource extends js.Object {
  /**
    * Creates a new exclusion in a specified parent resource. Only log entries belonging to that resource can be excluded. You can have up to 10 exclusions
    * in a resource.
    */
  def create(request: Accesstoken): Request[LogExclusion]
  /** Deletes an exclusion. */
  def delete(request: Alt): Request[js.Object]
  /** Gets the description of an exclusion. */
  def get(request: Alt): Request[LogExclusion]
  /** Lists all the exclusions in a parent resource. */
  def list(request: Bearertoken): Request[ListExclusionsResponse]
  /** Changes one or more properties of an existing exclusion. */
  def patch(request: Callback): Request[LogExclusion]
}

object ExclusionsResource {
  @scala.inline
  def apply(
    create: Accesstoken => Request[LogExclusion],
    delete: Alt => Request[js.Object],
    get: Alt => Request[LogExclusion],
    list: Bearertoken => Request[ListExclusionsResponse],
    patch: Callback => Request[LogExclusion]
  ): ExclusionsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
    __obj.asInstanceOf[ExclusionsResource]
  }
}

