package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains characteristics of a character style in a document.
  */
@JSGlobal("CharacterStyle")
@js.native
class CharacterStyle () extends StyleBase {
  /**
    * Gets or sets the linked style for the current style.
    */
  val linkedStyle: ParagraphStyle = js.native
  /**
    * Gets the style form which the current style inherits.
    */
  val parent: CharacterStyle = js.native
}

