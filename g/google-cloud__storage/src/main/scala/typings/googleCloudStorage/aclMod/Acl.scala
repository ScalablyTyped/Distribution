package typings.googleCloudStorage.aclMod

import typings.googleCloudCommon.utilMod.BodyResponseCallback
import typings.googleCloudCommon.utilMod.DecorateRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Storage uses access control lists (ACLs) to manage object and
  * bucket access. ACLs are the mechanism you use to share objects with other
  * users and allow other users to access your buckets and objects.
  *
  * An ACL consists of one or more entries, where each entry grants permissions
  * to an entity. Permissions define the actions that can be performed against an
  * object or bucket (for example, `READ` or `WRITE`); the entity defines who the
  * permission applies to (for example, a specific user or group of users).
  *
  * Where an `entity` value is accepted, we follow the format the Cloud Storage
  * API expects.
  *
  * Refer to
  * https://cloud.google.com/storage/docs/json_api/v1/defaultObjectAccessControls
  * for the most up-to-date values.
  *
  *   - `user-userId`
  *   - `user-email`
  *   - `group-groupId`
  *   - `group-email`
  *   - `domain-domain`
  *   - `project-team-projectId`
  *   - `allUsers`
  *   - `allAuthenticatedUsers`
  *
  * Examples:
  *
  *   - The user "liz@example.com" would be `user-liz@example.com`.
  *   - The group "example@googlegroups.com" would be
  *     `group-example@googlegroups.com`.
  *   - To refer to all members of the Google Apps for Business domain
  *     "example.com", the entity would be `domain-example.com`.
  *
  * For more detailed information, see
  * [About Access Control Lists](http://goo.gl/6qBBPO).
  *
  * @constructor Acl
  * @mixin
  * @param {object} options Configuration options.
  */
@JSImport("@google-cloud/storage/build/src/acl", "Acl")
@js.native
class Acl protected () extends AclRoleAccessorMethods {
  def this(options: AclOptions) = this()
  
  def add(options: AddAclOptions): js.Promise[AddAclResponse] = js.native
  def add(options: AddAclOptions, callback: AddAclCallback): Unit = js.native
  
  var default: Acl = js.native
  
  def delete(options: RemoveAclOptions): js.Promise[RemoveAclResponse] = js.native
  def delete(options: RemoveAclOptions, callback: RemoveAclCallback): Unit = js.native
  
  def get(): js.Promise[GetAclResponse] = js.native
  def get(callback: GetAclCallback): Unit = js.native
  def get(options: GetAclOptions): js.Promise[GetAclResponse] = js.native
  def get(options: GetAclOptions, callback: GetAclCallback): Unit = js.native
  
  /**
    * Transform API responses to a consistent object format.
    *
    * @private
    */
  def makeAclObject_(accessControlObject: AccessControlObject): AccessControlObject = js.native
  
  var pathPrefix: String = js.native
  
  /**
    * Patch requests up to the bucket's request object.
    *
    * @private
    *
    * @param {string} method Action.
    * @param {string} path Request path.
    * @param {*} query Request query object.
    * @param {*} body Request body contents.
    * @param {function} callback Callback function.
    */
  def request(reqOpts: DecorateRequestOptions, callback: BodyResponseCallback): Unit = js.native
  
  def request_(reqOpts: DecorateRequestOptions, callback: BodyResponseCallback): Unit = js.native
  
  def update(options: UpdateAclOptions): js.Promise[UpdateAclResponse] = js.native
  def update(options: UpdateAclOptions, callback: UpdateAclCallback): Unit = js.native
}
