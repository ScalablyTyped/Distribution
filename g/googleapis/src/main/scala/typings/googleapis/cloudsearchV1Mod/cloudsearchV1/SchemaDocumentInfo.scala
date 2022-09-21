package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDocumentInfo extends StObject {
  
  /**
    * A whiteboard document.
    */
  var whiteboardInfo: js.UndefOr[SchemaWhiteboardInfo] = js.undefined
}
object SchemaDocumentInfo {
  
  inline def apply(): SchemaDocumentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocumentInfo]
  }
  
  extension [Self <: SchemaDocumentInfo](x: Self) {
    
    inline def setWhiteboardInfo(value: SchemaWhiteboardInfo): Self = StObject.set(x, "whiteboardInfo", value.asInstanceOf[js.Any])
    
    inline def setWhiteboardInfoUndefined: Self = StObject.set(x, "whiteboardInfo", js.undefined)
  }
}
