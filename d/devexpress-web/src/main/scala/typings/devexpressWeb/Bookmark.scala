package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a bookmark in the document.
  */
@js.native
trait Bookmark extends js.Object {
  /**
    * Gets the text buffer interval occupied by the current bookmark element.
    */
  val interval: Interval = js.native
  /**
    * Gets the bookmark's length.
    */
  val length: Double = js.native
  /**
    * Gets the name of a bookmark in the document.
    */
  val name: String = js.native
  /**
    * Gets the bookmark's start position in a document.
    */
  val start: Double = js.native
}

object Bookmark {
  @scala.inline
  def apply(interval: Interval, length: Double, name: String, start: Double): Bookmark = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bookmark]
  }
  @scala.inline
  implicit class BookmarkOps[Self <: Bookmark] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInterval(value: Interval): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

