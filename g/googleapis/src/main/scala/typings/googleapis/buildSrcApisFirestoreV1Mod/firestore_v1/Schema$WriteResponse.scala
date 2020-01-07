package typings.googleapis.buildSrcApisFirestoreV1Mod.firestore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for Firestore.Write.
  */
@js.native
trait Schema$WriteResponse extends js.Object {
  /**
    * The time at which the commit occurred.
    */
  var commitTime: js.UndefOr[String] = js.native
  /**
    * The ID of the stream. Only set on the first message, when a new stream
    * was created.
    */
  var streamId: js.UndefOr[String] = js.native
  /**
    * A token that represents the position of this response in the stream. This
    * can be used by a client to resume the stream at this point.  This field
    * is always set.
    */
  var streamToken: js.UndefOr[String] = js.native
  /**
    * The result of applying the writes.  This i-th write result corresponds to
    * the i-th write in the request.
    */
  var writeResults: js.UndefOr[js.Array[Schema$WriteResult]] = js.native
}

object Schema$WriteResponse {
  @scala.inline
  def apply(
    commitTime: String = null,
    streamId: String = null,
    streamToken: String = null,
    writeResults: js.Array[Schema$WriteResult] = null
  ): Schema$WriteResponse = {
    val __obj = js.Dynamic.literal()
    if (commitTime != null) __obj.updateDynamic("commitTime")(commitTime.asInstanceOf[js.Any])
    if (streamId != null) __obj.updateDynamic("streamId")(streamId.asInstanceOf[js.Any])
    if (streamToken != null) __obj.updateDynamic("streamToken")(streamToken.asInstanceOf[js.Any])
    if (writeResults != null) __obj.updateDynamic("writeResults")(writeResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$WriteResponse]
  }
}

