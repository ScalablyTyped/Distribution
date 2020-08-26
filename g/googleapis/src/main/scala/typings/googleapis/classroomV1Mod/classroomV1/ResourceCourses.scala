package typings.googleapis.classroomV1Mod.classroomV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/classroom/v1", "classroom_v1.Resource$Courses")
@js.native
class ResourceCourses protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var aliases: ResourceCoursesAliases = js.native
  var announcements: ResourceCoursesAnnouncements = js.native
  var context: APIRequestContext = js.native
  var courseWork: ResourceCoursesCoursework = js.native
  var students: ResourceCoursesStudents = js.native
  var teachers: ResourceCoursesTeachers = js.native
  var topics: ResourceCoursesTopics = js.native
  /**
    * classroom.courses.create
    * @desc Creates a course.  The user specified in `ownerId` is the owner of
    * the created course and added as a teacher.  This method returns the
    * following error codes:  * `PERMISSION_DENIED` if the requesting user is
    * not permitted to create courses or for access errors. * `NOT_FOUND` if
    * the primary teacher is not a valid user. * `FAILED_PRECONDITION` if the
    * course owner's account is disabled or for the following request errors:
    * * UserGroupsMembershipLimitReached * `ALREADY_EXISTS` if an alias was
    * specified in the `id` and already exists.
    * @alias classroom.courses.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Course} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaCourse] = js.native
  def create(callback: BodyResponseCallback[SchemaCourse]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCourse] = js.native
  def create(params: ParamsResourceCoursesCreate): GaxiosPromise[SchemaCourse] = js.native
  def create(params: ParamsResourceCoursesCreate, callback: BodyResponseCallback[SchemaCourse]): Unit = js.native
  def create(
    params: ParamsResourceCoursesCreate,
    options: BodyResponseCallback[SchemaCourse],
    callback: BodyResponseCallback[SchemaCourse]
  ): Unit = js.native
  def create(params: ParamsResourceCoursesCreate, options: MethodOptions): GaxiosPromise[SchemaCourse] = js.native
  def create(
    params: ParamsResourceCoursesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCourse]
  ): Unit = js.native
  /**
    * classroom.courses.delete
    * @desc Deletes a course.  This method returns the following error codes:
    * * `PERMISSION_DENIED` if the requesting user is not permitted to delete
    * the requested course or for access errors. * `NOT_FOUND` if no course
    * exists with the requested ID.
    * @alias classroom.courses.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Identifier of the course to delete. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceCoursesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceCoursesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceCoursesDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceCoursesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceCoursesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * classroom.courses.get
    * @desc Returns a course.  This method returns the following error codes:
    * * `PERMISSION_DENIED` if the requesting user is not permitted to access
    * the requested course or for access errors. * `NOT_FOUND` if no course
    * exists with the requested ID.
    * @alias classroom.courses.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Identifier of the course to return. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaCourse] = js.native
  def get(callback: BodyResponseCallback[SchemaCourse]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCourse] = js.native
  def get(params: ParamsResourceCoursesGet): GaxiosPromise[SchemaCourse] = js.native
  def get(params: ParamsResourceCoursesGet, callback: BodyResponseCallback[SchemaCourse]): Unit = js.native
  def get(
    params: ParamsResourceCoursesGet,
    options: BodyResponseCallback[SchemaCourse],
    callback: BodyResponseCallback[SchemaCourse]
  ): Unit = js.native
  def get(params: ParamsResourceCoursesGet, options: MethodOptions): GaxiosPromise[SchemaCourse] = js.native
  def get(
    params: ParamsResourceCoursesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCourse]
  ): Unit = js.native
  /**
    * classroom.courses.list
    * @desc Returns a list of courses that the requesting user is permitted to
    * view, restricted to those that match the request. Returned courses are
    * ordered by creation time, with the most recently created coming first.
    * This method returns the following error codes:  * `PERMISSION_DENIED` for
    * access errors. * `INVALID_ARGUMENT` if the query argument is malformed. *
    * `NOT_FOUND` if any users specified in the query arguments do not exist.
    * @alias classroom.courses.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.courseStates Restricts returned courses to those in one of the specified states The default value is ACTIVE, ARCHIVED, PROVISIONED, DECLINED.
    * @param {integer=} params.pageSize Maximum number of items to return. Zero or unspecified indicates that the server may assign a maximum.  The server may return fewer than the specified number of results.
    * @param {string=} params.pageToken nextPageToken value returned from a previous list call, indicating that the subsequent page of results should be returned.  The list request must be otherwise identical to the one that resulted in this token.
    * @param {string=} params.studentId Restricts returned courses to those having a student with the specified identifier. The identifier can be one of the following:  * the numeric identifier for the user * the email address of the user * the string literal `"me"`, indicating the requesting user
    * @param {string=} params.teacherId Restricts returned courses to those having a teacher with the specified identifier. The identifier can be one of the following:  * the numeric identifier for the user * the email address of the user * the string literal `"me"`, indicating the requesting user
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListCoursesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCoursesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListCoursesResponse] = js.native
  def list(params: ParamsResourceCoursesList): GaxiosPromise[SchemaListCoursesResponse] = js.native
  def list(params: ParamsResourceCoursesList, callback: BodyResponseCallback[SchemaListCoursesResponse]): Unit = js.native
  def list(
    params: ParamsResourceCoursesList,
    options: BodyResponseCallback[SchemaListCoursesResponse],
    callback: BodyResponseCallback[SchemaListCoursesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCoursesList, options: MethodOptions): GaxiosPromise[SchemaListCoursesResponse] = js.native
  def list(
    params: ParamsResourceCoursesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCoursesResponse]
  ): Unit = js.native
  /**
    * classroom.courses.patch
    * @desc Updates one or more fields in a course.  This method returns the
    * following error codes:  * `PERMISSION_DENIED` if the requesting user is
    * not permitted to modify the requested course or for access errors. *
    * `NOT_FOUND` if no course exists with the requested ID. *
    * `INVALID_ARGUMENT` if invalid fields are specified in the update mask or
    * if no update mask is supplied. * `FAILED_PRECONDITION` for the following
    * request errors:     * CourseNotModifiable
    * @alias classroom.courses.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Identifier of the course to update. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {string=} params.updateMask Mask that identifies which fields on the course to update. This field is required to do an update. The update will fail if invalid fields are specified. The following fields are valid:  * `name` * `section` * `descriptionHeading` * `description` * `room` * `courseState` * `ownerId`  Note: patches to ownerId are treated as being effective immediately, but in practice it may take some time for the ownership transfer of all affected resources to complete.  When set in a query parameter, this field should be specified as  `updateMask=<field1>,<field2>,...`
    * @param {().Course} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaCourse] = js.native
  def patch(callback: BodyResponseCallback[SchemaCourse]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCourse] = js.native
  def patch(params: ParamsResourceCoursesPatch): GaxiosPromise[SchemaCourse] = js.native
  def patch(params: ParamsResourceCoursesPatch, callback: BodyResponseCallback[SchemaCourse]): Unit = js.native
  def patch(
    params: ParamsResourceCoursesPatch,
    options: BodyResponseCallback[SchemaCourse],
    callback: BodyResponseCallback[SchemaCourse]
  ): Unit = js.native
  def patch(params: ParamsResourceCoursesPatch, options: MethodOptions): GaxiosPromise[SchemaCourse] = js.native
  def patch(
    params: ParamsResourceCoursesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCourse]
  ): Unit = js.native
  /**
    * classroom.courses.update
    * @desc Updates a course.  This method returns the following error codes:
    * * `PERMISSION_DENIED` if the requesting user is not permitted to modify
    * the requested course or for access errors. * `NOT_FOUND` if no course
    * exists with the requested ID. * `FAILED_PRECONDITION` for the following
    * request errors:     * CourseNotModifiable
    * @alias classroom.courses.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Identifier of the course to update. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {().Course} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaCourse] = js.native
  def update(callback: BodyResponseCallback[SchemaCourse]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCourse] = js.native
  def update(params: ParamsResourceCoursesUpdate): GaxiosPromise[SchemaCourse] = js.native
  def update(params: ParamsResourceCoursesUpdate, callback: BodyResponseCallback[SchemaCourse]): Unit = js.native
  def update(
    params: ParamsResourceCoursesUpdate,
    options: BodyResponseCallback[SchemaCourse],
    callback: BodyResponseCallback[SchemaCourse]
  ): Unit = js.native
  def update(params: ParamsResourceCoursesUpdate, options: MethodOptions): GaxiosPromise[SchemaCourse] = js.native
  def update(
    params: ParamsResourceCoursesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCourse]
  ): Unit = js.native
}

