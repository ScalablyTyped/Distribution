package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WriteResponse extends js.Object {
  /** The time at which the commit occurred. */
  var commitTime: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The ID of the stream.
               * Only set on the first message, when a new stream was created.
               */
  var streamId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * A token that represents the position of this response in the stream.
               * This can be used by a client to resume the stream at this point.
               *
               * This field is always set.
               */
  var streamToken: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The result of applying the writes.
               *
               * This i-th write result corresponds to the i-th write in the
               * request.
               */
  var writeResults: js.UndefOr[js.Array[WriteResult]] = js.undefined
}

