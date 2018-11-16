package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UsersResource extends js.Object {
  /** Creates a user's company relation. Affiliates the user to a company. */
  def createCompanyRelation(
    request: gapiDotClientDotPartnersLib.Anon_RequestMetadataexperimentIdsAccesstokenRequestMetadatauserOverridesuserIdPrettyPrint
  ): gapiDotClientLib.gapiNs.clientNs.Request[CompanyRelation]
  /** Deletes a user's company relation. Unaffiliaites the user from a company. */
  def deleteCompanyRelation(
    request: gapiDotClientDotPartnersLib.Anon_RequestMetadataexperimentIdsAccesstokenRequestMetadatauserOverridesuserIdPrettyPrint
  ): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Gets a user. */
  def get(
    request: gapiDotClientDotPartnersLib.Anon_RequestMetadataexperimentIdsAccesstokenRequestMetadatauserOverridesuserIdPrettyPrintBearertoken
  ): gapiDotClientLib.gapiNs.clientNs.Request[User]
  /**
               * Updates a user's profile. A user can only update their own profile and
               * should only be called within the context of a logged in user.
               */
  def updateProfile(request: gapiDotClientDotPartnersLib.Anon_RequestMetadataexperimentIds): gapiDotClientLib.gapiNs.clientNs.Request[UserProfile]
}

