package typings.googleapis.buildSrcApisDriveV2Mod.drive_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/drive/v2", "drive_v2.Resource$Changes")
@js.native
class Resource$Changes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * drive.changes.get
    * @desc Deprecated - Use changes.getStartPageToken and changes.list to
    * retrieve recent changes.
    * @alias drive.changes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.changeId The ID of the change.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {string=} params.teamDriveId The Team Drive from which the change will be returned.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Change] = js.native
  def get(callback: BodyResponseCallback[Schema$Change]): Unit = js.native
  def get(params: ParamsDollarResourceDollarChangesDollarGet): GaxiosPromise[Schema$Change] = js.native
  def get(params: ParamsDollarResourceDollarChangesDollarGet, callback: BodyResponseCallback[Schema$Change]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarChangesDollarGet,
    options: BodyResponseCallback[Schema$Change],
    callback: BodyResponseCallback[Schema$Change]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarChangesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Change] = js.native
  def get(
    params: ParamsDollarResourceDollarChangesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Change]
  ): Unit = js.native
  /**
    * drive.changes.getStartPageToken
    * @desc Gets the starting pageToken for listing future changes.
    * @alias drive.changes.getStartPageToken
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {string=} params.teamDriveId The ID of the Team Drive for which the starting pageToken for listing future changes from that Team Drive will be returned.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getStartPageToken(): GaxiosPromise[Schema$StartPageToken] = js.native
  def getStartPageToken(callback: BodyResponseCallback[Schema$StartPageToken]): Unit = js.native
  def getStartPageToken(params: ParamsDollarResourceDollarChangesDollarGetstartpagetoken): GaxiosPromise[Schema$StartPageToken] = js.native
  def getStartPageToken(
    params: ParamsDollarResourceDollarChangesDollarGetstartpagetoken,
    callback: BodyResponseCallback[Schema$StartPageToken]
  ): Unit = js.native
  def getStartPageToken(
    params: ParamsDollarResourceDollarChangesDollarGetstartpagetoken,
    options: BodyResponseCallback[Schema$StartPageToken],
    callback: BodyResponseCallback[Schema$StartPageToken]
  ): Unit = js.native
  def getStartPageToken(params: ParamsDollarResourceDollarChangesDollarGetstartpagetoken, options: MethodOptions): GaxiosPromise[Schema$StartPageToken] = js.native
  def getStartPageToken(
    params: ParamsDollarResourceDollarChangesDollarGetstartpagetoken,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$StartPageToken]
  ): Unit = js.native
  /**
    * drive.changes.list
    * @desc Lists the changes for a user or Team Drive.
    * @alias drive.changes.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {boolean=} params.includeCorpusRemovals Whether changes should include the file resource if the file is still accessible by the user at the time of the request, even when a file was removed from the list of changes and there will be no further change entries for this file.
    * @param {boolean=} params.includeDeleted Whether to include changes indicating that items have been removed from the list of changes, for example by deletion or loss of access.
    * @param {boolean=} params.includeSubscribed Whether to include changes outside the My Drive hierarchy in the result. When set to false, changes to files such as those in the Application Data folder or shared files which have not been added to My Drive will be omitted from the result.
    * @param {boolean=} params.includeTeamDriveItems Whether Team Drive files or changes should be included in results.
    * @param {integer=} params.maxResults Maximum number of changes to return.
    * @param {string=} params.pageToken The token for continuing a previous list request on the next page. This should be set to the value of 'nextPageToken' from the previous response or to the response from the getStartPageToken method.
    * @param {string=} params.spaces A comma-separated list of spaces to query. Supported values are 'drive', 'appDataFolder' and 'photos'.
    * @param {string=} params.startChangeId Deprecated - use pageToken instead.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {string=} params.teamDriveId The Team Drive from which changes will be returned. If specified the change IDs will be reflective of the Team Drive; use the combined Team Drive ID and change ID as an identifier.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ChangeList] = js.native
  def list(callback: BodyResponseCallback[Schema$ChangeList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarChangesDollarList): GaxiosPromise[Schema$ChangeList] = js.native
  def list(
    params: ParamsDollarResourceDollarChangesDollarList,
    callback: BodyResponseCallback[Schema$ChangeList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarChangesDollarList,
    options: BodyResponseCallback[Schema$ChangeList],
    callback: BodyResponseCallback[Schema$ChangeList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarChangesDollarList, options: MethodOptions): GaxiosPromise[Schema$ChangeList] = js.native
  def list(
    params: ParamsDollarResourceDollarChangesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ChangeList]
  ): Unit = js.native
  /**
    * drive.changes.watch
    * @desc Subscribe to changes for a user.
    * @alias drive.changes.watch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.includeCorpusRemovals Whether changes should include the file resource if the file is still accessible by the user at the time of the request, even when a file was removed from the list of changes and there will be no further change entries for this file.
    * @param {boolean=} params.includeDeleted Whether to include changes indicating that items have been removed from the list of changes, for example by deletion or loss of access.
    * @param {boolean=} params.includeSubscribed Whether to include changes outside the My Drive hierarchy in the result. When set to false, changes to files such as those in the Application Data folder or shared files which have not been added to My Drive will be omitted from the result.
    * @param {boolean=} params.includeTeamDriveItems Whether Team Drive files or changes should be included in results.
    * @param {integer=} params.maxResults Maximum number of changes to return.
    * @param {string=} params.pageToken The token for continuing a previous list request on the next page. This should be set to the value of 'nextPageToken' from the previous response or to the response from the getStartPageToken method.
    * @param {string=} params.spaces A comma-separated list of spaces to query. Supported values are 'drive', 'appDataFolder' and 'photos'.
    * @param {string=} params.startChangeId Deprecated - use pageToken instead.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {string=} params.teamDriveId The Team Drive from which changes will be returned. If specified the change IDs will be reflective of the Team Drive; use the combined Team Drive ID and change ID as an identifier.
    * @param {().Channel} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def watch(): GaxiosPromise[Schema$Channel] = js.native
  def watch(callback: BodyResponseCallback[Schema$Channel]): Unit = js.native
  def watch(params: ParamsDollarResourceDollarChangesDollarWatch): GaxiosPromise[Schema$Channel] = js.native
  def watch(
    params: ParamsDollarResourceDollarChangesDollarWatch,
    callback: BodyResponseCallback[Schema$Channel]
  ): Unit = js.native
  def watch(
    params: ParamsDollarResourceDollarChangesDollarWatch,
    options: BodyResponseCallback[Schema$Channel],
    callback: BodyResponseCallback[Schema$Channel]
  ): Unit = js.native
  def watch(params: ParamsDollarResourceDollarChangesDollarWatch, options: MethodOptions): GaxiosPromise[Schema$Channel] = js.native
  def watch(
    params: ParamsDollarResourceDollarChangesDollarWatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Channel]
  ): Unit = js.native
}

