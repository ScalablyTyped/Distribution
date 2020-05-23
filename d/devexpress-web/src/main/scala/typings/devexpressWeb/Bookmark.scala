package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a bookmark in the document.
  */
trait Bookmark extends js.Object {
  /**
    * Gets the text buffer interval occupied by the current bookmark element.
    */
  val interval: Interval
  /**
    * Gets the bookmark's length.
    */
  val length: Double
  /**
    * Gets the name of a bookmark in the document.
    */
  val name: String
  /**
    * Gets the bookmark's start position in a document.
    */
  val start: Double
}

object Bookmark {
  @scala.inline
  def apply(interval: Interval, length: Double, name: String, start: Double): Bookmark = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bookmark]
  }
}

