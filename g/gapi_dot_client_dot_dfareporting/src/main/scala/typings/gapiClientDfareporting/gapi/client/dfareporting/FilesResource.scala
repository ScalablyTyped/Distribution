package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.FileId
import typings.gapiClientDfareporting.anon.ReportId
import typings.gapiClientDfareporting.anon.Scope
import typings.gapiClientDfareporting.anon.SortField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilesResource extends js.Object {
  /** Retrieves a report file by its report ID and file ID. This method supports media download. */
  def get(request: FileId): Request[File] = js.native
  /** Retrieves a report file. This method supports media download. */
  def get(request: ReportId): Request[File] = js.native
  /** Lists files for a user profile. */
  def list(request: Scope): Request[FileList] = js.native
  /** Lists files for a report. */
  def list(request: SortField): Request[FileList] = js.native
}

