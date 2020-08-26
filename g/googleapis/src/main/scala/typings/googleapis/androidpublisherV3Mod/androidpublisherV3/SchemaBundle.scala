package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBundle extends js.Object {
  /**
    * A sha1 hash of the upload payload, encoded as a hex string and matching
    * the output of the sha1sum command.
    */
  var sha1: js.UndefOr[String] = js.native
  /**
    * A sha256 hash of the upload payload, encoded as a hex string and matching
    * the output of the sha256sum command.
    */
  var sha256: js.UndefOr[String] = js.native
  /**
    * The version code of the Android App Bundle. As specified in the Android
    * App Bundle&#39;s base module APK manifest file.
    */
  var versionCode: js.UndefOr[Double] = js.native
}

object SchemaBundle {
  @scala.inline
  def apply(): SchemaBundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBundle]
  }
  @scala.inline
  implicit class SchemaBundleOps[Self <: SchemaBundle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSha1(value: String): Self = this.set("sha1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSha1: Self = this.set("sha1", js.undefined)
    @scala.inline
    def setSha256(value: String): Self = this.set("sha256", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSha256: Self = this.set("sha256", js.undefined)
    @scala.inline
    def setVersionCode(value: Double): Self = this.set("versionCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionCode: Self = this.set("versionCode", js.undefined)
  }
  
}

