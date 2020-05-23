package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a document's interval.
  */
trait Interval extends js.Object {
  /**
    * Gets the interval's character length.
    */
  var length: Double
  /**
    * Gets the interval's start position in the document.
    */
  var start: Double
}

object Interval {
  @scala.inline
  def apply(length: Double, start: Double): Interval = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interval]
  }
}

