package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The existence of an Installs resource indicates that an app is installed on
  * a particular device (or that an install is pending).  The API can be used
  * to create an install resource using the update method. This triggers the
  * actual install of the app on the device. If the user does not already have
  * an entitlement for the app, then an attempt is made to create one. If this
  * fails (for example, because the app is not free and there is no available
  * license), then the creation of the install fails.  The API can also be used
  * to update an installed app. If the update method is used on an existing
  * install, then the app will be updated to the latest available version. Note
  * that it is not possible to force the installation of a specific version of
  * an app: the version code is read-only.  If a user installs an app
  * themselves (as permitted by the enterprise), then again an install resource
  * and possibly an entitlement resource are automatically created.  The API
  * can also be used to delete an install resource, which triggers the removal
  * of the app from the device. Note that deleting an install does not
  * automatically remove the corresponding entitlement, even if there are no
  * remaining installs. The install resource will also be deleted if the user
  * uninstalls the app themselves.
  */
@js.native
trait SchemaInstall extends js.Object {
  /**
    * Install state. The state &quot;installPending&quot; means that an install
    * request has recently been made and download to the device is in progress.
    * The state &quot;installed&quot; means that the app has been installed.
    * This field is read-only.
    */
  var installState: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#install&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The ID of the product that the install is for. For example,
    * &quot;app:com.google.android.gm&quot;.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * The version of the installed product. Guaranteed to be set only if the
    * install state is &quot;installed&quot;.
    */
  var versionCode: js.UndefOr[Double] = js.native
}

object SchemaInstall {
  @scala.inline
  def apply(
    installState: String = null,
    kind: String = null,
    productId: String = null,
    versionCode: js.UndefOr[Double] = js.undefined
  ): SchemaInstall = {
    val __obj = js.Dynamic.literal()
    if (installState != null) __obj.updateDynamic("installState")(installState.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (!js.isUndefined(versionCode)) __obj.updateDynamic("versionCode")(versionCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstall]
  }
}

