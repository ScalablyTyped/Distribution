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
    delete: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    files: FilesResource,
    get: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[Report]
    ],
    insert: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Report]
    ],
    list: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKeyMaxResultsOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ReportList]
    ],
    patch: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[Report]
    ],
    run: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProfileId, 
      gapiDotClientLib.gapiNs.clientNs.Request[File]
    ],
    update: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[Report]
    ]
  ): ReportsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compatibleFields")(compatibleFields)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("files")(files)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("run")(run)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[ReportsResource]
  }
}

