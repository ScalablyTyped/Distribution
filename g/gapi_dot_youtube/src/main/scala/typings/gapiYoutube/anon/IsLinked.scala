package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsLinked extends StObject {
  
  /**
    * Indicates whether the channel data identifies a user that is already linked to either a YouTube username or a Google+ account. A user that has one of these links already has a public YouTube identity, which is a prerequisite for several actions, such as uploading videos.
    */
  var isLinked: Boolean = js.native
  
  /**
    * Privacy status of the channel.
    */
  var privacyStatus: String = js.native
}
object IsLinked {
  
  @scala.inline
  def apply(isLinked: Boolean, privacyStatus: String): IsLinked = {
    val __obj = js.Dynamic.literal(isLinked = isLinked.asInstanceOf[js.Any], privacyStatus = privacyStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsLinked]
  }
  
  @scala.inline
  implicit class IsLinkedMutableBuilder[Self <: IsLinked] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsLinked(value: Boolean): Self = StObject.set(x, "isLinked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacyStatus(value: String): Self = StObject.set(x, "privacyStatus", value.asInstanceOf[js.Any])
  }
}
