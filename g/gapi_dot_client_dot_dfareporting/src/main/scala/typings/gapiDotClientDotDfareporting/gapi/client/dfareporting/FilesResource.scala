package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsFileId
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsFileIdKey
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKeyMaxResultsOauthtoken
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKeyMaxResultsOauthtokenPageToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilesResource extends js.Object {
  /** Retrieves a report file by its report ID and file ID. This method supports media download. */
  def get(request: Anon_AltFieldsFileId): Request[File] = js.native
  /** Retrieves a report file. This method supports media download. */
  def get(request: Anon_AltFieldsFileIdKey): Request[File] = js.native
  /** Lists files for a user profile. */
  def list(request: Anon_AltFieldsKeyMaxResultsOauthtoken): Request[FileList] = js.native
  /** Lists files for a report. */
  def list(request: Anon_AltFieldsKeyMaxResultsOauthtokenPageToken): Request[FileList] = js.native
}

