package typings
package gapiDotClientDotFitnessLib.gapiNs.clientNs.fitnessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SessionsResource extends js.Object {
  /** Deletes a session specified by the given session ID. */
  def delete(request: gapiDotClientDotFitnessLib.Anon_PrettyPrintCurrentTimeMillis): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Lists sessions previously created. */
  def list(request: gapiDotClientDotFitnessLib.Anon_StartTime): gapiDotClientLib.gapiNs.clientNs.Request[ListSessionsResponse]
  /** Updates or insert a given session. */
  def update(request: gapiDotClientDotFitnessLib.Anon_PrettyPrintCurrentTimeMillis): gapiDotClientLib.gapiNs.clientNs.Request[Session]
}

