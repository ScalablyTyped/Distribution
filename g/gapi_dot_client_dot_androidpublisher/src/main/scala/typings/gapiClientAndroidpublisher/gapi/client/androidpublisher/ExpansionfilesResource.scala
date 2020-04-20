package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidpublisher.AnonExpansionFileType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpansionfilesResource extends js.Object {
  /** Fetches the Expansion File configuration for the APK specified. */
  def get(request: AnonExpansionFileType): Request_[ExpansionFile]
  /**
    * Updates the APK's Expansion File configuration to reference another APK's Expansion Files. To add a new Expansion File use the Upload method. This
    * method supports patch semantics.
    */
  def patch(request: AnonExpansionFileType): Request_[ExpansionFile]
  /** Updates the APK's Expansion File configuration to reference another APK's Expansion Files. To add a new Expansion File use the Upload method. */
  def update(request: AnonExpansionFileType): Request_[ExpansionFile]
  /** Uploads and attaches a new Expansion File to the APK specified. */
  def upload(request: AnonExpansionFileType): Request_[ExpansionFilesUploadResponse]
}

object ExpansionfilesResource {
  @scala.inline
  def apply(
    get: AnonExpansionFileType => Request_[ExpansionFile],
    patch: AnonExpansionFileType => Request_[ExpansionFile],
    update: AnonExpansionFileType => Request_[ExpansionFile],
    upload: AnonExpansionFileType => Request_[ExpansionFilesUploadResponse]
  ): ExpansionfilesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update), upload = js.Any.fromFunction1(upload))
    __obj.asInstanceOf[ExpansionfilesResource]
  }
}

