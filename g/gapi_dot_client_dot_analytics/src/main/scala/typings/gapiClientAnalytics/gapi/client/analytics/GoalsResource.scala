package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsGoalId
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsKeyMaxresultsOauthtoken
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoalsResource extends js.Object {
  /** Gets a goal to which the user has access. */
  def get(request: AnonAccountIdAltFieldsGoalId): Request_[Goal]
  /** Create a new goal. */
  def insert(request: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrint): Request_[Goal]
  /** Lists goals to which the user has access. */
  def list(request: AnonAccountIdAltFieldsKeyMaxresultsOauthtoken): Request_[Goals]
  /** Updates an existing goal. This method supports patch semantics. */
  def patch(request: AnonAccountIdAltFieldsGoalId): Request_[Goal]
  /** Updates an existing goal. */
  def update(request: AnonAccountIdAltFieldsGoalId): Request_[Goal]
}

object GoalsResource {
  @scala.inline
  def apply(
    get: AnonAccountIdAltFieldsGoalId => Request_[Goal],
    insert: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrint => Request_[Goal],
    list: AnonAccountIdAltFieldsKeyMaxresultsOauthtoken => Request_[Goals],
    patch: AnonAccountIdAltFieldsGoalId => Request_[Goal],
    update: AnonAccountIdAltFieldsGoalId => Request_[Goal]
  ): GoalsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[GoalsResource]
  }
}

