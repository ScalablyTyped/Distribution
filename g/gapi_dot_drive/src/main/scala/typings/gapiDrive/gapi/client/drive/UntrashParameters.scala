package typings.gapiDrive.gapi.client.drive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntrashParameters extends StObject {
  
  var fileId: String
  
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
}
object UntrashParameters {
  
  @scala.inline
  def apply(fileId: String): UntrashParameters = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntrashParameters]
  }
  
  @scala.inline
  implicit class UntrashParametersMutableBuilder[Self <: UntrashParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsTeamDrives(value: Boolean): Self = StObject.set(x, "supportsTeamDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsTeamDrivesUndefined: Self = StObject.set(x, "supportsTeamDrives", js.undefined)
  }
}
