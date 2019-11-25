package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKeyMaxResultsOauthtoken
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKeyOauthtokenPrettyPrint
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKeyOauthtokenPrettyPrintProfileId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  var compatibleFields: CompatibleFieldsResource
  var files: FilesResource
  /** Deletes a report by its ID. */
  def delete(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Unit]
  /** Retrieves a report by its ID. */
  def get(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Report]
  /** Creates a report. */
  def insert(request: Anon_AltFieldsKey): Request[Report]
  /** Retrieves list of reports. */
  def list(request: Anon_AltFieldsKeyMaxResultsOauthtoken): Request[ReportList]
  /** Updates a report. This method supports patch semantics. */
  def patch(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Report]
  /** Runs a report. */
  def run(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProfileId): Request[File]
  /** Updates a report. */
  def update(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Report]
}

object ReportsResource {
  @scala.inline
  def apply(
    compatibleFields: CompatibleFieldsResource,
    delete: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Unit],
    files: FilesResource,
    get: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Report],
    insert: Anon_AltFieldsKey => Request[Report],
    list: Anon_AltFieldsKeyMaxResultsOauthtoken => Request[ReportList],
    patch: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Report],
    run: Anon_AltFieldsKeyOauthtokenPrettyPrintProfileId => Request[File],
    update: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Report]
  ): ReportsResource = {
    val __obj = js.Dynamic.literal(compatibleFields = compatibleFields.asInstanceOf[js.Any], delete = js.Any.fromFunction1(delete), files = files.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), run = js.Any.fromFunction1(run), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ReportsResource]
  }
}

