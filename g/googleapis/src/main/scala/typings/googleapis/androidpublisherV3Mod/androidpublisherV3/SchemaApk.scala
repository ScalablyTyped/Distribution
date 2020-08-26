package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaApk extends js.Object {
  /**
    * Information about the binary payload of this APK.
    */
  var binary: js.UndefOr[SchemaApkBinary] = js.native
  /**
    * The version code of the APK, as specified in the APK&#39;s manifest file.
    */
  var versionCode: js.UndefOr[Double] = js.native
}

object SchemaApk {
  @scala.inline
  def apply(): SchemaApk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApk]
  }
  @scala.inline
  implicit class SchemaApkOps[Self <: SchemaApk] (val x: Self) extends AnyVal {
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
    def setBinary(value: SchemaApkBinary): Self = this.set("binary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinary: Self = this.set("binary", js.undefined)
    @scala.inline
    def setVersionCode(value: Double): Self = this.set("versionCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionCode: Self = this.set("versionCode", js.undefined)
  }
  
}

