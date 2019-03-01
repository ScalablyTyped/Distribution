package typings
package ejDotWebDotAllLib.ejNs.PivotChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Title extends js.Object {
  /** Text to be displayed in PivotChart title.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object Title {
  @scala.inline
  def apply(text: java.lang.String = null): Title = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Title]
  }
}

