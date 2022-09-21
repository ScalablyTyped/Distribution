package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFilePushedEvent extends StObject {
  
  /**
    * The path of the file being pushed.
    */
  var filePath: js.UndefOr[String | Null] = js.undefined
}
object SchemaFilePushedEvent {
  
  inline def apply(): SchemaFilePushedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilePushedEvent]
  }
  
  extension [Self <: SchemaFilePushedEvent](x: Self) {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathNull: Self = StObject.set(x, "filePath", null)
    
    inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
  }
}
