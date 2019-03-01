package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnsTotalCount extends js.Object {
  /** To customize the totalCount text properties.
    * @Default {null}
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object ColumnsTotalCount {
  @scala.inline
  def apply(text: java.lang.String = null): ColumnsTotalCount = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ColumnsTotalCount]
  }
}

