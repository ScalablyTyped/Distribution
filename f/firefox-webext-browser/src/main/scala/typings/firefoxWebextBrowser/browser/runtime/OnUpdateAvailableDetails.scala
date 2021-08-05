package typings.firefoxWebextBrowser.browser.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The manifest details of the available update. */
trait OnUpdateAvailableDetails extends StObject {
  
  /** The version number of the available update. */
  var version: String
}
object OnUpdateAvailableDetails {
  
  inline def apply(version: String): OnUpdateAvailableDetails = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnUpdateAvailableDetails]
  }
  
  extension [Self <: OnUpdateAvailableDetails](x: Self) {
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
