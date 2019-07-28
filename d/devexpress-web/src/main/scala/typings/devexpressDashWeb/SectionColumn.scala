package typings.devexpressDashWeb

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
  var spacing: Double
  /**
    * Gets or sets the width of the section column.
    * Value: An integer value specifying the section column width in twips.
    */
  var width: Double
}

object SectionColumn {
  @scala.inline
  def apply(spacing: Double, width: Double): SectionColumn = {
    val __obj = js.Dynamic.literal(spacing = spacing, width = width)
  
    __obj.asInstanceOf[SectionColumn]
  }
}

