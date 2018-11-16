package typings
package atGoogleDashCloudStorageLib.storageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This class allows you interact with Google Cloud Storage.
     */
@JSImport("@google-cloud/storage", "Channel")
@js.native
class Channel protected ()
  extends atGoogleDashCloudStorageLib.storageMod.StorageNs.Channel {
  def this(storage: Storage, id: java.lang.String, resourceId: java.lang.String) = this()
  /* CompleteClass */
  override def stop(): stdLib.Promise[js.Array[atGoogleDashCloudStorageLib.storageMod.StorageNs.ApiResponse]] = js.native
}

