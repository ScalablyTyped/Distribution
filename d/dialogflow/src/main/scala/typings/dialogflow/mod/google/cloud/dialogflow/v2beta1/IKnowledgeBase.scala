package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a KnowledgeBase. */
@js.native
trait IKnowledgeBase extends StObject {
  
  /** KnowledgeBase displayName */
  var displayName: js.UndefOr[String | Null] = js.native
  
  /** KnowledgeBase languageCode */
  var languageCode: js.UndefOr[String | Null] = js.native
  
  /** KnowledgeBase name */
  var name: js.UndefOr[String | Null] = js.native
}
object IKnowledgeBase {
  
  @scala.inline
  def apply(): IKnowledgeBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IKnowledgeBase]
  }
  
  @scala.inline
  implicit class IKnowledgeBaseMutableBuilder[Self <: IKnowledgeBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
