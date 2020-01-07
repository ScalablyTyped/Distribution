package typings.googleapis.buildSrcApisLicensingV1Mod.licensing_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/licensing/v1", "licensing_v1.Resource$Licenseassignments")
@js.native
class Resource$Licenseassignments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * licensing.licenseAssignments.delete
    * @desc Revoke License.
    * @alias licensing.licenseAssignments.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.productId Name for product
    * @param {string} params.skuId Name for sku
    * @param {string} params.userId email id or unique Id of the user
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarLicenseassignmentsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarLicenseassignmentsDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarLicenseassignmentsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarLicenseassignmentsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarLicenseassignmentsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * licensing.licenseAssignments.get
    * @desc Get license assignment of a particular product and sku for a user
    * @alias licensing.licenseAssignments.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.productId Name for product
    * @param {string} params.skuId Name for sku
    * @param {string} params.userId email id or unique Id of the user
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$LicenseAssignment] = js.native
  def get(callback: BodyResponseCallback[Schema$LicenseAssignment]): Unit = js.native
  def get(params: ParamsDollarResourceDollarLicenseassignmentsDollarGet): GaxiosPromise[Schema$LicenseAssignment] = js.native
  def get(
    params: ParamsDollarResourceDollarLicenseassignmentsDollarGet,
    callback: BodyResponseCallback[Schema$LicenseAssignment]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarLicenseassignmentsDollarGet,
    options: BodyResponseCallback[Schema$LicenseAssignment],
    callback: BodyResponseCallback[Schema$LicenseAssignment]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarLicenseassignmentsDollarGet, options: MethodOptions): GaxiosPromise[Schema$LicenseAssignment] = js.native
  def get(
    params: ParamsDollarResourceDollarLicenseassignmentsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LicenseAssignment]
  ): Unit = js.native
  /**
    * licensing.licenseAssignments.insert
    * @desc Assign License.
    * @alias licensing.licenseAssignments.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.productId Name for product
    * @param {string} params.skuId Name for sku
    * @param {().LicenseAssignmentInsert} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$LicenseAssignment] = js.native
  def insert(callback: BodyResponseCallback[Schema$LicenseAssignment]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarLicenseassignmentsDollarInsert): GaxiosPromise[Schema$LicenseAssignment] = js.native
  def insert(
    params: ParamsDollarResourceDollarLicenseassignmentsDollarInsert,
    callback: BodyResponseCallback[Schema$LicenseAssignment]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarLicenseassignmentsDollarInsert,
    options: BodyResponseCallback[Schema$LicenseAssignment],
    callback: BodyResponseCallback[Schema$LicenseAssignment]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarLicenseassignmentsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$LicenseAssignment] = js.native
  def insert(
    params: ParamsDollarResourceDollarLicenseassignmentsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LicenseAssignment]
  ): Unit = js.native
  /**
    * licensing.licenseAssignments.listForProduct
    * @desc List license assignments for given product of the customer.
    * @alias licensing.licenseAssignments.listForProduct
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId CustomerId represents the customer for whom licenseassignments are queried
    * @param {integer=} params.maxResults Maximum number of campaigns to return at one time. Must be positive. Optional. Default value is 100.
    * @param {string=} params.pageToken Token to fetch the next page.Optional. By default server will return first page
    * @param {string} params.productId Name for product
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listForProduct(): GaxiosPromise[Schema$LicenseAssignmentList] = js.native
  def listForProduct(callback: BodyResponseCallback[Schema$LicenseAssignmentList]): Unit = js.native
  def listForProduct(params: ParamsDollarResourceDollarLicenseassignmentsDollarListforproduct): GaxiosPromise[Schema$LicenseAssignmentList] = js.native
  def listForProduct(
    params: ParamsDollarResourceDollarLicenseassignmentsDollarListforproduct,
    callback: BodyResponseCallback[Schema$LicenseAssignmentList]
  ): Unit = js.native
  def listForProduct(
    params: ParamsDollarResourceDollarLicenseassignmentsDollarListforproduct,
    options: BodyResponseCallback[Schema$LicenseAssignmentList],
    callback: BodyResponseCallback[Schema$LicenseAssignmentList]
  ): Unit = js.native
  def listForProduct(params: ParamsDollarResourceDollarLicenseassignmentsDollarListforproduct, options: MethodOptions): GaxiosPromise[Schema$LicenseAssignmentList] = js.native
  def listForProduct(
    params: ParamsDollarResourceDollarLicenseassignmentsDollarListforproduct,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LicenseAssignmentList]
  ): Unit = js.native
  /**
    * licensing.licenseAssignments.listForProductAndSku
    * @desc List license assignments for given product and sku of the customer.
    * @alias licensing.licenseAssignments.listForProductAndSku
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId CustomerId represents the customer for whom licenseassignments are queried
    * @param {integer=} params.maxResults Maximum number of campaigns to return at one time. Must be positive. Optional. Default value is 100.
    * @param {string=} params.pageToken Token to fetch the next page.Optional. By default server will return first page
    * @param {string} params.productId Name for product
    * @param {string} params.skuId Name for sku
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listForProductAndSku(): GaxiosPromise[Schema$LicenseAssignmentList] = js.native
  def listForProductAndSku(callback: BodyResponseCallback[Schema$LicenseAssignmentList]): Unit = js.native
  def listForProductAndSku(params: ParamsDollarResourceDollarLicenseassignmentsDollarListforproductandsku): GaxiosPromise[Schema$LicenseAssignmentList] = js.native
  def listForProductAndSku(
    params: ParamsDollarResourceDollarLicenseassignmentsDollarListforproductandsku,
    callback: BodyResponseCallback[Schema$LicenseAssignmentList]
  ): Unit = js.native
  def listForProductAndSku(
    params: ParamsDollarResourceDollarLicenseassignmentsDollarListforproductandsku,
    options: BodyResponseCallback[Schema$LicenseAssignmentList],
    callback: BodyResponseCallback[Schema$LicenseAssignmentList]
  ): Unit = js.native
  def listForProductAndSku(
    params: ParamsDollarResourceDollarLicenseassignmentsDollarListforproductandsku,
    options: MethodOptions
  ): GaxiosPromise[Schema$LicenseAssignmentList] = js.native
  def listForProductAndSku(
    params: ParamsDollarResourceDollarLicenseassignmentsDollarListforproductandsku,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LicenseAssignmentList]
  ): Unit = js.native
  /**
    * licensing.licenseAssignments.patch
    * @desc Assign License. This method supports patch semantics.
    * @alias licensing.licenseAssignments.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.productId Name for product
    * @param {string} params.skuId Name for sku for which license would be revoked
    * @param {string} params.userId email id or unique Id of the user
    * @param {().LicenseAssignment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$LicenseAssignment] = js.native
  def patch(callback: BodyResponseCallback[Schema$LicenseAssignment]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarLicenseassignmentsDollarPatch): GaxiosPromise[Schema$LicenseAssignment] = js.native
  def patch(
    params: ParamsDollarResourceDollarLicenseassignmentsDollarPatch,
    callback: BodyResponseCallback[Schema$LicenseAssignment]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarLicenseassignmentsDollarPatch,
    options: BodyResponseCallback[Schema$LicenseAssignment],
    callback: BodyResponseCallback[Schema$LicenseAssignment]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarLicenseassignmentsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$LicenseAssignment] = js.native
  def patch(
    params: ParamsDollarResourceDollarLicenseassignmentsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LicenseAssignment]
  ): Unit = js.native
  /**
    * licensing.licenseAssignments.update
    * @desc Assign License.
    * @alias licensing.licenseAssignments.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.productId Name for product
    * @param {string} params.skuId Name for sku for which license would be revoked
    * @param {string} params.userId email id or unique Id of the user
    * @param {().LicenseAssignment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$LicenseAssignment] = js.native
  def update(callback: BodyResponseCallback[Schema$LicenseAssignment]): Unit = js.native
  def update(params: ParamsDollarResourceDollarLicenseassignmentsDollarUpdate): GaxiosPromise[Schema$LicenseAssignment] = js.native
  def update(
    params: ParamsDollarResourceDollarLicenseassignmentsDollarUpdate,
    callback: BodyResponseCallback[Schema$LicenseAssignment]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarLicenseassignmentsDollarUpdate,
    options: BodyResponseCallback[Schema$LicenseAssignment],
    callback: BodyResponseCallback[Schema$LicenseAssignment]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarLicenseassignmentsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$LicenseAssignment] = js.native
  def update(
    params: ParamsDollarResourceDollarLicenseassignmentsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LicenseAssignment]
  ): Unit = js.native
}

