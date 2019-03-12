package typings
package gapiDotClientDotSurveysLib.gapiNs.clientNs.surveysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurveysResource extends js.Object {
  /** Removes a survey from view in all user GET requests. */
  def delete(request: gapiDotClientDotSurveysLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[SurveysDeleteResponse]
  /** Retrieves information about the specified survey. */
  def get(request: gapiDotClientDotSurveysLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Survey]
  /** Creates a survey. */
  def insert(request: gapiDotClientDotSurveysLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Survey]
  /** Lists the surveys owned by the authenticated user. */
  def list(request: gapiDotClientDotSurveysLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[SurveysListResponse]
  /** Begins running a survey. */
  def start(request: gapiDotClientDotSurveysLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[SurveysStartResponse]
  /** Stops a running survey. */
  def stop(request: gapiDotClientDotSurveysLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[SurveysStopResponse]
  /** Updates a survey. Currently the only property that can be updated is the owners property. */
  def update(request: gapiDotClientDotSurveysLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Survey]
}

object SurveysResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotSurveysLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[SurveysDeleteResponse],
    get: gapiDotClientDotSurveysLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[Survey],
    insert: gapiDotClientDotSurveysLib.Anon_AltFieldsKeyOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[Survey],
    list: gapiDotClientDotSurveysLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[SurveysListResponse],
    start: gapiDotClientDotSurveysLib.Anon_AltFieldsKeyOauthtokenPrettyPrint => gapiDotClientLib.gapiNs.clientNs.Request[SurveysStartResponse],
    stop: gapiDotClientDotSurveysLib.Anon_AltFieldsKeyOauthtokenPrettyPrint => gapiDotClientLib.gapiNs.clientNs.Request[SurveysStopResponse],
    update: gapiDotClientDotSurveysLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[Survey]
  ): SurveysResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction1(stop), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[SurveysResource]
  }
}

