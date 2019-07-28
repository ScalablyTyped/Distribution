package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightActivityDynamicTag extends js.Object {
  /** ID of this dynamic tag. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  /** Name of this tag. */
  var name: js.UndefOr[String] = js.undefined
  /** Tag code. */
  var tag: js.UndefOr[String] = js.undefined
}

object FloodlightActivityDynamicTag {
  @scala.inline
  def apply(id: String = null, name: String = null, tag: String = null): FloodlightActivityDynamicTag = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[FloodlightActivityDynamicTag]
  }
}

