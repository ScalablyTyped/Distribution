package typings
package draftDashConvertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Empty
  extends draftDashConvertLib.draftDashConvertMod._Tag {
  var empty: js.UndefOr[java.lang.String] = js.undefined
  var end: java.lang.String
  var start: java.lang.String
}

object Anon_Empty {
  @scala.inline
  def apply(end: java.lang.String, start: java.lang.String, empty: java.lang.String = null): Anon_Empty = {
    val __obj = js.Dynamic.literal(end = end, start = start)
    if (empty != null) __obj.updateDynamic("empty")(empty)
    __obj.asInstanceOf[Anon_Empty]
  }
}

