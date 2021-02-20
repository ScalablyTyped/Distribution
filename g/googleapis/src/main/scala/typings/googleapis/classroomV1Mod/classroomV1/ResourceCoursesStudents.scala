package typings.googleapis.classroomV1Mod.classroomV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/classroom/v1", "classroom_v1.Resource$Courses$Students")
@js.native
class ResourceCoursesStudents protected () extends StObject {
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
  def create(): GaxiosPromise[SchemaStudent] = js.native
  def create(callback: BodyResponseCallback[SchemaStudent]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaStudent] = js.native
  def create(params: ParamsResourceCoursesStudentsCreate): GaxiosPromise[SchemaStudent] = js.native
  def create(params: ParamsResourceCoursesStudentsCreate, callback: BodyResponseCallback[SchemaStudent]): Unit = js.native
  def create(
    params: ParamsResourceCoursesStudentsCreate,
    options: BodyResponseCallback[SchemaStudent],
    callback: BodyResponseCallback[SchemaStudent]
  ): Unit = js.native
  def create(params: ParamsResourceCoursesStudentsCreate, options: MethodOptions): GaxiosPromise[SchemaStudent] = js.native
  def create(
    params: ParamsResourceCoursesStudentsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStudent]
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
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceCoursesStudentsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceCoursesStudentsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceCoursesStudentsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceCoursesStudentsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceCoursesStudentsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
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
  def get(): GaxiosPromise[SchemaStudent] = js.native
  def get(callback: BodyResponseCallback[SchemaStudent]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaStudent] = js.native
  def get(params: ParamsResourceCoursesStudentsGet): GaxiosPromise[SchemaStudent] = js.native
  def get(params: ParamsResourceCoursesStudentsGet, callback: BodyResponseCallback[SchemaStudent]): Unit = js.native
  def get(
    params: ParamsResourceCoursesStudentsGet,
    options: BodyResponseCallback[SchemaStudent],
    callback: BodyResponseCallback[SchemaStudent]
  ): Unit = js.native
  def get(params: ParamsResourceCoursesStudentsGet, options: MethodOptions): GaxiosPromise[SchemaStudent] = js.native
  def get(
    params: ParamsResourceCoursesStudentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStudent]
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
  def list(): GaxiosPromise[SchemaListStudentsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListStudentsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListStudentsResponse] = js.native
  def list(params: ParamsResourceCoursesStudentsList): GaxiosPromise[SchemaListStudentsResponse] = js.native
  def list(
    params: ParamsResourceCoursesStudentsList,
    callback: BodyResponseCallback[SchemaListStudentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCoursesStudentsList,
    options: BodyResponseCallback[SchemaListStudentsResponse],
    callback: BodyResponseCallback[SchemaListStudentsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCoursesStudentsList, options: MethodOptions): GaxiosPromise[SchemaListStudentsResponse] = js.native
  def list(
    params: ParamsResourceCoursesStudentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListStudentsResponse]
  ): Unit = js.native
}
