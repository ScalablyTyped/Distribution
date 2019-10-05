package typings.gapiDotClientDotAnalytics.gapi.client.analytics

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsGoalId
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKeyMaxresultsOauthtoken
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoalsResource extends js.Object {
  /** Gets a goal to which the user has access. */
  def get(request: Anon_AccountIdAltFieldsGoalId): Request[Goal]
  /** Create a new goal. */
  def insert(request: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint): Request[Goal]
  /** Lists goals to which the user has access. */
  def list(request: Anon_AccountIdAltFieldsKeyMaxresultsOauthtoken): Request[Goals]
  /** Updates an existing goal. This method supports patch semantics. */
  def patch(request: Anon_AccountIdAltFieldsGoalId): Request[Goal]
  /** Updates an existing goal. */
  def update(request: Anon_AccountIdAltFieldsGoalId): Request[Goal]
}

object GoalsResource {
  @scala.inline
  def apply(
    get: Anon_AccountIdAltFieldsGoalId => Request[Goal],
    insert: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint => Request[Goal],
    list: Anon_AccountIdAltFieldsKeyMaxresultsOauthtoken => Request[Goals],
    patch: Anon_AccountIdAltFieldsGoalId => Request[Goal],
    update: Anon_AccountIdAltFieldsGoalId => Request[Goal]
  ): GoalsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[GoalsResource]
  }
}

