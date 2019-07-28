package typings.devexpressDashWeb

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
  var length: Double
  /**
    * Gets the interval's start position in the document.
    * Value: An integer value specifying the start position.
    */
  var start: Double
}

object Interval {
  @scala.inline
  def apply(length: Double, start: Double): Interval = {
    val __obj = js.Dynamic.literal(length = length, start = start)
  
    __obj.asInstanceOf[Interval]
  }
}

