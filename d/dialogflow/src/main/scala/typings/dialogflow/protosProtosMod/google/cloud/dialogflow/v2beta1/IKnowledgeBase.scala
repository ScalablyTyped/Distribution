package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a KnowledgeBase. */
trait IKnowledgeBase extends StObject {
  
  /** KnowledgeBase displayName */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /** KnowledgeBase languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /** KnowledgeBase name */
  var name: js.UndefOr[String | Null] = js.undefined
}
object IKnowledgeBase {
  
  inline def apply(): IKnowledgeBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IKnowledgeBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IKnowledgeBase] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
