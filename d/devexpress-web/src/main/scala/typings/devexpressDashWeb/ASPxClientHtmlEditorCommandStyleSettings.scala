package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains style settings related to media elements in ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorCommandStyleSettings extends js.Object {
  /**
    * Gets or sets a media element's background color.
    * Value: A string that specifies a background color <a href="http://www.w3schools.com/cssref/css_colors_legal.asp">in any correct format</a>.
    */
  var backgroundColor: String
  /**
    * Gets or sets a media element's border color.
    * Value: A string that specifies a border color <a href="http://www.w3schools.com/cssref/css_colors_legal.asp">in any correct format</a>.
    */
  var borderColor: String
  /**
    * Gets or sets a media element's border style.
    * Value: A string that specifies a border style <a href="http://www.w3schools.com/cssref/pr_border-style.asp">in any correct format</a>.
    */
  var borderStyle: String
  /**
    * Gets or sets a media element's border width.
    * Value: A string that specifies a border width <a href="http://www.w3schools.com/cssref/pr_border-width.asp">in any correct format</a>.
    */
  var borderWidth: String
  /**
    * Gets or sets a media element's CSS class name.
    * Value: A string that specifies a class name.
    */
  var className: String
  /**
    * Gets or sets an element's height.
    * Value: A string that specifies an element's height <a href="http://www.w3schools.com/cssref/pr_dim_height.asp">in any correct format</a>.
    */
  var height: String
  /**
    * Gets or sets an element's bottom margin.
    * Value: A string that specifies an element's bottom margin <a href="http://www.w3schools.com/cssref/pr_margin.asp">in any correct format</a>.
    */
  var marginBottom: String
  /**
    * Gets or sets an element's left margin.
    * Value: A string that specifies an element's left margin <a href="http://www.w3schools.com/cssref/pr_margin.asp">in any correct format</a>.
    */
  var marginLeft: String
  /**
    * Gets or sets an element's right margin.
    * Value: A string that specifies an element's right margin <a href="http://www.w3schools.com/cssref/pr_margin.asp">in any correct format</a>.
    */
  var marginRight: String
  /**
    * Gets or sets an element's top margin.
    * Value: A string that specifies an element's top margin <a href="http://www.w3schools.com/cssref/pr_margin.asp">in any correct format</a>.
    */
  var marginTop: String
  /**
    * Gets or sets the element's text alignment.
    * Value: A string value that specifies the element's text alignment <a href="http://www.w3schools.com/cssref/css_colors_legal.asp">in any correct format</a>.
    */
  var textAlign: String
  /**
    * Gets or sets the element's vertical alignment.
    * Value: A string value that specifies the element's vertical alignment <a href="http://www.w3schools.com/cssref/css_colors_legal.asp">in any correct format</a>.
    */
  var verticalAlign: String
  /**
    * Gets or sets an element's width.
    * Value: A string that specifies an element's width <a href="http://www.w3schools.com/cssref/pr_dim_width.asp">in any correct format</a>.
    */
  var width: String
}

object ASPxClientHtmlEditorCommandStyleSettings {
  @scala.inline
  def apply(
    backgroundColor: String,
    borderColor: String,
    borderStyle: String,
    borderWidth: String,
    className: String,
    height: String,
    marginBottom: String,
    marginLeft: String,
    marginRight: String,
    marginTop: String,
    textAlign: String,
    verticalAlign: String,
    width: String
  ): ASPxClientHtmlEditorCommandStyleSettings = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor, borderColor = borderColor, borderStyle = borderStyle, borderWidth = borderWidth, className = className, height = height, marginBottom = marginBottom, marginLeft = marginLeft, marginRight = marginRight, marginTop = marginTop, textAlign = textAlign, verticalAlign = verticalAlign, width = width)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorCommandStyleSettings]
  }
}

