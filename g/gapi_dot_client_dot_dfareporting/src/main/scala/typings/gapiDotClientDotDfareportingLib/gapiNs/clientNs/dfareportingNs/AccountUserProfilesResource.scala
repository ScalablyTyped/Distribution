package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountUserProfilesResource extends js.Object {
  /** Gets one account user profile by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[AccountUserProfile]
  /** Inserts a new account user profile. */
  def insert(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[AccountUserProfile]
  /** Retrieves a list of account user profiles, possibly filtered. This method supports paging. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_ActiveAlt): gapiDotClientLib.gapiNs.clientNs.Request[AccountUserProfilesListResponse]
  /** Updates an existing account user profile. This method supports patch semantics. */
  def patch(request: gapiDotClientDotDfareportingLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[AccountUserProfile]
  /** Updates an existing account user profile. */
  def update(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[AccountUserProfile]
}

object AccountUserProfilesResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[AccountUserProfile]
    ],
    insert: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[AccountUserProfile]
    ],
    list: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_ActiveAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[AccountUserProfilesListResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[AccountUserProfile]
    ],
    update: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[AccountUserProfile]
    ]
  ): AccountUserProfilesResource = {
    val __obj = js.Dynamic.literal(get = get, insert = insert, list = list, patch = patch, update = update)
  
    __obj.asInstanceOf[AccountUserProfilesResource]
  }
}

