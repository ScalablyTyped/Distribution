package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A card is a UI element that can contain UI widgets such as texts, images.
  */
trait SchemaCard extends StObject {
  
  /**
    * The actions of this card.
    */
  var cardActions: js.UndefOr[js.Array[SchemaCardAction]] = js.undefined
  
  /**
    * The header of the card. A header usually contains a title and an image.
    */
  var header: js.UndefOr[SchemaCardHeader] = js.undefined
  
  /**
    * Name of the card.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Sections are separated by a line divider.
    */
  var sections: js.UndefOr[js.Array[SchemaSection]] = js.undefined
}
object SchemaCard {
  
  @scala.inline
  def apply(): SchemaCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCard]
  }
  
  @scala.inline
  implicit class SchemaCardMutableBuilder[Self <: SchemaCard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardActions(value: js.Array[SchemaCardAction]): Self = StObject.set(x, "cardActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardActionsUndefined: Self = StObject.set(x, "cardActions", js.undefined)
    
    @scala.inline
    def setCardActionsVarargs(value: SchemaCardAction*): Self = StObject.set(x, "cardActions", js.Array(value :_*))
    
    @scala.inline
    def setHeader(value: SchemaCardHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSections(value: js.Array[SchemaSection]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
    
    @scala.inline
    def setSectionsVarargs(value: SchemaSection*): Self = StObject.set(x, "sections", js.Array(value :_*))
  }
}
