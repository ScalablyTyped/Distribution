package typings.draftDashConvert

import typings.draftDashConvert.draftDashConvertMod._Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Empty extends _Tag {
  var empty: js.UndefOr[String] = js.undefined
  var end: String
  var start: String
}

object Anon_Empty {
  @scala.inline
  def apply(end: String, start: String, empty: String = null): Anon_Empty = {
    val __obj = js.Dynamic.literal(end = end, start = start)
    if (empty != null) __obj.updateDynamic("empty")(empty)
    __obj.asInstanceOf[Anon_Empty]
  }
}

