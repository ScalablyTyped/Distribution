package typings.googleCloudStorage.bucketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFilesOptions extends StObject {
  
  var autoPaginate: js.UndefOr[Boolean] = js.native
  
  var delimiter: js.UndefOr[String] = js.native
  
  var directory: js.UndefOr[String] = js.native
  
  var endOffset: js.UndefOr[String] = js.native
  
  var includeTrailingDelimiter: js.UndefOr[Boolean] = js.native
  
  var maxApiCalls: js.UndefOr[Double] = js.native
  
  var maxResults: js.UndefOr[Double] = js.native
  
  var pageToken: js.UndefOr[String] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var startOffset: js.UndefOr[String] = js.native
  
  var userProject: js.UndefOr[String] = js.native
  
  var versions: js.UndefOr[Boolean] = js.native
}
object GetFilesOptions {
  
  @scala.inline
  def apply(): GetFilesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFilesOptions]
  }
  
  @scala.inline
  implicit class GetFilesOptionsMutableBuilder[Self <: GetFilesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoPaginate(value: Boolean): Self = StObject.set(x, "autoPaginate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPaginateUndefined: Self = StObject.set(x, "autoPaginate", js.undefined)
    
    @scala.inline
    def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    @scala.inline
    def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
    
    @scala.inline
    def setEndOffset(value: String): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOffsetUndefined: Self = StObject.set(x, "endOffset", js.undefined)
    
    @scala.inline
    def setIncludeTrailingDelimiter(value: Boolean): Self = StObject.set(x, "includeTrailingDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeTrailingDelimiterUndefined: Self = StObject.set(x, "includeTrailingDelimiter", js.undefined)
    
    @scala.inline
    def setMaxApiCalls(value: Double): Self = StObject.set(x, "maxApiCalls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxApiCallsUndefined: Self = StObject.set(x, "maxApiCalls", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setStartOffset(value: String): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
    
    @scala.inline
    def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
    
    @scala.inline
    def setVersions(value: Boolean): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
  }
}
