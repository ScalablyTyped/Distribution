package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androiddeviceprovisioning/v1", "androiddeviceprovisioning_v1.Resource$Customers$Configurations")
@js.native
class ResourceDollarCustomersDollarConfigurations protected () extends js.Object {
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
  def create(): GaxiosPromise[Schema$Configuration] = js.native
  def create(callback: BodyResponseCallback[Schema$Configuration]): Unit = js.native
  def create(params: ParamsDollarResourceDollarCustomersDollarConfigurationsDollarCreate): GaxiosPromise[Schema$Configuration] = js.native
  def create(
    params: ParamsDollarResourceDollarCustomersDollarConfigurationsDollarCreate,
    callback: BodyResponseCallback[Schema$Configuration]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarCustomersDollarConfigurationsDollarCreate,
    options: BodyResponseCallback[Schema$Configuration],
    callback: BodyResponseCallback[Schema$Configuration]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarCustomersDollarConfigurationsDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Configuration] = js.native
  def create(
    params: ParamsDollarResourceDollarCustomersDollarConfigurationsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Configuration]
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
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarCustomersDollarConfigurationsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarCustomersDollarConfigurationsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarCustomersDollarConfigurationsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarCustomersDollarConfigurationsDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarCustomersDollarConfigurationsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
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
  def get(): GaxiosPromise[Schema$Configuration] = js.native
  def get(callback: BodyResponseCallback[Schema$Configuration]): Unit = js.native
  def get(params: ParamsDollarResourceDollarCustomersDollarConfigurationsDollarGet): GaxiosPromise[Schema$Configuration] = js.native
  def get(
    params: ParamsDollarResourceDollarCustomersDollarConfigurationsDollarGet,
    callback: BodyResponseCallback[Schema$Configuration]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarCustomersDollarConfigurationsDollarGet,
    options: BodyResponseCallback[Schema$Configuration],
    callback: BodyResponseCallback[Schema$Configuration]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarCustomersDollarConfigurationsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Configuration] = js.native
  def get(
    params: ParamsDollarResourceDollarCustomersDollarConfigurationsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Configuration]
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
  def list(): GaxiosPromise[Schema$CustomerListConfigurationsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$CustomerListConfigurationsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarCustomersDollarConfigurationsDollarList): GaxiosPromise[Schema$CustomerListConfigurationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCustomersDollarConfigurationsDollarList,
    callback: BodyResponseCallback[Schema$CustomerListConfigurationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarCustomersDollarConfigurationsDollarList,
    options: BodyResponseCallback[Schema$CustomerListConfigurationsResponse],
    callback: BodyResponseCallback[Schema$CustomerListConfigurationsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarCustomersDollarConfigurationsDollarList, options: MethodOptions): GaxiosPromise[Schema$CustomerListConfigurationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCustomersDollarConfigurationsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CustomerListConfigurationsResponse]
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
  def patch(): GaxiosPromise[Schema$Configuration] = js.native
  def patch(callback: BodyResponseCallback[Schema$Configuration]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCustomersDollarConfigurationsDollarPatch): GaxiosPromise[Schema$Configuration] = js.native
  def patch(
    params: ParamsDollarResourceDollarCustomersDollarConfigurationsDollarPatch,
    callback: BodyResponseCallback[Schema$Configuration]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarCustomersDollarConfigurationsDollarPatch,
    options: BodyResponseCallback[Schema$Configuration],
    callback: BodyResponseCallback[Schema$Configuration]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCustomersDollarConfigurationsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Configuration] = js.native
  def patch(
    params: ParamsDollarResourceDollarCustomersDollarConfigurationsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Configuration]
  ): Unit = js.native
}

