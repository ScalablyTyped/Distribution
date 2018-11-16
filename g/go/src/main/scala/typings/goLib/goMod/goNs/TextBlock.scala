package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * A TextBlock is a GraphObject that displays a .text string in a given .font.
    */
@js.native
trait TextBlock extends GraphObject {
  /**Gets or sets whether or not this TextBlock allows in-place editing of the .text string by the user with the help of the TextEditingTool.*/
  var editable: scala.Boolean = js.native
  /**Gets or sets the current font settings.*/
  var font: java.lang.String = js.native
  /**Gets or sets whether or not the text allows or displays multiple lines or embedded newlines.*/
  var isMultiline: scala.Boolean = js.native
  /**Gets or sets whether or not the text has a strikethrough line (line-through).*/
  var isStrikethrough: scala.Boolean = js.native
  /**Gets or sets whether or not the text is underlined.*/
  var isUnderline: scala.Boolean = js.native
  /**This read-only property returns the total number of lines in this TextBlock, including lines created from returns and wrapping.*/
  var lineCount: scala.Double = js.native
  /**Gets or sets the maximum number of lines that this TextBlock may display.*/
  var maxLines: scala.Double = js.native
  /**Gets or sets how text that is too long to display should be handled.*/
  var overflow: EnumValue = js.native
  var spacingAbove: scala.Double = js.native
    // undocumented
  var spacingBelow: scala.Double = js.native
  /**Gets or sets the Brush (or CSS color string) that describes the stroke (color) of the .font.*/
  var stroke: BrushLike = js.native
  /**Gets or sets the current text string.*/
  var text: java.lang.String = js.native
  /**Gets or sets the current text alignment property.*/
  var textAlign: java.lang.String = js.native
  /**Gets or sets the HTMLElement that this TextBlock uses as its text editor in the TextEditingTool.*/
  var textEditor: stdLib.HTMLElement = js.native
  /**Gets or sets whether the text should be wrapped if it is too long to fit on one line.*/
  var wrap: EnumValue = js.native
  /**Gets or sets the function to call if a text edit made with the TextEditingTool is invalid.*/
  def errorFunction(tool: TextEditingTool, oldstr: java.lang.String, newstr: java.lang.String): scala.Unit = js.native
  /**Gets or sets the predicate that determines whether or not a string of text is valid.*/
  def textValidation(tb: TextBlock, oldstr: java.lang.String, newstr: java.lang.String): scala.Boolean = js.native
}

