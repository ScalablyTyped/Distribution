package typings
package atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod

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
  val mergeFields: js.UndefOr[js.Array[java.lang.String | FieldPath]] = js.undefined
}

