package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoalsResource extends js.Object {
  /** Gets a goal to which the user has access. */
  def get(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsGoalId): gapiDotClientLib.gapiNs.clientNs.Request[Goal]
  /** Create a new goal. */
  def insert(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Goal]
  /** Lists goals to which the user has access. */
  def list(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyMaxresultsOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Goals]
  /** Updates an existing goal. This method supports patch semantics. */
  def patch(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsGoalId): gapiDotClientLib.gapiNs.clientNs.Request[Goal]
  /** Updates an existing goal. */
  def update(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsGoalId): gapiDotClientLib.gapiNs.clientNs.Request[Goal]
}

