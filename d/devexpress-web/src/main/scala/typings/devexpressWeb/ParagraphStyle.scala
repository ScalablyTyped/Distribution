package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the paragraph style settings.
  */
trait ParagraphStyle
  extends StObject
     with StyleBase {
  
  /**
    * Gets or sets the linked style for the current style.
    */
  val linkedStyle: CharacterStyle
  
  /**
    * Gets the index of the list item associated with the paragraph formatted with the current style.
    */
  val listIndex: Double
  
  /**
    * Gets the index of the list level applied to the paragraph formatted with the current style.
    */
  val listLevelIndex: Double
  
  /**
    * Gets or sets the default style for a paragraph that immediately follows the current paragraph.
    */
  val nextStyle: ParagraphStyle
  
  /**
    * Gets or sets the style from which the current style inherits.
    */
  val parent: ParagraphStyle
}
object ParagraphStyle {
  
  inline def apply(
    isDeleted: Boolean,
    linkedStyle: CharacterStyle,
    listIndex: Double,
    listLevelIndex: Double,
    name: String,
    nextStyle: ParagraphStyle,
    parent: ParagraphStyle
  ): ParagraphStyle = {
    val __obj = js.Dynamic.literal(isDeleted = isDeleted.asInstanceOf[js.Any], linkedStyle = linkedStyle.asInstanceOf[js.Any], listIndex = listIndex.asInstanceOf[js.Any], listLevelIndex = listLevelIndex.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nextStyle = nextStyle.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParagraphStyle] (val x: Self) extends AnyVal {
    
    inline def setLinkedStyle(value: CharacterStyle): Self = StObject.set(x, "linkedStyle", value.asInstanceOf[js.Any])
    
    inline def setListIndex(value: Double): Self = StObject.set(x, "listIndex", value.asInstanceOf[js.Any])
    
    inline def setListLevelIndex(value: Double): Self = StObject.set(x, "listLevelIndex", value.asInstanceOf[js.Any])
    
    inline def setNextStyle(value: ParagraphStyle): Self = StObject.set(x, "nextStyle", value.asInstanceOf[js.Any])
    
    inline def setParent(value: ParagraphStyle): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
