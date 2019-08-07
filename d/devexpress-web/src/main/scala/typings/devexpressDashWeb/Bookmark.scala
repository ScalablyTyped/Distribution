package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a bookmark in the document.
  */
@JSGlobal("Bookmark")
@js.native
class Bookmark () extends js.Object {
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

