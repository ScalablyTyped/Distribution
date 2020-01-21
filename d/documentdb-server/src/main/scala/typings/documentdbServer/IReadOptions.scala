package typings.documentdbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options associated with a read operation. */
trait IReadOptions extends js.Object {
  /** The conditional HTTP method ifNoneMatch value. */
  var ifNoneMatch: js.UndefOr[String] = js.undefined
}

object IReadOptions {
  @scala.inline
  def apply(ifNoneMatch: String = null): IReadOptions = {
    val __obj = js.Dynamic.literal()
    if (ifNoneMatch != null) __obj.updateDynamic("ifNoneMatch")(ifNoneMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReadOptions]
  }
}

