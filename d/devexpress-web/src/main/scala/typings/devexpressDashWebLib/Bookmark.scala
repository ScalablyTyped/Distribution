package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a bookmark in the document.
  */
trait Bookmark extends js.Object {
  /**
    * Gets the text buffer interval occupied by the current bookmark element.
    * Value: An <see cref="Interval" /> object specifying the interval settings.
    */
  var interval: Interval
  /**
    * Gets the bookmark's length.
    * Value: An integer value specifying the length of the bookmark.
    */
  var length: scala.Double
  /**
    * Gets the name of a bookmark in the document.
    * Value: A string that is the unique bookmark's name.
    */
  var name: java.lang.String
  /**
    * Gets the bookmark's start position in a document.
    * Value: An integer value specifying the start position.
    */
  var start: scala.Double
}

object Bookmark {
  @scala.inline
  def apply(interval: Interval, length: scala.Double, name: java.lang.String, start: scala.Double): Bookmark = {
    val __obj = js.Dynamic.literal(interval = interval, length = length, name = name, start = start)
  
    __obj.asInstanceOf[Bookmark]
  }
}

