package typings
package gapiDotClientDotPlusdomainsLib.gapiNs.clientNs.plusdomainsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ActivitiesResource extends js.Object {
  /** Get an activity. */
  def get(request: gapiDotClientDotPlusdomainsLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Activity]
  /** Create a new activity for the authenticated user. */
  def insert(request: gapiDotClientDotPlusdomainsLib.Anon_PrettyPrintPreview): gapiDotClientLib.gapiNs.clientNs.Request[Activity]
  /** List all of the activities in the specified collection for a particular user. */
  def list(request: gapiDotClientDotPlusdomainsLib.Anon_CollectionMaxResultsPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ActivityFeed]
}

