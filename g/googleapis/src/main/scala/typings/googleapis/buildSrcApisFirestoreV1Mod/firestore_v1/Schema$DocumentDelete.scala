package typings.googleapis.buildSrcApisFirestoreV1Mod.firestore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Document has been deleted.  May be the result of multiple writes,
  * including updates, the last of which deleted the Document.  Multiple
  * DocumentDelete messages may be returned for the same logical delete, if
  * multiple targets are affected.
  */
@js.native
trait Schema$DocumentDelete extends js.Object {
  /**
    * The resource name of the Document that was deleted.
    */
  var document: js.UndefOr[String] = js.native
  /**
    * The read timestamp at which the delete was observed.  Greater or equal to
    * the `commit_time` of the delete.
    */
  var readTime: js.UndefOr[String] = js.native
  /**
    * A set of target IDs for targets that previously matched this entity.
    */
  var removedTargetIds: js.UndefOr[js.Array[Double]] = js.native
}

object Schema$DocumentDelete {
  @scala.inline
  def apply(document: String = null, readTime: String = null, removedTargetIds: js.Array[Double] = null): Schema$DocumentDelete = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (readTime != null) __obj.updateDynamic("readTime")(readTime.asInstanceOf[js.Any])
    if (removedTargetIds != null) __obj.updateDynamic("removedTargetIds")(removedTargetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DocumentDelete]
  }
}

