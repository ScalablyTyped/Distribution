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

object GoalsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsGoalId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Goal]
    ],
    insert: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[Goal]
    ],
    list: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyMaxresultsOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Goals]
    ],
    patch: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsGoalId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Goal]
    ],
    update: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsGoalId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Goal]
    ]
  ): GoalsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[GoalsResource]
  }
}

