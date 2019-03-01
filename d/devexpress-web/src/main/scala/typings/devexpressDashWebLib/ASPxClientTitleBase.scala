package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the base for ASPxClientSeriesTitle classes.
  */
trait ASPxClientTitleBase extends ASPxClientWebChartElement {
  /**
    * Gets the alignment of the title.
    * Value: A string value containing the text, which specifies the alignment of a title.
    */
  var alignment: java.lang.String
  /**
    * Gets a value that specifies to which edges of a parent element the title should be docked.
    * Value: A string value.
    */
  var dock: java.lang.String
  /**
    * Gets the lines of text within a title.
    * Value: An array of string values containing the text of a title.
    */
  var lines: js.Array[java.lang.String]
}

object ASPxClientTitleBase {
  @scala.inline
  def apply(
    alignment: java.lang.String,
    chart: ASPxClientWebChart,
    dock: java.lang.String,
    lines: js.Array[java.lang.String]
  ): ASPxClientTitleBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alignment")(alignment)
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("dock")(dock)
    __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[ASPxClientTitleBase]
  }
}

