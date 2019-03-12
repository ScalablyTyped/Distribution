package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  var compatibleFields: CompatibleFieldsResource
  var files: FilesResource
  /** Deletes a report by its ID. */
  def delete(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves a report by its ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Report]
  /** Creates a report. */
  def insert(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Report]
  /** Retrieves list of reports. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKeyMaxResultsOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[ReportList]
  /** Updates a report. This method supports patch semantics. */
  def patch(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Report]
  /** Runs a report. */
  def run(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProfileId): gapiDotClientLib.gapiNs.clientNs.Request[File]
  /** Updates a report. */
  def update(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Report]
}

object ReportsResource {
  @scala.inline
  def apply(
    compatibleFields: CompatibleFieldsResource,
    delete: gapiDotClientDotDfareportingLib.Anon_AltFieldsKeyOauthtokenPrettyPrint => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    files: FilesResource,
    get: gapiDotClientDotDfareportingLib.Anon_AltFieldsKeyOauthtokenPrettyPrint => gapiDotClientLib.gapiNs.clientNs.Request[Report],
    insert: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[Report],
    list: gapiDotClientDotDfareportingLib.Anon_AltFieldsKeyMaxResultsOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[ReportList],
    patch: gapiDotClientDotDfareportingLib.Anon_AltFieldsKeyOauthtokenPrettyPrint => gapiDotClientLib.gapiNs.clientNs.Request[Report],
    run: gapiDotClientDotDfareportingLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProfileId => gapiDotClientLib.gapiNs.clientNs.Request[File],
    update: gapiDotClientDotDfareportingLib.Anon_AltFieldsKeyOauthtokenPrettyPrint => gapiDotClientLib.gapiNs.clientNs.Request[Report]
  ): ReportsResource = {
    val __obj = js.Dynamic.literal(compatibleFields = compatibleFields, delete = js.Any.fromFunction1(delete), files = files, get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), run = js.Any.fromFunction1(run), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ReportsResource]
  }
}

