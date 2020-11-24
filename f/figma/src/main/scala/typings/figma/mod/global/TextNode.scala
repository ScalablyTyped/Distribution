package typings.figma.mod.global

import typings.figma.figmaStrings.AFTER
import typings.figma.figmaStrings.BEFORE
import typings.figma.figmaStrings.BOTTOM
import typings.figma.figmaStrings.CENTER
import typings.figma.figmaStrings.HEIGHT
import typings.figma.figmaStrings.JUSTIFIED
import typings.figma.figmaStrings.LEFT
import typings.figma.figmaStrings.NONE
import typings.figma.figmaStrings.RIGHT
import typings.figma.figmaStrings.TEXT
import typings.figma.figmaStrings.TOP
import typings.figma.figmaStrings.WIDTH_AND_HEIGHT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextNode
  extends SceneNode
     with BaseNodeMixin
     with SceneNodeMixin
     with ReactionMixin
     with BlendMixin
     with GeometryMixin
     with LayoutMixin
     with ExportMixin
     with ConstraintMixin {
  
  var autoRename: Boolean = js.native
  
  var characters: String = js.native
  
  def deleteCharacters(start: Double, end: Double): Unit = js.native
  
  var fontName: FontName | js.Symbol = js.native
  
  var fontSize: Double | js.Symbol = js.native
  
  def getRangeFillStyleId(start: Double, end: Double): String | js.Symbol = js.native
  
  def getRangeFills(start: Double, end: Double): js.Array[Paint] | js.Symbol = js.native
  
  def getRangeFontName(start: Double, end: Double): FontName | js.Symbol = js.native
  
  def getRangeFontSize(start: Double, end: Double): Double | js.Symbol = js.native
  
  def getRangeLetterSpacing(start: Double, end: Double): LetterSpacing | js.Symbol = js.native
  
  def getRangeLineHeight(start: Double, end: Double): LineHeight | js.Symbol = js.native
  
  def getRangeTextCase(start: Double, end: Double): TextCase | js.Symbol = js.native
  
  def getRangeTextDecoration(start: Double, end: Double): TextDecoration | js.Symbol = js.native
  
  def getRangeTextStyleId(start: Double, end: Double): String | js.Symbol = js.native
  
  val hasMissingFont: Boolean = js.native
  
  def insertCharacters(start: Double, characters: String): Unit = js.native
  @JSName("insertCharacters")
  def insertCharacters_AFTER(start: Double, characters: String, useStyle: AFTER): Unit = js.native
  @JSName("insertCharacters")
  def insertCharacters_BEFORE(start: Double, characters: String, useStyle: BEFORE): Unit = js.native
  
  var letterSpacing: LetterSpacing | js.Symbol = js.native
  
  var lineHeight: LineHeight | js.Symbol = js.native
  
  var paragraphIndent: Double = js.native
  
  var paragraphSpacing: Double = js.native
  
  def setRangeFillStyleId(start: Double, end: Double, value: String): Unit = js.native
  
  def setRangeFills(start: Double, end: Double, value: js.Array[Paint]): Unit = js.native
  
  def setRangeFontName(start: Double, end: Double, value: FontName): Unit = js.native
  
  def setRangeFontSize(start: Double, end: Double, value: Double): Unit = js.native
  
  def setRangeLetterSpacing(start: Double, end: Double, value: LetterSpacing): Unit = js.native
  
  def setRangeLineHeight(start: Double, end: Double, value: LineHeight): Unit = js.native
  
  def setRangeTextCase(start: Double, end: Double, value: TextCase): Unit = js.native
  
  def setRangeTextDecoration(start: Double, end: Double, value: TextDecoration): Unit = js.native
  
  def setRangeTextStyleId(start: Double, end: Double, value: String): Unit = js.native
  
  var textAlignHorizontal: LEFT | CENTER | RIGHT | JUSTIFIED = js.native
  
  var textAlignVertical: TOP | CENTER | BOTTOM = js.native
  
  var textAutoResize: NONE | WIDTH_AND_HEIGHT | HEIGHT = js.native
  
  var textCase: TextCase | js.Symbol = js.native
  
  var textDecoration: TextDecoration | js.Symbol = js.native
  
  var textStyleId: String | js.Symbol = js.native
  
  val `type`: TEXT = js.native
}
