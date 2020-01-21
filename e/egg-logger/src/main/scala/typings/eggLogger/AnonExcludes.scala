package typings.eggLogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExcludes extends js.Object {
  var excludes: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonExcludes {
  @scala.inline
  def apply(excludes: js.Array[String] = null): AnonExcludes = {
    val __obj = js.Dynamic.literal()
    if (excludes != null) __obj.updateDynamic("excludes")(excludes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExcludes]
  }
}

