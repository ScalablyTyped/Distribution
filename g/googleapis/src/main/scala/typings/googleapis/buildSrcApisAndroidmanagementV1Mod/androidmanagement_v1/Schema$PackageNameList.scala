package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of package names.
  */
@js.native
trait Schema$PackageNameList extends js.Object {
  /**
    * A list of package names.
    */
  var packageNames: js.UndefOr[js.Array[String]] = js.native
}

object Schema$PackageNameList {
  @scala.inline
  def apply(packageNames: js.Array[String] = null): Schema$PackageNameList = {
    val __obj = js.Dynamic.literal()
    if (packageNames != null) __obj.updateDynamic("packageNames")(packageNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PackageNameList]
  }
}

