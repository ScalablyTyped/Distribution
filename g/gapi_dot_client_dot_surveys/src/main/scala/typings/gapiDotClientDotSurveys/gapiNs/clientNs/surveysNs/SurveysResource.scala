package typings.gapiDotClientDotSurveys.gapiNs.clientNs.surveysNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotSurveys.Anon_AltFields
import typings.gapiDotClientDotSurveys.Anon_AltFieldsKey
import typings.gapiDotClientDotSurveys.Anon_AltFieldsKeyOauthtoken
import typings.gapiDotClientDotSurveys.Anon_AltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurveysResource extends js.Object {
  /** Removes a survey from view in all user GET requests. */
  def delete(request: Anon_AltFieldsKey): Request[SurveysDeleteResponse]
  /** Retrieves information about the specified survey. */
  def get(request: Anon_AltFieldsKey): Request[Survey]
  /** Creates a survey. */
  def insert(request: Anon_AltFieldsKeyOauthtoken): Request[Survey]
  /** Lists the surveys owned by the authenticated user. */
  def list(request: Anon_AltFields): Request[SurveysListResponse]
  /** Begins running a survey. */
  def start(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[SurveysStartResponse]
  /** Stops a running survey. */
  def stop(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[SurveysStopResponse]
  /** Updates a survey. Currently the only property that can be updated is the owners property. */
  def update(request: Anon_AltFieldsKey): Request[Survey]
}

object SurveysResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsKey => Request[SurveysDeleteResponse],
    get: Anon_AltFieldsKey => Request[Survey],
    insert: Anon_AltFieldsKeyOauthtoken => Request[Survey],
    list: Anon_AltFields => Request[SurveysListResponse],
    start: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[SurveysStartResponse],
    stop: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[SurveysStopResponse],
    update: Anon_AltFieldsKey => Request[Survey]
  ): SurveysResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction1(stop), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[SurveysResource]
  }
}

