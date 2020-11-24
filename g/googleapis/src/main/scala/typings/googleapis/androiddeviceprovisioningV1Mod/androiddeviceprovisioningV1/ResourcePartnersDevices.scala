package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androiddeviceprovisioning/v1", "androiddeviceprovisioning_v1.Resource$Partners$Devices")
@js.native
class ResourcePartnersDevices protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
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
  def claim(): GaxiosPromise[SchemaClaimDeviceResponse] = js.native
  def claim(callback: BodyResponseCallback[SchemaClaimDeviceResponse]): Unit = js.native
  def claim(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaClaimDeviceResponse] = js.native
  def claim(params: ParamsResourcePartnersDevicesClaim): GaxiosPromise[SchemaClaimDeviceResponse] = js.native
  def claim(
    params: ParamsResourcePartnersDevicesClaim,
    callback: BodyResponseCallback[SchemaClaimDeviceResponse]
  ): Unit = js.native
  def claim(
    params: ParamsResourcePartnersDevicesClaim,
    options: BodyResponseCallback[SchemaClaimDeviceResponse],
    callback: BodyResponseCallback[SchemaClaimDeviceResponse]
  ): Unit = js.native
  def claim(params: ParamsResourcePartnersDevicesClaim, options: MethodOptions): GaxiosPromise[SchemaClaimDeviceResponse] = js.native
  def claim(
    params: ParamsResourcePartnersDevicesClaim,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaClaimDeviceResponse]
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
  def claimAsync(): GaxiosPromise[SchemaOperation] = js.native
  def claimAsync(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def claimAsync(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def claimAsync(params: ParamsResourcePartnersDevicesClaimasync): GaxiosPromise[SchemaOperation] = js.native
  def claimAsync(params: ParamsResourcePartnersDevicesClaimasync, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def claimAsync(
    params: ParamsResourcePartnersDevicesClaimasync,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def claimAsync(params: ParamsResourcePartnersDevicesClaimasync, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def claimAsync(
    params: ParamsResourcePartnersDevicesClaimasync,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
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
  def findByIdentifier(): GaxiosPromise[SchemaFindDevicesByDeviceIdentifierResponse] = js.native
  def findByIdentifier(callback: BodyResponseCallback[SchemaFindDevicesByDeviceIdentifierResponse]): Unit = js.native
  def findByIdentifier(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFindDevicesByDeviceIdentifierResponse] = js.native
  def findByIdentifier(params: ParamsResourcePartnersDevicesFindbyidentifier): GaxiosPromise[SchemaFindDevicesByDeviceIdentifierResponse] = js.native
  def findByIdentifier(
    params: ParamsResourcePartnersDevicesFindbyidentifier,
    callback: BodyResponseCallback[SchemaFindDevicesByDeviceIdentifierResponse]
  ): Unit = js.native
  def findByIdentifier(
    params: ParamsResourcePartnersDevicesFindbyidentifier,
    options: BodyResponseCallback[SchemaFindDevicesByDeviceIdentifierResponse],
    callback: BodyResponseCallback[SchemaFindDevicesByDeviceIdentifierResponse]
  ): Unit = js.native
  def findByIdentifier(params: ParamsResourcePartnersDevicesFindbyidentifier, options: MethodOptions): GaxiosPromise[SchemaFindDevicesByDeviceIdentifierResponse] = js.native
  def findByIdentifier(
    params: ParamsResourcePartnersDevicesFindbyidentifier,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFindDevicesByDeviceIdentifierResponse]
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
  def findByOwner(): GaxiosPromise[SchemaFindDevicesByOwnerResponse] = js.native
  def findByOwner(callback: BodyResponseCallback[SchemaFindDevicesByOwnerResponse]): Unit = js.native
  def findByOwner(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFindDevicesByOwnerResponse] = js.native
  def findByOwner(params: ParamsResourcePartnersDevicesFindbyowner): GaxiosPromise[SchemaFindDevicesByOwnerResponse] = js.native
  def findByOwner(
    params: ParamsResourcePartnersDevicesFindbyowner,
    callback: BodyResponseCallback[SchemaFindDevicesByOwnerResponse]
  ): Unit = js.native
  def findByOwner(
    params: ParamsResourcePartnersDevicesFindbyowner,
    options: BodyResponseCallback[SchemaFindDevicesByOwnerResponse],
    callback: BodyResponseCallback[SchemaFindDevicesByOwnerResponse]
  ): Unit = js.native
  def findByOwner(params: ParamsResourcePartnersDevicesFindbyowner, options: MethodOptions): GaxiosPromise[SchemaFindDevicesByOwnerResponse] = js.native
  def findByOwner(
    params: ParamsResourcePartnersDevicesFindbyowner,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFindDevicesByOwnerResponse]
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
  def get(): GaxiosPromise[SchemaDevice] = js.native
  def get(callback: BodyResponseCallback[SchemaDevice]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDevice] = js.native
  def get(params: ParamsResourcePartnersDevicesGet): GaxiosPromise[SchemaDevice] = js.native
  def get(params: ParamsResourcePartnersDevicesGet, callback: BodyResponseCallback[SchemaDevice]): Unit = js.native
  def get(
    params: ParamsResourcePartnersDevicesGet,
    options: BodyResponseCallback[SchemaDevice],
    callback: BodyResponseCallback[SchemaDevice]
  ): Unit = js.native
  def get(params: ParamsResourcePartnersDevicesGet, options: MethodOptions): GaxiosPromise[SchemaDevice] = js.native
  def get(
    params: ParamsResourcePartnersDevicesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDevice]
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
  def metadata(): GaxiosPromise[SchemaDeviceMetadata] = js.native
  def metadata(callback: BodyResponseCallback[SchemaDeviceMetadata]): Unit = js.native
  def metadata(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDeviceMetadata] = js.native
  def metadata(params: ParamsResourcePartnersDevicesMetadata): GaxiosPromise[SchemaDeviceMetadata] = js.native
  def metadata(
    params: ParamsResourcePartnersDevicesMetadata,
    callback: BodyResponseCallback[SchemaDeviceMetadata]
  ): Unit = js.native
  def metadata(
    params: ParamsResourcePartnersDevicesMetadata,
    options: BodyResponseCallback[SchemaDeviceMetadata],
    callback: BodyResponseCallback[SchemaDeviceMetadata]
  ): Unit = js.native
  def metadata(params: ParamsResourcePartnersDevicesMetadata, options: MethodOptions): GaxiosPromise[SchemaDeviceMetadata] = js.native
  def metadata(
    params: ParamsResourcePartnersDevicesMetadata,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeviceMetadata]
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
  def unclaim(): GaxiosPromise[SchemaEmpty] = js.native
  def unclaim(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def unclaim(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def unclaim(params: ParamsResourcePartnersDevicesUnclaim): GaxiosPromise[SchemaEmpty] = js.native
  def unclaim(params: ParamsResourcePartnersDevicesUnclaim, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def unclaim(
    params: ParamsResourcePartnersDevicesUnclaim,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def unclaim(params: ParamsResourcePartnersDevicesUnclaim, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def unclaim(
    params: ParamsResourcePartnersDevicesUnclaim,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
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
  def unclaimAsync(): GaxiosPromise[SchemaOperation] = js.native
  def unclaimAsync(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def unclaimAsync(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def unclaimAsync(params: ParamsResourcePartnersDevicesUnclaimasync): GaxiosPromise[SchemaOperation] = js.native
  def unclaimAsync(params: ParamsResourcePartnersDevicesUnclaimasync, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def unclaimAsync(
    params: ParamsResourcePartnersDevicesUnclaimasync,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def unclaimAsync(params: ParamsResourcePartnersDevicesUnclaimasync, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def unclaimAsync(
    params: ParamsResourcePartnersDevicesUnclaimasync,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
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
  def updateMetadataAsync(): GaxiosPromise[SchemaOperation] = js.native
  def updateMetadataAsync(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def updateMetadataAsync(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateMetadataAsync(params: ParamsResourcePartnersDevicesUpdatemetadataasync): GaxiosPromise[SchemaOperation] = js.native
  def updateMetadataAsync(
    params: ParamsResourcePartnersDevicesUpdatemetadataasync,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def updateMetadataAsync(
    params: ParamsResourcePartnersDevicesUpdatemetadataasync,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def updateMetadataAsync(params: ParamsResourcePartnersDevicesUpdatemetadataasync, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateMetadataAsync(
    params: ParamsResourcePartnersDevicesUpdatemetadataasync,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}
