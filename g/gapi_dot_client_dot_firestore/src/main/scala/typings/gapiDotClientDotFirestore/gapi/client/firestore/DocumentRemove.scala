package typings.gapiDotClientDotFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentRemove extends js.Object {
  /** The resource name of the Document that has gone out of view. */
  var document: js.UndefOr[String] = js.undefined
  /**
    * The read timestamp at which the remove was observed.
    *
    * Greater or equal to the `commit_time` of the change/delete/remove.
    */
  var readTime: js.UndefOr[String] = js.undefined
  /** A set of target IDs for targets that previously matched this document. */
  var removedTargetIds: js.UndefOr[js.Array[Double]] = js.undefined
}

object DocumentRemove {
  @scala.inline
  def apply(document: String = null, readTime: String = null, removedTargetIds: js.Array[Double] = null): DocumentRemove = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (readTime != null) __obj.updateDynamic("readTime")(readTime.asInstanceOf[js.Any])
    if (removedTargetIds != null) __obj.updateDynamic("removedTargetIds")(removedTargetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentRemove]
  }
}

