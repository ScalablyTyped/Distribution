package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of package names.
  */
@js.native
trait SchemaPackageNameList extends js.Object {
  /**
    * A list of package names.
    */
  var packageNames: js.UndefOr[js.Array[String]] = js.native
}

object SchemaPackageNameList {
  @scala.inline
  def apply(packageNames: js.Array[String] = null): SchemaPackageNameList = {
    val __obj = js.Dynamic.literal()
    if (packageNames != null) __obj.updateDynamic("packageNames")(packageNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPackageNameList]
  }
}

