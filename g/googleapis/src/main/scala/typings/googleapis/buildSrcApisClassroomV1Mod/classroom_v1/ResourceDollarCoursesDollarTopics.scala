package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/classroom/v1", "classroom_v1.Resource$Courses$Topics")
@js.native
class ResourceDollarCoursesDollarTopics protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * classroom.courses.topics.create
    * @desc Creates a topic.  This method returns the following error codes:  *
    * `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course, create a topic in the requested course, or for access
    * errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND`
    * if the requested course does not exist.
    * @alias classroom.courses.topics.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.courseId Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {().Topic} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Topic] = js.native
  def create(callback: BodyResponseCallback[Schema$Topic]): Unit = js.native
  def create(params: ParamsDollarResourceDollarCoursesDollarTopicsDollarCreate): GaxiosPromise[Schema$Topic] = js.native
  def create(
    params: ParamsDollarResourceDollarCoursesDollarTopicsDollarCreate,
    callback: BodyResponseCallback[Schema$Topic]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarCoursesDollarTopicsDollarCreate,
    options: BodyResponseCallback[Schema$Topic],
    callback: BodyResponseCallback[Schema$Topic]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarCoursesDollarTopicsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Topic] = js.native
  def create(
    params: ParamsDollarResourceDollarCoursesDollarTopicsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Topic]
  ): Unit = js.native
  /**
    * classroom.courses.topics.delete
    * @desc Deletes a topic.  This method returns the following error codes:  *
    * `PERMISSION_DENIED` if the requesting user is not allowed to delete the
    * requested topic or for access errors. * `FAILED_PRECONDITION` if the
    * requested topic has already been deleted. * `NOT_FOUND` if no course or
    * topic exists with the requested ID.
    * @alias classroom.courses.topics.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.courseId Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {string} params.id Identifier of the topic to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarCoursesDollarTopicsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarCoursesDollarTopicsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarCoursesDollarTopicsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarCoursesDollarTopicsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarCoursesDollarTopicsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * classroom.courses.topics.get
    * @desc Returns a topic.  This method returns the following error codes:  *
    * `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course or topic, or for access errors. * `INVALID_ARGUMENT` if
    * the request is malformed. * `NOT_FOUND` if the requested course or topic
    * does not exist.
    * @alias classroom.courses.topics.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.courseId Identifier of the course.
    * @param {string} params.id Identifier of the topic.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Topic] = js.native
  def get(callback: BodyResponseCallback[Schema$Topic]): Unit = js.native
  def get(params: ParamsDollarResourceDollarCoursesDollarTopicsDollarGet): GaxiosPromise[Schema$Topic] = js.native
  def get(
    params: ParamsDollarResourceDollarCoursesDollarTopicsDollarGet,
    callback: BodyResponseCallback[Schema$Topic]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarCoursesDollarTopicsDollarGet,
    options: BodyResponseCallback[Schema$Topic],
    callback: BodyResponseCallback[Schema$Topic]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarCoursesDollarTopicsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Topic] = js.native
  def get(
    params: ParamsDollarResourceDollarCoursesDollarTopicsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Topic]
  ): Unit = js.native
  /**
    * classroom.courses.topics.list
    * @desc Returns the list of topics that the requester is permitted to view.
    * This method returns the following error codes:  * `PERMISSION_DENIED` if
    * the requesting user is not permitted to access the requested course or
    * for access errors. * `INVALID_ARGUMENT` if the request is malformed. *
    * `NOT_FOUND` if the requested course does not exist.
    * @alias classroom.courses.topics.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.courseId Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {integer=} params.pageSize Maximum number of items to return. Zero or unspecified indicates that the server may assign a maximum.  The server may return fewer than the specified number of results.
    * @param {string=} params.pageToken nextPageToken value returned from a previous list call, indicating that the subsequent page of results should be returned.  The list request must be otherwise identical to the one that resulted in this token.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListTopicResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListTopicResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarCoursesDollarTopicsDollarList): GaxiosPromise[Schema$ListTopicResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCoursesDollarTopicsDollarList,
    callback: BodyResponseCallback[Schema$ListTopicResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarCoursesDollarTopicsDollarList,
    options: BodyResponseCallback[Schema$ListTopicResponse],
    callback: BodyResponseCallback[Schema$ListTopicResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarCoursesDollarTopicsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListTopicResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCoursesDollarTopicsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListTopicResponse]
  ): Unit = js.native
  /**
    * classroom.courses.topics.patch
    * @desc Updates one or more fields of a topic.  This method returns the
    * following error codes:  * `PERMISSION_DENIED` if the requesting developer
    * project did not create the corresponding topic or for access errors. *
    * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the
    * requested course or topic does not exist
    * @alias classroom.courses.topics.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.courseId Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    * @param {string} params.id Identifier of the topic.
    * @param {string=} params.updateMask Mask that identifies which fields on the topic to update. This field is required to do an update. The update fails if invalid fields are specified. If a field supports empty values, it can be cleared by specifying it in the update mask and not in the Topic object. If a field that does not support empty values is included in the update mask and not set in the Topic object, an `INVALID_ARGUMENT` error will be returned.  The following fields may be specified:  * `name`
    * @param {().Topic} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Topic] = js.native
  def patch(callback: BodyResponseCallback[Schema$Topic]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCoursesDollarTopicsDollarPatch): GaxiosPromise[Schema$Topic] = js.native
  def patch(
    params: ParamsDollarResourceDollarCoursesDollarTopicsDollarPatch,
    callback: BodyResponseCallback[Schema$Topic]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarCoursesDollarTopicsDollarPatch,
    options: BodyResponseCallback[Schema$Topic],
    callback: BodyResponseCallback[Schema$Topic]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCoursesDollarTopicsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Topic] = js.native
  def patch(
    params: ParamsDollarResourceDollarCoursesDollarTopicsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Topic]
  ): Unit = js.native
}

