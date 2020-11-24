package typings.googleCloudStorage.bucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFilesOptions extends js.Object {
  
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
  implicit class GetFilesOptionsOps[Self <: GetFilesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoPaginate(value: Boolean): Self = this.set("autoPaginate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPaginate: Self = this.set("autoPaginate", js.undefined)
    
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def setDirectory(value: String): Self = this.set("directory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectory: Self = this.set("directory", js.undefined)
    
    @scala.inline
    def setEndOffset(value: String): Self = this.set("endOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndOffset: Self = this.set("endOffset", js.undefined)
    
    @scala.inline
    def setIncludeTrailingDelimiter(value: Boolean): Self = this.set("includeTrailingDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeTrailingDelimiter: Self = this.set("includeTrailingDelimiter", js.undefined)
    
    @scala.inline
    def setMaxApiCalls(value: Double): Self = this.set("maxApiCalls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxApiCalls: Self = this.set("maxApiCalls", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setStartOffset(value: String): Self = this.set("startOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartOffset: Self = this.set("startOffset", js.undefined)
    
    @scala.inline
    def setUserProject(value: String): Self = this.set("userProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProject: Self = this.set("userProject", js.undefined)
    
    @scala.inline
    def setVersions(value: Boolean): Self = this.set("versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersions: Self = this.set("versions", js.undefined)
  }
}
