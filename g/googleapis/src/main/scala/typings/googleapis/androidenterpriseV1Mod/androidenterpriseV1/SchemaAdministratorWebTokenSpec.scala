package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specification for a token used to generate iframes. The token specifies
  * what data the admin is allowed to modify and the URI the iframe is allowed
  * to communiate with.
  */
@js.native
trait SchemaAdministratorWebTokenSpec extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#administratorWebTokenSpec&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Options for displaying the Managed Configuration page.
    */
  var managedConfigurations: js.UndefOr[SchemaAdministratorWebTokenSpecManagedConfigurations] = js.native
  /**
    * The URI of the parent frame hosting the iframe. To prevent XSS, the
    * iframe may not be hosted at other URIs. This URI must be https.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Deprecated. Use PlaySearch.approveApps.
    */
  var permission: js.UndefOr[js.Array[String]] = js.native
  /**
    * Options for displaying the managed Play Search apps page.
    */
  var playSearch: js.UndefOr[SchemaAdministratorWebTokenSpecPlaySearch] = js.native
  /**
    * Options for displaying the Private Apps page.
    */
  var privateApps: js.UndefOr[SchemaAdministratorWebTokenSpecPrivateApps] = js.native
  /**
    * Options for displaying the Organize apps page.
    */
  var storeBuilder: js.UndefOr[SchemaAdministratorWebTokenSpecStoreBuilder] = js.native
  /**
    * Options for displaying the Web Apps page.
    */
  var webApps: js.UndefOr[SchemaAdministratorWebTokenSpecWebApps] = js.native
}

object SchemaAdministratorWebTokenSpec {
  @scala.inline
  def apply(
    kind: String = null,
    managedConfigurations: SchemaAdministratorWebTokenSpecManagedConfigurations = null,
    parent: String = null,
    permission: js.Array[String] = null,
    playSearch: SchemaAdministratorWebTokenSpecPlaySearch = null,
    privateApps: SchemaAdministratorWebTokenSpecPrivateApps = null,
    storeBuilder: SchemaAdministratorWebTokenSpecStoreBuilder = null,
    webApps: SchemaAdministratorWebTokenSpecWebApps = null
  ): SchemaAdministratorWebTokenSpec = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (managedConfigurations != null) __obj.updateDynamic("managedConfigurations")(managedConfigurations.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    if (playSearch != null) __obj.updateDynamic("playSearch")(playSearch.asInstanceOf[js.Any])
    if (privateApps != null) __obj.updateDynamic("privateApps")(privateApps.asInstanceOf[js.Any])
    if (storeBuilder != null) __obj.updateDynamic("storeBuilder")(storeBuilder.asInstanceOf[js.Any])
    if (webApps != null) __obj.updateDynamic("webApps")(webApps.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAdministratorWebTokenSpec]
  }
}

