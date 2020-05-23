package typings.gapiClientSurveys.gapi.client.surveys

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSurveys.anon.Fields
import typings.gapiClientSurveys.anon.Key
import typings.gapiClientSurveys.anon.Oauthtoken
import typings.gapiClientSurveys.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurveysResource extends js.Object {
  /** Removes a survey from view in all user GET requests. */
  def delete(request: Key): Request[SurveysDeleteResponse]
  /** Retrieves information about the specified survey. */
  def get(request: Key): Request[Survey]
  /** Creates a survey. */
  def insert(request: Oauthtoken): Request[Survey]
  /** Lists the surveys owned by the authenticated user. */
  def list(request: Fields): Request[SurveysListResponse]
  /** Begins running a survey. */
  def start(request: PrettyPrint): Request[SurveysStartResponse]
  /** Stops a running survey. */
  def stop(request: PrettyPrint): Request[SurveysStopResponse]
  /** Updates a survey. Currently the only property that can be updated is the owners property. */
  def update(request: Key): Request[Survey]
}

object SurveysResource {
  @scala.inline
  def apply(
    delete: Key => Request[SurveysDeleteResponse],
    get: Key => Request[Survey],
    insert: Oauthtoken => Request[Survey],
    list: Fields => Request[SurveysListResponse],
    start: PrettyPrint => Request[SurveysStartResponse],
    stop: PrettyPrint => Request[SurveysStopResponse],
    update: Key => Request[Survey]
  ): SurveysResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction1(stop), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[SurveysResource]
  }
}

