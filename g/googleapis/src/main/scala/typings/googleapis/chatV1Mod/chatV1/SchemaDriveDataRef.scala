package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDriveDataRef extends StObject {
  
  /**
    * The id for the drive file, for use with the Drive API.
    */
  var driveFileId: js.UndefOr[String | Null] = js.undefined
}
object SchemaDriveDataRef {
  
  inline def apply(): SchemaDriveDataRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDriveDataRef]
  }
  
  extension [Self <: SchemaDriveDataRef](x: Self) {
    
    inline def setDriveFileId(value: String): Self = StObject.set(x, "driveFileId", value.asInstanceOf[js.Any])
    
    inline def setDriveFileIdNull: Self = StObject.set(x, "driveFileId", null)
    
    inline def setDriveFileIdUndefined: Self = StObject.set(x, "driveFileId", js.undefined)
  }
}
