package typings
package atGoogleDashCloudStorageLib.buildSrcAclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var default: Acl = js.native
  var pathPrefix: java.lang.String = js.native
  @JSName("request_")
  var request__Original: requestLib.requestMod.requestNs.RequestAPI[
    requestLib.requestMod.requestNs.Request, 
    requestLib.requestMod.requestNs.CoreOptions, 
    requestLib.requestMod.requestNs.RequiredUriUrl
  ] = js.native
  def add(options: AddAclOptions): js.Promise[AddAclResponse] = js.native
  def add(options: AddAclOptions, callback: AddAclCallback): scala.Unit = js.native
  def delete(options: RemoveAclOptions): js.Promise[RemoveAclResponse] = js.native
  def delete(options: RemoveAclOptions, callback: RemoveAclCallback): scala.Unit = js.native
  def get(): js.Promise[GetAclResponse] = js.native
  def get(callback: GetAclCallback): scala.Unit = js.native
  def get(options: GetAclOptions): js.Promise[GetAclResponse] = js.native
  def get(options: GetAclOptions, callback: GetAclCallback): scala.Unit = js.native
  /**
    * Transform API responses to a consistent object format.
    *
    * @private
    */
  def `makeAclObject_`(accessControlObject: AccessControlObject): AccessControlObject = js.native
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
  def request(
    reqOpts: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify DecorateRequestOptions */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify BodyResponseCallback */ js.Any
  ): scala.Unit = js.native
  def `request_`(
    options: requestLib.requestMod.requestNs.RequiredUriUrl with requestLib.requestMod.requestNs.CoreOptions
  ): requestLib.requestMod.requestNs.Request = js.native
  def `request_`(
    options: requestLib.requestMod.requestNs.RequiredUriUrl with requestLib.requestMod.requestNs.CoreOptions,
    callback: requestLib.requestMod.requestNs.RequestCallback
  ): requestLib.requestMod.requestNs.Request = js.native
  def `request_`(uri: java.lang.String): requestLib.requestMod.requestNs.Request = js.native
  def `request_`(uri: java.lang.String, callback: requestLib.requestMod.requestNs.RequestCallback): requestLib.requestMod.requestNs.Request = js.native
  def `request_`(uri: java.lang.String, options: requestLib.requestMod.requestNs.CoreOptions): requestLib.requestMod.requestNs.Request = js.native
  def `request_`(
    uri: java.lang.String,
    options: requestLib.requestMod.requestNs.CoreOptions,
    callback: requestLib.requestMod.requestNs.RequestCallback
  ): requestLib.requestMod.requestNs.Request = js.native
  def update(options: UpdateAclOptions): js.Promise[UpdateAclResponse] = js.native
  def update(options: UpdateAclOptions, callback: UpdateAclCallback): scala.Unit = js.native
}

