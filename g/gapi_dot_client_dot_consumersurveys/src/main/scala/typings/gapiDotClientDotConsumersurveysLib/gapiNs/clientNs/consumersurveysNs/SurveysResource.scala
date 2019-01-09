package typings
package gapiDotClientDotConsumersurveysLib.gapiNs.clientNs.consumersurveysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurveysResource extends js.Object {
  /** Removes a survey from view in all user GET requests. */
  def delete(request: gapiDotClientDotConsumersurveysLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[SurveysDeleteResponse]
  /** Retrieves information about the specified survey. */
  def get(request: gapiDotClientDotConsumersurveysLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Survey]
  /** Creates a survey. */
  def insert(request: gapiDotClientDotConsumersurveysLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Survey]
  /** Lists the surveys owned by the authenticated user. */
  def list(request: gapiDotClientDotConsumersurveysLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[SurveysListResponse]
  /** Begins running a survey. */
  def start(request: gapiDotClientDotConsumersurveysLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[SurveysStartResponse]
  /** Stops a running survey. */
  def stop(request: gapiDotClientDotConsumersurveysLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[SurveysStopResponse]
  /** Updates a survey. Currently the only property that can be updated is the owners property. */
  def update(request: gapiDotClientDotConsumersurveysLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Survey]
}

