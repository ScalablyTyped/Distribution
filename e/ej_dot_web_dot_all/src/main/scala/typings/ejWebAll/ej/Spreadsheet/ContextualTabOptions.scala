package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextualTabOptions extends js.Object {
  /** Pass the background color
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /** Pass the border color
    */
  var borderColor: js.UndefOr[String] = js.undefined
  /** Pass the tabs object to add in ribbon
    */
  var tabs: js.UndefOr[js.Any] = js.undefined
}

object ContextualTabOptions {
  @scala.inline
  def apply(backgroundColor: String = null, borderColor: String = null, tabs: js.Any = null): ContextualTabOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (tabs != null) __obj.updateDynamic("tabs")(tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextualTabOptions]
  }
}

