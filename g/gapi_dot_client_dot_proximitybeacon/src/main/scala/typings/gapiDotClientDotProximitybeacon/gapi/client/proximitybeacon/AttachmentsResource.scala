package typings.gapiDotClientDotProximitybeacon.gapi.client.proximitybeacon

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotProximitybeacon.Anon_AccesstokenAlt
import typings.gapiDotClientDotProximitybeacon.Anon_AccesstokenAltAttachmentName
import typings.gapiDotClientDotProximitybeacon.Anon_AccesstokenAltBeaconName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentsResource extends js.Object {
  /**
    * Deletes multiple attachments on a given beacon. This operation is
    * permanent and cannot be undone.
    *
    * You can optionally specify `namespacedType` to choose which attachments
    * should be deleted. If you do not specify `namespacedType`,  all your
    * attachments on the given beacon will be deleted. You also may explicitly
    * specify `&#42;/&#42;` to delete all.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42; permissions in the
    * Google Developers Console project.
    */
  def batchDelete(request: Anon_AccesstokenAlt): Request[DeleteAttachmentsResponse]
  /**
    * Associates the given data with the specified beacon. Attachment data must
    * contain two parts:
    * <ul>
    * <li>A namespaced type.</li>
    * <li>The actual attachment data itself.</li>
    * </ul>
    * The namespaced type consists of two parts, the namespace and the type.
    * The namespace must be one of the values returned by the `namespaces`
    * endpoint, while the type can be a string of any characters except for the
    * forward slash (`/`) up to 100 characters in length.
    *
    * Attachment data can be up to 1024 bytes long.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42; permissions in the
    * Google Developers Console project.
    */
  def create(request: Anon_AccesstokenAltBeaconName): Request[BeaconAttachment]
  /**
    * Deletes the specified attachment for the given beacon. Each attachment has
    * a unique attachment name (`attachmentName`) which is returned when you
    * fetch the attachment data via this API. You specify this with the delete
    * request to control which attachment is removed. This operation cannot be
    * undone.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42; permissions in the
    * Google Developers Console project.
    */
  def delete(request: Anon_AccesstokenAltAttachmentName): Request[js.Object]
  /**
    * Returns the attachments for the specified beacon that match the specified
    * namespaced-type pattern.
    *
    * To control which namespaced types are returned, you add the
    * `namespacedType` query parameter to the request. You must either use
    * `&#42;/&#42;`, to return all attachments, or the namespace must be one of
    * the ones returned from the  `namespaces` endpoint.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;viewer&#42;&#42;, &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42;
    * permissions in the Google Developers Console project.
    */
  def list(request: Anon_AccesstokenAlt): Request[ListBeaconAttachmentsResponse]
}

object AttachmentsResource {
  @scala.inline
  def apply(
    batchDelete: Anon_AccesstokenAlt => Request[DeleteAttachmentsResponse],
    create: Anon_AccesstokenAltBeaconName => Request[BeaconAttachment],
    delete: Anon_AccesstokenAltAttachmentName => Request[js.Object],
    list: Anon_AccesstokenAlt => Request[ListBeaconAttachmentsResponse]
  ): AttachmentsResource = {
    val __obj = js.Dynamic.literal(batchDelete = js.Any.fromFunction1(batchDelete), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AttachmentsResource]
  }
}

