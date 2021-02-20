package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Representation of a Google Drive file.
  */
@js.native
trait SchemaDriveFile extends StObject {
  
  /**
    * URL that can be used to access the Drive item.  Read-only.
    */
  var alternateLink: js.UndefOr[String] = js.native
  
  /**
    * Drive API resource ID.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * URL of a thumbnail image of the Drive item.  Read-only.
    */
  var thumbnailUrl: js.UndefOr[String] = js.native
  
  /**
    * Title of the Drive item.  Read-only.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaDriveFile {
  
  @scala.inline
  def apply(): SchemaDriveFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDriveFile]
  }
  
  @scala.inline
  implicit class SchemaDriveFileMutableBuilder[Self <: SchemaDriveFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternateLinkUndefined: Self = StObject.set(x, "alternateLink", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setThumbnailUrl(value: String): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
