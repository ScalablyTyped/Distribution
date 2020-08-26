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
  def apply(): SchemaApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplication]
  }
  @scala.inline
  implicit class SchemaApplicationOps[Self <: SchemaApplication] (val x: Self) extends AnyVal {
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
    def setManagedPropertiesVarargs(value: SchemaManagedProperty*): Self = this.set("managedProperties", js.Array(value :_*))
    @scala.inline
    def setManagedProperties(value: js.Array[SchemaManagedProperty]): Self = this.set("managedProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedProperties: Self = this.set("managedProperties", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPermissionsVarargs(value: SchemaApplicationPermission*): Self = this.set("permissions", js.Array(value :_*))
    @scala.inline
    def setPermissions(value: js.Array[SchemaApplicationPermission]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

