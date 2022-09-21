package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDriveFolder extends StObject {
  
  /**
    * URL that can be used to access the Drive folder. Read-only.
    */
  var alternateLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Drive API resource ID.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Title of the Drive folder. Read-only.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaDriveFolder {
  
  inline def apply(): SchemaDriveFolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDriveFolder]
  }
  
  extension [Self <: SchemaDriveFolder](x: Self) {
    
    inline def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
    
    inline def setAlternateLinkNull: Self = StObject.set(x, "alternateLink", null)
    
    inline def setAlternateLinkUndefined: Self = StObject.set(x, "alternateLink", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
