package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarPeopleDollarUpdatecontact extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$Person] = js.native
  /**
    * The resource name for the person, assigned by the server. An ASCII string
    * with a max length of 27 characters, in the form of
    * `people/`<var>person_id</var>.
    */
  var resourceName: js.UndefOr[String] = js.native
  /**
    * **Required.** A field mask to restrict which fields on the person are
    * updated. Multiple fields can be specified by separating them with commas.
    * All updated fields will be replaced. Valid values are:  * addresses *
    * biographies * birthdays * emailAddresses * events * genders * imClients *
    * interests * locales * names * nicknames * occupations * organizations *
    * phoneNumbers * relations * residences * sipAddresses * urls * userDefined
    */
  var updatePersonFields: js.UndefOr[String] = js.native
}

