package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarPeopleDollarGetbatchget extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * **Required.** A field mask to restrict which fields on each person are
    * returned. Multiple fields can be specified by separating them with
    * commas. Valid values are:  * addresses * ageRanges * biographies *
    * birthdays * braggingRights * coverPhotos * emailAddresses * events *
    * genders * imClients * interests * locales * memberships * metadata *
    * names * nicknames * occupations * organizations * phoneNumbers * photos *
    * relations * relationshipInterests * relationshipStatuses * residences *
    * sipAddresses * skills * taglines * urls * userDefined
    */
  var personFields: js.UndefOr[String] = js.native
  /**
    * **Required.** Comma-separated list of person fields to be included in the
    * response. Each path should start with `person.`: for example,
    * `person.names` or `person.photos`.
    */
  @JSName("requestMask.includeField")
  var requestMaskDotincludeField: js.UndefOr[String] = js.native
  /**
    * The resource names of the people to provide information about.  - To get
    * information about the authenticated user, specify `people/me`. - To get
    * information about a google account, specify
    * `people/`<var>account_id</var>. - To get information about a contact,
    * specify the resource name that   identifies the contact as returned by
    * [`people.connections.list`](/people/api/rest/v1/people.connections/list).
    * You can include up to 50 resource names in one request.
    */
  var resourceNames: js.UndefOr[js.Array[String]] = js.native
}

