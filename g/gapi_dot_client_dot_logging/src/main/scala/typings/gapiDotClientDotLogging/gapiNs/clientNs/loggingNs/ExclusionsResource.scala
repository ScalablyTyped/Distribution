package typings.gapiDotClientDotLogging.gapiNs.clientNs.loggingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotLogging.Anon_Accesstoken
import typings.gapiDotClientDotLogging.Anon_AccesstokenAlt
import typings.gapiDotClientDotLogging.Anon_AccesstokenAltBearertoken
import typings.gapiDotClientDotLogging.Anon_AccesstokenAltBearertokenCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExclusionsResource extends js.Object {
  /**
    * Creates a new exclusion in a specified parent resource. Only log entries belonging to that resource can be excluded. You can have up to 10 exclusions
    * in a resource.
    */
  def create(request: Anon_Accesstoken): Request[LogExclusion]
  /** Deletes an exclusion. */
  def delete(request: Anon_AccesstokenAlt): Request[js.Object]
  /** Gets the description of an exclusion. */
  def get(request: Anon_AccesstokenAlt): Request[LogExclusion]
  /** Lists all the exclusions in a parent resource. */
  def list(request: Anon_AccesstokenAltBearertoken): Request[ListExclusionsResponse]
  /** Changes one or more properties of an existing exclusion. */
  def patch(request: Anon_AccesstokenAltBearertokenCallback): Request[LogExclusion]
}

object ExclusionsResource {
  @scala.inline
  def apply(
    create: Anon_Accesstoken => Request[LogExclusion],
    delete: Anon_AccesstokenAlt => Request[js.Object],
    get: Anon_AccesstokenAlt => Request[LogExclusion],
    list: Anon_AccesstokenAltBearertoken => Request[ListExclusionsResponse],
    patch: Anon_AccesstokenAltBearertokenCallback => Request[LogExclusion]
  ): ExclusionsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
  
    __obj.asInstanceOf[ExclusionsResource]
  }
}

