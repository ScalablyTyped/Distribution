package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteRequest extends js.Object {
  /** Labels associated with this write request. */
  var labels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /**
    * The ID of the write stream to resume.
    * This may only be set in the first message. When left empty, a new write
    * stream will be created.
    */
  var streamId: js.UndefOr[java.lang.String] = js.undefined
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
  var streamToken: js.UndefOr[java.lang.String] = js.undefined
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

