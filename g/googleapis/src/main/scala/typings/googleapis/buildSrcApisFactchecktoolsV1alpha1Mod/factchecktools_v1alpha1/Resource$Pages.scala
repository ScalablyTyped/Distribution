package typings.googleapis.buildSrcApisFactchecktoolsV1alpha1Mod.factchecktools_v1alpha1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/factchecktools/v1alpha1", "factchecktools_v1alpha1.Resource$Pages")
@js.native
class Resource$Pages protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * factchecktools.pages.create
    * @desc Create `ClaimReview` markup on a page.
    * @alias factchecktools.pages.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
  def create(
    callback: BodyResponseCallback[Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarPagesDollarCreate): GaxiosPromise[Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
  def create(
    params: ParamsDollarResourceDollarPagesDollarCreate,
    callback: BodyResponseCallback[Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarPagesDollarCreate,
    options: BodyResponseCallback[Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage],
    callback: BodyResponseCallback[Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarPagesDollarCreate, options: MethodOptions): GaxiosPromise[Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
  def create(
    params: ParamsDollarResourceDollarPagesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]
  ): Unit = js.native
  /**
    * factchecktools.pages.delete
    * @desc Delete all `ClaimReview` markup on a page.
    * @alias factchecktools.pages.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the resource to delete, in the form of `pages/{page_id}`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarPagesDollarDelete): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsDollarResourceDollarPagesDollarDelete,
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarPagesDollarDelete,
    options: BodyResponseCallback[Schema$GoogleProtobufEmpty],
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarPagesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsDollarResourceDollarPagesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * factchecktools.pages.get
    * @desc Get all `ClaimReview` markup on a page.
    * @alias factchecktools.pages.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the resource to get, in the form of `pages/{page_id}`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
  def get(
    callback: BodyResponseCallback[Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarPagesDollarGet): GaxiosPromise[Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
  def get(
    params: ParamsDollarResourceDollarPagesDollarGet,
    callback: BodyResponseCallback[Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarPagesDollarGet,
    options: BodyResponseCallback[Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage],
    callback: BodyResponseCallback[Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarPagesDollarGet, options: MethodOptions): GaxiosPromise[Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
  def get(
    params: ParamsDollarResourceDollarPagesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]
  ): Unit = js.native
  /**
    * factchecktools.pages.list
    * @desc List the `ClaimReview` markup pages for a specific URL or for an
    * organization.
    * @alias factchecktools.pages.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.offset An integer that specifies the current offset (that is, starting result location) in search results. This field is only considered if `page_token` is unset, and if the request is not for a specific URL. For example, 0 means to return results starting from the first matching result, and 10 means to return from the 11th result.
    * @param {string=} params.organization The organization for which we want to fetch markups for. For instance, "site.com". Cannot be specified along with an URL.
    * @param {integer=} params.pageSize The pagination size. We will return up to that many results. Defaults to 10 if not set. Has no effect if a URL is requested.
    * @param {string=} params.pageToken The pagination token. You may provide the `next_page_token` returned from a previous List request, if any, in order to get the next page. All other fields must have the same values as in the previous request.
    * @param {string=} params.url The URL from which to get `ClaimReview` markup. There will be at most one result. If markup is associated with a more canonical version of the URL provided, we will return that URL instead. Cannot be specified along with an organization.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[
    Schema$GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse
  ] = js.native
  def list(
    callback: BodyResponseCallback[
      Schema$GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse
    ]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarPagesDollarList): GaxiosPromise[
    Schema$GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse
  ] = js.native
  def list(
    params: ParamsDollarResourceDollarPagesDollarList,
    callback: BodyResponseCallback[
      Schema$GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse
    ]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarPagesDollarList,
    options: BodyResponseCallback[
      Schema$GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse
    ],
    callback: BodyResponseCallback[
      Schema$GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse
    ]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarPagesDollarList, options: MethodOptions): GaxiosPromise[
    Schema$GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse
  ] = js.native
  def list(
    params: ParamsDollarResourceDollarPagesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[
      Schema$GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse
    ]
  ): Unit = js.native
  /**
    * factchecktools.pages.update
    * @desc Update for all `ClaimReview` markup on a page  Note that this is a
    * full update. To retain the existing `ClaimReview` markup on a page, first
    * perform a Get operation, then modify the returned markup, and finally
    * call Update with the entire `ClaimReview` markup as the body.
    * @alias factchecktools.pages.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of this `ClaimReview` markup page resource, in the form of `pages/{page_id}`. Except for update requests, this field is output-only and should not be set by the user.
    * @param {().GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
  def update(
    callback: BodyResponseCallback[Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarPagesDollarUpdate): GaxiosPromise[Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
  def update(
    params: ParamsDollarResourceDollarPagesDollarUpdate,
    callback: BodyResponseCallback[Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarPagesDollarUpdate,
    options: BodyResponseCallback[Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage],
    callback: BodyResponseCallback[Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarPagesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
  def update(
    params: ParamsDollarResourceDollarPagesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]
  ): Unit = js.native
}

