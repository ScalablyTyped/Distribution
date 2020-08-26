package typings.googleapis.classroomV1Mod.classroomV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/classroom/v1", "classroom_v1.Resource$Courses$Coursework")
@js.native
class ResourceCoursesCoursework protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var studentSubmissions: ResourceCoursesCourseworkStudentsubmissions = js.native
  /**
    * classroom.courses.courseWork.create
    * @desc Creates course work.  The resulting course work (and corresponding
    * student submissions) are associated with the Developer Console project of
    * the [OAuth client ID](https://support.google.com/cloud/answer/6158849)
    * used to make the request. Classroom API requests to modify course work
    * and student submissions must be made with an OAuth client ID from the
    * associated Developer Console project.  This method returns the following
    * error codes:  * `PERMISSION_DENIED` if the requesting user is not
    * permitted to access the requested course, create course work in the
    * requested course, share a Drive attachment, or for access errors. *
    * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the
    * requested course does not exist. * `FAILED_PRECONDITION` for the
    * following request error:     * AttachmentNotVisible
    * @alias classroom.courses.courseWork.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.courseId Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {().CourseWork} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaCourseWork] = js.native
  def create(callback: BodyResponseCallback[SchemaCourseWork]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCourseWork] = js.native
  def create(params: ParamsResourceCoursesCourseworkCreate): GaxiosPromise[SchemaCourseWork] = js.native
  def create(params: ParamsResourceCoursesCourseworkCreate, callback: BodyResponseCallback[SchemaCourseWork]): Unit = js.native
  def create(
    params: ParamsResourceCoursesCourseworkCreate,
    options: BodyResponseCallback[SchemaCourseWork],
    callback: BodyResponseCallback[SchemaCourseWork]
  ): Unit = js.native
  def create(params: ParamsResourceCoursesCourseworkCreate, options: MethodOptions): GaxiosPromise[SchemaCourseWork] = js.native
  def create(
    params: ParamsResourceCoursesCourseworkCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCourseWork]
  ): Unit = js.native
  /**
    * classroom.courses.courseWork.delete
    * @desc Deletes a course work.  This request must be made by the Developer
    * Console project of the [OAuth client
    * ID](https://support.google.com/cloud/answer/6158849) used to create the
    * corresponding course work item.  This method returns the following error
    * codes:  * `PERMISSION_DENIED` if the requesting developer project did not
    * create the corresponding course work, if the requesting user is not
    * permitted to delete the requested course or for access errors. *
    * `FAILED_PRECONDITION` if the requested course work has already been
    * deleted. * `NOT_FOUND` if no course exists with the requested ID.
    * @alias classroom.courses.courseWork.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.courseId Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {string} params.id Identifier of the course work to delete. This identifier is a Classroom-assigned identifier.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceCoursesCourseworkDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceCoursesCourseworkDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceCoursesCourseworkDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceCoursesCourseworkDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceCoursesCourseworkDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * classroom.courses.courseWork.get
    * @desc Returns course work.  This method returns the following error
    * codes:  * `PERMISSION_DENIED` if the requesting user is not permitted to
    * access the requested course or course work, or for access errors. *
    * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the
    * requested course or course work does not exist.
    * @alias classroom.courses.courseWork.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.courseId Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {string} params.id Identifier of the course work.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaCourseWork] = js.native
  def get(callback: BodyResponseCallback[SchemaCourseWork]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCourseWork] = js.native
  def get(params: ParamsResourceCoursesCourseworkGet): GaxiosPromise[SchemaCourseWork] = js.native
  def get(params: ParamsResourceCoursesCourseworkGet, callback: BodyResponseCallback[SchemaCourseWork]): Unit = js.native
  def get(
    params: ParamsResourceCoursesCourseworkGet,
    options: BodyResponseCallback[SchemaCourseWork],
    callback: BodyResponseCallback[SchemaCourseWork]
  ): Unit = js.native
  def get(params: ParamsResourceCoursesCourseworkGet, options: MethodOptions): GaxiosPromise[SchemaCourseWork] = js.native
  def get(
    params: ParamsResourceCoursesCourseworkGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCourseWork]
  ): Unit = js.native
  /**
    * classroom.courses.courseWork.list
    * @desc Returns a list of course work that the requester is permitted to
    * view.  Course students may only view `PUBLISHED` course work. Course
    * teachers and domain administrators may view all course work.  This method
    * returns the following error codes:  * `PERMISSION_DENIED` if the
    * requesting user is not permitted to access the requested course or for
    * access errors. * `INVALID_ARGUMENT` if the request is malformed. *
    * `NOT_FOUND` if the requested course does not exist.
    * @alias classroom.courses.courseWork.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.courseId Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {string=} params.courseWorkStates Restriction on the work status to return. Only courseWork that matches is returned. If unspecified, items with a work status of `PUBLISHED` is returned.
    * @param {string=} params.orderBy Optional sort ordering for results. A comma-separated list of fields with an optional sort direction keyword. Supported fields are `updateTime` and `dueDate`. Supported direction keywords are `asc` and `desc`. If not specified, `updateTime desc` is the default behavior. Examples: `dueDate asc,updateTime desc`, `updateTime,dueDate desc`
    * @param {integer=} params.pageSize Maximum number of items to return. Zero or unspecified indicates that the server may assign a maximum.  The server may return fewer than the specified number of results.
    * @param {string=} params.pageToken nextPageToken value returned from a previous list call, indicating that the subsequent page of results should be returned.  The list request must be otherwise identical to the one that resulted in this token.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListCourseWorkResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCourseWorkResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListCourseWorkResponse] = js.native
  def list(params: ParamsResourceCoursesCourseworkList): GaxiosPromise[SchemaListCourseWorkResponse] = js.native
  def list(
    params: ParamsResourceCoursesCourseworkList,
    callback: BodyResponseCallback[SchemaListCourseWorkResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCoursesCourseworkList,
    options: BodyResponseCallback[SchemaListCourseWorkResponse],
    callback: BodyResponseCallback[SchemaListCourseWorkResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCoursesCourseworkList, options: MethodOptions): GaxiosPromise[SchemaListCourseWorkResponse] = js.native
  def list(
    params: ParamsResourceCoursesCourseworkList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCourseWorkResponse]
  ): Unit = js.native
  /**
    * classroom.courses.courseWork.modifyAssignees
    * @desc Modifies assignee mode and options of a coursework.  Only a teacher
    * of the course that contains the coursework may call this method.  This
    * method returns the following error codes:  * `PERMISSION_DENIED` if the
    * requesting user is not permitted to access the requested course or course
    * work or for access errors. * `INVALID_ARGUMENT` if the request is
    * malformed. * `NOT_FOUND` if the requested course or course work does not
    * exist.
    * @alias classroom.courses.courseWork.modifyAssignees
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.courseId Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {string} params.id Identifier of the coursework.
    * @param {().ModifyCourseWorkAssigneesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def modifyAssignees(): GaxiosPromise[SchemaCourseWork] = js.native
  def modifyAssignees(callback: BodyResponseCallback[SchemaCourseWork]): Unit = js.native
  def modifyAssignees(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCourseWork] = js.native
  def modifyAssignees(params: ParamsResourceCoursesCourseworkModifyassignees): GaxiosPromise[SchemaCourseWork] = js.native
  def modifyAssignees(
    params: ParamsResourceCoursesCourseworkModifyassignees,
    callback: BodyResponseCallback[SchemaCourseWork]
  ): Unit = js.native
  def modifyAssignees(
    params: ParamsResourceCoursesCourseworkModifyassignees,
    options: BodyResponseCallback[SchemaCourseWork],
    callback: BodyResponseCallback[SchemaCourseWork]
  ): Unit = js.native
  def modifyAssignees(params: ParamsResourceCoursesCourseworkModifyassignees, options: MethodOptions): GaxiosPromise[SchemaCourseWork] = js.native
  def modifyAssignees(
    params: ParamsResourceCoursesCourseworkModifyassignees,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCourseWork]
  ): Unit = js.native
  /**
    * classroom.courses.courseWork.patch
    * @desc Updates one or more fields of a course work.  See
    * google.classroom.v1.CourseWork for details of which fields may be updated
    * and who may change them.  This request must be made by the Developer
    * Console project of the [OAuth client
    * ID](https://support.google.com/cloud/answer/6158849) used to create the
    * corresponding course work item.  This method returns the following error
    * codes:  * `PERMISSION_DENIED` if the requesting developer project did not
    * create the corresponding course work, if the user is not permitted to
    * make the requested modification to the student submission, or for access
    * errors. * `INVALID_ARGUMENT` if the request is malformed. *
    * `FAILED_PRECONDITION` if the requested course work has already been
    * deleted. * `NOT_FOUND` if the requested course, course work, or student
    * submission does not exist.
    * @alias classroom.courses.courseWork.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.courseId Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {string} params.id Identifier of the course work.
    * @param {string=} params.updateMask Mask that identifies which fields on the course work to update. This field is required to do an update. The update fails if invalid fields are specified. If a field supports empty values, it can be cleared by specifying it in the update mask and not in the CourseWork object. If a field that does not support empty values is included in the update mask and not set in the CourseWork object, an `INVALID_ARGUMENT` error will be returned.  The following fields may be specified by teachers:  * `title` * `description` * `state` * `due_date` * `due_time` * `max_points` * `scheduled_time` * `submission_modification_mode`
    * @param {().CourseWork} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaCourseWork] = js.native
  def patch(callback: BodyResponseCallback[SchemaCourseWork]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCourseWork] = js.native
  def patch(params: ParamsResourceCoursesCourseworkPatch): GaxiosPromise[SchemaCourseWork] = js.native
  def patch(params: ParamsResourceCoursesCourseworkPatch, callback: BodyResponseCallback[SchemaCourseWork]): Unit = js.native
  def patch(
    params: ParamsResourceCoursesCourseworkPatch,
    options: BodyResponseCallback[SchemaCourseWork],
    callback: BodyResponseCallback[SchemaCourseWork]
  ): Unit = js.native
  def patch(params: ParamsResourceCoursesCourseworkPatch, options: MethodOptions): GaxiosPromise[SchemaCourseWork] = js.native
  def patch(
    params: ParamsResourceCoursesCourseworkPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCourseWork]
  ): Unit = js.native
}

