package typings.draftConvert

import typings.draftConvert.mod._Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmpty extends _Tag {
  var empty: js.UndefOr[String] = js.undefined
  var end: String
  var start: String
}

object AnonEmpty {
  @scala.inline
  def apply(end: String, start: String, empty: String = null): AnonEmpty = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmpty]
  }
}

