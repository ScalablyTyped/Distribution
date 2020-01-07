package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/classroom/v1", "classroom_v1.Resource$Courses$Teachers")
@js.native
class ResourceDollarCoursesDollarTeachers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * classroom.courses.teachers.create
    * @desc Creates a teacher of a course.  This method returns the following
    * error codes:  * `PERMISSION_DENIED` if the requesting user is not
    * permitted to create teachers in this course or for access errors. *
    * `NOT_FOUND` if the requested course ID does not exist. *
    * `FAILED_PRECONDITION` if the requested user's account is disabled, for
    * the following request errors:     * CourseMemberLimitReached     *
    * CourseNotModifiable     * CourseTeacherLimitReached     *
    * UserGroupsMembershipLimitReached * `ALREADY_EXISTS` if the user is
    * already a teacher or student in the course.
    * @alias classroom.courses.teachers.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.courseId Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {().Teacher} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Teacher] = js.native
  def create(callback: BodyResponseCallback[Schema$Teacher]): Unit = js.native
  def create(params: ParamsDollarResourceDollarCoursesDollarTeachersDollarCreate): GaxiosPromise[Schema$Teacher] = js.native
  def create(
    params: ParamsDollarResourceDollarCoursesDollarTeachersDollarCreate,
    callback: BodyResponseCallback[Schema$Teacher]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarCoursesDollarTeachersDollarCreate,
    options: BodyResponseCallback[Schema$Teacher],
    callback: BodyResponseCallback[Schema$Teacher]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarCoursesDollarTeachersDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Teacher] = js.native
  def create(
    params: ParamsDollarResourceDollarCoursesDollarTeachersDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Teacher]
  ): Unit = js.native
  /**
    * classroom.courses.teachers.delete
    * @desc Deletes a teacher of a course.  This method returns the following
    * error codes:  * `PERMISSION_DENIED` if the requesting user is not
    * permitted to delete teachers of this course or for access errors. *
    * `NOT_FOUND` if no teacher of this course has the requested ID or if the
    * course does not exist. * `FAILED_PRECONDITION` if the requested ID
    * belongs to the primary teacher of this course.
    * @alias classroom.courses.teachers.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.courseId Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {string} params.userId Identifier of the teacher to delete. The identifier can be one of the following:  * the numeric identifier for the user * the email address of the user * the string literal `"me"`, indicating the requesting user
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarCoursesDollarTeachersDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarCoursesDollarTeachersDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarCoursesDollarTeachersDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarCoursesDollarTeachersDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarCoursesDollarTeachersDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * classroom.courses.teachers.get
    * @desc Returns a teacher of a course.  This method returns the following
    * error codes:  * `PERMISSION_DENIED` if the requesting user is not
    * permitted to view teachers of this course or for access errors. *
    * `NOT_FOUND` if no teacher of this course has the requested ID or if the
    * course does not exist.
    * @alias classroom.courses.teachers.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.courseId Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {string} params.userId Identifier of the teacher to return. The identifier can be one of the following:  * the numeric identifier for the user * the email address of the user * the string literal `"me"`, indicating the requesting user
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Teacher] = js.native
  def get(callback: BodyResponseCallback[Schema$Teacher]): Unit = js.native
  def get(params: ParamsDollarResourceDollarCoursesDollarTeachersDollarGet): GaxiosPromise[Schema$Teacher] = js.native
  def get(
    params: ParamsDollarResourceDollarCoursesDollarTeachersDollarGet,
    callback: BodyResponseCallback[Schema$Teacher]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarCoursesDollarTeachersDollarGet,
    options: BodyResponseCallback[Schema$Teacher],
    callback: BodyResponseCallback[Schema$Teacher]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarCoursesDollarTeachersDollarGet, options: MethodOptions): GaxiosPromise[Schema$Teacher] = js.native
  def get(
    params: ParamsDollarResourceDollarCoursesDollarTeachersDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Teacher]
  ): Unit = js.native
  /**
    * classroom.courses.teachers.list
    * @desc Returns a list of teachers of this course that the requester is
    * permitted to view.  This method returns the following error codes:  *
    * `NOT_FOUND` if the course does not exist. * `PERMISSION_DENIED` for
    * access errors.
    * @alias classroom.courses.teachers.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.courseId Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {integer=} params.pageSize Maximum number of items to return. Zero means no maximum.  The server may return fewer than the specified number of results.
    * @param {string=} params.pageToken nextPageToken value returned from a previous list call, indicating that the subsequent page of results should be returned.  The list request must be otherwise identical to the one that resulted in this token.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListTeachersResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListTeachersResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarCoursesDollarTeachersDollarList): GaxiosPromise[Schema$ListTeachersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCoursesDollarTeachersDollarList,
    callback: BodyResponseCallback[Schema$ListTeachersResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarCoursesDollarTeachersDollarList,
    options: BodyResponseCallback[Schema$ListTeachersResponse],
    callback: BodyResponseCallback[Schema$ListTeachersResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarCoursesDollarTeachersDollarList, options: MethodOptions): GaxiosPromise[Schema$ListTeachersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCoursesDollarTeachersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListTeachersResponse]
  ): Unit = js.native
}

