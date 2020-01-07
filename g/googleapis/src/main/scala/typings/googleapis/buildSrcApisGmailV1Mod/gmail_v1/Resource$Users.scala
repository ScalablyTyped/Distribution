package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users")
@js.native
class Resource$Users protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var drafts: ResourceDollarUsersDollarDrafts = js.native
  var history: ResourceDollarUsersDollarHistory = js.native
  var labels: ResourceDollarUsersDollarLabels = js.native
  var messages: ResourceDollarUsersDollarMessages = js.native
  var settings: ResourceDollarUsersDollarSettings = js.native
  var threads: ResourceDollarUsersDollarThreads = js.native
  /**
    * gmail.users.getProfile
    * @desc Gets the current user's Gmail profile.
    * @alias gmail.users.getProfile
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getProfile(): GaxiosPromise[Schema$Profile] = js.native
  def getProfile(callback: BodyResponseCallback[Schema$Profile]): Unit = js.native
  def getProfile(params: ParamsDollarResourceDollarUsersDollarGetprofile): GaxiosPromise[Schema$Profile] = js.native
  def getProfile(
    params: ParamsDollarResourceDollarUsersDollarGetprofile,
    callback: BodyResponseCallback[Schema$Profile]
  ): Unit = js.native
  def getProfile(
    params: ParamsDollarResourceDollarUsersDollarGetprofile,
    options: BodyResponseCallback[Schema$Profile],
    callback: BodyResponseCallback[Schema$Profile]
  ): Unit = js.native
  def getProfile(params: ParamsDollarResourceDollarUsersDollarGetprofile, options: MethodOptions): GaxiosPromise[Schema$Profile] = js.native
  def getProfile(
    params: ParamsDollarResourceDollarUsersDollarGetprofile,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Profile]
  ): Unit = js.native
  /**
    * gmail.users.stop
    * @desc Stop receiving push notifications for the given user mailbox.
    * @alias gmail.users.stop
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def stop(): GaxiosPromise[Unit] = js.native
  def stop(callback: BodyResponseCallback[Unit]): Unit = js.native
  def stop(params: ParamsDollarResourceDollarUsersDollarStop): GaxiosPromise[Unit] = js.native
  def stop(params: ParamsDollarResourceDollarUsersDollarStop, callback: BodyResponseCallback[Unit]): Unit = js.native
  def stop(
    params: ParamsDollarResourceDollarUsersDollarStop,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def stop(params: ParamsDollarResourceDollarUsersDollarStop, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def stop(
    params: ParamsDollarResourceDollarUsersDollarStop,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gmail.users.watch
    * @desc Set up or update a push notification watch on the given user
    * mailbox.
    * @alias gmail.users.watch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {().WatchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def watch(): GaxiosPromise[Schema$WatchResponse] = js.native
  def watch(callback: BodyResponseCallback[Schema$WatchResponse]): Unit = js.native
  def watch(params: ParamsDollarResourceDollarUsersDollarWatch): GaxiosPromise[Schema$WatchResponse] = js.native
  def watch(
    params: ParamsDollarResourceDollarUsersDollarWatch,
    callback: BodyResponseCallback[Schema$WatchResponse]
  ): Unit = js.native
  def watch(
    params: ParamsDollarResourceDollarUsersDollarWatch,
    options: BodyResponseCallback[Schema$WatchResponse],
    callback: BodyResponseCallback[Schema$WatchResponse]
  ): Unit = js.native
  def watch(params: ParamsDollarResourceDollarUsersDollarWatch, options: MethodOptions): GaxiosPromise[Schema$WatchResponse] = js.native
  def watch(
    params: ParamsDollarResourceDollarUsersDollarWatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$WatchResponse]
  ): Unit = js.native
}

