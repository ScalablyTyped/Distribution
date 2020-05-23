package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.FieldsKey
import typings.gapiClientDfareporting.anon.Key
import typings.gapiClientDfareporting.anon.Scope
import typings.gapiClientDfareporting.anon.Synchronous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  var compatibleFields: CompatibleFieldsResource
  var files: FilesResource
  /** Deletes a report by its ID. */
  def delete(request: FieldsKey): Request[Unit]
  /** Retrieves a report by its ID. */
  def get(request: FieldsKey): Request[Report]
  /** Creates a report. */
  def insert(request: Key): Request[Report]
  /** Retrieves list of reports. */
  def list(request: Scope): Request[ReportList]
  /** Updates a report. This method supports patch semantics. */
  def patch(request: FieldsKey): Request[Report]
  /** Runs a report. */
  def run(request: Synchronous): Request[File]
  /** Updates a report. */
  def update(request: FieldsKey): Request[Report]
}

object ReportsResource {
  @scala.inline
  def apply(
    compatibleFields: CompatibleFieldsResource,
    delete: FieldsKey => Request[Unit],
    files: FilesResource,
    get: FieldsKey => Request[Report],
    insert: Key => Request[Report],
    list: Scope => Request[ReportList],
    patch: FieldsKey => Request[Report],
    run: Synchronous => Request[File],
    update: FieldsKey => Request[Report]
  ): ReportsResource = {
    val __obj = js.Dynamic.literal(compatibleFields = compatibleFields.asInstanceOf[js.Any], delete = js.Any.fromFunction1(delete), files = files.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), run = js.Any.fromFunction1(run), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ReportsResource]
  }
}

