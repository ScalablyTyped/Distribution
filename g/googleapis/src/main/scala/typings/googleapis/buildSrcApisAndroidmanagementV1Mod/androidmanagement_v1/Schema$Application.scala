package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about an app.
  */
@js.native
trait Schema$Application extends js.Object {
  /**
    * The set of managed properties available to be pre-configured for the app.
    */
  var managedProperties: js.UndefOr[js.Array[Schema$ManagedProperty]] = js.native
  /**
    * The name of the app in the form
    * enterprises/{enterpriseId}/applications/{package_name}.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The permissions required by the app.
    */
  var permissions: js.UndefOr[js.Array[Schema$ApplicationPermission]] = js.native
  /**
    * The title of the app. Localized.
    */
  var title: js.UndefOr[String] = js.native
}

object Schema$Application {
  @scala.inline
  def apply(
    managedProperties: js.Array[Schema$ManagedProperty] = null,
    name: String = null,
    permissions: js.Array[Schema$ApplicationPermission] = null,
    title: String = null
  ): Schema$Application = {
    val __obj = js.Dynamic.literal()
    if (managedProperties != null) __obj.updateDynamic("managedProperties")(managedProperties.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Application]
  }
}

