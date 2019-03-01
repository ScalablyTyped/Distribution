package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitResponse extends js.Object {
  /** The time at which the commit occurred. */
  var commitTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The result of applying the writes.
    *
    * This i-th write result corresponds to the i-th write in the
    * request.
    */
  var writeResults: js.UndefOr[js.Array[WriteResult]] = js.undefined
}

object CommitResponse {
  @scala.inline
  def apply(commitTime: java.lang.String = null, writeResults: js.Array[WriteResult] = null): CommitResponse = {
    val __obj = js.Dynamic.literal()
    if (commitTime != null) __obj.updateDynamic("commitTime")(commitTime)
    if (writeResults != null) __obj.updateDynamic("writeResults")(writeResults)
    __obj.asInstanceOf[CommitResponse]
  }
}

