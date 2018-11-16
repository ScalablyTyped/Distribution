package typings
package atGoogleDashCloudStorageLib.storageMod.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Options when uploading file to bucket.
     */

trait UploadOptions extends WriteStreamOptions {
  var destination: js.UndefOr[java.lang.String | File] = js.undefined
  var encryptionKey: js.UndefOr[java.lang.String] = js.undefined
  var kmsKeyName: js.UndefOr[java.lang.String] = js.undefined
  var requestOptions: js.UndefOr[requestLib.requestMod.requestNs.CoreOptions] = js.undefined
}

