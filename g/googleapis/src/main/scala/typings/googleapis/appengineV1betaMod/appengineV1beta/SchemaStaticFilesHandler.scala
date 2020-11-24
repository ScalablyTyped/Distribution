package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Files served directly to the user for a given URL, such as images, CSS
  * stylesheets, or JavaScript source files. Static file handlers describe
  * which files in the application directory are static files, and which URLs
  * serve them.
  */
@js.native
trait SchemaStaticFilesHandler extends js.Object {
  
  /**
    * Whether files should also be uploaded as code data. By default, files
    * declared in static file handlers are uploaded as static data and are only
    * served to end users; they cannot be read by the application. If enabled,
    * uploads are charged against both your code and static data storage
    * resource quotas.
    */
  var applicationReadable: js.UndefOr[Boolean] = js.native
  
  /**
    * Time a static file served by this handler should be cached by web proxies
    * and browsers.
    */
  var expiration: js.UndefOr[String] = js.native
  
  /**
    * HTTP headers to use for all responses from these URLs.
    */
  var httpHeaders: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * MIME type used to serve all files served by this handler.Defaults to
    * file-specific MIME types, which are derived from each file&#39;s filename
    * extension.
    */
  var mimeType: js.UndefOr[String] = js.native
  
  /**
    * Path to the static files matched by the URL pattern, from the application
    * root directory. The path can refer to text matched in groupings in the
    * URL pattern.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * Whether this handler should match the request if the file referenced by
    * the handler does not exist.
    */
  var requireMatchingFile: js.UndefOr[Boolean] = js.native
  
  /**
    * Regular expression that matches the file paths for all files that should
    * be referenced by this handler.
    */
  var uploadPathRegex: js.UndefOr[String] = js.native
}
object SchemaStaticFilesHandler {
  
  @scala.inline
  def apply(): SchemaStaticFilesHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStaticFilesHandler]
  }
  
  @scala.inline
  implicit class SchemaStaticFilesHandlerOps[Self <: SchemaStaticFilesHandler] (val x: Self) extends AnyVal {
    
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
    def setApplicationReadable(value: Boolean): Self = this.set("applicationReadable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationReadable: Self = this.set("applicationReadable", js.undefined)
    
    @scala.inline
    def setExpiration(value: String): Self = this.set("expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiration: Self = this.set("expiration", js.undefined)
    
    @scala.inline
    def setHttpHeaders(value: StringDictionary[String]): Self = this.set("httpHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpHeaders: Self = this.set("httpHeaders", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setRequireMatchingFile(value: Boolean): Self = this.set("requireMatchingFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireMatchingFile: Self = this.set("requireMatchingFile", js.undefined)
    
    @scala.inline
    def setUploadPathRegex(value: String): Self = this.set("uploadPathRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadPathRegex: Self = this.set("uploadPathRegex", js.undefined)
  }
}
