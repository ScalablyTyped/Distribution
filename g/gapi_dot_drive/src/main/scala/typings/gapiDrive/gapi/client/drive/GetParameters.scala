package typings.gapiDrive.gapi.client.drive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters extends StObject {
  
  var acknowledgeAbuse: js.UndefOr[Boolean] = js.undefined
  
  var fileId: String
  
  var projection: js.UndefOr[String] = js.undefined
  
  var revisionId: js.UndefOr[String] = js.undefined
  
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
  
  var updateViewedDate: js.UndefOr[Boolean] = js.undefined
}
object GetParameters {
  
  @scala.inline
  def apply(fileId: String): GetParameters = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters]
  }
  
  @scala.inline
  implicit class GetParametersMutableBuilder[Self <: GetParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcknowledgeAbuse(value: Boolean): Self = StObject.set(x, "acknowledgeAbuse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcknowledgeAbuseUndefined: Self = StObject.set(x, "acknowledgeAbuse", js.undefined)
    
    @scala.inline
    def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    @scala.inline
    def setSupportsTeamDrives(value: Boolean): Self = StObject.set(x, "supportsTeamDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsTeamDrivesUndefined: Self = StObject.set(x, "supportsTeamDrives", js.undefined)
    
    @scala.inline
    def setUpdateViewedDate(value: Boolean): Self = StObject.set(x, "updateViewedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateViewedDateUndefined: Self = StObject.set(x, "updateViewedDate", js.undefined)
  }
}
