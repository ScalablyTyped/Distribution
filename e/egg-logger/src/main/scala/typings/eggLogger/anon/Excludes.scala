package typings.eggLogger.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Excludes extends js.Object {
  var excludes: js.UndefOr[js.Array[String]] = js.undefined
}

object Excludes {
  @scala.inline
  def apply(excludes: js.Array[String] = null): Excludes = {
    val __obj = js.Dynamic.literal()
    if (excludes != null) __obj.updateDynamic("excludes")(excludes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Excludes]
  }
}

