package typings.gapiClientFirestore.gapi.client.firestore

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteRequest extends js.Object {
  /** Labels associated with this write request. */
  var labels: js.UndefOr[Record[String, String]] = js.undefined
  /**
    * The ID of the write stream to resume.
    * This may only be set in the first message. When left empty, a new write
    * stream will be created.
    */
  var streamId: js.UndefOr[String] = js.undefined
  /**
    * A stream token that was previously sent by the server.
    *
    * The client should set this field to the token from the most recent
    * WriteResponse it has received. This acknowledges that the client has
    * received responses up to this token. After sending this token, earlier
    * tokens may not be used anymore.
    *
    * The server may close the stream if there are too many unacknowledged
    * responses.
    *
    * Leave this field unset when creating a new stream. To resume a stream at
    * a specific point, set this field and the `stream_id` field.
    *
    * Leave this field unset when creating a new stream.
    */
  var streamToken: js.UndefOr[String] = js.undefined
  /**
    * The writes to apply.
    *
    * Always executed atomically and in order.
    * This must be empty on the first request.
    * This may be empty on the last request.
    * This must not be empty on all other requests.
    */
  var writes: js.UndefOr[js.Array[Write]] = js.undefined
}

object WriteRequest {
  @scala.inline
  def apply(
    labels: Record[String, String] = null,
    streamId: String = null,
    streamToken: String = null,
    writes: js.Array[Write] = null
  ): WriteRequest = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (streamId != null) __obj.updateDynamic("streamId")(streamId.asInstanceOf[js.Any])
    if (streamToken != null) __obj.updateDynamic("streamToken")(streamToken.asInstanceOf[js.Any])
    if (writes != null) __obj.updateDynamic("writes")(writes.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteRequest]
  }
}

