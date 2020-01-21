package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAltFieldsFileId
import typings.gapiClientDfareporting.AnonAltFieldsFileIdKey
import typings.gapiClientDfareporting.AnonAltFieldsKeyMaxResultsOauthtoken
import typings.gapiClientDfareporting.AnonAltFieldsKeyMaxResultsOauthtokenPageToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilesResource extends js.Object {
  /** Retrieves a report file by its report ID and file ID. This method supports media download. */
  def get(request: AnonAltFieldsFileId): Request_[File] = js.native
  /** Retrieves a report file. This method supports media download. */
  def get(request: AnonAltFieldsFileIdKey): Request_[File] = js.native
  /** Lists files for a user profile. */
  def list(request: AnonAltFieldsKeyMaxResultsOauthtoken): Request_[FileList] = js.native
  /** Lists files for a report. */
  def list(request: AnonAltFieldsKeyMaxResultsOauthtokenPageToken): Request_[FileList] = js.native
}

