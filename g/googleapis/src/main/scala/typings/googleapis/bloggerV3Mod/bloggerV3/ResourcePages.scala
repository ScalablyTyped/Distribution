package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/blogger/v3", "blogger_v3.Resource$Pages")
@js.native
class ResourcePages protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * blogger.pages.delete
    * @desc Delete a page by ID.
    * @alias blogger.pages.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId The ID of the Blog.
    * @param {string} params.pageId The ID of the Page.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePagesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePagesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourcePagesDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourcePagesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePagesDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * blogger.pages.get
    * @desc Gets one blog page by ID.
    * @alias blogger.pages.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId ID of the blog containing the page.
    * @param {string} params.pageId The ID of the page to get.
    * @param {string=} params.view
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaPage] = js.native
  def get(callback: BodyResponseCallback[SchemaPage]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPage] = js.native
  def get(params: ParamsResourcePagesGet): GaxiosPromise[SchemaPage] = js.native
  def get(params: ParamsResourcePagesGet, callback: BodyResponseCallback[SchemaPage]): Unit = js.native
  def get(
    params: ParamsResourcePagesGet,
    options: BodyResponseCallback[SchemaPage],
    callback: BodyResponseCallback[SchemaPage]
  ): Unit = js.native
  def get(params: ParamsResourcePagesGet, options: MethodOptions): GaxiosPromise[SchemaPage] = js.native
  def get(params: ParamsResourcePagesGet, options: MethodOptions, callback: BodyResponseCallback[SchemaPage]): Unit = js.native
  /**
    * blogger.pages.insert
    * @desc Add a page.
    * @alias blogger.pages.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId ID of the blog to add the page to.
    * @param {boolean=} params.isDraft Whether to create the page as a draft (default: false).
    * @param {().Page} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaPage] = js.native
  def insert(callback: BodyResponseCallback[SchemaPage]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPage] = js.native
  def insert(params: ParamsResourcePagesInsert): GaxiosPromise[SchemaPage] = js.native
  def insert(params: ParamsResourcePagesInsert, callback: BodyResponseCallback[SchemaPage]): Unit = js.native
  def insert(
    params: ParamsResourcePagesInsert,
    options: BodyResponseCallback[SchemaPage],
    callback: BodyResponseCallback[SchemaPage]
  ): Unit = js.native
  def insert(params: ParamsResourcePagesInsert, options: MethodOptions): GaxiosPromise[SchemaPage] = js.native
  def insert(
    params: ParamsResourcePagesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPage]
  ): Unit = js.native
  /**
    * blogger.pages.list
    * @desc Retrieves the pages for a blog, optionally including non-LIVE
    * statuses.
    * @alias blogger.pages.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId ID of the blog to fetch Pages from.
    * @param {boolean=} params.fetchBodies Whether to retrieve the Page bodies.
    * @param {integer=} params.maxResults Maximum number of Pages to fetch.
    * @param {string=} params.pageToken Continuation token if the request is paged.
    * @param {string=} params.status
    * @param {string=} params.view Access level with which to view the returned result. Note that some fields require elevated access.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaPageList] = js.native
  def list(callback: BodyResponseCallback[SchemaPageList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPageList] = js.native
  def list(params: ParamsResourcePagesList): GaxiosPromise[SchemaPageList] = js.native
  def list(params: ParamsResourcePagesList, callback: BodyResponseCallback[SchemaPageList]): Unit = js.native
  def list(
    params: ParamsResourcePagesList,
    options: BodyResponseCallback[SchemaPageList],
    callback: BodyResponseCallback[SchemaPageList]
  ): Unit = js.native
  def list(params: ParamsResourcePagesList, options: MethodOptions): GaxiosPromise[SchemaPageList] = js.native
  def list(
    params: ParamsResourcePagesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPageList]
  ): Unit = js.native
  /**
    * blogger.pages.patch
    * @desc Update a page. This method supports patch semantics.
    * @alias blogger.pages.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId The ID of the Blog.
    * @param {string} params.pageId The ID of the Page.
    * @param {boolean=} params.publish Whether a publish action should be performed when the page is updated (default: false).
    * @param {boolean=} params.revert Whether a revert action should be performed when the page is updated (default: false).
    * @param {().Page} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaPage] = js.native
  def patch(callback: BodyResponseCallback[SchemaPage]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPage] = js.native
  def patch(params: ParamsResourcePagesPatch): GaxiosPromise[SchemaPage] = js.native
  def patch(params: ParamsResourcePagesPatch, callback: BodyResponseCallback[SchemaPage]): Unit = js.native
  def patch(
    params: ParamsResourcePagesPatch,
    options: BodyResponseCallback[SchemaPage],
    callback: BodyResponseCallback[SchemaPage]
  ): Unit = js.native
  def patch(params: ParamsResourcePagesPatch, options: MethodOptions): GaxiosPromise[SchemaPage] = js.native
  def patch(
    params: ParamsResourcePagesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPage]
  ): Unit = js.native
  /**
    * blogger.pages.publish
    * @desc Publishes a draft page.
    * @alias blogger.pages.publish
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId The ID of the blog.
    * @param {string} params.pageId The ID of the page.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def publish(): GaxiosPromise[SchemaPage] = js.native
  def publish(callback: BodyResponseCallback[SchemaPage]): Unit = js.native
  def publish(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPage] = js.native
  def publish(params: ParamsResourcePagesPublish): GaxiosPromise[SchemaPage] = js.native
  def publish(params: ParamsResourcePagesPublish, callback: BodyResponseCallback[SchemaPage]): Unit = js.native
  def publish(
    params: ParamsResourcePagesPublish,
    options: BodyResponseCallback[SchemaPage],
    callback: BodyResponseCallback[SchemaPage]
  ): Unit = js.native
  def publish(params: ParamsResourcePagesPublish, options: MethodOptions): GaxiosPromise[SchemaPage] = js.native
  def publish(
    params: ParamsResourcePagesPublish,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPage]
  ): Unit = js.native
  /**
    * blogger.pages.revert
    * @desc Revert a published or scheduled page to draft state.
    * @alias blogger.pages.revert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId The ID of the blog.
    * @param {string} params.pageId The ID of the page.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def revert(): GaxiosPromise[SchemaPage] = js.native
  def revert(callback: BodyResponseCallback[SchemaPage]): Unit = js.native
  def revert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPage] = js.native
  def revert(params: ParamsResourcePagesRevert): GaxiosPromise[SchemaPage] = js.native
  def revert(params: ParamsResourcePagesRevert, callback: BodyResponseCallback[SchemaPage]): Unit = js.native
  def revert(
    params: ParamsResourcePagesRevert,
    options: BodyResponseCallback[SchemaPage],
    callback: BodyResponseCallback[SchemaPage]
  ): Unit = js.native
  def revert(params: ParamsResourcePagesRevert, options: MethodOptions): GaxiosPromise[SchemaPage] = js.native
  def revert(
    params: ParamsResourcePagesRevert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPage]
  ): Unit = js.native
  /**
    * blogger.pages.update
    * @desc Update a page.
    * @alias blogger.pages.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId The ID of the Blog.
    * @param {string} params.pageId The ID of the Page.
    * @param {boolean=} params.publish Whether a publish action should be performed when the page is updated (default: false).
    * @param {boolean=} params.revert Whether a revert action should be performed when the page is updated (default: false).
    * @param {().Page} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaPage] = js.native
  def update(callback: BodyResponseCallback[SchemaPage]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPage] = js.native
  def update(params: ParamsResourcePagesUpdate): GaxiosPromise[SchemaPage] = js.native
  def update(params: ParamsResourcePagesUpdate, callback: BodyResponseCallback[SchemaPage]): Unit = js.native
  def update(
    params: ParamsResourcePagesUpdate,
    options: BodyResponseCallback[SchemaPage],
    callback: BodyResponseCallback[SchemaPage]
  ): Unit = js.native
  def update(params: ParamsResourcePagesUpdate, options: MethodOptions): GaxiosPromise[SchemaPage] = js.native
  def update(
    params: ParamsResourcePagesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPage]
  ): Unit = js.native
}

