package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains floating text boxes settings.
  */
trait FloatingTextBoxInfo
  extends StObject
     with FloatingObjectInfo {
  
  /**
    * Gets the sub-document representing the floating text box's content.
    */
  val contentSubDocument: SubDocument
}
object FloatingTextBoxInfo {
  
  inline def apply(contentSubDocument: SubDocument, parentSubDocument: SubDocument, position: Double): FloatingTextBoxInfo = {
    val __obj = js.Dynamic.literal(contentSubDocument = contentSubDocument.asInstanceOf[js.Any], parentSubDocument = parentSubDocument.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingTextBoxInfo]
  }
  
  extension [Self <: FloatingTextBoxInfo](x: Self) {
    
    inline def setContentSubDocument(value: SubDocument): Self = StObject.set(x, "contentSubDocument", value.asInstanceOf[js.Any])
  }
}
