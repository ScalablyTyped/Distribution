package typings.firebaseFirestore.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a local view (overlay) of a document, and the fields that are
  * locally mutated.
  */
trait OverlayedDocument extends StObject {
  
  /**
    * The fields that are locally mutated by patch mutations. If the overlayed
    * document is from set or delete mutations, this returns null.
    */
  val mutatedFields: FieldMask | Null
  
  val overlayedDocument: Document2
}
object OverlayedDocument {
  
  inline def apply(overlayedDocument: Document2): OverlayedDocument = {
    val __obj = js.Dynamic.literal(overlayedDocument = overlayedDocument.asInstanceOf[js.Any], mutatedFields = null)
    __obj.asInstanceOf[OverlayedDocument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OverlayedDocument] (val x: Self) extends AnyVal {
    
    inline def setMutatedFields(value: FieldMask): Self = StObject.set(x, "mutatedFields", value.asInstanceOf[js.Any])
    
    inline def setMutatedFieldsNull: Self = StObject.set(x, "mutatedFields", null)
    
    inline def setOverlayedDocument(value: Document2): Self = StObject.set(x, "overlayedDocument", value.asInstanceOf[js.Any])
  }
}
