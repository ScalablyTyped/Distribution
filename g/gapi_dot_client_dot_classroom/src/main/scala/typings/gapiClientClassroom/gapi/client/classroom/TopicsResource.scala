package typings.gapiClientClassroom.gapi.client.classroom

import typings.gapiClient.gapi.client.Request
import typings.gapiClientClassroom.anon.Alt
import typings.gapiClientClassroom.anon.Callback
import typings.gapiClientClassroom.anon.Fields
import typings.gapiClientClassroom.anon.FieldsId
import typings.gapiClientClassroom.anon.FieldsKey
import typings.gapiClientClassroom.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicsResource extends js.Object {
  def create(request: Alt, body: Topic): Request[Topic] = js.native
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
  def create(request: FieldsKey): Request[Topic] = js.native
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
  def delete(): Request[js.Object] = js.native
  def delete(request: Fields): Request[js.Object] = js.native
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
  def get(): Request[Topic] = js.native
  def get(request: Fields): Request[Topic] = js.native
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
  def list(): Request[ListTopicResponse] = js.native
  def list(request: Callback): Request[ListTopicResponse] = js.native
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
  def patch(request: FieldsId): Request[Topic] = js.native
  def patch(request: Oauthtoken, body: Topic): Request[Topic] = js.native
}

