package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a document's interval.
  */
trait Interval extends js.Object {
  /**
    * Gets the interval's character length.
    * Value: An integer value specifying the element length in characters.
    */
  var length: scala.Double
  /**
    * Gets the interval's start position in the document.
    * Value: An integer value specifying the start position.
    */
  var start: scala.Double
}

object Interval {
  @scala.inline
  def apply(length: scala.Double, start: scala.Double): Interval = {
    val __obj = js.Dynamic.literal(length = length, start = start)
  
    __obj.asInstanceOf[Interval]
  }
}

