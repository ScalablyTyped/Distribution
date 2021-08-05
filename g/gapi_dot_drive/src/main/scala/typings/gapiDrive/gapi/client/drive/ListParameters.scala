package typings.gapiDrive.gapi.client.drive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListParameters extends StObject {
  
  var corpora: js.UndefOr[String] = js.undefined
  
  var corpus: js.UndefOr[String] = js.undefined
  
  var includeTeamDriveItems: js.UndefOr[Boolean] = js.undefined
  
  var maxResults: js.UndefOr[Double] = js.undefined
  
  var orderBy: js.UndefOr[String] = js.undefined
  
  var pageToken: js.UndefOr[String] = js.undefined
  
  var projection: js.UndefOr[String] = js.undefined
  
  var q: js.UndefOr[String] = js.undefined
  
  var spaces: js.UndefOr[String] = js.undefined
  
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
  
  var teamDriveId: js.UndefOr[String] = js.undefined
}
object ListParameters {
  
  inline def apply(): ListParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListParameters]
  }
  
  extension [Self <: ListParameters](x: Self) {
    
    inline def setCorpora(value: String): Self = StObject.set(x, "corpora", value.asInstanceOf[js.Any])
    
    inline def setCorporaUndefined: Self = StObject.set(x, "corpora", js.undefined)
    
    inline def setCorpus(value: String): Self = StObject.set(x, "corpus", value.asInstanceOf[js.Any])
    
    inline def setCorpusUndefined: Self = StObject.set(x, "corpus", js.undefined)
    
    inline def setIncludeTeamDriveItems(value: Boolean): Self = StObject.set(x, "includeTeamDriveItems", value.asInstanceOf[js.Any])
    
    inline def setIncludeTeamDriveItemsUndefined: Self = StObject.set(x, "includeTeamDriveItems", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    inline def setSpaces(value: String): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
    
    inline def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
    
    inline def setSupportsTeamDrives(value: Boolean): Self = StObject.set(x, "supportsTeamDrives", value.asInstanceOf[js.Any])
    
    inline def setSupportsTeamDrivesUndefined: Self = StObject.set(x, "supportsTeamDrives", js.undefined)
    
    inline def setTeamDriveId(value: String): Self = StObject.set(x, "teamDriveId", value.asInstanceOf[js.Any])
    
    inline def setTeamDriveIdUndefined: Self = StObject.set(x, "teamDriveId", js.undefined)
  }
}
