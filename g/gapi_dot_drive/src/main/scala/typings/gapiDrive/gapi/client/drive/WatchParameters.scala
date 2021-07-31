package typings.gapiDrive.gapi.client.drive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchParameters extends StObject {
  
  var fileId: String
  
  var resource: js.UndefOr[WatchResource] = js.undefined
  
  var revisionId: js.UndefOr[String] = js.undefined
  
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
}
object WatchParameters {
  
  @scala.inline
  def apply(fileId: String): WatchParameters = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchParameters]
  }
  
  @scala.inline
  implicit class WatchParametersMutableBuilder[Self <: WatchParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: WatchResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    @scala.inline
    def setSupportsTeamDrives(value: Boolean): Self = StObject.set(x, "supportsTeamDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsTeamDrivesUndefined: Self = StObject.set(x, "supportsTeamDrives", js.undefined)
  }
}
