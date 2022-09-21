package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChatV1ContextualAddOnMarkup extends StObject {
  
  /**
    * A list of cards. A card must contain a header and at least 1 section.
    */
  var cards: js.UndefOr[js.Array[SchemaGoogleChatV1ContextualAddOnMarkupCard]] = js.undefined
}
object SchemaGoogleChatV1ContextualAddOnMarkup {
  
  inline def apply(): SchemaGoogleChatV1ContextualAddOnMarkup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChatV1ContextualAddOnMarkup]
  }
  
  extension [Self <: SchemaGoogleChatV1ContextualAddOnMarkup](x: Self) {
    
    inline def setCards(value: js.Array[SchemaGoogleChatV1ContextualAddOnMarkupCard]): Self = StObject.set(x, "cards", value.asInstanceOf[js.Any])
    
    inline def setCardsUndefined: Self = StObject.set(x, "cards", js.undefined)
    
    inline def setCardsVarargs(value: SchemaGoogleChatV1ContextualAddOnMarkupCard*): Self = StObject.set(x, "cards", js.Array(value*))
  }
}
