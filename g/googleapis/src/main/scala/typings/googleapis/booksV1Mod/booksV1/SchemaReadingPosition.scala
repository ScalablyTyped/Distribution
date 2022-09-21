package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReadingPosition extends StObject {
  
  /**
    * Position in an EPUB as a CFI.
    */
  var epubCfiPosition: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Position in a volume for image-based content.
    */
  var gbImagePosition: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Position in a volume for text-based content.
    */
  var gbTextPosition: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource type for a reading position.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Position in a PDF file.
    */
  var pdfPosition: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Timestamp when this reading position was last updated (formatted UTC timestamp with millisecond resolution).
    */
  var updated: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Volume id associated with this reading position.
    */
  var volumeId: js.UndefOr[String | Null] = js.undefined
}
object SchemaReadingPosition {
  
  inline def apply(): SchemaReadingPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReadingPosition]
  }
  
  extension [Self <: SchemaReadingPosition](x: Self) {
    
    inline def setEpubCfiPosition(value: String): Self = StObject.set(x, "epubCfiPosition", value.asInstanceOf[js.Any])
    
    inline def setEpubCfiPositionNull: Self = StObject.set(x, "epubCfiPosition", null)
    
    inline def setEpubCfiPositionUndefined: Self = StObject.set(x, "epubCfiPosition", js.undefined)
    
    inline def setGbImagePosition(value: String): Self = StObject.set(x, "gbImagePosition", value.asInstanceOf[js.Any])
    
    inline def setGbImagePositionNull: Self = StObject.set(x, "gbImagePosition", null)
    
    inline def setGbImagePositionUndefined: Self = StObject.set(x, "gbImagePosition", js.undefined)
    
    inline def setGbTextPosition(value: String): Self = StObject.set(x, "gbTextPosition", value.asInstanceOf[js.Any])
    
    inline def setGbTextPositionNull: Self = StObject.set(x, "gbTextPosition", null)
    
    inline def setGbTextPositionUndefined: Self = StObject.set(x, "gbTextPosition", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPdfPosition(value: String): Self = StObject.set(x, "pdfPosition", value.asInstanceOf[js.Any])
    
    inline def setPdfPositionNull: Self = StObject.set(x, "pdfPosition", null)
    
    inline def setPdfPositionUndefined: Self = StObject.set(x, "pdfPosition", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedNull: Self = StObject.set(x, "updated", null)
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdNull: Self = StObject.set(x, "volumeId", null)
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
