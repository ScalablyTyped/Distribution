package typings.googleapis.classroomV1Mod.classroomV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/classroom/v1", "classroom_v1.Resource$Courses$Teachers")
@js.native
class ResourceCoursesTeachers protected () extends StObject {
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
  def create(): GaxiosPromise[SchemaTeacher] = js.native
  def create(callback: BodyResponseCallback[SchemaTeacher]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTeacher] = js.native
  def create(params: ParamsResourceCoursesTeachersCreate): GaxiosPromise[SchemaTeacher] = js.native
  def create(params: ParamsResourceCoursesTeachersCreate, callback: BodyResponseCallback[SchemaTeacher]): Unit = js.native
  def create(
    params: ParamsResourceCoursesTeachersCreate,
    options: BodyResponseCallback[SchemaTeacher],
    callback: BodyResponseCallback[SchemaTeacher]
  ): Unit = js.native
  def create(params: ParamsResourceCoursesTeachersCreate, options: MethodOptions): GaxiosPromise[SchemaTeacher] = js.native
  def create(
    params: ParamsResourceCoursesTeachersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTeacher]
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
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceCoursesTeachersDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceCoursesTeachersDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceCoursesTeachersDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceCoursesTeachersDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceCoursesTeachersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
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
  def get(): GaxiosPromise[SchemaTeacher] = js.native
  def get(callback: BodyResponseCallback[SchemaTeacher]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTeacher] = js.native
  def get(params: ParamsResourceCoursesTeachersGet): GaxiosPromise[SchemaTeacher] = js.native
  def get(params: ParamsResourceCoursesTeachersGet, callback: BodyResponseCallback[SchemaTeacher]): Unit = js.native
  def get(
    params: ParamsResourceCoursesTeachersGet,
    options: BodyResponseCallback[SchemaTeacher],
    callback: BodyResponseCallback[SchemaTeacher]
  ): Unit = js.native
  def get(params: ParamsResourceCoursesTeachersGet, options: MethodOptions): GaxiosPromise[SchemaTeacher] = js.native
  def get(
    params: ParamsResourceCoursesTeachersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTeacher]
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
  def list(): GaxiosPromise[SchemaListTeachersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTeachersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListTeachersResponse] = js.native
  def list(params: ParamsResourceCoursesTeachersList): GaxiosPromise[SchemaListTeachersResponse] = js.native
  def list(
    params: ParamsResourceCoursesTeachersList,
    callback: BodyResponseCallback[SchemaListTeachersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCoursesTeachersList,
    options: BodyResponseCallback[SchemaListTeachersResponse],
    callback: BodyResponseCallback[SchemaListTeachersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCoursesTeachersList, options: MethodOptions): GaxiosPromise[SchemaListTeachersResponse] = js.native
  def list(
    params: ParamsResourceCoursesTeachersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTeachersResponse]
  ): Unit = js.native
}
