package typings.gapiClientClassroom.gapi.client.classroom

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientClassroom.AnonAccesstokenAlt
import typings.gapiClientClassroom.AnonAccesstokenAltCallback
import typings.gapiClientClassroom.AnonAccesstokenAltCallbackCourseIdFields
import typings.gapiClientClassroom.AnonAccesstokenAltCallbackCourseIdFieldsIdKeyOauthtoken
import typings.gapiClientClassroom.AnonAccesstokenAltCallbackCourseIdFieldsIdKeyOauthtokenPrettyPrintQuotaUserResource
import typings.gapiClientClassroom.AnonAccesstokenAltCallbackCourseIdFieldsKeyOauthtokenPrettyPrintQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicsResource extends js.Object {
  /**
    * Creates a topic.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course, create a topic in the requested course,
    * or for access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `NOT_FOUND` if the requested course does not exist.
    */
  def create(request: AnonAccesstokenAltCallbackCourseIdFieldsKeyOauthtokenPrettyPrintQuotaUser): Request_[Topic] = js.native
  def create(request: AnonAccesstokenAlt, body: Topic): Request_[Topic] = js.native
  /**
    * Deletes a topic.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not allowed to delete the
    * requested topic or for access errors.
    * &#42; `FAILED_PRECONDITION` if the requested topic has already been
    * deleted.
    * &#42; `NOT_FOUND` if no course or topic exists with the requested ID.
    */
  def delete(request: AnonAccesstokenAltCallbackCourseIdFields): Request_[js.Object] = js.native
  /**
    * Returns a topic.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course or topic, or for access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `NOT_FOUND` if the requested course or topic does not exist.
    */
  def get(request: AnonAccesstokenAltCallbackCourseIdFields): Request_[Topic] = js.native
  /**
    * Returns the list of topics that the requester is permitted to view.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access
    * the requested course or for access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `NOT_FOUND` if the requested course does not exist.
    */
  def list(request: AnonAccesstokenAltCallback): Request_[ListTopicResponse] = js.native
  /**
    * Updates one or more fields of a topic.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting developer project did not create
    * the corresponding topic or for access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `NOT_FOUND` if the requested course or topic does not exist
    */
  def patch(request: AnonAccesstokenAltCallbackCourseIdFieldsIdKeyOauthtokenPrettyPrintQuotaUserResource): Request_[Topic] = js.native
  def patch(request: AnonAccesstokenAltCallbackCourseIdFieldsIdKeyOauthtoken, body: Topic): Request_[Topic] = js.native
}

