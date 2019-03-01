package typings
package firebaseLib.firebaseMod.firebaseNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetOptions extends js.Object {
  /**
    * Changes the behavior of a set() call to only replace the values specified
    * in its data argument. Fields omitted from the set() call remain
    * untouched.
    */
  val merge: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Changes the behavior of set() calls to only replace the specified field
    * paths. Any field path that is not specified is ignored and remains
    * untouched.
    */
  val mergeFields: js.UndefOr[coreDashJsLib.Array[java.lang.String | FieldPath]] = js.undefined
}

object SetOptions {
  @scala.inline
  def apply(
    merge: js.UndefOr[scala.Boolean] = js.undefined,
    mergeFields: coreDashJsLib.Array[java.lang.String | FieldPath] = null
  ): SetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(merge)) __obj.updateDynamic("merge")(merge)
    if (mergeFields != null) __obj.updateDynamic("mergeFields")(mergeFields)
    __obj.asInstanceOf[SetOptions]
  }
}

