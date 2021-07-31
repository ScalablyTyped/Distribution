package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Files served directly to the user for a given URL, such as images, CSS
  * stylesheets, or JavaScript source files. Static file handlers describe
  * which files in the application directory are static files, and which URLs
  * serve them.
  */
trait SchemaStaticFilesHandler extends StObject {
  
  /**
    * Whether files should also be uploaded as code data. By default, files
    * declared in static file handlers are uploaded as static data and are only
    * served to end users; they cannot be read by the application. If enabled,
    * uploads are charged against both your code and static data storage
    * resource quotas.
    */
  var applicationReadable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Time a static file served by this handler should be cached by web proxies
    * and browsers.
    */
  var expiration: js.UndefOr[String] = js.undefined
  
  /**
    * HTTP headers to use for all responses from these URLs.
    */
  var httpHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * MIME type used to serve all files served by this handler.Defaults to
    * file-specific MIME types, which are derived from each file&#39;s filename
    * extension.
    */
  var mimeType: js.UndefOr[String] = js.undefined
  
  /**
    * Path to the static files matched by the URL pattern, from the application
    * root directory. The path can refer to text matched in groupings in the
    * URL pattern.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this handler should match the request if the file referenced by
    * the handler does not exist.
    */
  var requireMatchingFile: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Regular expression that matches the file paths for all files that should
    * be referenced by this handler.
    */
  var uploadPathRegex: js.UndefOr[String] = js.undefined
}
object SchemaStaticFilesHandler {
  
  @scala.inline
  def apply(): SchemaStaticFilesHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStaticFilesHandler]
  }
  
  @scala.inline
  implicit class SchemaStaticFilesHandlerMutableBuilder[Self <: SchemaStaticFilesHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationReadable(value: Boolean): Self = StObject.set(x, "applicationReadable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationReadableUndefined: Self = StObject.set(x, "applicationReadable", js.undefined)
    
    @scala.inline
    def setExpiration(value: String): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    @scala.inline
    def setHttpHeaders(value: StringDictionary[String]): Self = StObject.set(x, "httpHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpHeadersUndefined: Self = StObject.set(x, "httpHeaders", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setRequireMatchingFile(value: Boolean): Self = StObject.set(x, "requireMatchingFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireMatchingFileUndefined: Self = StObject.set(x, "requireMatchingFile", js.undefined)
    
    @scala.inline
    def setUploadPathRegex(value: String): Self = StObject.set(x, "uploadPathRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadPathRegexUndefined: Self = StObject.set(x, "uploadPathRegex", js.undefined)
  }
}
