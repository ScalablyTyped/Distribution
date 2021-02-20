package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrivacyStatus extends StObject {
  
  /**
    * The playlists privacy status.
    */
  var privacyStatus: String = js.native
}
object PrivacyStatus {
  
  @scala.inline
  def apply(privacyStatus: String): PrivacyStatus = {
    val __obj = js.Dynamic.literal(privacyStatus = privacyStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivacyStatus]
  }
  
  @scala.inline
  implicit class PrivacyStatusMutableBuilder[Self <: PrivacyStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrivacyStatus(value: String): Self = StObject.set(x, "privacyStatus", value.asInstanceOf[js.Any])
  }
}
