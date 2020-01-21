package typings.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteResponse extends js.Object {
  /** The time at which the commit occurred. */
  var commitTime: js.UndefOr[String] = js.undefined
  /**
    * The ID of the stream.
    * Only set on the first message, when a new stream was created.
    */
  var streamId: js.UndefOr[String] = js.undefined
  /**
    * A token that represents the position of this response in the stream.
    * This can be used by a client to resume the stream at this point.
    *
    * This field is always set.
    */
  var streamToken: js.UndefOr[String] = js.undefined
  /**
    * The result of applying the writes.
    *
    * This i-th write result corresponds to the i-th write in the
    * request.
    */
  var writeResults: js.UndefOr[js.Array[WriteResult]] = js.undefined
}

object WriteResponse {
  @scala.inline
  def apply(
    commitTime: String = null,
    streamId: String = null,
    streamToken: String = null,
    writeResults: js.Array[WriteResult] = null
  ): WriteResponse = {
    val __obj = js.Dynamic.literal()
    if (commitTime != null) __obj.updateDynamic("commitTime")(commitTime.asInstanceOf[js.Any])
    if (streamId != null) __obj.updateDynamic("streamId")(streamId.asInstanceOf[js.Any])
    if (streamToken != null) __obj.updateDynamic("streamToken")(streamToken.asInstanceOf[js.Any])
    if (writeResults != null) __obj.updateDynamic("writeResults")(writeResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteResponse]
  }
}

