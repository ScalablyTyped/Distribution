package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Edits$Listings")
@js.native
class ResourceEditsListings protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * androidpublisher.edits.listings.delete
    * @desc Deletes the specified localized store listing from an edit.
    * @alias androidpublisher.edits.listings.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.language The language code (a BCP-47 language tag) of the localized listing to read or modify. For example, to select Austrian German, pass "de-AT".
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceEditsListingsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceEditsListingsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceEditsListingsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceEditsListingsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceEditsListingsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * androidpublisher.edits.listings.deleteall
    * @desc Deletes all localized listings from an edit.
    * @alias androidpublisher.edits.listings.deleteall
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deleteall(): GaxiosPromise[Unit] = js.native
  def deleteall(callback: BodyResponseCallback[Unit]): Unit = js.native
  def deleteall(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def deleteall(params: ParamsResourceEditsListingsDeleteall): GaxiosPromise[Unit] = js.native
  def deleteall(params: ParamsResourceEditsListingsDeleteall, callback: BodyResponseCallback[Unit]): Unit = js.native
  def deleteall(
    params: ParamsResourceEditsListingsDeleteall,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def deleteall(params: ParamsResourceEditsListingsDeleteall, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def deleteall(
    params: ParamsResourceEditsListingsDeleteall,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * androidpublisher.edits.listings.get
    * @desc Fetches information about a localized store listing.
    * @alias androidpublisher.edits.listings.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.language The language code (a BCP-47 language tag) of the localized listing to read or modify. For example, to select Austrian German, pass "de-AT".
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaListing] = js.native
  def get(callback: BodyResponseCallback[SchemaListing]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListing] = js.native
  def get(params: ParamsResourceEditsListingsGet): GaxiosPromise[SchemaListing] = js.native
  def get(params: ParamsResourceEditsListingsGet, callback: BodyResponseCallback[SchemaListing]): Unit = js.native
  def get(
    params: ParamsResourceEditsListingsGet,
    options: BodyResponseCallback[SchemaListing],
    callback: BodyResponseCallback[SchemaListing]
  ): Unit = js.native
  def get(params: ParamsResourceEditsListingsGet, options: MethodOptions): GaxiosPromise[SchemaListing] = js.native
  def get(
    params: ParamsResourceEditsListingsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListing]
  ): Unit = js.native
  
  /**
    * androidpublisher.edits.listings.list
    * @desc Returns all of the localized store listings attached to this edit.
    * @alias androidpublisher.edits.listings.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListingsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListingsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListingsListResponse] = js.native
  def list(params: ParamsResourceEditsListingsList): GaxiosPromise[SchemaListingsListResponse] = js.native
  def list(
    params: ParamsResourceEditsListingsList,
    callback: BodyResponseCallback[SchemaListingsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceEditsListingsList,
    options: BodyResponseCallback[SchemaListingsListResponse],
    callback: BodyResponseCallback[SchemaListingsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceEditsListingsList, options: MethodOptions): GaxiosPromise[SchemaListingsListResponse] = js.native
  def list(
    params: ParamsResourceEditsListingsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListingsListResponse]
  ): Unit = js.native
  
  /**
    * androidpublisher.edits.listings.patch
    * @desc Creates or updates a localized store listing. This method supports
    * patch semantics.
    * @alias androidpublisher.edits.listings.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.language The language code (a BCP-47 language tag) of the localized listing to read or modify. For example, to select Austrian German, pass "de-AT".
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {().Listing} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaListing] = js.native
  def patch(callback: BodyResponseCallback[SchemaListing]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListing] = js.native
  def patch(params: ParamsResourceEditsListingsPatch): GaxiosPromise[SchemaListing] = js.native
  def patch(params: ParamsResourceEditsListingsPatch, callback: BodyResponseCallback[SchemaListing]): Unit = js.native
  def patch(
    params: ParamsResourceEditsListingsPatch,
    options: BodyResponseCallback[SchemaListing],
    callback: BodyResponseCallback[SchemaListing]
  ): Unit = js.native
  def patch(params: ParamsResourceEditsListingsPatch, options: MethodOptions): GaxiosPromise[SchemaListing] = js.native
  def patch(
    params: ParamsResourceEditsListingsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListing]
  ): Unit = js.native
  
  /**
    * androidpublisher.edits.listings.update
    * @desc Creates or updates a localized store listing.
    * @alias androidpublisher.edits.listings.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.language The language code (a BCP-47 language tag) of the localized listing to read or modify. For example, to select Austrian German, pass "de-AT".
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {().Listing} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaListing] = js.native
  def update(callback: BodyResponseCallback[SchemaListing]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListing] = js.native
  def update(params: ParamsResourceEditsListingsUpdate): GaxiosPromise[SchemaListing] = js.native
  def update(params: ParamsResourceEditsListingsUpdate, callback: BodyResponseCallback[SchemaListing]): Unit = js.native
  def update(
    params: ParamsResourceEditsListingsUpdate,
    options: BodyResponseCallback[SchemaListing],
    callback: BodyResponseCallback[SchemaListing]
  ): Unit = js.native
  def update(params: ParamsResourceEditsListingsUpdate, options: MethodOptions): GaxiosPromise[SchemaListing] = js.native
  def update(
    params: ParamsResourceEditsListingsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListing]
  ): Unit = js.native
}
