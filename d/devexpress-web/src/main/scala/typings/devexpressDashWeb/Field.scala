package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a field in the document.
  */
trait Field extends js.Object {
  /**
    * Gets the text buffer interval occupied by the field code element.
    * Value: An <see cref="Interval" /> object specifying the interval settings.
    */
  var codeInterval: Interval
  /**
    * Gets or sets the name of a bookmark (or a hyperlink) in the current document which shall be the target of the hyperlink field.
    * Value: A string representing the bookmark's name.
    */
  var hyperlinkAnchor: String
  /**
    * Gets or sets the text for the tooltip displayed when the mouse hovers over a hyperlink field.
    * Value: A string containing the tooltip text.
    */
  var hyperlinkTip: String
  /**
    * Gets or sets a URI to navigate to when the hyperlink (represented by the current field) is activated.
    * Value: A string representing an URI.
    */
  var hyperlinkUri: String
  /**
    * Gets the index of the field
    * Value: An integer value specifying the field's index
    */
  var index: Double
  /**
    * Gets the text buffer interval occupied by the current field element.
    * Value: An <see cref="Interval" /> object specifying the interval settings.
    */
  var interval: Interval
  /**
    * Returns a value specifying whether the field is a hyperlink.
    * Value: true, if the field is a hyperlink; otherwise, false.
    */
  var isHyperlink: Boolean
  /**
    * Gets the field length in a document.
    * Value: An integer value specifying the field length.
    */
  var length: Double
  /**
    * Gets the text buffer interval occupied by the field result element.
    * Value: An <see cref="Interval" /> object specifying the interval settings.
    */
  var resultInterval: Interval
  /**
    * Gets a value specifying whether a field's code or result is dispalyed.
    * Value: true, if the field code is displayed; false, if the field result is displayed.
    */
  var showCode: Boolean
  /**
    * Gets the field's start position in a document.
    * Value: An integer value specifying the start position.
    */
  var start: Double
}

object Field {
  @scala.inline
  def apply(
    codeInterval: Interval,
    hyperlinkAnchor: String,
    hyperlinkTip: String,
    hyperlinkUri: String,
    index: Double,
    interval: Interval,
    isHyperlink: Boolean,
    length: Double,
    resultInterval: Interval,
    showCode: Boolean,
    start: Double
  ): Field = {
    val __obj = js.Dynamic.literal(codeInterval = codeInterval, hyperlinkAnchor = hyperlinkAnchor, hyperlinkTip = hyperlinkTip, hyperlinkUri = hyperlinkUri, index = index, interval = interval, isHyperlink = isHyperlink, length = length, resultInterval = resultInterval, showCode = showCode, start = start)
  
    __obj.asInstanceOf[Field]
  }
}

