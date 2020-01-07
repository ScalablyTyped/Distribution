package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The install resources for the device.
  */
@js.native
trait Schema$InstallsListResponse extends js.Object {
  /**
    * An installation of an app for a user on a specific device. The existence
    * of an install implies that the user must have an entitlement to the app.
    */
  var install: js.UndefOr[js.Array[Schema$Install]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#installsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$InstallsListResponse {
  @scala.inline
  def apply(install: js.Array[Schema$Install] = null, kind: String = null): Schema$InstallsListResponse = {
    val __obj = js.Dynamic.literal()
    if (install != null) __obj.updateDynamic("install")(install.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstallsListResponse]
  }
}

