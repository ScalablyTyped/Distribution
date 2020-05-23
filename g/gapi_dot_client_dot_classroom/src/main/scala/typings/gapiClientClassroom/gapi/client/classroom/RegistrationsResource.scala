package typings.gapiClientClassroom.gapi.client.classroom

import typings.gapiClient.gapi.client.Request
import typings.gapiClientClassroom.anon.KeyOauthtoken
import typings.gapiClientClassroom.anon.RegistrationId
import typings.gapiClientClassroom.anon.UploadTypeUploadprotocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegistrationsResource extends js.Object {
  def create(request: KeyOauthtoken, body: Registration): Request[Registration] = js.native
  /**
    * Creates a `Registration`, causing Classroom to start sending notifications
    * from the provided `feed` to the destination provided in `cloudPubSubTopic`.
    *
    * Returns the created `Registration`. Currently, this will be the same as
    * the argument, but with server-assigned fields such as `expiry_time` and
    * `id` filled in.
    *
    * Note that any value specified for the `expiry_time` or `id` fields will be
    * ignored.
    *
    * While Classroom may validate the `cloudPubSubTopic` and return errors on a
    * best effort basis, it is the caller's responsibility to ensure that it
    * exists and that Classroom has permission to publish to it.
    *
    * This method may return the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if:
    * &#42; the authenticated user does not have permission to receive
    * notifications from the requested field; or
    * &#42; the credential provided does not include the appropriate scope for
    * the requested feed.
    * &#42; another access error is encountered.
    * &#42; `INVALID_ARGUMENT` if:
    * &#42; no `cloudPubsubTopic` is specified, or the specified
    * `cloudPubsubTopic` is not valid; or
    * &#42; no `feed` is specified, or the specified `feed` is not valid.
    * &#42; `NOT_FOUND` if:
    * &#42; the specified `feed` cannot be located, or the requesting user does
    * not have permission to determine whether or not it exists; or
    * &#42; the specified `cloudPubsubTopic` cannot be located, or Classroom has
    * not been granted permission to publish to it.
    */
  def create(request: UploadTypeUploadprotocol): Request[Registration] = js.native
  /**
    * Deletes a `Registration`, causing Classroom to stop sending notifications
    * for that `Registration`.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: RegistrationId): Request[js.Object] = js.native
}

