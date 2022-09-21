package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSpaceDetails extends StObject {
  
  /**
    * Optional. A description of the space. It could describe the space's discussion topic, functional purpose, or participants.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The space's rules, expectations, and etiquette.
    */
  var guidelines: js.UndefOr[String | Null] = js.undefined
}
object SchemaSpaceDetails {
  
  inline def apply(): SchemaSpaceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpaceDetails]
  }
  
  extension [Self <: SchemaSpaceDetails](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGuidelines(value: String): Self = StObject.set(x, "guidelines", value.asInstanceOf[js.Any])
    
    inline def setGuidelinesNull: Self = StObject.set(x, "guidelines", null)
    
    inline def setGuidelinesUndefined: Self = StObject.set(x, "guidelines", js.undefined)
  }
}
