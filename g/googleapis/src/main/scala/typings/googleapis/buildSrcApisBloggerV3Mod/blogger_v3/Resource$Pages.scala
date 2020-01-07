package typings.googleapis.buildSrcApisBloggerV3Mod.blogger_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/blogger/v3", "blogger_v3.Resource$Pages")
@js.native
class Resource$Pages protected () extends js.Object {
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
  def delete(params: ParamsDollarResourceDollarPagesDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarPagesDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarPagesDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarPagesDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarPagesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
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
  def get(): GaxiosPromise[Schema$Page] = js.native
  def get(callback: BodyResponseCallback[Schema$Page]): Unit = js.native
  def get(params: ParamsDollarResourceDollarPagesDollarGet): GaxiosPromise[Schema$Page] = js.native
  def get(params: ParamsDollarResourceDollarPagesDollarGet, callback: BodyResponseCallback[Schema$Page]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarPagesDollarGet,
    options: BodyResponseCallback[Schema$Page],
    callback: BodyResponseCallback[Schema$Page]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarPagesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Page] = js.native
  def get(
    params: ParamsDollarResourceDollarPagesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Page]
  ): Unit = js.native
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
  def insert(): GaxiosPromise[Schema$Page] = js.native
  def insert(callback: BodyResponseCallback[Schema$Page]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarPagesDollarInsert): GaxiosPromise[Schema$Page] = js.native
  def insert(params: ParamsDollarResourceDollarPagesDollarInsert, callback: BodyResponseCallback[Schema$Page]): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarPagesDollarInsert,
    options: BodyResponseCallback[Schema$Page],
    callback: BodyResponseCallback[Schema$Page]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarPagesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Page] = js.native
  def insert(
    params: ParamsDollarResourceDollarPagesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Page]
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
  def list(): GaxiosPromise[Schema$PageList] = js.native
  def list(callback: BodyResponseCallback[Schema$PageList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarPagesDollarList): GaxiosPromise[Schema$PageList] = js.native
  def list(params: ParamsDollarResourceDollarPagesDollarList, callback: BodyResponseCallback[Schema$PageList]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarPagesDollarList,
    options: BodyResponseCallback[Schema$PageList],
    callback: BodyResponseCallback[Schema$PageList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarPagesDollarList, options: MethodOptions): GaxiosPromise[Schema$PageList] = js.native
  def list(
    params: ParamsDollarResourceDollarPagesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PageList]
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
  def patch(): GaxiosPromise[Schema$Page] = js.native
  def patch(callback: BodyResponseCallback[Schema$Page]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarPagesDollarPatch): GaxiosPromise[Schema$Page] = js.native
  def patch(params: ParamsDollarResourceDollarPagesDollarPatch, callback: BodyResponseCallback[Schema$Page]): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarPagesDollarPatch,
    options: BodyResponseCallback[Schema$Page],
    callback: BodyResponseCallback[Schema$Page]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarPagesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Page] = js.native
  def patch(
    params: ParamsDollarResourceDollarPagesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Page]
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
  def publish(): GaxiosPromise[Schema$Page] = js.native
  def publish(callback: BodyResponseCallback[Schema$Page]): Unit = js.native
  def publish(params: ParamsDollarResourceDollarPagesDollarPublish): GaxiosPromise[Schema$Page] = js.native
  def publish(params: ParamsDollarResourceDollarPagesDollarPublish, callback: BodyResponseCallback[Schema$Page]): Unit = js.native
  def publish(
    params: ParamsDollarResourceDollarPagesDollarPublish,
    options: BodyResponseCallback[Schema$Page],
    callback: BodyResponseCallback[Schema$Page]
  ): Unit = js.native
  def publish(params: ParamsDollarResourceDollarPagesDollarPublish, options: MethodOptions): GaxiosPromise[Schema$Page] = js.native
  def publish(
    params: ParamsDollarResourceDollarPagesDollarPublish,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Page]
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
  def revert(): GaxiosPromise[Schema$Page] = js.native
  def revert(callback: BodyResponseCallback[Schema$Page]): Unit = js.native
  def revert(params: ParamsDollarResourceDollarPagesDollarRevert): GaxiosPromise[Schema$Page] = js.native
  def revert(params: ParamsDollarResourceDollarPagesDollarRevert, callback: BodyResponseCallback[Schema$Page]): Unit = js.native
  def revert(
    params: ParamsDollarResourceDollarPagesDollarRevert,
    options: BodyResponseCallback[Schema$Page],
    callback: BodyResponseCallback[Schema$Page]
  ): Unit = js.native
  def revert(params: ParamsDollarResourceDollarPagesDollarRevert, options: MethodOptions): GaxiosPromise[Schema$Page] = js.native
  def revert(
    params: ParamsDollarResourceDollarPagesDollarRevert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Page]
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
  def update(): GaxiosPromise[Schema$Page] = js.native
  def update(callback: BodyResponseCallback[Schema$Page]): Unit = js.native
  def update(params: ParamsDollarResourceDollarPagesDollarUpdate): GaxiosPromise[Schema$Page] = js.native
  def update(params: ParamsDollarResourceDollarPagesDollarUpdate, callback: BodyResponseCallback[Schema$Page]): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarPagesDollarUpdate,
    options: BodyResponseCallback[Schema$Page],
    callback: BodyResponseCallback[Schema$Page]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarPagesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Page] = js.native
  def update(
    params: ParamsDollarResourceDollarPagesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Page]
  ): Unit = js.native
}

