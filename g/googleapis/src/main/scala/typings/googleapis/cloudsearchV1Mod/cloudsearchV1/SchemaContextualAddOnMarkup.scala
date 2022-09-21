package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContextualAddOnMarkup extends StObject {
  
  /**
    * A card must contain a header and at least 1 section.
    */
  var cards: js.UndefOr[js.Array[SchemaCard]] = js.undefined
  
  /**
    * Deprecated.
    */
  var toolbar: js.UndefOr[SchemaToolbar] = js.undefined
}
object SchemaContextualAddOnMarkup {
  
  inline def apply(): SchemaContextualAddOnMarkup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContextualAddOnMarkup]
  }
  
  extension [Self <: SchemaContextualAddOnMarkup](x: Self) {
    
    inline def setCards(value: js.Array[SchemaCard]): Self = StObject.set(x, "cards", value.asInstanceOf[js.Any])
    
    inline def setCardsUndefined: Self = StObject.set(x, "cards", js.undefined)
    
    inline def setCardsVarargs(value: SchemaCard*): Self = StObject.set(x, "cards", js.Array(value*))
    
    inline def setToolbar(value: SchemaToolbar): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
  }
}
