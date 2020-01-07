package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ExpansionFile extends js.Object {
  /**
    * If set this field indicates that this APK has an Expansion File uploaded
    * to it: this APK does not reference another APK&#39;s Expansion File. The
    * field&#39;s value is the size of the uploaded Expansion File in bytes.
    */
  var fileSize: js.UndefOr[String] = js.native
  /**
    * If set this APK&#39;s Expansion File references another APK&#39;s
    * Expansion File. The file_size field will not be set.
    */
  var referencesVersion: js.UndefOr[Double] = js.native
}

object Schema$ExpansionFile {
  @scala.inline
  def apply(fileSize: String = null, referencesVersion: Int | Double = null): Schema$ExpansionFile = {
    val __obj = js.Dynamic.literal()
    if (fileSize != null) __obj.updateDynamic("fileSize")(fileSize.asInstanceOf[js.Any])
    if (referencesVersion != null) __obj.updateDynamic("referencesVersion")(referencesVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ExpansionFile]
  }
}

