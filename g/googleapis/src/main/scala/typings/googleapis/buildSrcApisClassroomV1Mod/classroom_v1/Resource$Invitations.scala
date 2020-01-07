package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/classroom/v1", "classroom_v1.Resource$Invitations")
@js.native
class Resource$Invitations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * classroom.invitations.accept
    * @desc Accepts an invitation, removing it and adding the invited user to
    * the teachers or students (as appropriate) of the specified course. Only
    * the invited user may accept an invitation.  This method returns the
    * following error codes:  * `PERMISSION_DENIED` if the requesting user is
    * not permitted to accept the requested invitation or for access errors. *
    * `FAILED_PRECONDITION` for the following request errors:     *
    * CourseMemberLimitReached     * CourseNotModifiable     *
    * CourseTeacherLimitReached     * UserGroupsMembershipLimitReached *
    * `NOT_FOUND` if no invitation exists with the requested ID.
    * @alias classroom.invitations.accept
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Identifier of the invitation to accept.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def accept(): GaxiosPromise[Schema$Empty] = js.native
  def accept(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def accept(params: ParamsDollarResourceDollarInvitationsDollarAccept): GaxiosPromise[Schema$Empty] = js.native
  def accept(
    params: ParamsDollarResourceDollarInvitationsDollarAccept,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def accept(
    params: ParamsDollarResourceDollarInvitationsDollarAccept,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def accept(params: ParamsDollarResourceDollarInvitationsDollarAccept, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def accept(
    params: ParamsDollarResourceDollarInvitationsDollarAccept,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * classroom.invitations.create
    * @desc Creates an invitation. Only one invitation for a user and course
    * may exist at a time. Delete and re-create an invitation to make changes.
    * This method returns the following error codes:  * `PERMISSION_DENIED` if
    * the requesting user is not permitted to create invitations for this
    * course or for access errors. * `NOT_FOUND` if the course or the user does
    * not exist. * `FAILED_PRECONDITION` if the requested user's account is
    * disabled or if the user already has this role or a role with greater
    * permissions. * `ALREADY_EXISTS` if an invitation for the specified user
    * and course already exists.
    * @alias classroom.invitations.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Invitation} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Invitation] = js.native
  def create(callback: BodyResponseCallback[Schema$Invitation]): Unit = js.native
  def create(params: ParamsDollarResourceDollarInvitationsDollarCreate): GaxiosPromise[Schema$Invitation] = js.native
  def create(
    params: ParamsDollarResourceDollarInvitationsDollarCreate,
    callback: BodyResponseCallback[Schema$Invitation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarInvitationsDollarCreate,
    options: BodyResponseCallback[Schema$Invitation],
    callback: BodyResponseCallback[Schema$Invitation]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarInvitationsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Invitation] = js.native
  def create(
    params: ParamsDollarResourceDollarInvitationsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Invitation]
  ): Unit = js.native
  /**
    * classroom.invitations.delete
    * @desc Deletes an invitation.  This method returns the following error
    * codes:  * `PERMISSION_DENIED` if the requesting user is not permitted to
    * delete the requested invitation or for access errors. * `NOT_FOUND` if no
    * invitation exists with the requested ID.
    * @alias classroom.invitations.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Identifier of the invitation to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarInvitationsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarInvitationsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarInvitationsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarInvitationsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarInvitationsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * classroom.invitations.get
    * @desc Returns an invitation.  This method returns the following error
    * codes:  * `PERMISSION_DENIED` if the requesting user is not permitted to
    * view the requested invitation or for access errors. * `NOT_FOUND` if no
    * invitation exists with the requested ID.
    * @alias classroom.invitations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Identifier of the invitation to return.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Invitation] = js.native
  def get(callback: BodyResponseCallback[Schema$Invitation]): Unit = js.native
  def get(params: ParamsDollarResourceDollarInvitationsDollarGet): GaxiosPromise[Schema$Invitation] = js.native
  def get(
    params: ParamsDollarResourceDollarInvitationsDollarGet,
    callback: BodyResponseCallback[Schema$Invitation]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarInvitationsDollarGet,
    options: BodyResponseCallback[Schema$Invitation],
    callback: BodyResponseCallback[Schema$Invitation]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarInvitationsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Invitation] = js.native
  def get(
    params: ParamsDollarResourceDollarInvitationsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Invitation]
  ): Unit = js.native
  /**
    * classroom.invitations.list
    * @desc Returns a list of invitations that the requesting user is permitted
    * to view, restricted to those that match the list request.  *Note:* At
    * least one of `user_id` or `course_id` must be supplied. Both fields can
    * be supplied.  This method returns the following error codes:  *
    * `PERMISSION_DENIED` for access errors.
    * @alias classroom.invitations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.courseId Restricts returned invitations to those for a course with the specified identifier.
    * @param {integer=} params.pageSize Maximum number of items to return. Zero means no maximum.  The server may return fewer than the specified number of results.
    * @param {string=} params.pageToken nextPageToken value returned from a previous list call, indicating that the subsequent page of results should be returned.  The list request must be otherwise identical to the one that resulted in this token.
    * @param {string=} params.userId Restricts returned invitations to those for a specific user. The identifier can be one of the following:  * the numeric identifier for the user * the email address of the user * the string literal `"me"`, indicating the requesting user
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListInvitationsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListInvitationsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarInvitationsDollarList): GaxiosPromise[Schema$ListInvitationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarInvitationsDollarList,
    callback: BodyResponseCallback[Schema$ListInvitationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarInvitationsDollarList,
    options: BodyResponseCallback[Schema$ListInvitationsResponse],
    callback: BodyResponseCallback[Schema$ListInvitationsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarInvitationsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListInvitationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarInvitationsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListInvitationsResponse]
  ): Unit = js.native
}

