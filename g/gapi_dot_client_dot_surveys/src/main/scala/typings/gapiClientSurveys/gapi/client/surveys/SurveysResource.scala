package typings.gapiClientSurveys.gapi.client.surveys

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientSurveys.AnonAltFields
import typings.gapiClientSurveys.AnonAltFieldsKey
import typings.gapiClientSurveys.AnonAltFieldsKeyOauthtoken
import typings.gapiClientSurveys.AnonAltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurveysResource extends js.Object {
  /** Removes a survey from view in all user GET requests. */
  def delete(request: AnonAltFieldsKey): Request_[SurveysDeleteResponse]
  /** Retrieves information about the specified survey. */
  def get(request: AnonAltFieldsKey): Request_[Survey]
  /** Creates a survey. */
  def insert(request: AnonAltFieldsKeyOauthtoken): Request_[Survey]
  /** Lists the surveys owned by the authenticated user. */
  def list(request: AnonAltFields): Request_[SurveysListResponse]
  /** Begins running a survey. */
  def start(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[SurveysStartResponse]
  /** Stops a running survey. */
  def stop(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[SurveysStopResponse]
  /** Updates a survey. Currently the only property that can be updated is the owners property. */
  def update(request: AnonAltFieldsKey): Request_[Survey]
}

object SurveysResource {
  @scala.inline
  def apply(
    delete: AnonAltFieldsKey => Request_[SurveysDeleteResponse],
    get: AnonAltFieldsKey => Request_[Survey],
    insert: AnonAltFieldsKeyOauthtoken => Request_[Survey],
    list: AnonAltFields => Request_[SurveysListResponse],
    start: AnonAltFieldsKeyOauthtokenPrettyPrint => Request_[SurveysStartResponse],
    stop: AnonAltFieldsKeyOauthtokenPrettyPrint => Request_[SurveysStopResponse],
    update: AnonAltFieldsKey => Request_[Survey]
  ): SurveysResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction1(stop), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[SurveysResource]
  }
}

