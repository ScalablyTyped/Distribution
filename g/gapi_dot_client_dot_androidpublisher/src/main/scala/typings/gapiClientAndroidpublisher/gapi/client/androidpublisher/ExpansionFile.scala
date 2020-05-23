package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpansionFile extends js.Object {
  /**
    * If set this field indicates that this APK has an Expansion File uploaded to it: this APK does not reference another APK's Expansion File. The field's
    * value is the size of the uploaded Expansion File in bytes.
    */
  var fileSize: js.UndefOr[String] = js.undefined
  /** If set this APK's Expansion File references another APK's Expansion File. The file_size field will not be set. */
  var referencesVersion: js.UndefOr[Double] = js.undefined
}

object ExpansionFile {
  @scala.inline
  def apply(fileSize: String = null, referencesVersion: js.UndefOr[Double] = js.undefined): ExpansionFile = {
    val __obj = js.Dynamic.literal()
    if (fileSize != null) __obj.updateDynamic("fileSize")(fileSize.asInstanceOf[js.Any])
    if (!js.isUndefined(referencesVersion)) __obj.updateDynamic("referencesVersion")(referencesVersion.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpansionFile]
  }
}

