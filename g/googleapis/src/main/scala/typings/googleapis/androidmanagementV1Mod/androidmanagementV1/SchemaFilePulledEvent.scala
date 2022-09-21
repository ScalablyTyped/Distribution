package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFilePulledEvent extends StObject {
  
  /**
    * The path of the file being pulled.
    */
  var filePath: js.UndefOr[String | Null] = js.undefined
}
object SchemaFilePulledEvent {
  
  inline def apply(): SchemaFilePulledEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilePulledEvent]
  }
  
  extension [Self <: SchemaFilePulledEvent](x: Self) {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathNull: Self = StObject.set(x, "filePath", null)
    
    inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
  }
}
