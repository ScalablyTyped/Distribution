package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedJustification extends StObject {
  
  /**
    * Time the action took place.
    */
  var actionTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of action performed on the document.
    */
  var actionType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Owner of the document.
    */
  var documentOwner: js.UndefOr[SchemaAppsDynamiteSharedJustificationPerson] = js.undefined
  
  /**
    * Words or phrases from the user's query that describes the document content. (Ex: Users query is "Can you share the document about Bullseye?" the extracted topic would be "Bullseye").
    */
  var topics: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaAppsDynamiteSharedJustification {
  
  inline def apply(): SchemaAppsDynamiteSharedJustification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedJustification]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedJustification](x: Self) {
    
    inline def setActionTime(value: String): Self = StObject.set(x, "actionTime", value.asInstanceOf[js.Any])
    
    inline def setActionTimeNull: Self = StObject.set(x, "actionTime", null)
    
    inline def setActionTimeUndefined: Self = StObject.set(x, "actionTime", js.undefined)
    
    inline def setActionType(value: String): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    inline def setActionTypeNull: Self = StObject.set(x, "actionType", null)
    
    inline def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
    
    inline def setDocumentOwner(value: SchemaAppsDynamiteSharedJustificationPerson): Self = StObject.set(x, "documentOwner", value.asInstanceOf[js.Any])
    
    inline def setDocumentOwnerUndefined: Self = StObject.set(x, "documentOwner", js.undefined)
    
    inline def setTopics(value: js.Array[String]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsNull: Self = StObject.set(x, "topics", null)
    
    inline def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
    
    inline def setTopicsVarargs(value: String*): Self = StObject.set(x, "topics", js.Array(value*))
  }
}
