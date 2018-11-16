package typings
package atGoogleDashCloudStorageLib.storageMod.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Options when obtaining a temporary signed URL for a file.
     */

trait SignedUrlConfig extends js.Object {
  var action: java.lang.String
  var cname: js.UndefOr[java.lang.String] = js.undefined
  var contentMd5: js.UndefOr[java.lang.String] = js.undefined
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var expires: js.Any
  var extensionHeaders: js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var promptSaveAs: js.UndefOr[java.lang.String] = js.undefined
  var responseDisposition: js.UndefOr[java.lang.String] = js.undefined
  var responseType: js.UndefOr[java.lang.String] = js.undefined
}

