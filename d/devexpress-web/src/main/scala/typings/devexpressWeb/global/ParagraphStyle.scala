package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the paragraph style settings.
  */
@JSGlobal("ParagraphStyle")
@js.native
class ParagraphStyle ()
  extends StObject
     with typings.devexpressWeb.ParagraphStyle {
  
  /**
    * Gets whether the specified style is marked as deleted.
    */
  /* CompleteClass */
  override val isDeleted: Boolean = js.native
  
  /**
    * Gets or sets the linked style for the current style.
    */
  /* CompleteClass */
  override val linkedStyle: typings.devexpressWeb.CharacterStyle = js.native
  
  /**
    * Gets the index of the list item associated with the paragraph formatted with the current style.
    */
  /* CompleteClass */
  override val listIndex: Double = js.native
  
  /**
    * Gets the index of the list level applied to the paragraph formatted with the current style.
    */
  /* CompleteClass */
  override val listLevelIndex: Double = js.native
  
  /**
    * Gets or sets the name of the style.
    */
  /* CompleteClass */
  override val name: String = js.native
  
  /**
    * Gets or sets the default style for a paragraph that immediately follows the current paragraph.
    */
  /* CompleteClass */
  override val nextStyle: typings.devexpressWeb.ParagraphStyle = js.native
  
  /**
    * Gets or sets the style from which the current style inherits.
    */
  /* CompleteClass */
  override val parent: typings.devexpressWeb.ParagraphStyle = js.native
}
