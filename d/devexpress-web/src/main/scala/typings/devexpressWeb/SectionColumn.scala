package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a section column in the document.
  */
trait SectionColumn extends js.Object {
  /**
    * Specifies the space between adjacent section columns.
    */
  var spacing: Double
  /**
    * Specifies the width of the section column.
    */
  var width: Double
}

object SectionColumn {
  @scala.inline
  def apply(spacing: Double, width: Double): SectionColumn = {
    val __obj = js.Dynamic.literal(spacing = spacing.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionColumn]
  }
}

