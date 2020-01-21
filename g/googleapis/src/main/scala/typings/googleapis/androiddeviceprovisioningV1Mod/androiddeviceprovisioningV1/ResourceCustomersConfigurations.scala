package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androiddeviceprovisioning/v1", "androiddeviceprovisioning_v1.Resource$Customers$Configurations")
@js.native
class ResourceCustomersConfigurations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androiddeviceprovisioning.customers.configurations.create
    * @desc Creates a new configuration. Once created, a customer can apply the
    * configuration to devices.
    * @alias androiddeviceprovisioning.customers.configurations.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The customer that manages the configuration. An API resource name in the format `customers/[CUSTOMER_ID]`.
    * @param {().Configuration} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaConfiguration] = js.native
  def create(callback: BodyResponseCallback[SchemaConfiguration]): Unit = js.native
  def create(params: ParamsResourceCustomersConfigurationsCreate): GaxiosPromise[SchemaConfiguration] = js.native
  def create(
    params: ParamsResourceCustomersConfigurationsCreate,
    callback: BodyResponseCallback[SchemaConfiguration]
  ): Unit = js.native
  def create(
    params: ParamsResourceCustomersConfigurationsCreate,
    options: BodyResponseCallback[SchemaConfiguration],
    callback: BodyResponseCallback[SchemaConfiguration]
  ): Unit = js.native
  def create(params: ParamsResourceCustomersConfigurationsCreate, options: MethodOptions): GaxiosPromise[SchemaConfiguration] = js.native
  def create(
    params: ParamsResourceCustomersConfigurationsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConfiguration]
  ): Unit = js.native
  /**
    * androiddeviceprovisioning.customers.configurations.delete
    * @desc Deletes an unused configuration. The API call fails if the customer
    * has devices with the configuration applied.
    * @alias androiddeviceprovisioning.customers.configurations.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The configuration to delete. An API resource name in the format `customers/[CUSTOMER_ID]/configurations/[CONFIGURATION_ID]`. If the configuration is applied to any devices, the API call fails.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: ParamsResourceCustomersConfigurationsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceCustomersConfigurationsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceCustomersConfigurationsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceCustomersConfigurationsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceCustomersConfigurationsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * androiddeviceprovisioning.customers.configurations.get
    * @desc Gets the details of a configuration.
    * @alias androiddeviceprovisioning.customers.configurations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The configuration to get. An API resource name in the format `customers/[CUSTOMER_ID]/configurations/[CONFIGURATION_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaConfiguration] = js.native
  def get(callback: BodyResponseCallback[SchemaConfiguration]): Unit = js.native
  def get(params: ParamsResourceCustomersConfigurationsGet): GaxiosPromise[SchemaConfiguration] = js.native
  def get(
    params: ParamsResourceCustomersConfigurationsGet,
    callback: BodyResponseCallback[SchemaConfiguration]
  ): Unit = js.native
  def get(
    params: ParamsResourceCustomersConfigurationsGet,
    options: BodyResponseCallback[SchemaConfiguration],
    callback: BodyResponseCallback[SchemaConfiguration]
  ): Unit = js.native
  def get(params: ParamsResourceCustomersConfigurationsGet, options: MethodOptions): GaxiosPromise[SchemaConfiguration] = js.native
  def get(
    params: ParamsResourceCustomersConfigurationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConfiguration]
  ): Unit = js.native
  /**
    * androiddeviceprovisioning.customers.configurations.list
    * @desc Lists a customer's configurations.
    * @alias androiddeviceprovisioning.customers.configurations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The customer that manages the listed configurations. An API resource name in the format `customers/[CUSTOMER_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaCustomerListConfigurationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaCustomerListConfigurationsResponse]): Unit = js.native
  def list(params: ParamsResourceCustomersConfigurationsList): GaxiosPromise[SchemaCustomerListConfigurationsResponse] = js.native
  def list(
    params: ParamsResourceCustomersConfigurationsList,
    callback: BodyResponseCallback[SchemaCustomerListConfigurationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCustomersConfigurationsList,
    options: BodyResponseCallback[SchemaCustomerListConfigurationsResponse],
    callback: BodyResponseCallback[SchemaCustomerListConfigurationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCustomersConfigurationsList, options: MethodOptions): GaxiosPromise[SchemaCustomerListConfigurationsResponse] = js.native
  def list(
    params: ParamsResourceCustomersConfigurationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomerListConfigurationsResponse]
  ): Unit = js.native
  /**
    * androiddeviceprovisioning.customers.configurations.patch
    * @desc Updates a configuration's field values.
    * @alias androiddeviceprovisioning.customers.configurations.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Output only. The API resource name in the format `customers/[CUSTOMER_ID]/configurations/[CONFIGURATION_ID]`. Assigned by the server.
    * @param {string=} params.updateMask Required. The field mask applied to the target `Configuration` before updating the fields. To learn more about using field masks, read [FieldMask](/protocol-buffers/docs/reference/google.protobuf#fieldmask) in the Protocol Buffers documentation.
    * @param {().Configuration} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaConfiguration] = js.native
  def patch(callback: BodyResponseCallback[SchemaConfiguration]): Unit = js.native
  def patch(params: ParamsResourceCustomersConfigurationsPatch): GaxiosPromise[SchemaConfiguration] = js.native
  def patch(
    params: ParamsResourceCustomersConfigurationsPatch,
    callback: BodyResponseCallback[SchemaConfiguration]
  ): Unit = js.native
  def patch(
    params: ParamsResourceCustomersConfigurationsPatch,
    options: BodyResponseCallback[SchemaConfiguration],
    callback: BodyResponseCallback[SchemaConfiguration]
  ): Unit = js.native
  def patch(params: ParamsResourceCustomersConfigurationsPatch, options: MethodOptions): GaxiosPromise[SchemaConfiguration] = js.native
  def patch(
    params: ParamsResourceCustomersConfigurationsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConfiguration]
  ): Unit = js.native
}

