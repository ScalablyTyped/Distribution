package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Precondition extends js.Object {
  /**
    * When set to `true`, the target document must exist.
    * When set to `false`, the target document must not exist.
    */
  var exists: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When set, the target document must exist and have been last updated at
    * that time.
    */
  var updateTime: js.UndefOr[java.lang.String] = js.undefined
}

object Precondition {
  @scala.inline
  def apply(exists: js.UndefOr[scala.Boolean] = js.undefined, updateTime: java.lang.String = null): Precondition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exists)) __obj.updateDynamic("exists")(exists)
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime)
    __obj.asInstanceOf[Precondition]
  }
}

