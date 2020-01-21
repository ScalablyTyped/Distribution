package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a field in the document.
  */
@JSGlobal("Field")
@js.native
class Field () extends js.Object {
  /**
    * Gets the text buffer interval occupied by the field code element.
    */
  val codeInterval: Interval = js.native
  /**
    * Gets or sets the name of a bookmark (or a hyperlink) in the current document which shall be the target of the hyperlink field.
    */
  val hyperlinkAnchor: String = js.native
  /**
    * Gets or sets the text for the tooltip displayed when the mouse hovers over a hyperlink field.
    */
  val hyperlinkTip: String = js.native
  /**
    * Gets or sets a URI to navigate to when the hyperlink (represented by the current field) is activated.
    */
  val hyperlinkUri: String = js.native
  /**
    * Gets the index of the field
    */
  val index: Double = js.native
  /**
    * Gets the text buffer interval occupied by the current field element.
    */
  val interval: Interval = js.native
  /**
    * Returns a value specifying whether the field is a hyperlink.
    */
  val isHyperlink: Boolean = js.native
  /**
    * Gets the field length in a document.
    */
  val length: Double = js.native
  /**
    * Gets the text buffer interval occupied by the field result element.
    */
  val resultInterval: Interval = js.native
  /**
    * Gets a value specifying whether a field's code or result is dispalyed.
    */
  val showCode: Boolean = js.native
  /**
    * Gets the field's start position in a document.
    */
  val start: Double = js.native
}

