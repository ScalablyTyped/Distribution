package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a bookmark in the document.
  */
@JSGlobal("Bookmark")
@js.native
class Bookmark ()
  extends typings.devexpressWeb.Bookmark {
  /**
    * Gets the text buffer interval occupied by the current bookmark element.
    */
  /* CompleteClass */
  override val interval: typings.devexpressWeb.Interval = js.native
  /**
    * Gets the bookmark's length.
    */
  /* CompleteClass */
  override val length: Double = js.native
  /**
    * Gets the name of a bookmark in the document.
    */
  /* CompleteClass */
  override val name: String = js.native
  /**
    * Gets the bookmark's start position in a document.
    */
  /* CompleteClass */
  override val start: Double = js.native
}

