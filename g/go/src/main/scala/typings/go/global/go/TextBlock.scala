package typings.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A TextBlock is a GraphObject that displays a .text string in a given .font.
  */
@JSGlobal("go.TextBlock")
@js.native
/**
  * A newly constructed TextBlock has no string to show; if it did, it would draw the text, wrapping if needed, in the default font using a black stroke.
  */
class TextBlock ()
  extends typings.go.mod.TextBlock
object TextBlock {
  
  @JSGlobal("go.TextBlock")
  @js.native
  val ^ : js.Any = js.native
  
  /**The TextBlock will not wrap its text.*/
  /* static member */
  @JSGlobal("go.TextBlock.None")
  @js.native
  def None: typings.go.mod.EnumValue = js.native
  inline def None_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  /** Used as the default value for TextBlock.overflow: if the width is too small to display all text, the TextBlock will clip.*/
  /* static member */
  @JSGlobal("go.TextBlock.OverflowClip")
  @js.native
  def OverflowClip: typings.go.mod.EnumValue = js.native
  inline def OverflowClip_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OverflowClip")(x.asInstanceOf[js.Any])
  
  /** Used as a value for TextBlock.overflow: if the width is too small to display all text, the TextBlock will display an ellipsis.*/
  /* static member */
  @JSGlobal("go.TextBlock.OverflowEllipsis")
  @js.native
  def OverflowEllipsis: typings.go.mod.EnumValue = js.native
  inline def OverflowEllipsis_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OverflowEllipsis")(x.asInstanceOf[js.Any])
  
  /**The TextBlock will wrap text and the width of the TextBlock will be the desiredSize's width, if any.*/
  /* static member */
  @JSGlobal("go.TextBlock.WrapDesiredSize")
  @js.native
  def WrapDesiredSize: typings.go.mod.EnumValue = js.native
  inline def WrapDesiredSize_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WrapDesiredSize")(x.asInstanceOf[js.Any])
  
  /**The TextBlock will wrap text, making the width of the TextBlock equal to the width of the longest line.*/
  /* static member */
  @JSGlobal("go.TextBlock.WrapFit")
  @js.native
  def WrapFit: typings.go.mod.EnumValue = js.native
  inline def WrapFit_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WrapFit")(x.asInstanceOf[js.Any])
  
  // undocumented
  /* static member */
  inline def getEllipsis(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEllipsis")().asInstanceOf[String]
  
  // undocumented
  /* static member */
  inline def isValidFont(font: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidFont")(font.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  // undocumented
  /* static member */
  inline def setEllipsis(`val`: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEllipsis")(`val`.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
