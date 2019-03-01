package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpansionFile extends js.Object {
  /**
    * If set this field indicates that this APK has an Expansion File uploaded to it: this APK does not reference another APK's Expansion File. The field's
    * value is the size of the uploaded Expansion File in bytes.
    */
  var fileSize: js.UndefOr[java.lang.String] = js.undefined
  /** If set this APK's Expansion File references another APK's Expansion File. The file_size field will not be set. */
  var referencesVersion: js.UndefOr[scala.Double] = js.undefined
}

object ExpansionFile {
  @scala.inline
  def apply(fileSize: java.lang.String = null, referencesVersion: scala.Int | scala.Double = null): ExpansionFile = {
    val __obj = js.Dynamic.literal()
    if (fileSize != null) __obj.updateDynamic("fileSize")(fileSize)
    if (referencesVersion != null) __obj.updateDynamic("referencesVersion")(referencesVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpansionFile]
  }
}

