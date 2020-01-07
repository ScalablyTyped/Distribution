package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androiddeviceprovisioning/v1", "androiddeviceprovisioning_v1.Resource$Partners$Devices")
@js.native
class ResourceDollarPartnersDollarDevices protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androiddeviceprovisioning.partners.devices.claim
    * @desc Claims a device for a customer and adds it to zero-touch
    * enrollment. If the device is already claimed by another customer, the
    * call returns an error.
    * @alias androiddeviceprovisioning.partners.devices.claim
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.partnerId Required. The ID of the reseller partner.
    * @param {().ClaimDeviceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def claim(): GaxiosPromise[Schema$ClaimDeviceResponse] = js.native
  def claim(callback: BodyResponseCallback[Schema$ClaimDeviceResponse]): Unit = js.native
  def claim(params: ParamsDollarResourceDollarPartnersDollarDevicesDollarClaim): GaxiosPromise[Schema$ClaimDeviceResponse] = js.native
  def claim(
    params: ParamsDollarResourceDollarPartnersDollarDevicesDollarClaim,
    callback: BodyResponseCallback[Schema$ClaimDeviceResponse]
  ): Unit = js.native
  def claim(
    params: ParamsDollarResourceDollarPartnersDollarDevicesDollarClaim,
    options: BodyResponseCallback[Schema$ClaimDeviceResponse],
    callback: BodyResponseCallback[Schema$ClaimDeviceResponse]
  ): Unit = js.native
  def claim(params: ParamsDollarResourceDollarPartnersDollarDevicesDollarClaim, options: MethodOptions): GaxiosPromise[Schema$ClaimDeviceResponse] = js.native
  def claim(
    params: ParamsDollarResourceDollarPartnersDollarDevicesDollarClaim,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ClaimDeviceResponse]
  ): Unit = js.native
  /**
    * androiddeviceprovisioning.partners.devices.claimAsync
    * @desc Claims a batch of devices for a customer asynchronously. Adds the
    * devices to zero-touch enrollment. To learn more, read [Long‑running batch
    * operations](/zero-touch/guides/how-it-works#operations).
    * @alias androiddeviceprovisioning.partners.devices.claimAsync
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.partnerId Required. The ID of the reseller partner.
    * @param {().ClaimDevicesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def claimAsync(): GaxiosPromise[Schema$Operation] = js.native
  def claimAsync(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def claimAsync(params: ParamsDollarResourceDollarPartnersDollarDevicesDollarClaimasync): GaxiosPromise[Schema$Operation] = js.native
  def claimAsync(
    params: ParamsDollarResourceDollarPartnersDollarDevicesDollarClaimasync,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def claimAsync(
    params: ParamsDollarResourceDollarPartnersDollarDevicesDollarClaimasync,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def claimAsync(params: ParamsDollarResourceDollarPartnersDollarDevicesDollarClaimasync, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def claimAsync(
    params: ParamsDollarResourceDollarPartnersDollarDevicesDollarClaimasync,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * androiddeviceprovisioning.partners.devices.findByIdentifier
    * @desc Finds devices by hardware identifiers, such as IMEI.
    * @alias androiddeviceprovisioning.partners.devices.findByIdentifier
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.partnerId Required. The ID of the reseller partner.
    * @param {().FindDevicesByDeviceIdentifierRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def findByIdentifier(): GaxiosPromise[Schema$FindDevicesByDeviceIdentifierResponse] = js.native
  def findByIdentifier(callback: BodyResponseCallback[Schema$FindDevicesByDeviceIdentifierResponse]): Unit = js.native
  def findByIdentifier(params: ParamsDollarResourceDollarPartnersDollarDevicesDollarFindbyidentifier): GaxiosPromise[Schema$FindDevicesByDeviceIdentifierResponse] = js.native
  def findByIdentifier(
    params: ParamsDollarResourceDollarPartnersDollarDevicesDollarFindbyidentifier,
    callback: BodyResponseCallback[Schema$FindDevicesByDeviceIdentifierResponse]
  ): Unit = js.native
  def findByIdentifier(
    params: ParamsDollarResourceDollarPartnersDollarDevicesDollarFindbyidentifier,
    options: BodyResponseCallback[Schema$FindDevicesByDeviceIdentifierResponse],
    callback: BodyResponseCallback[Schema$FindDevicesByDeviceIdentifierResponse]
  ): Unit = js.native
  def findByIdentifier(
    params: ParamsDollarResourceDollarPartnersDollarDevicesDollarFindbyidentifier,
    options: MethodOptions
  ): GaxiosPromise[Schema$FindDevicesByDeviceIdentifierResponse] = js.native
  def findByIdentifier(
    params: ParamsDollarResourceDollarPartnersDollarDevicesDollarFindbyidentifier,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FindDevicesByDeviceIdentifierResponse]
  ): Unit = js.native
  /**
    * androiddeviceprovisioning.partners.devices.findByOwner
    * @desc Finds devices claimed for customers. The results only contain
    * devices registered to the reseller that's identified by the `partnerId`
    * argument. The customer's devices purchased from other resellers don't
    * appear in the results.
    * @alias androiddeviceprovisioning.partners.devices.findByOwner
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.partnerId Required. The ID of the reseller partner.
    * @param {().FindDevicesByOwnerRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def findByOwner(): GaxiosPromise[Schema$FindDevicesByOwnerResponse] = js.native
  def findByOwner(callback: BodyResponseCallback[Schema$FindDevicesByOwnerResponse]): Unit = js.native
  def findByOwner(params: ParamsDollarResourceDollarPartnersDollarDevicesDollarFindbyowner): GaxiosPromise[Schema$FindDevicesByOwnerResponse] = js.native
  def findByOwner(
    params: ParamsDollarResourceDollarPartnersDollarDevicesDollarFindbyowner,
    callback: BodyResponseCallback[Schema$FindDevicesByOwnerResponse]
  ): Unit = js.native
  def findByOwner(
    params: ParamsDollarResourceDollarPartnersDollarDevicesDollarFindbyowner,
    options: BodyResponseCallback[Schema$FindDevicesByOwnerResponse],
    callback: BodyResponseCallback[Schema$FindDevicesByOwnerResponse]
  ): Unit = js.native
  def findByOwner(params: ParamsDollarResourceDollarPartnersDollarDevicesDollarFindbyowner, options: MethodOptions): GaxiosPromise[Schema$FindDevicesByOwnerResponse] = js.native
  def findByOwner(
    params: ParamsDollarResourceDollarPartnersDollarDevicesDollarFindbyowner,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FindDevicesByOwnerResponse]
  ): Unit = js.native
  /**
    * androiddeviceprovisioning.partners.devices.get
    * @desc Gets a device.
    * @alias androiddeviceprovisioning.partners.devices.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The device API resource name in the format `partners/[PARTNER_ID]/devices/[DEVICE_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Device] = js.native
  def get(callback: BodyResponseCallback[Schema$Device]): Unit = js.native
  def get(params: ParamsDollarResourceDollarPartnersDollarDevicesDollarGet): GaxiosPromise[Schema$Device] = js.native
  def get(
    params: ParamsDollarResourceDollarPartnersDollarDevicesDollarGet,
    callback: BodyResponseCallback[Schema$Device]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarPartnersDollarDevicesDollarGet,
    options: BodyResponseCallback[Schema$Device],
    callback: BodyResponseCallback[Schema$Device]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarPartnersDollarDevicesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Device] = js.native
  def get(
    params: ParamsDollarResourceDollarPartnersDollarDevicesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Device]
  ): Unit = js.native
  /**
    * androiddeviceprovisioning.partners.devices.metadata
    * @desc Updates reseller metadata associated with the device.
    * @alias androiddeviceprovisioning.partners.devices.metadata
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.deviceId Required. The ID of the device.
    * @param {string} params.metadataOwnerId Required. The owner of the newly set metadata. Set this to the partner ID.
    * @param {().UpdateDeviceMetadataRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def metadata(): GaxiosPromise[Schema$DeviceMetadata] = js.native
  def metadata(callback: BodyResponseCallback[Schema$DeviceMetadata]): Unit = js.native
  def metadata(params: ParamsDollarResourceDollarPartnersDollarDevicesDollarMetadata): GaxiosPromise[Schema$DeviceMetadata] = js.native
  def metadata(
    params: ParamsDollarResourceDollarPartnersDollarDevicesDollarMetadata,
    callback: BodyResponseCallback[Schema$DeviceMetadata]
  ): Unit = js.native
  def metadata(
    params: ParamsDollarResourceDollarPartnersDollarDevicesDollarMetadata,
    options: BodyResponseCallback[Schema$DeviceMetadata],
    callback: BodyResponseCallback[Schema$DeviceMetadata]
  ): Unit = js.native
  def metadata(params: ParamsDollarResourceDollarPartnersDollarDevicesDollarMetadata, options: MethodOptions): GaxiosPromise[Schema$DeviceMetadata] = js.native
  def metadata(
    params: ParamsDollarResourceDollarPartnersDollarDevicesDollarMetadata,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DeviceMetadata]
  ): Unit = js.native
  /**
    * androiddeviceprovisioning.partners.devices.unclaim
    * @desc Unclaims a device from a customer and removes it from zero-touch
    * enrollment.
    * @alias androiddeviceprovisioning.partners.devices.unclaim
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.partnerId Required. The ID of the reseller partner.
    * @param {().UnclaimDeviceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def unclaim(): GaxiosPromise[Schema$Empty] = js.native
  def unclaim(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def unclaim(params: ParamsDollarResourceDollarPartnersDollarDevicesDollarUnclaim): GaxiosPromise[Schema$Empty] = js.native
  def unclaim(
    params: ParamsDollarResourceDollarPartnersDollarDevicesDollarUnclaim,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def unclaim(
    params: ParamsDollarResourceDollarPartnersDollarDevicesDollarUnclaim,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def unclaim(params: ParamsDollarResourceDollarPartnersDollarDevicesDollarUnclaim, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def unclaim(
    params: ParamsDollarResourceDollarPartnersDollarDevicesDollarUnclaim,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * androiddeviceprovisioning.partners.devices.unclaimAsync
    * @desc Unclaims a batch of devices for a customer asynchronously. Removes
    * the devices from zero-touch enrollment. To learn more, read [Long‑running
    * batch operations](/zero-touch/guides/how-it-works#operations).
    * @alias androiddeviceprovisioning.partners.devices.unclaimAsync
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.partnerId Required. The reseller partner ID.
    * @param {().UnclaimDevicesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def unclaimAsync(): GaxiosPromise[Schema$Operation] = js.native
  def unclaimAsync(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def unclaimAsync(params: ParamsDollarResourceDollarPartnersDollarDevicesDollarUnclaimasync): GaxiosPromise[Schema$Operation] = js.native
  def unclaimAsync(
    params: ParamsDollarResourceDollarPartnersDollarDevicesDollarUnclaimasync,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def unclaimAsync(
    params: ParamsDollarResourceDollarPartnersDollarDevicesDollarUnclaimasync,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def unclaimAsync(params: ParamsDollarResourceDollarPartnersDollarDevicesDollarUnclaimasync, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def unclaimAsync(
    params: ParamsDollarResourceDollarPartnersDollarDevicesDollarUnclaimasync,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * androiddeviceprovisioning.partners.devices.updateMetadataAsync
    * @desc Updates the reseller metadata attached to a batch of devices. This
    * method updates devices asynchronously and returns an `Operation` that can
    * be used to track progress. Read [Long‑running batch
    * operations](/zero-touch/guides/how-it-works#operations).
    * @alias androiddeviceprovisioning.partners.devices.updateMetadataAsync
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.partnerId Required. The reseller partner ID.
    * @param {().UpdateDeviceMetadataInBatchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateMetadataAsync(): GaxiosPromise[Schema$Operation] = js.native
  def updateMetadataAsync(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def updateMetadataAsync(params: ParamsDollarResourceDollarPartnersDollarDevicesDollarUpdatemetadataasync): GaxiosPromise[Schema$Operation] = js.native
  def updateMetadataAsync(
    params: ParamsDollarResourceDollarPartnersDollarDevicesDollarUpdatemetadataasync,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def updateMetadataAsync(
    params: ParamsDollarResourceDollarPartnersDollarDevicesDollarUpdatemetadataasync,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def updateMetadataAsync(
    params: ParamsDollarResourceDollarPartnersDollarDevicesDollarUpdatemetadataasync,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def updateMetadataAsync(
    params: ParamsDollarResourceDollarPartnersDollarDevicesDollarUpdatemetadataasync,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

