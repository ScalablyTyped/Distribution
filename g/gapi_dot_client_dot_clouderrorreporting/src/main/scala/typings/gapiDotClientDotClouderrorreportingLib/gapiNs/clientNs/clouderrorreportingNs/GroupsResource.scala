package typings
package gapiDotClientDotClouderrorreportingLib.gapiNs.clientNs.clouderrorreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GroupsResource extends js.Object {
  /** Get the specified group. */
  def get(request: gapiDotClientDotClouderrorreportingLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[ErrorGroup]
  /**
               * Replace the data for the specified group.
               * Fails if the group does not exist.
               */
  def update(request: gapiDotClientDotClouderrorreportingLib.Anon_Name): gapiDotClientLib.gapiNs.clientNs.Request[ErrorGroup]
}

