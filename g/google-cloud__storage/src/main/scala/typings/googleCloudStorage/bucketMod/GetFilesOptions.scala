package typings.googleCloudStorage.bucketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFilesOptions extends StObject {
  
  var autoPaginate: js.UndefOr[Boolean] = js.undefined
  
  var delimiter: js.UndefOr[String] = js.undefined
  
  var directory: js.UndefOr[String] = js.undefined
  
  var endOffset: js.UndefOr[String] = js.undefined
  
  var includeTrailingDelimiter: js.UndefOr[Boolean] = js.undefined
  
  var maxApiCalls: js.UndefOr[Double] = js.undefined
  
  var maxResults: js.UndefOr[Double] = js.undefined
  
  var pageToken: js.UndefOr[String] = js.undefined
  
  var prefix: js.UndefOr[String] = js.undefined
  
  var startOffset: js.UndefOr[String] = js.undefined
  
  var userProject: js.UndefOr[String] = js.undefined
  
  var versions: js.UndefOr[Boolean] = js.undefined
}
object GetFilesOptions {
  
  inline def apply(): GetFilesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFilesOptions]
  }
  
  extension [Self <: GetFilesOptions](x: Self) {
    
    inline def setAutoPaginate(value: Boolean): Self = StObject.set(x, "autoPaginate", value.asInstanceOf[js.Any])
    
    inline def setAutoPaginateUndefined: Self = StObject.set(x, "autoPaginate", js.undefined)
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
    
    inline def setEndOffset(value: String): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    inline def setEndOffsetUndefined: Self = StObject.set(x, "endOffset", js.undefined)
    
    inline def setIncludeTrailingDelimiter(value: Boolean): Self = StObject.set(x, "includeTrailingDelimiter", value.asInstanceOf[js.Any])
    
    inline def setIncludeTrailingDelimiterUndefined: Self = StObject.set(x, "includeTrailingDelimiter", js.undefined)
    
    inline def setMaxApiCalls(value: Double): Self = StObject.set(x, "maxApiCalls", value.asInstanceOf[js.Any])
    
    inline def setMaxApiCallsUndefined: Self = StObject.set(x, "maxApiCalls", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setStartOffset(value: String): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    inline def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
    
    inline def setVersions(value: Boolean): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
  }
}
