package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Drive file that is used as material for course work.
  */
@js.native
trait SchemaSharedDriveFile extends StObject {
  
  /**
    * Drive file details.
    */
  var driveFile: js.UndefOr[SchemaDriveFile] = js.native
  
  /**
    * Mechanism by which students access the Drive item.
    */
  var shareMode: js.UndefOr[String] = js.native
}
object SchemaSharedDriveFile {
  
  @scala.inline
  def apply(): SchemaSharedDriveFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSharedDriveFile]
  }
  
  @scala.inline
  implicit class SchemaSharedDriveFileMutableBuilder[Self <: SchemaSharedDriveFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDriveFile(value: SchemaDriveFile): Self = StObject.set(x, "driveFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveFileUndefined: Self = StObject.set(x, "driveFile", js.undefined)
    
    @scala.inline
    def setShareMode(value: String): Self = StObject.set(x, "shareMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareModeUndefined: Self = StObject.set(x, "shareMode", js.undefined)
  }
}
