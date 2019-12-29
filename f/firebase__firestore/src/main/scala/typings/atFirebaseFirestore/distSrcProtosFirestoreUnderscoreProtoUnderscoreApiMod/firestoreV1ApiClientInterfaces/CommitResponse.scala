package typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitResponse extends js.Object {
  var commitTime: js.UndefOr[String] = js.undefined
  var writeResults: js.UndefOr[js.Array[WriteResult]] = js.undefined
}

object CommitResponse {
  @scala.inline
  def apply(commitTime: String = null, writeResults: js.Array[WriteResult] = null): CommitResponse = {
    val __obj = js.Dynamic.literal()
    if (commitTime != null) __obj.updateDynamic("commitTime")(commitTime.asInstanceOf[js.Any])
    if (writeResults != null) __obj.updateDynamic("writeResults")(writeResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitResponse]
  }
}

