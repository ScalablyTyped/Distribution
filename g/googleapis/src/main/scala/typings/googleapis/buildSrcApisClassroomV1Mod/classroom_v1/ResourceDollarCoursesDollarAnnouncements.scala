package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/classroom/v1", "classroom_v1.Resource$Courses$Announcements")
@js.native
class ResourceDollarCoursesDollarAnnouncements protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * classroom.courses.announcements.create
    * @desc Creates an announcement.  This method returns the following error
    * codes:  * `PERMISSION_DENIED` if the requesting user is not permitted to
    * access the requested course, create announcements in the requested
    * course, share a Drive attachment, or for access errors. *
    * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the
    * requested course does not exist. * `FAILED_PRECONDITION` for the
    * following request error:     * AttachmentNotVisible
    * @alias classroom.courses.announcements.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.courseId Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {().Announcement} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Announcement] = js.native
  def create(callback: BodyResponseCallback[Schema$Announcement]): Unit = js.native
  def create(params: ParamsDollarResourceDollarCoursesDollarAnnouncementsDollarCreate): GaxiosPromise[Schema$Announcement] = js.native
  def create(
    params: ParamsDollarResourceDollarCoursesDollarAnnouncementsDollarCreate,
    callback: BodyResponseCallback[Schema$Announcement]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarCoursesDollarAnnouncementsDollarCreate,
    options: BodyResponseCallback[Schema$Announcement],
    callback: BodyResponseCallback[Schema$Announcement]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarCoursesDollarAnnouncementsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Announcement] = js.native
  def create(
    params: ParamsDollarResourceDollarCoursesDollarAnnouncementsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Announcement]
  ): Unit = js.native
  /**
    * classroom.courses.announcements.delete
    * @desc Deletes an announcement.  This request must be made by the
    * Developer Console project of the [OAuth client
    * ID](https://support.google.com/cloud/answer/6158849) used to create the
    * corresponding announcement item.  This method returns the following error
    * codes:  * `PERMISSION_DENIED` if the requesting developer project did not
    * create the corresponding announcement, if the requesting user is not
    * permitted to delete the requested course or for access errors. *
    * `FAILED_PRECONDITION` if the requested announcement has already been
    * deleted. * `NOT_FOUND` if no course exists with the requested ID.
    * @alias classroom.courses.announcements.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.courseId Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {string} params.id Identifier of the announcement to delete. This identifier is a Classroom-assigned identifier.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarCoursesDollarAnnouncementsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarCoursesDollarAnnouncementsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarCoursesDollarAnnouncementsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarCoursesDollarAnnouncementsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarCoursesDollarAnnouncementsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * classroom.courses.announcements.get
    * @desc Returns an announcement.  This method returns the following error
    * codes:  * `PERMISSION_DENIED` if the requesting user is not permitted to
    * access the requested course or announcement, or for access errors. *
    * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the
    * requested course or announcement does not exist.
    * @alias classroom.courses.announcements.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.courseId Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {string} params.id Identifier of the announcement.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Announcement] = js.native
  def get(callback: BodyResponseCallback[Schema$Announcement]): Unit = js.native
  def get(params: ParamsDollarResourceDollarCoursesDollarAnnouncementsDollarGet): GaxiosPromise[Schema$Announcement] = js.native
  def get(
    params: ParamsDollarResourceDollarCoursesDollarAnnouncementsDollarGet,
    callback: BodyResponseCallback[Schema$Announcement]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarCoursesDollarAnnouncementsDollarGet,
    options: BodyResponseCallback[Schema$Announcement],
    callback: BodyResponseCallback[Schema$Announcement]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarCoursesDollarAnnouncementsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Announcement] = js.native
  def get(
    params: ParamsDollarResourceDollarCoursesDollarAnnouncementsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Announcement]
  ): Unit = js.native
  /**
    * classroom.courses.announcements.list
    * @desc Returns a list of announcements that the requester is permitted to
    * view.  Course students may only view `PUBLISHED` announcements. Course
    * teachers and domain administrators may view all announcements.  This
    * method returns the following error codes:  * `PERMISSION_DENIED` if the
    * requesting user is not permitted to access the requested course or for
    * access errors. * `INVALID_ARGUMENT` if the request is malformed. *
    * `NOT_FOUND` if the requested course does not exist.
    * @alias classroom.courses.announcements.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.announcementStates Restriction on the `state` of announcements returned. If this argument is left unspecified, the default value is `PUBLISHED`.
    * @param {string} params.courseId Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {string=} params.orderBy Optional sort ordering for results. A comma-separated list of fields with an optional sort direction keyword. Supported field is `updateTime`. Supported direction keywords are `asc` and `desc`. If not specified, `updateTime desc` is the default behavior. Examples: `updateTime asc`, `updateTime`
    * @param {integer=} params.pageSize Maximum number of items to return. Zero or unspecified indicates that the server may assign a maximum.  The server may return fewer than the specified number of results.
    * @param {string=} params.pageToken nextPageToken value returned from a previous list call, indicating that the subsequent page of results should be returned.  The list request must be otherwise identical to the one that resulted in this token.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListAnnouncementsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListAnnouncementsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarCoursesDollarAnnouncementsDollarList): GaxiosPromise[Schema$ListAnnouncementsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCoursesDollarAnnouncementsDollarList,
    callback: BodyResponseCallback[Schema$ListAnnouncementsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarCoursesDollarAnnouncementsDollarList,
    options: BodyResponseCallback[Schema$ListAnnouncementsResponse],
    callback: BodyResponseCallback[Schema$ListAnnouncementsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarCoursesDollarAnnouncementsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListAnnouncementsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCoursesDollarAnnouncementsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListAnnouncementsResponse]
  ): Unit = js.native
  /**
    * classroom.courses.announcements.modifyAssignees
    * @desc Modifies assignee mode and options of an announcement.  Only a
    * teacher of the course that contains the announcement may call this
    * method.  This method returns the following error codes:  *
    * `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course or course work or for access errors. *
    * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the
    * requested course or course work does not exist.
    * @alias classroom.courses.announcements.modifyAssignees
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.courseId Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {string} params.id Identifier of the announcement.
    * @param {().ModifyAnnouncementAssigneesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def modifyAssignees(): GaxiosPromise[Schema$Announcement] = js.native
  def modifyAssignees(callback: BodyResponseCallback[Schema$Announcement]): Unit = js.native
  def modifyAssignees(params: ParamsDollarResourceDollarCoursesDollarAnnouncementsDollarModifyassignees): GaxiosPromise[Schema$Announcement] = js.native
  def modifyAssignees(
    params: ParamsDollarResourceDollarCoursesDollarAnnouncementsDollarModifyassignees,
    callback: BodyResponseCallback[Schema$Announcement]
  ): Unit = js.native
  def modifyAssignees(
    params: ParamsDollarResourceDollarCoursesDollarAnnouncementsDollarModifyassignees,
    options: BodyResponseCallback[Schema$Announcement],
    callback: BodyResponseCallback[Schema$Announcement]
  ): Unit = js.native
  def modifyAssignees(
    params: ParamsDollarResourceDollarCoursesDollarAnnouncementsDollarModifyassignees,
    options: MethodOptions
  ): GaxiosPromise[Schema$Announcement] = js.native
  def modifyAssignees(
    params: ParamsDollarResourceDollarCoursesDollarAnnouncementsDollarModifyassignees,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Announcement]
  ): Unit = js.native
  /**
    * classroom.courses.announcements.patch
    * @desc Updates one or more fields of an announcement.  This method returns
    * the following error codes:  * `PERMISSION_DENIED` if the requesting
    * developer project did not create the corresponding announcement or for
    * access errors. * `INVALID_ARGUMENT` if the request is malformed. *
    * `FAILED_PRECONDITION` if the requested announcement has already been
    * deleted. * `NOT_FOUND` if the requested course or announcement does not
    * exist
    * @alias classroom.courses.announcements.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.courseId Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {string} params.id Identifier of the announcement.
    * @param {string=} params.updateMask Mask that identifies which fields on the announcement to update. This field is required to do an update. The update fails if invalid fields are specified. If a field supports empty values, it can be cleared by specifying it in the update mask and not in the Announcement object. If a field that does not support empty values is included in the update mask and not set in the Announcement object, an `INVALID_ARGUMENT` error will be returned.  The following fields may be specified by teachers:  * `text` * `state` * `scheduled_time`
    * @param {().Announcement} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Announcement] = js.native
  def patch(callback: BodyResponseCallback[Schema$Announcement]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCoursesDollarAnnouncementsDollarPatch): GaxiosPromise[Schema$Announcement] = js.native
  def patch(
    params: ParamsDollarResourceDollarCoursesDollarAnnouncementsDollarPatch,
    callback: BodyResponseCallback[Schema$Announcement]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarCoursesDollarAnnouncementsDollarPatch,
    options: BodyResponseCallback[Schema$Announcement],
    callback: BodyResponseCallback[Schema$Announcement]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCoursesDollarAnnouncementsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Announcement] = js.native
  def patch(
    params: ParamsDollarResourceDollarCoursesDollarAnnouncementsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Announcement]
  ): Unit = js.native
}

