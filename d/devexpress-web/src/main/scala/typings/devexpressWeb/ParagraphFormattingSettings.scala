package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains paragraph formatting settings.
  */
@js.native
trait ParagraphFormattingSettings extends StObject {
  
  /**
    * Specifies the paragraph alignment.
    */
  var alignment: ParagraphAlignment = js.native
  
  /**
    * Specifies the paragraph background color.
    */
  var backColor: String = js.native
  
  /**
    * Specifies whether to remove an additional space (contextual spacing) between paragraphs of the same style.
    */
  var contextualSpacing: Boolean = js.native
  
  /**
    * Specifies the indent of the paragraph's first line.
    */
  var firstLineIndent: Double = js.native
  
  /**
    * Specifies whether and how the paragraph's first line is indented.
    */
  var firstLineIndentType: ParagraphFirstLineIndent = js.native
  
  /**
    * Specifies whether all lines in a paragraph should appear on the same page.
    */
  var keepLinesTogether: Boolean = js.native
  
  /**
    * Specifies the left indent for text in a paragraph.
    */
  var leftIndent: Double = js.native
  
  /**
    * Specifies a line spacing value.
    */
  var lineSpacing: Double = js.native
  
  /**
    * Specifies a spacing between lines in the paragraph.
    */
  var lineSpacingType: ParagraphLineSpacingType = js.native
  
  /**
    * Specifies the paragraph's outline level.
    */
  var outlineLevel: Double = js.native
  
  /**
    * Specifies whether a page break is inserted before the paragraph.
    */
  var pageBreakBefore: Boolean = js.native
  
  /**
    * Specifies the paragraph's right indent.
    */
  var rightIndent: Double = js.native
  
  /**
    * Specifies the spacing after the paragraph.
    */
  var spacingAfter: Double = js.native
  
  /**
    * Specifies the spacing before the paragraph.
    */
  var spacingBefore: Double = js.native
}
object ParagraphFormattingSettings {
  
  @scala.inline
  def apply(
    alignment: ParagraphAlignment,
    backColor: String,
    contextualSpacing: Boolean,
    firstLineIndent: Double,
    firstLineIndentType: ParagraphFirstLineIndent,
    keepLinesTogether: Boolean,
    leftIndent: Double,
    lineSpacing: Double,
    lineSpacingType: ParagraphLineSpacingType,
    outlineLevel: Double,
    pageBreakBefore: Boolean,
    rightIndent: Double,
    spacingAfter: Double,
    spacingBefore: Double
  ): ParagraphFormattingSettings = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], backColor = backColor.asInstanceOf[js.Any], contextualSpacing = contextualSpacing.asInstanceOf[js.Any], firstLineIndent = firstLineIndent.asInstanceOf[js.Any], firstLineIndentType = firstLineIndentType.asInstanceOf[js.Any], keepLinesTogether = keepLinesTogether.asInstanceOf[js.Any], leftIndent = leftIndent.asInstanceOf[js.Any], lineSpacing = lineSpacing.asInstanceOf[js.Any], lineSpacingType = lineSpacingType.asInstanceOf[js.Any], outlineLevel = outlineLevel.asInstanceOf[js.Any], pageBreakBefore = pageBreakBefore.asInstanceOf[js.Any], rightIndent = rightIndent.asInstanceOf[js.Any], spacingAfter = spacingAfter.asInstanceOf[js.Any], spacingBefore = spacingBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphFormattingSettings]
  }
  
  @scala.inline
  implicit class ParagraphFormattingSettingsMutableBuilder[Self <: ParagraphFormattingSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: ParagraphAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackColor(value: String): Self = StObject.set(x, "backColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextualSpacing(value: Boolean): Self = StObject.set(x, "contextualSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstLineIndent(value: Double): Self = StObject.set(x, "firstLineIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstLineIndentType(value: ParagraphFirstLineIndent): Self = StObject.set(x, "firstLineIndentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepLinesTogether(value: Boolean): Self = StObject.set(x, "keepLinesTogether", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftIndent(value: Double): Self = StObject.set(x, "leftIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineSpacing(value: Double): Self = StObject.set(x, "lineSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineSpacingType(value: ParagraphLineSpacingType): Self = StObject.set(x, "lineSpacingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineLevel(value: Double): Self = StObject.set(x, "outlineLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageBreakBefore(value: Boolean): Self = StObject.set(x, "pageBreakBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightIndent(value: Double): Self = StObject.set(x, "rightIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingAfter(value: Double): Self = StObject.set(x, "spacingAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingBefore(value: Double): Self = StObject.set(x, "spacingBefore", value.asInstanceOf[js.Any])
  }
}
