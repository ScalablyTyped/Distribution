package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Borders extends js.Object {
  /** The bottom border of the cell. */
  var bottom: js.UndefOr[Border] = js.undefined
  /** The left border of the cell. */
  var left: js.UndefOr[Border] = js.undefined
  /** The right border of the cell. */
  var right: js.UndefOr[Border] = js.undefined
  /** The top border of the cell. */
  var top: js.UndefOr[Border] = js.undefined
}

object Borders {
  @scala.inline
  def apply(bottom: Border = null, left: Border = null, right: Border = null, top: Border = null): Borders = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Borders]
  }
}

