package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAltFieldsKey
import typings.gapiClientDfareporting.AnonAltFieldsKeyMaxResultsOauthtoken
import typings.gapiClientDfareporting.AnonAltFieldsKeyOauthtokenPrettyPrint
import typings.gapiClientDfareporting.AnonAltFieldsKeyOauthtokenPrettyPrintProfileId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  var compatibleFields: CompatibleFieldsResource
  var files: FilesResource
  /** Deletes a report by its ID. */
  def delete(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[Unit]
  /** Retrieves a report by its ID. */
  def get(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[Report]
  /** Creates a report. */
  def insert(request: AnonAltFieldsKey): Request_[Report]
  /** Retrieves list of reports. */
  def list(request: AnonAltFieldsKeyMaxResultsOauthtoken): Request_[ReportList]
  /** Updates a report. This method supports patch semantics. */
  def patch(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[Report]
  /** Runs a report. */
  def run(request: AnonAltFieldsKeyOauthtokenPrettyPrintProfileId): Request_[File]
  /** Updates a report. */
  def update(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[Report]
}

object ReportsResource {
  @scala.inline
  def apply(
    compatibleFields: CompatibleFieldsResource,
    delete: AnonAltFieldsKeyOauthtokenPrettyPrint => Request_[Unit],
    files: FilesResource,
    get: AnonAltFieldsKeyOauthtokenPrettyPrint => Request_[Report],
    insert: AnonAltFieldsKey => Request_[Report],
    list: AnonAltFieldsKeyMaxResultsOauthtoken => Request_[ReportList],
    patch: AnonAltFieldsKeyOauthtokenPrettyPrint => Request_[Report],
    run: AnonAltFieldsKeyOauthtokenPrettyPrintProfileId => Request_[File],
    update: AnonAltFieldsKeyOauthtokenPrettyPrint => Request_[Report]
  ): ReportsResource = {
    val __obj = js.Dynamic.literal(compatibleFields = compatibleFields.asInstanceOf[js.Any], delete = js.Any.fromFunction1(delete), files = files.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), run = js.Any.fromFunction1(run), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ReportsResource]
  }
}

