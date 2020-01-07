package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/classroom/v1", "classroom_v1.Resource$Courses$Students")
@js.native
class ResourceDollarCoursesDollarStudents protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * classroom.courses.students.create
    * @desc Adds a user as a student of a course.  This method returns the
    * following error codes:  * `PERMISSION_DENIED` if the requesting user is
    * not permitted to create students in this course or for access errors. *
    * `NOT_FOUND` if the requested course ID does not exist. *
    * `FAILED_PRECONDITION` if the requested user's account is disabled, for
    * the following request errors:     * CourseMemberLimitReached     *
    * CourseNotModifiable     * UserGroupsMembershipLimitReached *
    * `ALREADY_EXISTS` if the user is already a student or teacher in the
    * course.
    * @alias classroom.courses.students.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.courseId Identifier of the course to create the student in. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {string=} params.enrollmentCode Enrollment code of the course to create the student in. This code is required if userId corresponds to the requesting user; it may be omitted if the requesting user has administrative permissions to create students for any user.
    * @param {().Student} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Student] = js.native
  def create(callback: BodyResponseCallback[Schema$Student]): Unit = js.native
  def create(params: ParamsDollarResourceDollarCoursesDollarStudentsDollarCreate): GaxiosPromise[Schema$Student] = js.native
  def create(
    params: ParamsDollarResourceDollarCoursesDollarStudentsDollarCreate,
    callback: BodyResponseCallback[Schema$Student]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarCoursesDollarStudentsDollarCreate,
    options: BodyResponseCallback[Schema$Student],
    callback: BodyResponseCallback[Schema$Student]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarCoursesDollarStudentsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Student] = js.native
  def create(
    params: ParamsDollarResourceDollarCoursesDollarStudentsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Student]
  ): Unit = js.native
  /**
    * classroom.courses.students.delete
    * @desc Deletes a student of a course.  This method returns the following
    * error codes:  * `PERMISSION_DENIED` if the requesting user is not
    * permitted to delete students of this course or for access errors. *
    * `NOT_FOUND` if no student of this course has the requested ID or if the
    * course does not exist.
    * @alias classroom.courses.students.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.courseId Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {string} params.userId Identifier of the student to delete. The identifier can be one of the following:  * the numeric identifier for the user * the email address of the user * the string literal `"me"`, indicating the requesting user
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarCoursesDollarStudentsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarCoursesDollarStudentsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarCoursesDollarStudentsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarCoursesDollarStudentsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarCoursesDollarStudentsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * classroom.courses.students.get
    * @desc Returns a student of a course.  This method returns the following
    * error codes:  * `PERMISSION_DENIED` if the requesting user is not
    * permitted to view students of this course or for access errors. *
    * `NOT_FOUND` if no student of this course has the requested ID or if the
    * course does not exist.
    * @alias classroom.courses.students.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.courseId Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {string} params.userId Identifier of the student to return. The identifier can be one of the following:  * the numeric identifier for the user * the email address of the user * the string literal `"me"`, indicating the requesting user
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Student] = js.native
  def get(callback: BodyResponseCallback[Schema$Student]): Unit = js.native
  def get(params: ParamsDollarResourceDollarCoursesDollarStudentsDollarGet): GaxiosPromise[Schema$Student] = js.native
  def get(
    params: ParamsDollarResourceDollarCoursesDollarStudentsDollarGet,
    callback: BodyResponseCallback[Schema$Student]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarCoursesDollarStudentsDollarGet,
    options: BodyResponseCallback[Schema$Student],
    callback: BodyResponseCallback[Schema$Student]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarCoursesDollarStudentsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Student] = js.native
  def get(
    params: ParamsDollarResourceDollarCoursesDollarStudentsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Student]
  ): Unit = js.native
  /**
    * classroom.courses.students.list
    * @desc Returns a list of students of this course that the requester is
    * permitted to view.  This method returns the following error codes:  *
    * `NOT_FOUND` if the course does not exist. * `PERMISSION_DENIED` for
    * access errors.
    * @alias classroom.courses.students.list
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
  def list(): GaxiosPromise[Schema$ListStudentsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListStudentsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarCoursesDollarStudentsDollarList): GaxiosPromise[Schema$ListStudentsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCoursesDollarStudentsDollarList,
    callback: BodyResponseCallback[Schema$ListStudentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarCoursesDollarStudentsDollarList,
    options: BodyResponseCallback[Schema$ListStudentsResponse],
    callback: BodyResponseCallback[Schema$ListStudentsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarCoursesDollarStudentsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListStudentsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCoursesDollarStudentsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListStudentsResponse]
  ): Unit = js.native
}

