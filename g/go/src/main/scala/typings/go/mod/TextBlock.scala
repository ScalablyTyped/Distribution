package typings.go.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A TextBlock is a GraphObject that displays a .text string in a given .font.
  */
@JSImport("go", "TextBlock")
@js.native
/**
  * A newly constructed TextBlock has no string to show; if it did, it would draw the text, wrapping if needed, in the default font using a black stroke.
  */
class TextBlock () extends GraphObject {
  
  /**Gets or sets whether or not this TextBlock allows in-place editing of the .text string by the user with the help of the TextEditingTool.*/
  var editable: Boolean = js.native
  
  /**Gets or sets the function to call if a text edit made with the TextEditingTool is invalid.*/
  def errorFunction(tool: TextEditingTool, oldstr: String, newstr: String): Unit = js.native
  
  /**Gets or sets the current font settings.*/
  var font: String = js.native
  
  /**Gets or sets whether or not the text allows or displays multiple lines or embedded newlines.*/
  var isMultiline: Boolean = js.native
  
  /**Gets or sets whether or not the text has a strikethrough line (line-through).*/
  var isStrikethrough: Boolean = js.native
  
  /**Gets or sets whether or not the text is underlined.*/
  var isUnderline: Boolean = js.native
  
  /**This read-only property returns the total number of lines in this TextBlock, including lines created from returns and wrapping.*/
  var lineCount: Double = js.native
  
  /**Gets or sets the maximum number of lines that this TextBlock may display.*/
  var maxLines: Double = js.native
  
  /**Gets or sets how text that is too long to display should be handled.*/
  var overflow: EnumValue = js.native
  
  var spacingAbove: Double = js.native
  
  // undocumented
  var spacingBelow: Double = js.native
  
  /**Gets or sets the Brush (or CSS color string) that describes the stroke (color) of the .font.*/
  var stroke: BrushLike = js.native
  
  /**Gets or sets the current text string.*/
  var text: String = js.native
  
  /**Gets or sets the current text alignment property.*/
  var textAlign: String = js.native
  
  /**Gets or sets the HTMLElement that this TextBlock uses as its text editor in the TextEditingTool.*/
  var textEditor: HTMLElement = js.native
  
  /**Gets or sets the predicate that determines whether or not a string of text is valid.*/
  def textValidation(tb: TextBlock, oldstr: String, newstr: String): Boolean = js.native
  
  /**Gets or sets whether the text should be wrapped if it is too long to fit on one line.*/
  var wrap: EnumValue = js.native
}
object TextBlock {
  
  @JSImport("go", "TextBlock")
  @js.native
  val ^ : js.Any = js.native
  
  /**The TextBlock will not wrap its text.*/
  /* static member */
  @JSImport("go", "TextBlock.None")
  @js.native
  def None: EnumValue = js.native
  @scala.inline
  def None_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  /** Used as the default value for TextBlock.overflow: if the width is too small to display all text, the TextBlock will clip.*/
  /* static member */
  @JSImport("go", "TextBlock.OverflowClip")
  @js.native
  def OverflowClip: EnumValue = js.native
  @scala.inline
  def OverflowClip_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OverflowClip")(x.asInstanceOf[js.Any])
  
  /** Used as a value for TextBlock.overflow: if the width is too small to display all text, the TextBlock will display an ellipsis.*/
  /* static member */
  @JSImport("go", "TextBlock.OverflowEllipsis")
  @js.native
  def OverflowEllipsis: EnumValue = js.native
  @scala.inline
  def OverflowEllipsis_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OverflowEllipsis")(x.asInstanceOf[js.Any])
  
  /**The TextBlock will wrap text and the width of the TextBlock will be the desiredSize's width, if any.*/
  /* static member */
  @JSImport("go", "TextBlock.WrapDesiredSize")
  @js.native
  def WrapDesiredSize: EnumValue = js.native
  @scala.inline
  def WrapDesiredSize_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WrapDesiredSize")(x.asInstanceOf[js.Any])
  
  /**The TextBlock will wrap text, making the width of the TextBlock equal to the width of the longest line.*/
  /* static member */
  @JSImport("go", "TextBlock.WrapFit")
  @js.native
  def WrapFit: EnumValue = js.native
  @scala.inline
  def WrapFit_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WrapFit")(x.asInstanceOf[js.Any])
  
  // undocumented
  /* static member */
  @scala.inline
  def getEllipsis(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEllipsis")().asInstanceOf[String]
  
  // undocumented
  /* static member */
  @scala.inline
  def isValidFont(font: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidFont")(font.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  // undocumented
  /* static member */
  @scala.inline
  def setEllipsis(`val`: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEllipsis")(`val`.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
