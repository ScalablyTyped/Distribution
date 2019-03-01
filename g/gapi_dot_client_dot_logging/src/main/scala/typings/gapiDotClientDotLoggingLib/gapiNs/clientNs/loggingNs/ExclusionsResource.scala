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
    create: js.Function1[
      gapiDotClientDotLoggingLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[LogExclusion]
    ],
    delete: js.Function1[
      gapiDotClientDotLoggingLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    get: js.Function1[
      gapiDotClientDotLoggingLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[LogExclusion]
    ],
    list: js.Function1[
      gapiDotClientDotLoggingLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListExclusionsResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotLoggingLib.Anon_AccesstokenAltBearertokenCallback, 
      gapiDotClientLib.gapiNs.clientNs.Request[LogExclusion]
    ]
  ): ExclusionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("patch")(patch)
    __obj.asInstanceOf[ExclusionsResource]
  }
}

