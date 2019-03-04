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
    delete: js.Function1[
      gapiDotClientDotSurveysLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[SurveysDeleteResponse]
    ],
    get: js.Function1[
      gapiDotClientDotSurveysLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Survey]
    ],
    insert: js.Function1[
      gapiDotClientDotSurveysLib.Anon_AltFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Survey]
    ],
    list: js.Function1[
      gapiDotClientDotSurveysLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[SurveysListResponse]
    ],
    start: js.Function1[
      gapiDotClientDotSurveysLib.Anon_AltFieldsKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[SurveysStartResponse]
    ],
    stop: js.Function1[
      gapiDotClientDotSurveysLib.Anon_AltFieldsKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[SurveysStopResponse]
    ],
    update: js.Function1[
      gapiDotClientDotSurveysLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Survey]
    ]
  ): SurveysResource = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, insert = insert, list = list, start = start, stop = stop, update = update)
  
    __obj.asInstanceOf[SurveysResource]
  }
}

