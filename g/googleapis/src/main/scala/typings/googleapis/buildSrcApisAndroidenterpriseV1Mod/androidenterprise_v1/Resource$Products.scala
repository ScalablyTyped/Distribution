package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Products")
@js.native
class Resource$Products protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidenterprise.products.approve
    * @desc Approves the specified product and the relevant app permissions, if
    * any. The maximum number of products that you can approve per enterprise
    * customer is 1,000.  To learn how to use managed Google Play to design and
    * create a store layout to display approved products to your users, see
    * Store Layout Design.
    * @alias androidenterprise.products.approve
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.productId The ID of the product.
    * @param {().ProductsApproveRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def approve(): GaxiosPromise[Unit] = js.native
  def approve(callback: BodyResponseCallback[Unit]): Unit = js.native
  def approve(params: ParamsDollarResourceDollarProductsDollarApprove): GaxiosPromise[Unit] = js.native
  def approve(params: ParamsDollarResourceDollarProductsDollarApprove, callback: BodyResponseCallback[Unit]): Unit = js.native
  def approve(
    params: ParamsDollarResourceDollarProductsDollarApprove,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def approve(params: ParamsDollarResourceDollarProductsDollarApprove, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def approve(
    params: ParamsDollarResourceDollarProductsDollarApprove,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * androidenterprise.products.generateApprovalUrl
    * @desc Generates a URL that can be rendered in an iframe to display the
    * permissions (if any) of a product. An enterprise admin must view these
    * permissions and accept them on behalf of their organization in order to
    * approve that product.  Admins should accept the displayed permissions by
    * interacting with a separate UI element in the EMM console, which in turn
    * should trigger the use of this URL as the approvalUrlInfo.approvalUrl
    * property in a Products.approve call to approve the product. This URL can
    * only be used to display permissions for up to 1 day.
    * @alias androidenterprise.products.generateApprovalUrl
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string=} params.languageCode The BCP 47 language code used for permission names and descriptions in the returned iframe, for instance "en-US".
    * @param {string} params.productId The ID of the product.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def generateApprovalUrl(): GaxiosPromise[Schema$ProductsGenerateApprovalUrlResponse] = js.native
  def generateApprovalUrl(callback: BodyResponseCallback[Schema$ProductsGenerateApprovalUrlResponse]): Unit = js.native
  def generateApprovalUrl(params: ParamsDollarResourceDollarProductsDollarGenerateapprovalurl): GaxiosPromise[Schema$ProductsGenerateApprovalUrlResponse] = js.native
  def generateApprovalUrl(
    params: ParamsDollarResourceDollarProductsDollarGenerateapprovalurl,
    callback: BodyResponseCallback[Schema$ProductsGenerateApprovalUrlResponse]
  ): Unit = js.native
  def generateApprovalUrl(
    params: ParamsDollarResourceDollarProductsDollarGenerateapprovalurl,
    options: BodyResponseCallback[Schema$ProductsGenerateApprovalUrlResponse],
    callback: BodyResponseCallback[Schema$ProductsGenerateApprovalUrlResponse]
  ): Unit = js.native
  def generateApprovalUrl(params: ParamsDollarResourceDollarProductsDollarGenerateapprovalurl, options: MethodOptions): GaxiosPromise[Schema$ProductsGenerateApprovalUrlResponse] = js.native
  def generateApprovalUrl(
    params: ParamsDollarResourceDollarProductsDollarGenerateapprovalurl,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ProductsGenerateApprovalUrlResponse]
  ): Unit = js.native
  /**
    * androidenterprise.products.get
    * @desc Retrieves details of a product for display to an enterprise admin.
    * @alias androidenterprise.products.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string=} params.language The BCP47 tag for the user's preferred language (e.g. "en-US", "de").
    * @param {string} params.productId The ID of the product, e.g. "app:com.google.android.gm".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Product] = js.native
  def get(callback: BodyResponseCallback[Schema$Product]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProductsDollarGet): GaxiosPromise[Schema$Product] = js.native
  def get(
    params: ParamsDollarResourceDollarProductsDollarGet,
    callback: BodyResponseCallback[Schema$Product]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProductsDollarGet,
    options: BodyResponseCallback[Schema$Product],
    callback: BodyResponseCallback[Schema$Product]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProductsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Product] = js.native
  def get(
    params: ParamsDollarResourceDollarProductsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Product]
  ): Unit = js.native
  /**
    * androidenterprise.products.getAppRestrictionsSchema
    * @desc Retrieves the schema that defines the configurable properties for
    * this product. All products have a schema, but this schema may be empty if
    * no managed configurations have been defined. This schema can be used to
    * populate a UI that allows an admin to configure the product. To apply a
    * managed configuration based on the schema obtained using this API, see
    * Managed Configurations through Play.
    * @alias androidenterprise.products.getAppRestrictionsSchema
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string=} params.language The BCP47 tag for the user's preferred language (e.g. "en-US", "de").
    * @param {string} params.productId The ID of the product.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getAppRestrictionsSchema(): GaxiosPromise[Schema$AppRestrictionsSchema] = js.native
  def getAppRestrictionsSchema(callback: BodyResponseCallback[Schema$AppRestrictionsSchema]): Unit = js.native
  def getAppRestrictionsSchema(params: ParamsDollarResourceDollarProductsDollarGetapprestrictionsschema): GaxiosPromise[Schema$AppRestrictionsSchema] = js.native
  def getAppRestrictionsSchema(
    params: ParamsDollarResourceDollarProductsDollarGetapprestrictionsschema,
    callback: BodyResponseCallback[Schema$AppRestrictionsSchema]
  ): Unit = js.native
  def getAppRestrictionsSchema(
    params: ParamsDollarResourceDollarProductsDollarGetapprestrictionsschema,
    options: BodyResponseCallback[Schema$AppRestrictionsSchema],
    callback: BodyResponseCallback[Schema$AppRestrictionsSchema]
  ): Unit = js.native
  def getAppRestrictionsSchema(params: ParamsDollarResourceDollarProductsDollarGetapprestrictionsschema, options: MethodOptions): GaxiosPromise[Schema$AppRestrictionsSchema] = js.native
  def getAppRestrictionsSchema(
    params: ParamsDollarResourceDollarProductsDollarGetapprestrictionsschema,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AppRestrictionsSchema]
  ): Unit = js.native
  /**
    * androidenterprise.products.getPermissions
    * @desc Retrieves the Android app permissions required by this app.
    * @alias androidenterprise.products.getPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.productId The ID of the product.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getPermissions(): GaxiosPromise[Schema$ProductPermissions] = js.native
  def getPermissions(callback: BodyResponseCallback[Schema$ProductPermissions]): Unit = js.native
  def getPermissions(params: ParamsDollarResourceDollarProductsDollarGetpermissions): GaxiosPromise[Schema$ProductPermissions] = js.native
  def getPermissions(
    params: ParamsDollarResourceDollarProductsDollarGetpermissions,
    callback: BodyResponseCallback[Schema$ProductPermissions]
  ): Unit = js.native
  def getPermissions(
    params: ParamsDollarResourceDollarProductsDollarGetpermissions,
    options: BodyResponseCallback[Schema$ProductPermissions],
    callback: BodyResponseCallback[Schema$ProductPermissions]
  ): Unit = js.native
  def getPermissions(params: ParamsDollarResourceDollarProductsDollarGetpermissions, options: MethodOptions): GaxiosPromise[Schema$ProductPermissions] = js.native
  def getPermissions(
    params: ParamsDollarResourceDollarProductsDollarGetpermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ProductPermissions]
  ): Unit = js.native
  /**
    * androidenterprise.products.list
    * @desc Finds approved products that match a query, or all approved
    * products if there is no query.
    * @alias androidenterprise.products.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.approved Specifies whether to search among all products (false) or among only products that have been approved (true). Only "true" is supported, and should be specified.
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string=} params.language The BCP47 tag for the user's preferred language (e.g. "en-US", "de"). Results are returned in the language best matching the preferred language.
    * @param {integer=} params.maxResults Specifies the maximum number of products that can be returned per request. If not specified, uses a default value of 100, which is also the maximum retrievable within a single response.
    * @param {string=} params.query The search query as typed in the Google Play store search box. If omitted, all approved apps will be returned (using the pagination parameters), including apps that are not available in the store (e.g. unpublished apps).
    * @param {string=} params.token A pagination token is contained in a request's response when there are more products. The token can be used in a subsequent request to obtain more products, and so forth. This parameter cannot be used in the initial request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ProductsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ProductsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProductsDollarList): GaxiosPromise[Schema$ProductsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProductsDollarList,
    callback: BodyResponseCallback[Schema$ProductsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProductsDollarList,
    options: BodyResponseCallback[Schema$ProductsListResponse],
    callback: BodyResponseCallback[Schema$ProductsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProductsDollarList, options: MethodOptions): GaxiosPromise[Schema$ProductsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProductsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ProductsListResponse]
  ): Unit = js.native
  /**
    * androidenterprise.products.unapprove
    * @desc Unapproves the specified product (and the relevant app permissions,
    * if any)
    * @alias androidenterprise.products.unapprove
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.productId The ID of the product.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def unapprove(): GaxiosPromise[Unit] = js.native
  def unapprove(callback: BodyResponseCallback[Unit]): Unit = js.native
  def unapprove(params: ParamsDollarResourceDollarProductsDollarUnapprove): GaxiosPromise[Unit] = js.native
  def unapprove(params: ParamsDollarResourceDollarProductsDollarUnapprove, callback: BodyResponseCallback[Unit]): Unit = js.native
  def unapprove(
    params: ParamsDollarResourceDollarProductsDollarUnapprove,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def unapprove(params: ParamsDollarResourceDollarProductsDollarUnapprove, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def unapprove(
    params: ParamsDollarResourceDollarProductsDollarUnapprove,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}

