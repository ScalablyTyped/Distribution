package typings
package gapiDotClientDotClouderrorreportingLib.gapiNs.clientNs.clouderrorreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsResource extends js.Object {
  /** Get the specified group. */
  def get(request: gapiDotClientDotClouderrorreportingLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ErrorGroup]
  /**
    * Replace the data for the specified group.
    * Fails if the group does not exist.
    */
  def update(request: gapiDotClientDotClouderrorreportingLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[ErrorGroup]
}

object GroupsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotClouderrorreportingLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ErrorGroup]
    ],
    update: js.Function1[
      gapiDotClientDotClouderrorreportingLib.Anon_AccesstokenAltBearertokenCallback, 
      gapiDotClientLib.gapiNs.clientNs.Request[ErrorGroup]
    ]
  ): GroupsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[GroupsResource]
  }
}

