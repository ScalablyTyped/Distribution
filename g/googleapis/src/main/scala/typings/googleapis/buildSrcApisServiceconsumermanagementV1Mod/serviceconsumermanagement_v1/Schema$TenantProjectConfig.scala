package typings.googleapis.buildSrcApisServiceconsumermanagementV1Mod.serviceconsumermanagement_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure defines a tenant project to be added to the specified
  * tenancy unit and its initial configuration and properties. A project lien
  * is created for the tenant project to prevent the tenant project from being
  * deleted accidentally. The lien is deleted as part of tenant project
  * removal.
  */
@js.native
trait Schema$TenantProjectConfig extends js.Object {
  /**
    * Billing account properties. The billing account must be specified.
    */
  var billingConfig: js.UndefOr[Schema$BillingConfig] = js.native
  /**
    * Folder where project in this tenancy unit must be located This folder
    * must have been previously created with the required permissions for the
    * caller to create and configure a project in it. Valid folder resource
    * names have the format `folders/{folder_number}` (for example,
    * `folders/123456`).
    */
  var folder: js.UndefOr[String] = js.native
  /**
    * Labels that are applied to this project.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Configuration for the IAM service account on the tenant project.
    */
  var serviceAccountConfig: js.UndefOr[Schema$ServiceAccountConfig] = js.native
  /**
    * Google Cloud API names of services that are activated on this project
    * during provisioning.  If any of these services can&#39;t be activated,
    * the request fails. For example:
    * &#39;compute.googleapis.com&#39;,&#39;cloudfunctions.googleapis.com&#39;
    */
  var services: js.UndefOr[js.Array[String]] = js.native
  /**
    * Describes ownership and policies for the new tenant project. Required.
    */
  var tenantProjectPolicy: js.UndefOr[Schema$TenantProjectPolicy] = js.native
}

object Schema$TenantProjectConfig {
  @scala.inline
  def apply(
    billingConfig: Schema$BillingConfig = null,
    folder: String = null,
    labels: StringDictionary[String] = null,
    serviceAccountConfig: Schema$ServiceAccountConfig = null,
    services: js.Array[String] = null,
    tenantProjectPolicy: Schema$TenantProjectPolicy = null
  ): Schema$TenantProjectConfig = {
    val __obj = js.Dynamic.literal()
    if (billingConfig != null) __obj.updateDynamic("billingConfig")(billingConfig.asInstanceOf[js.Any])
    if (folder != null) __obj.updateDynamic("folder")(folder.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (serviceAccountConfig != null) __obj.updateDynamic("serviceAccountConfig")(serviceAccountConfig.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    if (tenantProjectPolicy != null) __obj.updateDynamic("tenantProjectPolicy")(tenantProjectPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TenantProjectConfig]
  }
}

