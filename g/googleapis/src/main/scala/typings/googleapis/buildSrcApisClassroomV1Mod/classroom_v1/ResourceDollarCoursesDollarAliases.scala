package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/classroom/v1", "classroom_v1.Resource$Courses$Aliases")
@js.native
class ResourceDollarCoursesDollarAliases protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * classroom.courses.aliases.create
    * @desc Creates an alias for a course.  This method returns the following
    * error codes:  * `PERMISSION_DENIED` if the requesting user is not
    * permitted to create the alias or for access errors. * `NOT_FOUND` if the
    * course does not exist. * `ALREADY_EXISTS` if the alias already exists. *
    * `FAILED_PRECONDITION` if the alias requested does not make sense for the
    * requesting user or course (for example, if a user not in a domain
    * attempts to access a domain-scoped alias).
    * @alias classroom.courses.aliases.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.courseId Identifier of the course to alias. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {().CourseAlias} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$CourseAlias] = js.native
  def create(callback: BodyResponseCallback[Schema$CourseAlias]): Unit = js.native
  def create(params: ParamsDollarResourceDollarCoursesDollarAliasesDollarCreate): GaxiosPromise[Schema$CourseAlias] = js.native
  def create(
    params: ParamsDollarResourceDollarCoursesDollarAliasesDollarCreate,
    callback: BodyResponseCallback[Schema$CourseAlias]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarCoursesDollarAliasesDollarCreate,
    options: BodyResponseCallback[Schema$CourseAlias],
    callback: BodyResponseCallback[Schema$CourseAlias]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarCoursesDollarAliasesDollarCreate, options: MethodOptions): GaxiosPromise[Schema$CourseAlias] = js.native
  def create(
    params: ParamsDollarResourceDollarCoursesDollarAliasesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CourseAlias]
  ): Unit = js.native
  /**
    * classroom.courses.aliases.delete
    * @desc Deletes an alias of a course.  This method returns the following
    * error codes:  * `PERMISSION_DENIED` if the requesting user is not
    * permitted to remove the alias or for access errors. * `NOT_FOUND` if the
    * alias does not exist. * `FAILED_PRECONDITION` if the alias requested does
    * not make sense for the   requesting user or course (for example, if a
    * user not in a domain   attempts to delete a domain-scoped alias).
    * @alias classroom.courses.aliases.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.alias Alias to delete. This may not be the Classroom-assigned identifier.
    * @param {string} params.courseId Identifier of the course whose alias should be deleted. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarCoursesDollarAliasesDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarCoursesDollarAliasesDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarCoursesDollarAliasesDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarCoursesDollarAliasesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarCoursesDollarAliasesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * classroom.courses.aliases.list
    * @desc Returns a list of aliases for a course.  This method returns the
    * following error codes:  * `PERMISSION_DENIED` if the requesting user is
    * not permitted to access the course or for access errors. * `NOT_FOUND` if
    * the course does not exist.
    * @alias classroom.courses.aliases.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.courseId The identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {integer=} params.pageSize Maximum number of items to return. Zero or unspecified indicates that the server may assign a maximum.  The server may return fewer than the specified number of results.
    * @param {string=} params.pageToken nextPageToken value returned from a previous list call, indicating that the subsequent page of results should be returned.  The list request must be otherwise identical to the one that resulted in this token.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListCourseAliasesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListCourseAliasesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarCoursesDollarAliasesDollarList): GaxiosPromise[Schema$ListCourseAliasesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCoursesDollarAliasesDollarList,
    callback: BodyResponseCallback[Schema$ListCourseAliasesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarCoursesDollarAliasesDollarList,
    options: BodyResponseCallback[Schema$ListCourseAliasesResponse],
    callback: BodyResponseCallback[Schema$ListCourseAliasesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarCoursesDollarAliasesDollarList, options: MethodOptions): GaxiosPromise[Schema$ListCourseAliasesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCoursesDollarAliasesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListCourseAliasesResponse]
  ): Unit = js.native
}

