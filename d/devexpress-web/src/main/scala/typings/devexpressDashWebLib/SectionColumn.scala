package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a section column in the document.
  */
trait SectionColumn extends js.Object {
  /**
    * Gets or sets the amount of space between adjacent section columns.
    * Value: An integer value specifying the spacing after a column in twips.
    */
  var spacing: scala.Double
  /**
    * Gets or sets the width of the section column.
    * Value: An integer value specifying the section column width in twips.
    */
  var width: scala.Double
}

object SectionColumn {
  @scala.inline
  def apply(spacing: scala.Double, width: scala.Double): SectionColumn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("spacing")(spacing)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[SectionColumn]
  }
}

