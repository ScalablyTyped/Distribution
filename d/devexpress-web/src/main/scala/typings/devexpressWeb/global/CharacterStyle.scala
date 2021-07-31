package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains characteristics of a character style in a document.
  */
@JSGlobal("CharacterStyle")
@js.native
class CharacterStyle ()
  extends StObject
     with typings.devexpressWeb.CharacterStyle {
  
  /**
    * Gets whether the specified style is marked as deleted.
    */
  /* CompleteClass */
  override val isDeleted: Boolean = js.native
  
  /**
    * Gets or sets the linked style for the current style.
    */
  /* CompleteClass */
  override val linkedStyle: typings.devexpressWeb.ParagraphStyle = js.native
  
  /**
    * Gets or sets the name of the style.
    */
  /* CompleteClass */
  override val name: String = js.native
  
  /**
    * Gets the style form which the current style inherits.
    */
  /* CompleteClass */
  override val parent: typings.devexpressWeb.CharacterStyle = js.native
}
