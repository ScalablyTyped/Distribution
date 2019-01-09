package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpansionfilesResource extends js.Object {
  /** Fetches the Expansion File configuration for the APK specified. */
  def get(request: gapiDotClientDotAndroidpublisherLib.Anon_AltApkVersionCodeEditId): gapiDotClientLib.gapiNs.clientNs.Request[ExpansionFile]
  /**
    * Updates the APK's Expansion File configuration to reference another APK's Expansion Files. To add a new Expansion File use the Upload method. This
    * method supports patch semantics.
    */
  def patch(request: gapiDotClientDotAndroidpublisherLib.Anon_AltApkVersionCodeEditId): gapiDotClientLib.gapiNs.clientNs.Request[ExpansionFile]
  /** Updates the APK's Expansion File configuration to reference another APK's Expansion Files. To add a new Expansion File use the Upload method. */
  def update(request: gapiDotClientDotAndroidpublisherLib.Anon_AltApkVersionCodeEditId): gapiDotClientLib.gapiNs.clientNs.Request[ExpansionFile]
  /** Uploads and attaches a new Expansion File to the APK specified. */
  def upload(request: gapiDotClientDotAndroidpublisherLib.Anon_AltApkVersionCodeEditId): gapiDotClientLib.gapiNs.clientNs.Request[ExpansionFilesUploadResponse]
}

