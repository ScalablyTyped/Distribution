package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ProfilesResource extends js.Object {
  /** Deletes a view (profile). */
  def delete(request: gapiDotClientDotAnalyticsLib.Anon_ProfileId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a view (profile) to which the user has access. */
  def get(request: gapiDotClientDotAnalyticsLib.Anon_ProfileId): gapiDotClientLib.gapiNs.clientNs.Request[Profile]
  /** Create a new view (profile). */
  def insert(request: gapiDotClientDotAnalyticsLib.Anon_PrettyPrintAccountId): gapiDotClientLib.gapiNs.clientNs.Request[Profile]
  /** Lists views (profiles) to which the user has access. */
  def list(request: gapiDotClientDotAnalyticsLib.Anon_MaxresultsStartindex): gapiDotClientLib.gapiNs.clientNs.Request[Profiles]
  /** Updates an existing view (profile). This method supports patch semantics. */
  def patch(request: gapiDotClientDotAnalyticsLib.Anon_ProfileId): gapiDotClientLib.gapiNs.clientNs.Request[Profile]
  /** Updates an existing view (profile). */
  def update(request: gapiDotClientDotAnalyticsLib.Anon_ProfileId): gapiDotClientLib.gapiNs.clientNs.Request[Profile]
}

