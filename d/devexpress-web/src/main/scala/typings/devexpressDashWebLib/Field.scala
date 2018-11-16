package typings
package devexpressDashWebLib

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
  var hyperlinkAnchor: java.lang.String
  /**
       * Gets or sets the text for the tooltip displayed when the mouse hovers over a hyperlink field.
       * Value: A string containing the tooltip text.
       */
  var hyperlinkTip: java.lang.String
  /**
       * Gets or sets a URI to navigate to when the hyperlink (represented by the current field) is activated.
       * Value: A string representing an URI.
       */
  var hyperlinkUri: java.lang.String
  /**
       * Gets the index of the field
       * Value: An integer value specifying the field's index
       */
  var index: scala.Double
  /**
       * Gets the text buffer interval occupied by the current field element.
       * Value: An <see cref="Interval" /> object specifying the interval settings.
       */
  var interval: Interval
  /**
       * Gets the field length in a document.
       * Value: An integer value specifying the field length.
       */
  var length: scala.Double
  /**
       * Gets the text buffer interval occupied by the field result element.
       * Value: An <see cref="Interval" /> object specifying the interval settings.
       */
  var resultInterval: Interval
  /**
       * Gets a value specifying whether a field's code or result is dispalyed.
       * Value: true, if the field code is displayed; false, if the field result is displayed.
       */
  var showCode: scala.Boolean
  /**
       * Gets the field's start position in a document.
       * Value: An integer value specifying the start position.
       */
  var start: scala.Double
}

