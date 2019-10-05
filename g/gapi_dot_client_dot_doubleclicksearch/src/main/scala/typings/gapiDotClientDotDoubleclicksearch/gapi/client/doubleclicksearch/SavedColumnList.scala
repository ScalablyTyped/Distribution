package typings.gapiDotClientDotDoubleclicksearch.gapi.client.doubleclicksearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedColumnList extends js.Object {
  /** The saved columns being requested. */
  var items: js.UndefOr[js.Array[SavedColumn]] = js.undefined
  /** Identifies this as a SavedColumnList resource. Value: the fixed string doubleclicksearch#savedColumnList. */
  var kind: js.UndefOr[String] = js.undefined
}

object SavedColumnList {
  @scala.inline
  def apply(items: js.Array[SavedColumn] = null, kind: String = null): SavedColumnList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[SavedColumnList]
  }
}

