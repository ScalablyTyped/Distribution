package typings
package documentdbDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options associated with a read operation. */
trait IReadOptions extends js.Object {
  /** The conditional HTTP method ifNoneMatch value. */
  var ifNoneMatch: js.UndefOr[java.lang.String] = js.undefined
}

object IReadOptions {
  @scala.inline
  def apply(ifNoneMatch: java.lang.String = null): IReadOptions = {
    val __obj = js.Dynamic.literal()
    if (ifNoneMatch != null) __obj.updateDynamic("ifNoneMatch")(ifNoneMatch)
    __obj.asInstanceOf[IReadOptions]
  }
}

