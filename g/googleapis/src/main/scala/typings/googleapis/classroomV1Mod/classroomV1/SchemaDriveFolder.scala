package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Representation of a Google Drive folder.
  */
trait SchemaDriveFolder extends StObject {
  
  /**
    * URL that can be used to access the Drive folder.  Read-only.
    */
  var alternateLink: js.UndefOr[String] = js.undefined
  
  /**
    * Drive API resource ID.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Title of the Drive folder.  Read-only.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaDriveFolder {
  
  @scala.inline
  def apply(): SchemaDriveFolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDriveFolder]
  }
  
  @scala.inline
  implicit class SchemaDriveFolderMutableBuilder[Self <: SchemaDriveFolder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternateLinkUndefined: Self = StObject.set(x, "alternateLink", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
