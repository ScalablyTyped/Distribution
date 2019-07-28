package typings.gapiDotClientDotCustomsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Anchor extends js.Object {
  var anchor: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var label_with_op: js.UndefOr[String] = js.undefined
}

object Anon_Anchor {
  @scala.inline
  def apply(anchor: String = null, label: String = null, label_with_op: String = null): Anon_Anchor = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (label != null) __obj.updateDynamic("label")(label)
    if (label_with_op != null) __obj.updateDynamic("label_with_op")(label_with_op)
    __obj.asInstanceOf[Anon_Anchor]
  }
}

