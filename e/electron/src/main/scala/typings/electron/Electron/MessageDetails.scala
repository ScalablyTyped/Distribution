package typings.electron.Electron

import typings.electron.electronStrings.`app-cache`
import typings.electron.electronStrings.`console-api`
import typings.electron.electronStrings.deprecation
import typings.electron.electronStrings.intervention
import typings.electron.electronStrings.javascript
import typings.electron.electronStrings.network
import typings.electron.electronStrings.other
import typings.electron.electronStrings.recommendation
import typings.electron.electronStrings.rendering
import typings.electron.electronStrings.security
import typings.electron.electronStrings.storage
import typings.electron.electronStrings.violation
import typings.electron.electronStrings.worker
import typings.electron.electronStrings.xml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageDetails extends StObject {
  
  /**
    * The log level, from 0 to 3. In order it matches `verbose`, `info`, `warning` and
    * `error`.
    */
  var level: Double
  
  /**
    * The line number of the source that triggered this console message
    */
  var lineNumber: Double
  
  /**
    * The actual console message
    */
  var message: String
  
  /**
    * The type of source for this message.  Can be `javascript`, `xml`, `network`,
    * `console-api`, `storage`, `app-cache`, `rendering`, `security`, `deprecation`,
    * `worker`, `violation`, `intervention`, `recommendation` or `other`.
    */
  var source: javascript | xml | network | `console-api` | storage | `app-cache` | rendering | security | deprecation | worker | violation | intervention | recommendation | other
  
  /**
    * The URL the message came from
    */
  var sourceUrl: String
  
  /**
    * The version ID of the service worker that sent the log message
    */
  var versionId: Double
}
object MessageDetails {
  
  @scala.inline
  def apply(
    level: Double,
    lineNumber: Double,
    message: String,
    source: javascript | xml | network | `console-api` | storage | `app-cache` | rendering | security | deprecation | worker | violation | intervention | recommendation | other,
    sourceUrl: String,
    versionId: Double
  ): MessageDetails = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceUrl = sourceUrl.asInstanceOf[js.Any], versionId = versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDetails]
  }
  
  @scala.inline
  implicit class MessageDetailsMutableBuilder[Self <: MessageDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(
      value: javascript | xml | network | `console-api` | storage | `app-cache` | rendering | security | deprecation | worker | violation | intervention | recommendation | other
    ): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUrl(value: String): Self = StObject.set(x, "sourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionId(value: Double): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
  }
}
