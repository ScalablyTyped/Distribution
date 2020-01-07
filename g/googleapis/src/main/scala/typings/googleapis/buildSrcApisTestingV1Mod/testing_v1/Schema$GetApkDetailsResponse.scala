package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response containing the details of the specified Android application APK.
  */
@js.native
trait Schema$GetApkDetailsResponse extends js.Object {
  /**
    * Details of the Android APK.
    */
  var apkDetail: js.UndefOr[Schema$ApkDetail] = js.native
}

object Schema$GetApkDetailsResponse {
  @scala.inline
  def apply(apkDetail: Schema$ApkDetail = null): Schema$GetApkDetailsResponse = {
    val __obj = js.Dynamic.literal()
    if (apkDetail != null) __obj.updateDynamic("apkDetail")(apkDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GetApkDetailsResponse]
  }
}

