package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about an app.
  */
@js.native
trait SchemaApplication extends js.Object {
  /**
    * The set of managed properties available to be pre-configured for the app.
    */
  var managedProperties: js.UndefOr[js.Array[SchemaManagedProperty]] = js.native
  /**
    * The name of the app in the form
    * enterprises/{enterpriseId}/applications/{package_name}.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The permissions required by the app.
    */
  var permissions: js.UndefOr[js.Array[SchemaApplicationPermission]] = js.native
  /**
    * The title of the app. Localized.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaApplication {
  @scala.inline
  def apply(
    managedProperties: js.Array[SchemaManagedProperty] = null,
    name: String = null,
    permissions: js.Array[SchemaApplicationPermission] = null,
    title: String = null
  ): SchemaApplication = {
    val __obj = js.Dynamic.literal()
    if (managedProperties != null) __obj.updateDynamic("managedProperties")(managedProperties.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaApplication]
  }
}

