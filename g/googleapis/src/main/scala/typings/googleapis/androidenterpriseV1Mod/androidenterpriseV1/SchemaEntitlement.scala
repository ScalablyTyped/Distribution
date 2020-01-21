package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The presence of an Entitlements resource indicates that a user has the
  * right to use a particular app. Entitlements are user specific, not device
  * specific. This allows a user with an entitlement to an app to install the
  * app on all their devices. It&#39;s also possible for a user to hold an
  * entitlement to an app without installing the app on any device.  The API
  * can be used to create an entitlement. As an option, you can also use the
  * API to trigger the installation of an app on all a user&#39;s managed
  * devices at the same time the entitlement is created.  If the app is free,
  * creating the entitlement also creates a group license for that app. For
  * paid apps, creating the entitlement consumes one license, and that license
  * remains consumed until the entitlement is removed. If the enterprise
  * hasn&#39;t purchased enough licenses, then no entitlement is created and
  * the installation fails. An entitlement is also not created for an app if
  * the app requires permissions that the enterprise hasn&#39;t accepted.  If
  * an entitlement is deleted, the app may be uninstalled from a user&#39;s
  * device. As a best practice, uninstall the app by calling  Installs.delete()
  * before deleting the entitlement.  Entitlements for apps that a user pays
  * for on an unmanaged profile have &quot;userPurchase&quot; as the
  * entitlement reason. These entitlements cannot be removed via the API.
  */
@js.native
trait SchemaEntitlement extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#entitlement&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The ID of the product that the entitlement is for. For example,
    * &quot;app:com.google.android.gm&quot;.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * The reason for the entitlement. For example, &quot;free&quot; for free
    * apps. This property is temporary: it will be replaced by the acquisition
    * kind field of group licenses.
    */
  var reason: js.UndefOr[String] = js.native
}

object SchemaEntitlement {
  @scala.inline
  def apply(kind: String = null, productId: String = null, reason: String = null): SchemaEntitlement = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEntitlement]
  }
}

