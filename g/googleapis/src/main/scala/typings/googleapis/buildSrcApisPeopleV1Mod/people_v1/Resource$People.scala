package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/people/v1", "people_v1.Resource$People")
@js.native
class Resource$People protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var connections: ResourceDollarPeopleDollarConnections = js.native
  var context: APIRequestContext = js.native
  /**
    * people.people.createContact
    * @desc Create a new contact and return the person resource for that
    * contact.
    * @alias people.people.createContact
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.parent The resource name of the owning person resource.
    * @param {().Person} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def createContact(): GaxiosPromise[Schema$Person] = js.native
  def createContact(callback: BodyResponseCallback[Schema$Person]): Unit = js.native
  def createContact(params: ParamsDollarResourceDollarPeopleDollarCreatecontact): GaxiosPromise[Schema$Person] = js.native
  def createContact(
    params: ParamsDollarResourceDollarPeopleDollarCreatecontact,
    callback: BodyResponseCallback[Schema$Person]
  ): Unit = js.native
  def createContact(
    params: ParamsDollarResourceDollarPeopleDollarCreatecontact,
    options: BodyResponseCallback[Schema$Person],
    callback: BodyResponseCallback[Schema$Person]
  ): Unit = js.native
  def createContact(params: ParamsDollarResourceDollarPeopleDollarCreatecontact, options: MethodOptions): GaxiosPromise[Schema$Person] = js.native
  def createContact(
    params: ParamsDollarResourceDollarPeopleDollarCreatecontact,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Person]
  ): Unit = js.native
  /**
    * people.people.deleteContact
    * @desc Delete a contact person. Any non-contact data will not be deleted.
    * @alias people.people.deleteContact
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resourceName The resource name of the contact to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deleteContact(): GaxiosPromise[Schema$Empty] = js.native
  def deleteContact(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def deleteContact(params: ParamsDollarResourceDollarPeopleDollarDeletecontact): GaxiosPromise[Schema$Empty] = js.native
  def deleteContact(
    params: ParamsDollarResourceDollarPeopleDollarDeletecontact,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def deleteContact(
    params: ParamsDollarResourceDollarPeopleDollarDeletecontact,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def deleteContact(params: ParamsDollarResourceDollarPeopleDollarDeletecontact, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def deleteContact(
    params: ParamsDollarResourceDollarPeopleDollarDeletecontact,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * people.people.get
    * @desc Provides information about a person by specifying a resource name.
    * Use `people/me` to indicate the authenticated user. <br> The request
    * throws a 400 error if 'personFields' is not specified.
    * @alias people.people.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.personFields **Required.** A field mask to restrict which fields on the person are returned. Multiple fields can be specified by separating them with commas. Valid values are:  * addresses * ageRanges * biographies * birthdays * braggingRights * coverPhotos * emailAddresses * events * genders * imClients * interests * locales * memberships * metadata * names * nicknames * occupations * organizations * phoneNumbers * photos * relations * relationshipInterests * relationshipStatuses * residences * sipAddresses * skills * taglines * urls * userDefined
    * @param {string=} params.requestMask.includeField **Required.** Comma-separated list of person fields to be included in the response. Each path should start with `person.`: for example, `person.names` or `person.photos`.
    * @param {string} params.resourceName The resource name of the person to provide information about.  - To get information about the authenticated user, specify `people/me`. - To get information about a google account, specify  `people/`<var>account_id</var>. - To get information about a contact, specify the resource name that   identifies the contact as returned by [`people.connections.list`](/people/api/rest/v1/people.connections/list).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Person] = js.native
  def get(callback: BodyResponseCallback[Schema$Person]): Unit = js.native
  def get(params: ParamsDollarResourceDollarPeopleDollarGet): GaxiosPromise[Schema$Person] = js.native
  def get(params: ParamsDollarResourceDollarPeopleDollarGet, callback: BodyResponseCallback[Schema$Person]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarPeopleDollarGet,
    options: BodyResponseCallback[Schema$Person],
    callback: BodyResponseCallback[Schema$Person]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarPeopleDollarGet, options: MethodOptions): GaxiosPromise[Schema$Person] = js.native
  def get(
    params: ParamsDollarResourceDollarPeopleDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Person]
  ): Unit = js.native
  /**
    * people.people.getBatchGet
    * @desc Provides information about a list of specific people by specifying
    * a list of requested resource names. Use `people/me` to indicate the
    * authenticated user. <br> The request throws a 400 error if 'personFields'
    * is not specified.
    * @alias people.people.getBatchGet
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.personFields **Required.** A field mask to restrict which fields on each person are returned. Multiple fields can be specified by separating them with commas. Valid values are:  * addresses * ageRanges * biographies * birthdays * braggingRights * coverPhotos * emailAddresses * events * genders * imClients * interests * locales * memberships * metadata * names * nicknames * occupations * organizations * phoneNumbers * photos * relations * relationshipInterests * relationshipStatuses * residences * sipAddresses * skills * taglines * urls * userDefined
    * @param {string=} params.requestMask.includeField **Required.** Comma-separated list of person fields to be included in the response. Each path should start with `person.`: for example, `person.names` or `person.photos`.
    * @param {string=} params.resourceNames The resource names of the people to provide information about.  - To get information about the authenticated user, specify `people/me`. - To get information about a google account, specify   `people/`<var>account_id</var>. - To get information about a contact, specify the resource name that   identifies the contact as returned by [`people.connections.list`](/people/api/rest/v1/people.connections/list).  You can include up to 50 resource names in one request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getBatchGet(): GaxiosPromise[Schema$GetPeopleResponse] = js.native
  def getBatchGet(callback: BodyResponseCallback[Schema$GetPeopleResponse]): Unit = js.native
  def getBatchGet(params: ParamsDollarResourceDollarPeopleDollarGetbatchget): GaxiosPromise[Schema$GetPeopleResponse] = js.native
  def getBatchGet(
    params: ParamsDollarResourceDollarPeopleDollarGetbatchget,
    callback: BodyResponseCallback[Schema$GetPeopleResponse]
  ): Unit = js.native
  def getBatchGet(
    params: ParamsDollarResourceDollarPeopleDollarGetbatchget,
    options: BodyResponseCallback[Schema$GetPeopleResponse],
    callback: BodyResponseCallback[Schema$GetPeopleResponse]
  ): Unit = js.native
  def getBatchGet(params: ParamsDollarResourceDollarPeopleDollarGetbatchget, options: MethodOptions): GaxiosPromise[Schema$GetPeopleResponse] = js.native
  def getBatchGet(
    params: ParamsDollarResourceDollarPeopleDollarGetbatchget,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GetPeopleResponse]
  ): Unit = js.native
  /**
    * people.people.updateContact
    * @desc Update contact data for an existing contact person. Any non-contact
    * data will not be modified.  The request throws a 400 error if
    * `updatePersonFields` is not specified. <br> The request throws a 400
    * error if `person.metadata.sources` is not specified for the contact to be
    * updated. <br> The request throws a 412 error if
    * `person.metadata.sources.etag` is different than the contact's etag,
    * which indicates the contact has changed since its data was read. Clients
    * should get the latest person and re-apply their updates to the latest
    * person.
    * @alias people.people.updateContact
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resourceName The resource name for the person, assigned by the server. An ASCII string with a max length of 27 characters, in the form of `people/`<var>person_id</var>.
    * @param {string=} params.updatePersonFields **Required.** A field mask to restrict which fields on the person are updated. Multiple fields can be specified by separating them with commas. All updated fields will be replaced. Valid values are:  * addresses * biographies * birthdays * emailAddresses * events * genders * imClients * interests * locales * names * nicknames * occupations * organizations * phoneNumbers * relations * residences * sipAddresses * urls * userDefined
    * @param {().Person} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateContact(): GaxiosPromise[Schema$Person] = js.native
  def updateContact(callback: BodyResponseCallback[Schema$Person]): Unit = js.native
  def updateContact(params: ParamsDollarResourceDollarPeopleDollarUpdatecontact): GaxiosPromise[Schema$Person] = js.native
  def updateContact(
    params: ParamsDollarResourceDollarPeopleDollarUpdatecontact,
    callback: BodyResponseCallback[Schema$Person]
  ): Unit = js.native
  def updateContact(
    params: ParamsDollarResourceDollarPeopleDollarUpdatecontact,
    options: BodyResponseCallback[Schema$Person],
    callback: BodyResponseCallback[Schema$Person]
  ): Unit = js.native
  def updateContact(params: ParamsDollarResourceDollarPeopleDollarUpdatecontact, options: MethodOptions): GaxiosPromise[Schema$Person] = js.native
  def updateContact(
    params: ParamsDollarResourceDollarPeopleDollarUpdatecontact,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Person]
  ): Unit = js.native
}

