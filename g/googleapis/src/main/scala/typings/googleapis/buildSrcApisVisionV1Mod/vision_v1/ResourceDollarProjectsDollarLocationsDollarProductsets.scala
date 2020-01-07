package typings.googleapis.buildSrcApisVisionV1Mod.vision_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/vision/v1", "vision_v1.Resource$Projects$Locations$Productsets")
@js.native
class ResourceDollarProjectsDollarLocationsDollarProductsets protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var products: ResourceDollarProjectsDollarLocationsDollarProductsetsDollarProducts = js.native
  /**
    * vision.projects.locations.productSets.addProduct
    * @desc Adds a Product to the specified ProductSet. If the Product is
    * already present, no change is made.  One Product can be added to at most
    * 100 ProductSets.  Possible errors:  * Returns NOT_FOUND if the Product or
    * the ProductSet doesn't exist.
    * @alias vision.projects.locations.productSets.addProduct
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name for the ProductSet to modify.  Format is: `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`
    * @param {().AddProductToProductSetRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addProduct(): GaxiosPromise[Schema$Empty] = js.native
  def addProduct(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def addProduct(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarAddproduct): GaxiosPromise[Schema$Empty] = js.native
  def addProduct(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarAddproduct,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def addProduct(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarAddproduct,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def addProduct(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarAddproduct,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def addProduct(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarAddproduct,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * vision.projects.locations.productSets.create
    * @desc Creates and returns a new ProductSet resource.  Possible errors:  *
    * Returns INVALID_ARGUMENT if display_name is missing, or is longer than
    * 4096 characters.
    * @alias vision.projects.locations.productSets.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The project in which the ProductSet should be created.  Format is `projects/PROJECT_ID/locations/LOC_ID`.
    * @param {string=} params.productSetId A user-supplied resource id for this ProductSet. If set, the server will attempt to use this value as the resource id. If it is already in use, an error is returned with code ALREADY_EXISTS. Must be at most 128 characters long. It cannot contain the character `/`.
    * @param {().ProductSet} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$ProductSet] = js.native
  def create(callback: BodyResponseCallback[Schema$ProductSet]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarCreate): GaxiosPromise[Schema$ProductSet] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarCreate,
    callback: BodyResponseCallback[Schema$ProductSet]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarCreate,
    options: BodyResponseCallback[Schema$ProductSet],
    callback: BodyResponseCallback[Schema$ProductSet]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$ProductSet] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ProductSet]
  ): Unit = js.native
  /**
    * vision.projects.locations.productSets.delete
    * @desc Permanently deletes a ProductSet. Products and ReferenceImages in
    * the ProductSet are not deleted.  The actual image files are not deleted
    * from Google Cloud Storage.  Possible errors:  * Returns NOT_FOUND if the
    * ProductSet does not exist.
    * @alias vision.projects.locations.productSets.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name of the ProductSet to delete.  Format is: `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * vision.projects.locations.productSets.get
    * @desc Gets information associated with a ProductSet.  Possible errors:  *
    * Returns NOT_FOUND if the ProductSet does not exist.
    * @alias vision.projects.locations.productSets.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name of the ProductSet to get.  Format is: `projects/PROJECT_ID/locations/LOG_ID/productSets/PRODUCT_SET_ID`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$ProductSet] = js.native
  def get(callback: BodyResponseCallback[Schema$ProductSet]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarGet): GaxiosPromise[Schema$ProductSet] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarGet,
    callback: BodyResponseCallback[Schema$ProductSet]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarGet,
    options: BodyResponseCallback[Schema$ProductSet],
    callback: BodyResponseCallback[Schema$ProductSet]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$ProductSet] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ProductSet]
  ): Unit = js.native
  /**
    * vision.projects.locations.productSets.import
    * @desc Asynchronous API that imports a list of reference images to specified
    * product sets based on a list of image information.  The
    * google.longrunning.Operation API can be used to keep track of the progress
    * and results of the request. `Operation.metadata` contains
    * `BatchOperationMetadata`. (progress) `Operation.response` contains
    * `ImportProductSetsResponse`. (results)  The input source of this method is a
    * csv file on Google Cloud Storage. For the format of the csv file please see
    * ImportProductSetsGcsSource.csv_file_uri.
    * @alias vision.projects.locations.productSets.import
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The project in which the ProductSets should be imported.  Format is `projects/PROJECT_ID/locations/LOC_ID`.
    * @param {().ImportProductSetsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def `import`(): GaxiosPromise[Schema$Operation] = js.native
  def `import`(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def `import`(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarImport): GaxiosPromise[Schema$Operation] = js.native
  def `import`(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarImport,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def `import`(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarImport,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def `import`(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarImport,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def `import`(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarImport,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * vision.projects.locations.productSets.list
    * @desc Lists ProductSets in an unspecified order.  Possible errors:  * Returns INVALID_ARGUMENT if page_size is greater than 100, or less   than 1.
    * @alias vision.projects.locations.productSets.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of items to return. Default 10, maximum 100.
    * @param {string=} params.pageToken The next_page_token returned from a previous List request, if any.
    * @param {string} params.parent The project from which ProductSets should be listed.  Format is `projects/PROJECT_ID/locations/LOC_ID`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListProductSetsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListProductSetsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarList): GaxiosPromise[Schema$ListProductSetsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarList,
    callback: BodyResponseCallback[Schema$ListProductSetsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarList,
    options: BodyResponseCallback[Schema$ListProductSetsResponse],
    callback: BodyResponseCallback[Schema$ListProductSetsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListProductSetsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListProductSetsResponse]
  ): Unit = js.native
  /**
    * vision.projects.locations.productSets.patch
    * @desc Makes changes to a ProductSet resource. Only display_name can be
    * updated currently.  Possible errors:  * Returns NOT_FOUND if the
    * ProductSet does not exist. * Returns INVALID_ARGUMENT if display_name is
    * present in update_mask but   missing from the request or longer than 4096
    * characters.
    * @alias vision.projects.locations.productSets.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the ProductSet.  Format is: `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`.  This field is ignored when creating a ProductSet.
    * @param {string=} params.updateMask The FieldMask that specifies which fields to update. If update_mask isn't specified, all mutable fields are to be updated. Valid mask path is `display_name`.
    * @param {().ProductSet} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$ProductSet] = js.native
  def patch(callback: BodyResponseCallback[Schema$ProductSet]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarPatch): GaxiosPromise[Schema$ProductSet] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarPatch,
    callback: BodyResponseCallback[Schema$ProductSet]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarPatch,
    options: BodyResponseCallback[Schema$ProductSet],
    callback: BodyResponseCallback[Schema$ProductSet]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$ProductSet] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ProductSet]
  ): Unit = js.native
  /**
    * vision.projects.locations.productSets.removeProduct
    * @desc Removes a Product from the specified ProductSet.  Possible errors:
    * * Returns NOT_FOUND If the Product is not found under the ProductSet.
    * @alias vision.projects.locations.productSets.removeProduct
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name for the ProductSet to modify.  Format is: `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`
    * @param {().RemoveProductFromProductSetRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def removeProduct(): GaxiosPromise[Schema$Empty] = js.native
  def removeProduct(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def removeProduct(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarRemoveproduct): GaxiosPromise[Schema$Empty] = js.native
  def removeProduct(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarRemoveproduct,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def removeProduct(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarRemoveproduct,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def removeProduct(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarRemoveproduct,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def removeProduct(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarRemoveproduct,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
}

