package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonFieldsKey
import typings.gapiClientDfareporting.AnonKey
import typings.gapiClientDfareporting.AnonScope
import typings.gapiClientDfareporting.AnonSynchronous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  var compatibleFields: CompatibleFieldsResource
  var files: FilesResource
  /** Deletes a report by its ID. */
  def delete(request: AnonFieldsKey): Request_[Unit]
  /** Retrieves a report by its ID. */
  def get(request: AnonFieldsKey): Request_[Report]
  /** Creates a report. */
  def insert(request: AnonKey): Request_[Report]
  /** Retrieves list of reports. */
  def list(request: AnonScope): Request_[ReportList]
  /** Updates a report. This method supports patch semantics. */
  def patch(request: AnonFieldsKey): Request_[Report]
  /** Runs a report. */
  def run(request: AnonSynchronous): Request_[File]
  /** Updates a report. */
  def update(request: AnonFieldsKey): Request_[Report]
}

object ReportsResource {
  @scala.inline
  def apply(
    compatibleFields: CompatibleFieldsResource,
    delete: AnonFieldsKey => Request_[Unit],
    files: FilesResource,
    get: AnonFieldsKey => Request_[Report],
    insert: AnonKey => Request_[Report],
    list: AnonScope => Request_[ReportList],
    patch: AnonFieldsKey => Request_[Report],
    run: AnonSynchronous => Request_[File],
    update: AnonFieldsKey => Request_[Report]
  ): ReportsResource = {
    val __obj = js.Dynamic.literal(compatibleFields = compatibleFields.asInstanceOf[js.Any], delete = js.Any.fromFunction1(delete), files = files.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), run = js.Any.fromFunction1(run), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ReportsResource]
  }
}

