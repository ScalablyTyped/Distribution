package typings.gapiClientCustomsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anchor extends js.Object {
  var anchor: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var label_with_op: js.UndefOr[String] = js.undefined
}

object Anchor {
  @scala.inline
  def apply(anchor: String = null, label: String = null, label_with_op: String = null): Anchor = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (label_with_op != null) __obj.updateDynamic("label_with_op")(label_with_op.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anchor]
  }
}

