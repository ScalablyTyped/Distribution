package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the margin settings.
  */
trait Margins extends js.Object {
  /**
    * Gets or sets the bottom margin.
    * Value: An integer value specifying the bottom margin in twips.
    */
  var bottom: Double
  /**
    * Gets or sets the left margin.
    * Value: An integer value specifying the left margin in twips.
    */
  var left: Double
  /**
    * Gets or sets the right margin.
    * Value: An integer value specifying the right margin in twips.
    */
  var right: Double
  /**
    * Gets or sets the top margin.
    * Value: An integer value specifying the top margin in twips.
    */
  var top: Double
}

object Margins {
  @scala.inline
  def apply(bottom: Double, left: Double, right: Double, top: Double): Margins = {
    val __obj = js.Dynamic.literal(bottom = bottom, left = left, right = right, top = top)
  
    __obj.asInstanceOf[Margins]
  }
}

