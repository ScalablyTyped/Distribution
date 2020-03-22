package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonFileId
import typings.gapiClientDfareporting.AnonReportId
import typings.gapiClientDfareporting.AnonScope
import typings.gapiClientDfareporting.AnonSortField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilesResource extends js.Object {
  /** Retrieves a report file by its report ID and file ID. This method supports media download. */
  def get(request: AnonFileId): Request_[File] = js.native
  /** Retrieves a report file. This method supports media download. */
  def get(request: AnonReportId): Request_[File] = js.native
  /** Lists files for a user profile. */
  def list(request: AnonScope): Request_[FileList] = js.native
  /** Lists files for a report. */
  def list(request: AnonSortField): Request_[FileList] = js.native
}

