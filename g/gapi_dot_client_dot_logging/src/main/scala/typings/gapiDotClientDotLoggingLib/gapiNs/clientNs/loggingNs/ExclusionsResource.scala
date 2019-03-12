package typings
package gapiDotClientDotLoggingLib.gapiNs.clientNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExclusionsResource extends js.Object {
  /**
    * Creates a new exclusion in a specified parent resource. Only log entries belonging to that resource can be excluded. You can have up to 10 exclusions
    * in a resource.
    */
  def create(request: gapiDotClientDotLoggingLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[LogExclusion]
  /** Deletes an exclusion. */
  def delete(request: gapiDotClientDotLoggingLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Gets the description of an exclusion. */
  def get(request: gapiDotClientDotLoggingLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[LogExclusion]
  /** Lists all the exclusions in a parent resource. */
  def list(request: gapiDotClientDotLoggingLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ListExclusionsResponse]
  /** Changes one or more properties of an existing exclusion. */
  def patch(request: gapiDotClientDotLoggingLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[LogExclusion]
}

object ExclusionsResource {
  @scala.inline
  def apply(
    create: gapiDotClientDotLoggingLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[LogExclusion],
    delete: gapiDotClientDotLoggingLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[js.Object],
    get: gapiDotClientDotLoggingLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[LogExclusion],
    list: gapiDotClientDotLoggingLib.Anon_AccesstokenAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[ListExclusionsResponse],
    patch: gapiDotClientDotLoggingLib.Anon_AccesstokenAltBearertokenCallback => gapiDotClientLib.gapiNs.clientNs.Request[LogExclusion]
  ): ExclusionsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
  
    __obj.asInstanceOf[ExclusionsResource]
  }
}

