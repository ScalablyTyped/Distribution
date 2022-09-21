package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSharedDriveFile extends StObject {
  
  /**
    * Drive file details.
    */
  var driveFile: js.UndefOr[SchemaDriveFile] = js.undefined
  
  /**
    * Mechanism by which students access the Drive item.
    */
  var shareMode: js.UndefOr[String | Null] = js.undefined
}
object SchemaSharedDriveFile {
  
  inline def apply(): SchemaSharedDriveFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSharedDriveFile]
  }
  
  extension [Self <: SchemaSharedDriveFile](x: Self) {
    
    inline def setDriveFile(value: SchemaDriveFile): Self = StObject.set(x, "driveFile", value.asInstanceOf[js.Any])
    
    inline def setDriveFileUndefined: Self = StObject.set(x, "driveFile", js.undefined)
    
    inline def setShareMode(value: String): Self = StObject.set(x, "shareMode", value.asInstanceOf[js.Any])
    
    inline def setShareModeNull: Self = StObject.set(x, "shareMode", null)
    
    inline def setShareModeUndefined: Self = StObject.set(x, "shareMode", js.undefined)
  }
}
