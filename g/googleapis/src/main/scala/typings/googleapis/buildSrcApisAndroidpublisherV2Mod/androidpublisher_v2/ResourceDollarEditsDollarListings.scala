package typings.googleapis.buildSrcApisAndroidpublisherV2Mod.androidpublisher_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidpublisher/v2", "androidpublisher_v2.Resource$Edits$Listings")
@js.native
class ResourceDollarEditsDollarListings protected () extends js.Object {
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
  def delete(params: ParamsDollarResourceDollarEditsDollarListingsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarEditsDollarListingsDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarEditsDollarListingsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarEditsDollarListingsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarEditsDollarListingsDollarDelete,
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
  def deleteall(params: ParamsDollarResourceDollarEditsDollarListingsDollarDeleteall): GaxiosPromise[Unit] = js.native
  def deleteall(
    params: ParamsDollarResourceDollarEditsDollarListingsDollarDeleteall,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def deleteall(
    params: ParamsDollarResourceDollarEditsDollarListingsDollarDeleteall,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def deleteall(params: ParamsDollarResourceDollarEditsDollarListingsDollarDeleteall, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def deleteall(
    params: ParamsDollarResourceDollarEditsDollarListingsDollarDeleteall,
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
  def get(): GaxiosPromise[Schema$Listing] = js.native
  def get(callback: BodyResponseCallback[Schema$Listing]): Unit = js.native
  def get(params: ParamsDollarResourceDollarEditsDollarListingsDollarGet): GaxiosPromise[Schema$Listing] = js.native
  def get(
    params: ParamsDollarResourceDollarEditsDollarListingsDollarGet,
    callback: BodyResponseCallback[Schema$Listing]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarEditsDollarListingsDollarGet,
    options: BodyResponseCallback[Schema$Listing],
    callback: BodyResponseCallback[Schema$Listing]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarEditsDollarListingsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Listing] = js.native
  def get(
    params: ParamsDollarResourceDollarEditsDollarListingsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Listing]
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
  def list(): GaxiosPromise[Schema$ListingsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListingsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarEditsDollarListingsDollarList): GaxiosPromise[Schema$ListingsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarEditsDollarListingsDollarList,
    callback: BodyResponseCallback[Schema$ListingsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarEditsDollarListingsDollarList,
    options: BodyResponseCallback[Schema$ListingsListResponse],
    callback: BodyResponseCallback[Schema$ListingsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarEditsDollarListingsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListingsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarEditsDollarListingsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListingsListResponse]
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
  def patch(): GaxiosPromise[Schema$Listing] = js.native
  def patch(callback: BodyResponseCallback[Schema$Listing]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarEditsDollarListingsDollarPatch): GaxiosPromise[Schema$Listing] = js.native
  def patch(
    params: ParamsDollarResourceDollarEditsDollarListingsDollarPatch,
    callback: BodyResponseCallback[Schema$Listing]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarEditsDollarListingsDollarPatch,
    options: BodyResponseCallback[Schema$Listing],
    callback: BodyResponseCallback[Schema$Listing]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarEditsDollarListingsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Listing] = js.native
  def patch(
    params: ParamsDollarResourceDollarEditsDollarListingsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Listing]
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
  def update(): GaxiosPromise[Schema$Listing] = js.native
  def update(callback: BodyResponseCallback[Schema$Listing]): Unit = js.native
  def update(params: ParamsDollarResourceDollarEditsDollarListingsDollarUpdate): GaxiosPromise[Schema$Listing] = js.native
  def update(
    params: ParamsDollarResourceDollarEditsDollarListingsDollarUpdate,
    callback: BodyResponseCallback[Schema$Listing]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarEditsDollarListingsDollarUpdate,
    options: BodyResponseCallback[Schema$Listing],
    callback: BodyResponseCallback[Schema$Listing]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarEditsDollarListingsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Listing] = js.native
  def update(
    params: ParamsDollarResourceDollarEditsDollarListingsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Listing]
  ): Unit = js.native
}

