package typings.gapiDotClientDotAndroidenterprise.gapi.client.androidenterprise

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAndroidenterprise.Anon_AltEmail
import typings.gapiDotClientDotAndroidenterprise.Anon_AltEnterpriseId
import typings.gapiDotClientDotAndroidenterprise.Anon_AltEnterpriseIdFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  /** Deleted an EMM-managed user. */
  def delete(request: Anon_AltEnterpriseId): Request[Unit]
  /**
    * Generates an authentication token which the device policy client can use to provision the given EMM-managed user account on a device. The generated
    * token is single-use and expires after a few minutes.
    *
    * This call only works with EMM-managed accounts.
    */
  def generateAuthenticationToken(request: Anon_AltEnterpriseId): Request[AuthenticationToken]
  /**
    * Generates a token (activation code) to allow this user to configure their managed account in the Android Setup Wizard. Revokes any previously generated
    * token.
    *
    * This call only works with Google managed accounts.
    */
  def generateToken(request: Anon_AltEnterpriseId): Request[UserToken]
  /** Retrieves a user's details. */
  def get(request: Anon_AltEnterpriseId): Request[User]
  /** Retrieves the set of products a user is entitled to access. */
  def getAvailableProductSet(request: Anon_AltEnterpriseId): Request[ProductSet]
  /**
    * Creates a new EMM-managed user.
    *
    * The Users resource passed in the body of the request should include an accountIdentifier and an accountType.
    * If a corresponding user already exists with the same account identifier, the user will be updated with the resource. In this case only the displayName
    * field can be changed.
    */
  def insert(request: Anon_AltEnterpriseIdFields): Request[User]
  /**
    * Looks up a user by primary email address. This is only supported for Google-managed users. Lookup of the id is not needed for EMM-managed users because
    * the id is already returned in the result of the Users.insert call.
    */
  def list(request: Anon_AltEmail): Request[UsersListResponse]
  /**
    * Updates the details of an EMM-managed user.
    *
    * Can be used with EMM-managed users only (not Google managed users). Pass the new details in the Users resource in the request body. Only the
    * displayName field can be changed. Other fields must either be unset or have the currently active value. This method supports patch semantics.
    */
  def patch(request: Anon_AltEnterpriseId): Request[User]
  /** Revokes a previously generated token (activation code) for the user. */
  def revokeToken(request: Anon_AltEnterpriseId): Request[Unit]
  /**
    * Modifies the set of products that a user is entitled to access (referred to as whitelisted products). Only products that are approved or products that
    * were previously approved (products with revoked approval) can be whitelisted.
    */
  def setAvailableProductSet(request: Anon_AltEnterpriseId): Request[ProductSet]
  /**
    * Updates the details of an EMM-managed user.
    *
    * Can be used with EMM-managed users only (not Google managed users). Pass the new details in the Users resource in the request body. Only the
    * displayName field can be changed. Other fields must either be unset or have the currently active value.
    */
  def update(request: Anon_AltEnterpriseId): Request[User]
}

object UsersResource {
  @scala.inline
  def apply(
    delete: Anon_AltEnterpriseId => Request[Unit],
    generateAuthenticationToken: Anon_AltEnterpriseId => Request[AuthenticationToken],
    generateToken: Anon_AltEnterpriseId => Request[UserToken],
    get: Anon_AltEnterpriseId => Request[User],
    getAvailableProductSet: Anon_AltEnterpriseId => Request[ProductSet],
    insert: Anon_AltEnterpriseIdFields => Request[User],
    list: Anon_AltEmail => Request[UsersListResponse],
    patch: Anon_AltEnterpriseId => Request[User],
    revokeToken: Anon_AltEnterpriseId => Request[Unit],
    setAvailableProductSet: Anon_AltEnterpriseId => Request[ProductSet],
    update: Anon_AltEnterpriseId => Request[User]
  ): UsersResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), generateAuthenticationToken = js.Any.fromFunction1(generateAuthenticationToken), generateToken = js.Any.fromFunction1(generateToken), get = js.Any.fromFunction1(get), getAvailableProductSet = js.Any.fromFunction1(getAvailableProductSet), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), revokeToken = js.Any.fromFunction1(revokeToken), setAvailableProductSet = js.Any.fromFunction1(setAvailableProductSet), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[UsersResource]
  }
}

