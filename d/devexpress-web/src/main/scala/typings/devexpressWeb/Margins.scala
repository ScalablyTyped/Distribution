package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the margin settings.
  */
trait Margins extends js.Object {
  /**
    * Gets or sets the bottom margin.
    */
  var bottom: Double
  /**
    * Gets or sets the left margin.
    */
  var left: Double
  /**
    * Gets or sets the right margin.
    */
  var right: Double
  /**
    * Gets or sets the top margin.
    */
  var top: Double
}

object Margins {
  @scala.inline
  def apply(bottom: Double, left: Double, right: Double, top: Double): Margins = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Margins]
  }
}

