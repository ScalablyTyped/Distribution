package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Directorysitecontacts")
@js.native
class Resource$Directorysitecontacts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.directorySiteContacts.get
    * @desc Gets one directory site contact by ID.
    * @alias dfareporting.directorySiteContacts.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Directory site contact ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$DirectorySiteContact] = js.native
  def get(callback: BodyResponseCallback[Schema$DirectorySiteContact]): Unit = js.native
  def get(params: ParamsDollarResourceDollarDirectorysitecontactsDollarGet): GaxiosPromise[Schema$DirectorySiteContact] = js.native
  def get(
    params: ParamsDollarResourceDollarDirectorysitecontactsDollarGet,
    callback: BodyResponseCallback[Schema$DirectorySiteContact]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarDirectorysitecontactsDollarGet,
    options: BodyResponseCallback[Schema$DirectorySiteContact],
    callback: BodyResponseCallback[Schema$DirectorySiteContact]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarDirectorysitecontactsDollarGet, options: MethodOptions): GaxiosPromise[Schema$DirectorySiteContact] = js.native
  def get(
    params: ParamsDollarResourceDollarDirectorysitecontactsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DirectorySiteContact]
  ): Unit = js.native
  /**
    * dfareporting.directorySiteContacts.list
    * @desc Retrieves a list of directory site contacts, possibly filtered.
    * This method supports paging.
    * @alias dfareporting.directorySiteContacts.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.directorySiteIds Select only directory site contacts with these directory site IDs. This is a required field.
    * @param {string=} params.ids Select only directory site contacts with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for objects by name, ID or email. Wildcards (*) are allowed. For example, "directory site contact*2015" will return objects with names like "directory site contact June 2015", "directory site contact April 2015", or simply "directory site contact 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "directory site contact" will match objects with name "my directory site contact", "directory site contact 2015", or simply "directory site contact".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$DirectorySiteContactsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$DirectorySiteContactsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarDirectorysitecontactsDollarList): GaxiosPromise[Schema$DirectorySiteContactsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarDirectorysitecontactsDollarList,
    callback: BodyResponseCallback[Schema$DirectorySiteContactsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarDirectorysitecontactsDollarList,
    options: BodyResponseCallback[Schema$DirectorySiteContactsListResponse],
    callback: BodyResponseCallback[Schema$DirectorySiteContactsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarDirectorysitecontactsDollarList, options: MethodOptions): GaxiosPromise[Schema$DirectorySiteContactsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarDirectorysitecontactsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DirectorySiteContactsListResponse]
  ): Unit = js.native
}

