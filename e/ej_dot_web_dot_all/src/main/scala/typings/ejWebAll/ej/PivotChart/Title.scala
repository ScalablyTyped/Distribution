package typings.ejWebAll.ej.PivotChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Title extends js.Object {
  /** Text to be displayed in PivotChart title.
    */
  var text: js.UndefOr[String] = js.undefined
}

object Title {
  @scala.inline
  def apply(text: String = null): Title = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
}

