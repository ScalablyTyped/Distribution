package typings.gapiClientSurveys.gapi.client.surveys

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientSurveys.AnonFields
import typings.gapiClientSurveys.AnonKey
import typings.gapiClientSurveys.AnonOauthtoken
import typings.gapiClientSurveys.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurveysResource extends js.Object {
  /** Removes a survey from view in all user GET requests. */
  def delete(request: AnonKey): Request_[SurveysDeleteResponse]
  /** Retrieves information about the specified survey. */
  def get(request: AnonKey): Request_[Survey]
  /** Creates a survey. */
  def insert(request: AnonOauthtoken): Request_[Survey]
  /** Lists the surveys owned by the authenticated user. */
  def list(request: AnonFields): Request_[SurveysListResponse]
  /** Begins running a survey. */
  def start(request: AnonPrettyPrint): Request_[SurveysStartResponse]
  /** Stops a running survey. */
  def stop(request: AnonPrettyPrint): Request_[SurveysStopResponse]
  /** Updates a survey. Currently the only property that can be updated is the owners property. */
  def update(request: AnonKey): Request_[Survey]
}

object SurveysResource {
  @scala.inline
  def apply(
    delete: AnonKey => Request_[SurveysDeleteResponse],
    get: AnonKey => Request_[Survey],
    insert: AnonOauthtoken => Request_[Survey],
    list: AnonFields => Request_[SurveysListResponse],
    start: AnonPrettyPrint => Request_[SurveysStartResponse],
    stop: AnonPrettyPrint => Request_[SurveysStopResponse],
    update: AnonKey => Request_[Survey]
  ): SurveysResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction1(stop), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[SurveysResource]
  }
}

