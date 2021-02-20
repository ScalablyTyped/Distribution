package typings.firefoxWebextBrowser.browser.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The manifest details of the available update. */
@js.native
trait OnUpdateAvailableDetails extends StObject {
  
  /** The version number of the available update. */
  var version: String = js.native
}
object OnUpdateAvailableDetails {
  
  @scala.inline
  def apply(version: String): OnUpdateAvailableDetails = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnUpdateAvailableDetails]
  }
  
  @scala.inline
  implicit class OnUpdateAvailableDetailsMutableBuilder[Self <: OnUpdateAvailableDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
