package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A TextBlock is a GraphObject that displays a .text string in a given .font.
  */
@JSImport("go", "TextBlock")
@js.native
/**
  * A newly constructed TextBlock has no string to show; if it did, it would draw the text, wrapping if needed, in the default font using a black stroke.
  */
class TextBlock ()
  extends goLib.goMod.goNs.TextBlock

/**
  * A TextBlock is a GraphObject that displays a .text string in a given .font.
  */
@JSImport("go", "TextBlock")
@js.native
object TextBlock extends js.Object {
  /**The TextBlock will not wrap its text.*/
  var None: goLib.goMod.goNs.EnumValue = js.native
  /** Used as the default value for TextBlock.overflow: if the width is too small to display all text, the TextBlock will clip.*/
  var OverflowClip: goLib.goMod.goNs.EnumValue = js.native
  /** Used as a value for TextBlock.overflow: if the width is too small to display all text, the TextBlock will display an ellipsis.*/
  var OverflowEllipsis: goLib.goMod.goNs.EnumValue = js.native
  /**The TextBlock will wrap text and the width of the TextBlock will be the desiredSize's width, if any.*/
  var WrapDesiredSize: goLib.goMod.goNs.EnumValue = js.native
  /**The TextBlock will wrap text, making the width of the TextBlock equal to the width of the longest line.*/
  var WrapFit: goLib.goMod.goNs.EnumValue = js.native
    // undocumented
  def getEllipsis(): java.lang.String = js.native
    // undocumented
  def isValidFont(font: java.lang.String): scala.Boolean = js.native
    // undocumented
  def setEllipsis(`val`: java.lang.String): scala.Unit = js.native
}

