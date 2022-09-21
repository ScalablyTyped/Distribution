package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDriveFile extends StObject {
  
  /**
    * URL that can be used to access the Drive item. Read-only.
    */
  var alternateLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Drive API resource ID.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL of a thumbnail image of the Drive item. Read-only.
    */
  var thumbnailUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Title of the Drive item. Read-only.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaDriveFile {
  
  inline def apply(): SchemaDriveFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDriveFile]
  }
  
  extension [Self <: SchemaDriveFile](x: Self) {
    
    inline def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
    
    inline def setAlternateLinkNull: Self = StObject.set(x, "alternateLink", null)
    
    inline def setAlternateLinkUndefined: Self = StObject.set(x, "alternateLink", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setThumbnailUrl(value: String): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUrlNull: Self = StObject.set(x, "thumbnailUrl", null)
    
    inline def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
