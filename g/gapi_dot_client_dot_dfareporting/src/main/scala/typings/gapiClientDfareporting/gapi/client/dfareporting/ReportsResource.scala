package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.FieldsKey
import typings.gapiClientDfareporting.anon.Key
import typings.gapiClientDfareporting.anon.Scope
import typings.gapiClientDfareporting.anon.Synchronous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportsResource extends js.Object {
  var compatibleFields: CompatibleFieldsResource = js.native
  var files: FilesResource = js.native
  /** Deletes a report by its ID. */
  def delete(request: FieldsKey): Request[Unit] = js.native
  /** Retrieves a report by its ID. */
  def get(request: FieldsKey): Request[Report] = js.native
  /** Creates a report. */
  def insert(request: Key): Request[Report] = js.native
  /** Retrieves list of reports. */
  def list(request: Scope): Request[ReportList] = js.native
  /** Updates a report. This method supports patch semantics. */
  def patch(request: FieldsKey): Request[Report] = js.native
  /** Runs a report. */
  def run(request: Synchronous): Request[File] = js.native
  /** Updates a report. */
  def update(request: FieldsKey): Request[Report] = js.native
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
  @scala.inline
  implicit class ReportsResourceOps[Self <: ReportsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCompatibleFields(value: CompatibleFieldsResource): Self = this.set("compatibleFields", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: FieldsKey => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setFiles(value: FilesResource): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: FieldsKey => Request[Report]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Key => Request[Report]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Scope => Request[ReportList]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: FieldsKey => Request[Report]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setRun(value: Synchronous => Request[File]): Self = this.set("run", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: FieldsKey => Request[Report]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

