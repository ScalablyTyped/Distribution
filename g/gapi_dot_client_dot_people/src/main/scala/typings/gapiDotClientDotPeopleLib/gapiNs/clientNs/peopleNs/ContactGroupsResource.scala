package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactGroupsResource extends js.Object {
  var members: MembersResource
  /**
    * Get a list of contact groups owned by the authenticated user by specifying
    * a list of contact group resource names.
    */
  def batchGet(request: gapiDotClientDotPeopleLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[BatchGetContactGroupsResponse]
  /** Create a new contact group owned by the authenticated user. */
  def create(request: gapiDotClientDotPeopleLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ContactGroup]
  /**
    * Delete an existing contact group owned by the authenticated user by
    * specifying a contact group resource name.
    */
  def delete(request: gapiDotClientDotPeopleLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /**
    * Get a specific contact group owned by the authenticated user by specifying
    * a contact group resource name.
    */
  def get(request: gapiDotClientDotPeopleLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[ContactGroup]
  /**
    * List all contact groups owned by the authenticated user. Members of the
    * contact groups are not populated.
    */
  def list(request: gapiDotClientDotPeopleLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[ListContactGroupsResponse]
  /**
    * Update the name of an existing contact group owned by the authenticated
    * user.
    */
  def update(request: gapiDotClientDotPeopleLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[ContactGroup]
}

object ContactGroupsResource {
  @scala.inline
  def apply(
    batchGet: js.Function1[
      gapiDotClientDotPeopleLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[BatchGetContactGroupsResponse]
    ],
    create: js.Function1[
      gapiDotClientDotPeopleLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ContactGroup]
    ],
    delete: js.Function1[
      gapiDotClientDotPeopleLib.Anon_AccesstokenAltBearertokenCallback, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    get: js.Function1[
      gapiDotClientDotPeopleLib.Anon_AccesstokenAltBearertokenCallbackFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[ContactGroup]
    ],
    list: js.Function1[
      gapiDotClientDotPeopleLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListContactGroupsResponse]
    ],
    members: MembersResource,
    update: js.Function1[
      gapiDotClientDotPeopleLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ContactGroup]
    ]
  ): ContactGroupsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("batchGet")(batchGet)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("members")(members)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[ContactGroupsResource]
  }
}

