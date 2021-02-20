package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a paragraph in the document.
  */
@js.native
trait Paragraph extends StObject {
  
  /**
    * Gets the paragraph's index.
    */
  val index: Double = js.native
  
  /**
    * Gets the text buffer interval occupied by the current paragraph element.
    */
  val interval: Interval = js.native
  
  /**
    * Gets the paragraph's character length.
    */
  val length: Double = js.native
  
  /**
    * Gets the index of a list applied to the paragraph.
    */
  val listIndex: Double = js.native
  
  /**
    * Gets the index of the list level applied to the current paragraph in the numbering list.
    */
  val listLevelIndex: Double = js.native
  
  /**
    * Gets the paragraph's start position in the document.
    */
  val start: Double = js.native
  
  /**
    * Gets the name of the paragraph style applied to the current paragraph (see StyleBase.name).
    */
  val styleName: String = js.native
}
object Paragraph {
  
  @scala.inline
  def apply(
    index: Double,
    interval: Interval,
    length: Double,
    listIndex: Double,
    listLevelIndex: Double,
    start: Double,
    styleName: String
  ): Paragraph = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], listIndex = listIndex.asInstanceOf[js.Any], listLevelIndex = listLevelIndex.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], styleName = styleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paragraph]
  }
  
  @scala.inline
  implicit class ParagraphMutableBuilder[Self <: Paragraph] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: Interval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListIndex(value: Double): Self = StObject.set(x, "listIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListLevelIndex(value: Double): Self = StObject.set(x, "listLevelIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleName(value: String): Self = StObject.set(x, "styleName", value.asInstanceOf[js.Any])
  }
}
